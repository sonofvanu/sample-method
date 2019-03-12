package com.eazied.eaziedTO.base;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.eazied.eaziedTO.commonembed.AddressFields;
import com.eazied.eaziedTO.commonembed.AuditFields;

@Entity
@Table(name = "M_LOCATION", schema = "BASE")
public class LocationTO implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "LOCATION_ID")
	private int locationId;
	@ManyToOne
	@JoinColumn(name = "ORG_ID")
	private OrganizationTO organizationTO;
	@Column(name = "LOCATION_NAME")
	private String locationName;
	@Column(name = "LOCATION_TYPE")
	private LocationTypeTO locationTypeTO;
	@Column(name = "LOCATION_CODE")
	private String locationCode;
	@Column(name = "ALT_PHONE_NUMBER")
	private String altPhoneNumber;
	@Column(name = "CONTACT_NAME")
	private String contactName;
	@Column(name = "CONTACT_PHONE_NUMBER")
	private String contactPhoneNumber;
	@Embedded
	private AddressFields addressFields;
	@Column(name = "COUNTRY")
	private String country;
	@Column(name = "EMAIL_ID")
	private String emailId;
	@Column(name = "WEB_URL")
	private String webUrl;
	@Column(name = "GSTIN_NO")
	private String gstinNumber;
	@Column(name = "PAN_NO")
	private String panNumber;
	@Column(name = "ACTIVE")
	private boolean isActive;
	@Column(name = "CUR_CD")
	private boolean currencyCode;
	@Column(name = "SMTP_PORT_NUMBER")
	private int smtpPortNumber;
	@Column(name = "SMTP_SERVER_NAME")
	private String smtpServerName;
	@Column(name = "POP_SERVER_NAME")
	private String popServerName;
	@Column(name = "POP_ACCOUNT_ID")
	private String popAccountId;
	@Column(name = "POP_ACCOUNT_PWD")
	private String popAccountPassword;
	@Column(name = "ACC_ID")
	private int accountId;
	@Column(name = "BILLING_ACC")
	private String billingAccount;
	@Column(name = "PRICE_LIST_ID")
	private int priceListId;
	@Column(name = "PRICE_LIST_NAME")
	private String priceListname;
	@Column(name = "PRINCIPAL_SIGN_PICTURE_PATH")
	private String principalSignaturePath;
	@Column(name = "ESSL_ACTIVE_FLAG")
	private boolean isEsslActiveFlag;
	@Column(name = "ESSL_IP_ADDRESS")
	private String esslIpAddress;
	@Column(name = "ESSL_PORT_NUMBER")
	private String esslPortNumber;
	@Column(name = "ESSL_DB_NAME")
	private String esslDBname;
	@Column(name = "ESSL_USER_NAME")
	private String esslUserName;
	@Column(name = "ESSL_PASSWORD")
	private String esslPassword;
	@Embedded
	private AuditFields auditFields;

	public int getLocationId() {
		return locationId;
	}

	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}

	public OrganizationTO getOrganizationTO() {
		return organizationTO;
	}

	public void setOrganizationTO(OrganizationTO organizationTO) {
		this.organizationTO = organizationTO;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public LocationTypeTO getLocationTypeTO() {
		return locationTypeTO;
	}

	public void setLocationTypeTO(LocationTypeTO locationTypeTO) {
		this.locationTypeTO = locationTypeTO;
	}

	public String getLocationCode() {
		return locationCode;
	}

	public void setLocationCode(String locationCode) {
		this.locationCode = locationCode;
	}

	public String getAltPhoneNumber() {
		return altPhoneNumber;
	}

	public void setAltPhoneNumber(String altPhoneNumber) {
		this.altPhoneNumber = altPhoneNumber;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactPhoneNumber() {
		return contactPhoneNumber;
	}

	public void setContactPhoneNumber(String contactPhoneNumber) {
		this.contactPhoneNumber = contactPhoneNumber;
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

	public String getGstinNumber() {
		return gstinNumber;
	}

	public void setGstinNumber(String gstinNumber) {
		this.gstinNumber = gstinNumber;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public boolean isCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(boolean currencyCode) {
		this.currencyCode = currencyCode;
	}

	public int getSmtpPortNumber() {
		return smtpPortNumber;
	}

	public void setSmtpPortNumber(int smtpPortNumber) {
		this.smtpPortNumber = smtpPortNumber;
	}

	public String getSmtpServerName() {
		return smtpServerName;
	}

	public void setSmtpServerName(String smtpServerName) {
		this.smtpServerName = smtpServerName;
	}

	public String getPopServerName() {
		return popServerName;
	}

	public void setPopServerName(String popServerName) {
		this.popServerName = popServerName;
	}

	public String getPopAccountId() {
		return popAccountId;
	}

	public void setPopAccountId(String popAccountId) {
		this.popAccountId = popAccountId;
	}

	public String getPopAccountPassword() {
		return popAccountPassword;
	}

	public void setPopAccountPassword(String popAccountPassword) {
		this.popAccountPassword = popAccountPassword;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getBillingAccount() {
		return billingAccount;
	}

	public void setBillingAccount(String billingAccount) {
		this.billingAccount = billingAccount;
	}

	public int getPriceListId() {
		return priceListId;
	}

	public void setPriceListId(int priceListId) {
		this.priceListId = priceListId;
	}

	public String getPriceListname() {
		return priceListname;
	}

	public void setPriceListname(String priceListname) {
		this.priceListname = priceListname;
	}

	public String getPrincipalSignaturePath() {
		return principalSignaturePath;
	}

	public void setPrincipalSignaturePath(String principalSignaturePath) {
		this.principalSignaturePath = principalSignaturePath;
	}

	public boolean isEsslActiveFlag() {
		return isEsslActiveFlag;
	}

	public void setEsslActiveFlag(boolean isEsslActiveFlag) {
		this.isEsslActiveFlag = isEsslActiveFlag;
	}

	public String getEsslIpAddress() {
		return esslIpAddress;
	}

	public void setEsslIpAddress(String esslIpAddress) {
		this.esslIpAddress = esslIpAddress;
	}

	public String getEsslPortNumber() {
		return esslPortNumber;
	}

	public void setEsslPortNumber(String esslPortNumber) {
		this.esslPortNumber = esslPortNumber;
	}

	public String getEsslDBname() {
		return esslDBname;
	}

	public void setEsslDBname(String esslDBname) {
		this.esslDBname = esslDBname;
	}

	public String getEsslUserName() {
		return esslUserName;
	}

	public void setEsslUserName(String esslUserName) {
		this.esslUserName = esslUserName;
	}

	public String getEsslPassword() {
		return esslPassword;
	}

	public void setEsslPassword(String esslPassword) {
		this.esslPassword = esslPassword;
	}

}
