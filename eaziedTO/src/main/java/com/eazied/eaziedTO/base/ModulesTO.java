package com.eazied.eaziedTO.base;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.eazied.eaziedTO.commonembed.AuditFields;

@Entity
@Table(name = "M_MODULES", schema = "BASE")
public class ModulesTO implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "MODULE_ID")
	private int moduleId;
	@Column(name = "MODULE_NAME")
	private String moduleName;
	@Column(name = "MODULE_DESC")
	private String moduleDescription;
	@Column(name = "MODULE_TYPE")
	private String moduleType;
	@Column(name = "MODULE_GROUP_NAME")
	private String moduleGroupName;
	@Column(name = "MODULE_LOCAL_NAME")
	private String moduleLocalName;
	@Column(name = "ICON_CLS")
	private String iconCls;
	@Column(name = "PARENT_MODULE_ID")
	private int parentModuleId;
	@Column(name = "ROUTER_PATH")
	private String routerPath;
	@Embedded
	private AuditFields auditFields;

	public int getModuleId() {
		return moduleId;
	}

	public void setModuleId(int moduleId) {
		this.moduleId = moduleId;
	}

	public String getModuleName() {
		return moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	public String getModuleDescription() {
		return moduleDescription;
	}

	public void setModuleDescription(String moduleDescription) {
		this.moduleDescription = moduleDescription;
	}

	public String getModuleType() {
		return moduleType;
	}

	public void setModuleType(String moduleType) {
		this.moduleType = moduleType;
	}

	public String getModuleGroupName() {
		return moduleGroupName;
	}

	public void setModuleGroupName(String moduleGroupName) {
		this.moduleGroupName = moduleGroupName;
	}

	public String getModuleLocalName() {
		return moduleLocalName;
	}

	public void setModuleLocalName(String moduleLocalName) {
		this.moduleLocalName = moduleLocalName;
	}

	public String getIconCls() {
		return iconCls;
	}

	public void setIconCls(String iconCls) {
		this.iconCls = iconCls;
	}

	public int getParentModuleId() {
		return parentModuleId;
	}

	public void setParentModuleId(int parentModuleId) {
		this.parentModuleId = parentModuleId;
	}

	public String getRouterPath() {
		return routerPath;
	}

	public void setRouterPath(String routerPath) {
		this.routerPath = routerPath;
	}

}
