package br.ifpb.edu.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import br.ifpb.edu.database.HibernateUtil;
import br.ifpb.edu.entidades.Eleitor;

public class EleitorDAO extends GenericDAO<Integer, Eleitor>{

	@Override
	public Eleitor find(Eleitor entity) throws HibernateException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Eleitor> getAll() throws HibernateException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Class<?> getEntityClass() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Eleitor getById(Integer pk) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		Eleitor eleitor = null;

		try {
			session.beginTransaction();
			eleitor = (Eleitor) session.get(Eleitor.class, pk);
			session.getTransaction().commit();

		} catch (HibernateException hexp) {
			session.getTransaction().rollback();

		} finally {

			session.close();

		}

		return eleitor;
	}

}
