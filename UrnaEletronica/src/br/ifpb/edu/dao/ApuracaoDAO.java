package br.ifpb.edu.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import br.ifpb.edu.database.HibernateUtil;
import br.ifpb.edu.entidades.Apuracao;

public class ApuracaoDAO extends GenericDAO<Integer, Apuracao>{

	@Override
	public Apuracao find(Apuracao entity) throws HibernateException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Apuracao> getAll() throws HibernateException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Class<?> getEntityClass() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Apuracao getById(Integer pk) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		Apuracao apuracao = null;

		try {
			
			session.beginTransaction();
			apuracao = (Apuracao) session.get(Apuracao.class, pk);
			session.getTransaction().commit();

		} catch (HibernateException hexp) {
			session.getTransaction().rollback();

		} finally {

			session.close();

		}

		return apuracao;
	}

}
