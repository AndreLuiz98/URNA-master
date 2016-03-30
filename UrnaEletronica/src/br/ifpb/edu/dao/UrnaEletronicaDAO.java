package br.ifpb.edu.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import br.ifpb.edu.database.HibernateUtil;
import br.ifpb.edu.entidades.UrnaEletronica;

public class UrnaEletronicaDAO extends GenericDAO<Integer, UrnaEletronica>{

	@Override
	public UrnaEletronica find(UrnaEletronica entity) throws HibernateException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UrnaEletronica> getAll() throws HibernateException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Class<?> getEntityClass() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public UrnaEletronica getById(Integer pk) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		UrnaEletronica urnaEletronica = null;

		try {
			
			session.beginTransaction();
			urnaEletronica = (UrnaEletronica) session.get(UrnaEletronica.class, pk);
			session.getTransaction().commit();

		} catch (HibernateException hexp) {
			session.getTransaction().rollback();

		} finally {

			session.close();

		}

		return urnaEletronica;
	}

}
