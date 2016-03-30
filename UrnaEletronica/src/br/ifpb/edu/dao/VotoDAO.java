package br.ifpb.edu.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import br.ifpb.edu.database.HibernateUtil;
import br.ifpb.edu.entidades.Voto;

public class VotoDAO extends GenericDAO<Integer, Voto>{

	@Override
	public Voto find(Voto entity) throws HibernateException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Voto> getAll() throws HibernateException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Class<?> getEntityClass() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Voto getById(Integer pk) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		Voto voto = null;

		try {
			
			session.beginTransaction();
			voto = (Voto) session.get(Voto.class, pk);
			session.getTransaction().commit();

		} catch (HibernateException hexp) {
			session.getTransaction().rollback();

		} finally {

			session.close();

		}

		return voto;
	}

}
