package com.eazied.eaziedDAO.common;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public interface CommonDAO {

	public boolean saveOrUpdate(Object object);

	public boolean deleteObject(Object object);

}
