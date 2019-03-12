package com.eazied.eaziedManager.common;

import javax.transaction.Transactional;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.eazied.eaziedDAO.common.CommonDAO;
import com.eazied.eaziedDAO.common.CommonDAOImpl;

@Repository
@Transactional
public class CommonManagerImpl implements CommonManager {
	
	@Autowired
	CommonDAO commonDAO;
	
	final static Logger logger = Logger.getLogger(CommonDAOImpl.class);

	public boolean saveOrUpdate(Object object) {
		// TODO Auto-generated method stub
		boolean result=true;
		logger.debug("Entering into CommonManagerImpl to save/update");
		result=commonDAO.saveOrUpdate(object);
		logger.debug("Exiting from CommonManagerImpl after save/update");;
		return result;
	}

	public boolean deleteObject(Object object) {
		// TODO Auto-generated method stub
		boolean result=true;
		logger.debug("Entering into CommonManagerImpl to delete");
		result=commonDAO.saveOrUpdate(object);
		logger.debug("Exiting from CommonManagerImpl after delete");;
		return result;
	}

}
