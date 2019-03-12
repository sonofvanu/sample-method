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
@Table(name = "M_MENU_MODULES", schema = "BASE")
public class MenuModulesTO implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "MENU_MODULE_ID")
	private int menuModuleId;
	@ManyToOne
	@JoinColumn(name = "MENU_ID")
	private MenuTO menuTO;
	@ManyToOne
	@JoinColumn(name = "MODULE_ID")
	private ModulesTO modulesTO;
	@Column(name = "MODULE_SEQ")
	private int moduleSequence;
	@Embedded
	private AuditFields auditFields;

	public int getMenuModuleId() {
		return menuModuleId;
	}

	public void setMenuModuleId(int menuModuleId) {
		this.menuModuleId = menuModuleId;
	}

	public MenuTO getMenuTO() {
		return menuTO;
	}

	public void setMenuTO(MenuTO menuTO) {
		this.menuTO = menuTO;
	}

	public ModulesTO getModulesTO() {
		return modulesTO;
	}

	public void setModulesTO(ModulesTO modulesTO) {
		this.modulesTO = modulesTO;
	}

	public int getModuleSequence() {
		return moduleSequence;
	}

	public void setModuleSequence(int moduleSequence) {
		this.moduleSequence = moduleSequence;
	}

}
