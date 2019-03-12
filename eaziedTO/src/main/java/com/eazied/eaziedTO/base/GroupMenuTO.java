package com.eazied.eaziedTO.base;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "M_GROUP_MENU", schema = "BASE")
public class GroupMenuTO implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "GROUP_MENU_ID")
	private int groupMenuId;
	@ManyToOne
	@JoinColumn(name = "GROUP_ID")
	private GroupTO groupTO;
	@ManyToOne
	@JoinColumn(name = "MENU_ID")
	private MenuTO menuTO;
	@Column(name = "MENU_SEQUENCE")
	private int menuSequence;

	public int getGroupMenuId() {
		return groupMenuId;
	}

	public void setGroupMenuId(int groupMenuId) {
		this.groupMenuId = groupMenuId;
	}

	public GroupTO getGroupTO() {
		return groupTO;
	}

	public void setGroupTO(GroupTO groupTO) {
		this.groupTO = groupTO;
	}

	public MenuTO getMenuTO() {
		return menuTO;
	}

	public void setMenuTO(MenuTO menuTO) {
		this.menuTO = menuTO;
	}

	public int getMenuSequence() {
		return menuSequence;
	}

	public void setMenuSequence(int menuSequence) {
		this.menuSequence = menuSequence;
	}

}
