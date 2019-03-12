package com.eazied.eaziedTO.base;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.eazied.eaziedTO.commonembed.AuditFields;

@Entity
@Table(name = "M_GROUP", schema = "BASE")
public class GroupTO implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "GROUP_ID")
	private int groupId;
	@ManyToOne
	@JoinColumn(name = "ORG_ID")
	private OrganizationTO organizationTO;
	@Column(name = "GROUP_NAME")
	private String groupName;
	@Embedded
	private AuditFields auditFields;

	public int getGroupId() {
		return groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	public OrganizationTO getOrganizationTO() {
		return organizationTO;
	}

	public void setOrganizationTO(OrganizationTO organizationTO) {
		this.organizationTO = organizationTO;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

}
