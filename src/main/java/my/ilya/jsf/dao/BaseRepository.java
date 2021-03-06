package my.ilya.jsf.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;


import javax.transaction.Transactional;

import java.io.Serializable;
import java.util.List;

@SuppressWarnings("unchecked")
@Transactional
public abstract class BaseRepository<T> implements Serializable {

	private static final long serialVersionUID = 1L;

	@PersistenceContext
	private EntityManager entityManager;

	private Class<T> entityClass;

	public BaseRepository(Class<T> entityClass) {
		this.entityClass = entityClass;
	}

	public BaseRepository() {
	}

	protected EntityManager getEntityManager() {
		return this.entityManager;
	}

	@Transactional
	public void create(T entity) {
		this.entityManager.persist(entity);		
	}
	@Transactional
	public void edit(T entity) {
		this.entityManager.merge(entity);
	}

	public void remove(T entity) {
		this.entityManager.remove(this.entityManager.merge(entity));
	}

	public T find(Long primaryKey) {
		return this.entityManager.find(entityClass, primaryKey);
	}

	public List<T> findAll() {
		CriteriaQuery<T> cq = (CriteriaQuery<T>) this.entityManager.getCriteriaBuilder().createQuery();
		cq.select(cq.from(entityClass));		
		return this.entityManager.createQuery(cq).getResultList();
	}
	

}
