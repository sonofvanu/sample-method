package com.eazied.eaziedTO.base;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.eazied.eaziedTO.commonembed.AddressFields;
import com.eazied.eaziedTO.commonembed.AuditFields;

@Entity
@Table(name = "M_ORG", schema = "BASE")
public class OrganizationTO implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "ORG_ID")
	private int organizationId;
	@Column(name = "ORG_NAME")
	private String organizationName;
	@Column(name = "ORG_CODE")
	private String organizationCode;
	@Column(name = "PHONE_NUMBER")
	private String phoneNumber;
	@Column(name = "ALT_PHONE_NUMBER")
	private String altPhoneNumber;
	@Embedded
	private AddressFields addressFields;
	@Column(name = "COUNTRY")
	private String country;
	@Column(name = "EMAIL_ID")
	private String emailId;
	@Column(name = "WEB_URL")
	private String webUrl;
	@Column(name = "CUR_CD")
	private String currencyCode;
	@Column(name = "BASE_CURRENCY")
	private String baseCurrency;
	@Column(name = "COUNTRY_CODE")
	private String countryCode;
	@Column(name = "ACTIVE")
	private String isActive;
	@Column(name = "LOGO_PATH")
	private String logoPath;
	@Embedded
	private AuditFields auditFields;

	public int getOrganizationId() {
		return organizationId;
	}

	public void setOrganizationId(int organizationId) {
		this.organizationId = organizationId;
	}

	public String getOrganizationName() {
		return organizationName;
	}

	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}

	public String getOrganizationCode() {
		return organizationCode;
	}

	public void setOrganizationCode(String organizationCode) {
		this.organizationCode = organizationCode;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAltPhoneNumber() {
		return altPhoneNumber;
	}

	public void setAltPhoneNumber(String altPhoneNumber) {
		this.altPhoneNumber = altPhoneNumber;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getWebUrl() {
		return webUrl;
	}

	public void setWebUrl(String webUrl) {
		this.webUrl = webUrl;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public String getBaseCurrency() {
		return baseCurrency;
	}

	public void setBaseCurrency(String baseCurrency) {
		this.baseCurrency = baseCurrency;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public String getLogoPath() {
		return logoPath;
	}

	public void setLogoPath(String logoPath) {
		this.logoPath = logoPath;
	}

}
