
package control;

import control.exceptions.NonexistentEntityException;
import entidad.TblEmpleado;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class TblpersonaJpaController implements Serializable {

    public TblpersonaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAEmpleadosCursoPU"); // definicion de la unidad de persistencia

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public TblpersonaJpaController(){   //debo crear el constructor
    }
    public void create(TblEmpleado tblEmpleado) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(tblEmpleado);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(TblEmpleado tblEmpleado) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();

            Integer id = tblEmpleado.getId();
            if (findTblEmpleado(id) == null) {
                throw new NonexistentEntityException("La persona con identificacion  " + id + " no existe.");
            }
            tblEmpleado = em.merge(tblEmpleado);
            em.getTransaction().commit();
        } catch (Exception ex) {
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
            TblEmpleado tblEmpleado;
            try {
                tblEmpleado = em.getReference(TblEmpleado.class, id);
                tblEmpleado.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The tblEmpleado with id " + id + " no longer exists.", enfe);
            }
            em.remove(tblEmpleado);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<TblEmpleado> findTblEmpleadoEntities() {
        return findTblEmpleadoEntities(true, -1, -1);
    }

    public List<TblEmpleado> findTblEmpleadoEntities(int maxResults, int firstResult) {
        return findTblEmpleadoEntities(false, maxResults, firstResult);
    }

    private List<TblEmpleado> findTblEmpleadoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(TblEmpleado.class));
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

    public TblEmpleado findTblEmpleado(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(TblEmpleado.class, id);
        } finally {
            em.close();
        }
    }

    public int getTblEmpleadoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<TblEmpleado> rt = cq.from(TblEmpleado.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
