package com.eazied.eaziedTO.base;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.eazied.eaziedTO.commonembed.AuditFields;

@Entity
@Table(name = "M_LOCATION_TYPE", schema = "BASE")
public class LocationTypeTO implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "LOCATION_TYPE_ID")
	private int locationTypeId;
	@Column(name = "LOCATION_TYPE")
	private String locationType;
	private AuditFields auditFields;

	public int getLocationTypeId() {
		return locationTypeId;
	}

	public void setLocationTypeId(int locationTypeId) {
		this.locationTypeId = locationTypeId;
	}

	public String getLocationType() {
		return locationType;
	}

	public void setLocationType(String locationType) {
		this.locationType = locationType;
	}

}
