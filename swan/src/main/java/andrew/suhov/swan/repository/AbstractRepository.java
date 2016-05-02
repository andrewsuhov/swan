/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package andrew.suhov.swan.repository;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

/**
 *
 * @author asuhov
 * @param <T>
 */
public abstract class AbstractRepository<T>
{
    @PersistenceContext
    protected EntityManager em;
    
    private final Class<T> entityClass;
    
    
    public AbstractRepository(Class entityClass)
    {
        this.entityClass = entityClass;
    }
    
    
    public void create(T entity)
    {
        em.persist(entity);
    }
    
    public T update(T entity)
    {
        return em.merge(entity);
    }
    
    public void delete(T entity)
    {
        em.remove(entity);
    }
    
    public T find(Long id)
    {
        return em.find(entityClass, id);
    }
    
    public List<T> findAll()
    {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<T> cq = cb.createQuery(entityClass);
        cq.select(cq.from(entityClass));
        return em.createQuery(cq).getResultList();
    }
}
