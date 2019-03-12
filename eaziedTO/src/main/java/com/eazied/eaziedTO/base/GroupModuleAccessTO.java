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
@Table(name = "M_GROUP_MODULE_ACCESS", schema = "BASE")
public class GroupModuleAccessTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "GROUP_ACCESS_ID")
	private int groupAccessId;
	@ManyToOne
	@JoinColumn(name = "ORG_ID")
	private OrganizationTO organizationTO;
	@ManyToOne
	@JoinColumn(name = "GROUP_ID")
	private GroupTO groupTO;
	@ManyToOne
	@JoinColumn(name = "MODULE_ID")
	private ModulesTO modulesTO;
	@Column(name = "CREATE_FLG")
	private boolean createFlag;
	@Column(name = "READ_FLG")
	private boolean readFlag;
	@Column(name = "UPDATE_FLG")
	private boolean updateFlag;
	@Column(name = "DELETE_FLG")
	private boolean deleteFlag;
	@Column(name = "IMPORT_FLG")
	private boolean importFlag;
	@Column(name = "EXPORT_FLG")
	private boolean exportFlag;
	@Embedded
	private AuditFields auditFields;

	public int getGroupAccessId() {
		return groupAccessId;
	}

	public void setGroupAccessId(int groupAccessId) {
		this.groupAccessId = groupAccessId;
	}

	public OrganizationTO getOrganizationTO() {
		return organizationTO;
	}

	public void setOrganizationTO(OrganizationTO organizationTO) {
		this.organizationTO = organizationTO;
	}

	public GroupTO getGroupTO() {
		return groupTO;
	}

	public void setGroupTO(GroupTO groupTO) {
		this.groupTO = groupTO;
	}

	public ModulesTO getModulesTO() {
		return modulesTO;
	}

	public void setModulesTO(ModulesTO modulesTO) {
		this.modulesTO = modulesTO;
	}

	public boolean isCreateFlag() {
		return createFlag;
	}

	public void setCreateFlag(boolean createFlag) {
		this.createFlag = createFlag;
	}

	public boolean isReadFlag() {
		return readFlag;
	}

	public void setReadFlag(boolean readFlag) {
		this.readFlag = readFlag;
	}

	public boolean isUpdateFlag() {
		return updateFlag;
	}

	public void setUpdateFlag(boolean updateFlag) {
		this.updateFlag = updateFlag;
	}

	public boolean isDeleteFlag() {
		return deleteFlag;
	}

	public void setDeleteFlag(boolean deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

	public boolean isImportFlag() {
		return importFlag;
	}

	public void setImportFlag(boolean importFlag) {
		this.importFlag = importFlag;
	}

	public boolean isExportFlag() {
		return exportFlag;
	}

	public void setExportFlag(boolean exportFlag) {
		this.exportFlag = exportFlag;
	}

}
