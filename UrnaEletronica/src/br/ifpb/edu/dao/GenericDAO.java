package br.ifpb.edu.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

import br.ifpb.edu.database.HibernateUtil;

public abstract class GenericDAO<PK, T> {

	public int insert(T entity) throws HibernateException {

		Session session = HibernateUtil.getSessionFactory().openSession();

		Integer id;

		try {

			session.beginTransaction();
			id = (Integer) session.save(entity);
			session.getTransaction().commit();

		} catch (HibernateException hibernateException) {

			session.getTransaction().rollback();

			throw new HibernateException(hibernateException);

		} finally {

			session.close();
		}

		return id;
	}

	public boolean insertOrUpdate(T entity) throws HibernateException {

		Session session = HibernateUtil.getSessionFactory().openSession();

		boolean success = false;

		try {

			session.beginTransaction();
			session.saveOrUpdate(entity);
			session.getTransaction().commit();

			success = true;

		} catch (HibernateException hibernateException) {

			session.getTransaction().rollback();

			throw new HibernateException(hibernateException);

		} finally {

			session.close();
		}

		return success;
	}

	@SuppressWarnings("unchecked")
	public T update(T entity) throws HibernateException{

		Session session = HibernateUtil.getSessionFactory().openSession();

		try {

			session.beginTransaction();
			entity = (T) session.merge(entity);
			session.getTransaction().commit();

		} catch (HibernateException hibernateException) {

			session.getTransaction().rollback();

			throw new HibernateException(hibernateException);

		} finally {

			session.close();
		}

		return entity;
	}

	public void delete(T entity) {

		Session session = HibernateUtil.getSessionFactory().openSession();

		try {

			session.beginTransaction();
			session.delete(entity);
			session.getTransaction().commit();

		} catch (HibernateException hibernateException) {

			session.getTransaction().rollback();

			throw new HibernateException(hibernateException);

		} finally {

			session.close();
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<T> getAll(String namedQuery) throws HibernateException {

		Session session = HibernateUtil.getSessionFactory().openSession();
		List<T> list = null;

		try {

			session.beginTransaction();
			Query query = session.getNamedQuery(namedQuery);
			list = (List<T>) query.list();
			session.getTransaction().commit();

		} catch (HibernateException hibernateException) {

			session.getTransaction().rollback();

			throw new HibernateException(hibernateException);

		} finally {

			session.close();
		}

		return list;
	}

	public abstract T find(T entity) throws HibernateException;

	public abstract List<T> getAll() throws HibernateException;

	public abstract Class<?> getEntityClass();
}
