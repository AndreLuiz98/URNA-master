package br.ifpb.edu.database;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class HibernateListener implements ServletContextListener{
	
	public void contextInitialized(ServletContextEvent event) {
		JPAUtil.getSessionFactory();
	}

	public void contextDestroyed(ServletContextEvent event) {
		JPAUtil.getSessionFactory().close();
	}
	

}
