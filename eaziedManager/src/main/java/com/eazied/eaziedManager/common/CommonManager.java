package com.eazied.eaziedManager.common;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public interface CommonManager {

	public boolean saveOrUpdate(Object object);

	public boolean deleteObject(Object object);

}
