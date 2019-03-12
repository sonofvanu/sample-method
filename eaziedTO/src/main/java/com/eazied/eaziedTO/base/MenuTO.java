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
@Table(name = "M_MENU", schema = "BASE")
public class MenuTO implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "MENU_ID")
	private int menuId;
	@ManyToOne
	@JoinColumn(name = "ORG_ID")
	private OrganizationTO organizationTO;
	@Column(name = "MENU_NAME")
	private String menuName;
	@Column(name = "ROUTER_PATH")
	private String routerPath;
	@Column(name = "ICON_CLS")
	private String iconClass;
	@Embedded
	private AuditFields auditFields;

	public int getMenuId() {
		return menuId;
	}

	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}

	public OrganizationTO getOrganizationTO() {
		return organizationTO;
	}

	public void setOrganizationTO(OrganizationTO organizationTO) {
		this.organizationTO = organizationTO;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public String getRouterPath() {
		return routerPath;
	}

	public void setRouterPath(String routerPath) {
		this.routerPath = routerPath;
	}

	public String getIconClass() {
		return iconClass;
	}

	public void setIconClass(String iconClass) {
		this.iconClass = iconClass;
	}

}
