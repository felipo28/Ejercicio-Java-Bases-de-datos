package control;

import control.exceptions.NonexistentEntityException;
import entidad.TblUsuario;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class TblUsuarioJpaController implements Serializable {
    
    public TblUsuarioJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAEmpleadosCursoPU");;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public TblUsuarioJpaController() {
    }
    
    public void create(TblUsuario tblUsuario) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(tblUsuario);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(TblUsuario tblUsuario) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            tblUsuario = em.merge(tblUsuario);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = tblUsuario.getId();
                if (findTblUsuario(id) == null) {
                    throw new NonexistentEntityException("The tblUsuario with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            TblUsuario tblUsuario;
            try {
                tblUsuario = em.getReference(TblUsuario.class, id);
                tblUsuario.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The tblUsuario with id " + id + " no longer exists.", enfe);
            }
            em.remove(tblUsuario);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<TblUsuario> findTblUsuarioEntities() {
        return findTblUsuarioEntities(true, -1, -1);
    }

    public List<TblUsuario> findTblUsuarioEntities(int maxResults, int firstResult) {
        return findTblUsuarioEntities(false, maxResults, firstResult);
    }

    private List<TblUsuario> findTblUsuarioEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(TblUsuario.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public TblUsuario findTblUsuario(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(TblUsuario.class, id);
        } finally {
            em.close();
        }
    }

    public int getTblUsuarioCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<TblUsuario> rt = cq.from(TblUsuario.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
