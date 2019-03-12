package com.eazied.eaziedDAO.common;

import javax.transaction.Transactional;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CommonDAOImpl implements CommonDAO {

	@Autowired
	SessionFactory sessionFactory;

	final static Logger logger = Logger.getLogger(CommonDAOImpl.class);

	public boolean saveOrUpdate(Object object) {
		// TODO Auto-generated method stub
		logger.debug("Entering into CommonDAOImpl to save/update ");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(object);
			logger.debug("Exiting from CommonDAOImpl after save/update");
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Error encountered while saving/updating in CommonDAOImpl " + e.getMessage());
			return false;
		}
	}

	public boolean deleteObject(Object object) {
		// TODO Auto-generated method stub
		logger.debug("Entering into CommonDAOImpl to delete ");
		try {
			sessionFactory.getCurrentSession().delete(object);
			logger.debug("Exiting from CommonDAOImpl after delete");
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("Error encountered while deleting in CommonDAOImpl " + e.getMessage());
			return false;
		}
	}

}
