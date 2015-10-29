package com.rmg.core.dao;

import java.sql.Connection;
import java.sql.SQLException;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Session;
import org.hibernate.connection.ConnectionProvider;
import org.hibernate.engine.SessionFactoryImplementor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author imoremada
 *
 */
@Repository
public class BaseDAO {

	/** Make subclasses pick up the correct logger */
	protected final Logger logger;
	/** The EntityManager instance injected by Spring */
	protected EntityManager em;
	protected Connection connection;

	protected BaseDAO() {
		logger = LoggerFactory.getLogger(this.getClass()); // makes subclasses
															// pick up the
															// correct logger
	}

	@PersistenceContext
	public void setEntityManager(EntityManager em) {
		this.em = em;
	}

	protected Connection getConnection() {
		try {
			Session session = (Session) em.getDelegate();
			SessionFactoryImplementor sfi = (SessionFactoryImplementor) session.getSessionFactory();
			ConnectionProvider cp = sfi.getConnectionProvider();
			connection = cp.getConnection();
		} catch (Exception e) {
			if (logger.isErrorEnabled()) {
				logger.error("Cannot Establish Data Base Connection", e);
			}
		}
		return connection;
	}

	/**
	 * Close the entity manager connection established.
	 *
	 */
	protected void closeConnection() {
		if (connection != null) {
			try {
				connection.close();
				connection = null;
			} catch (SQLException e) {
				logger.error("Exception closing Connection BaseDAO.closeConnection()", e);
			}
		}
	}
}
