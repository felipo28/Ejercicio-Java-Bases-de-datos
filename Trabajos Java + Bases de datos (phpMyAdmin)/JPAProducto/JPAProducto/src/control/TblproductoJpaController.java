package control;

import control.exceptions.NonexistentEntityException;
import entidad.Tblproducto;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class TblproductoJpaController implements Serializable {

    public TblproductoJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAProductoPU");

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public TblproductoJpaController() {
    }
    

    public void create(Tblproducto tblproducto) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(tblproducto);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Tblproducto tblproducto) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();

            Integer id = tblproducto.getId();
            if (findTblproducto(id) == null) {
                throw new NonexistentEntityException("La persona con id " + id + " no existe.");
            }else{
                tblproducto = em.merge(tblproducto);
                em.getTransaction().commit();
            }

        } catch (Exception ex) {
            //String msg = ex.getLocalizedMessage();
            //if (msg == null || msg.length() == 0) {
                
            //}
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
            Tblproducto tblproducto;
            try {
                tblproducto = em.getReference(Tblproducto.class, id);
                tblproducto.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("La persona con id " + id + " no existe.", enfe);
            }
            em.remove(tblproducto);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Tblproducto> findTblproductoEntities() {
        return findTblproductoEntities(true, -1, -1);
    }

    public List<Tblproducto> findTblproductoEntities(int maxResults, int firstResult) {
        return findTblproductoEntities(false, maxResults, firstResult);
    }

    private List<Tblproducto> findTblproductoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Tblproducto.class));
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

    public Tblproducto findTblproducto(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Tblproducto.class, id);
        } finally {
            em.close();
        }
    }

    public int getTblproductoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Tblproducto> rt = cq.from(Tblproducto.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
