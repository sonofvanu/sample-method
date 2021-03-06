/*----------------------------------------------------------------------------------------
-- Schema Base
----------------------------------------------------------------------------------------*/

CREATE SCHEMA BASE;

/*----------------------------------------------------------------------------------------
-- Table M_VERSION
----------------------------------------------------------------------------------------*/

CREATE SEQUENCE BASE.SEQ_VERSION_SEQ_NO;

CREATE TABLE BASE.M_VERSION(
 VERSION_SEQ_NO   INT CHECK (VERSION_SEQ_NO>=0) DEFAULT nextval('BASE.SEQ_VERSION_SEQ_NO'),
 VERSION_NAME     VARCHAR(30),
 RELEASE_DT       TIMESTAMP,
 REMARKS          VARCHAR(500),
 PRIMARY KEY(VERSION_SEQ_NO)
);

/*----------------------------------------------------------------------------------------
-- Table M_ORGANIZATION
----------------------------------------------------------------------------------------*/

CREATE SEQUENCE BASE.SEQ_ORG_ID;

CREATE TABLE BASE.M_ORG(
  	ORG_ID 					INT CHECK (ORG_ID >= 0) DEFAULT nextval('BASE.SEQ_ORG_ID'),
  	ORG_NAME 				VARCHAR(100) NOT NULL,
  	ORG_CODE				VARCHAR(20),
  	PHONE_NUMBER 			VARCHAR(20),
  	ALT_PHONE_NUMBER 		VARCHAR(20),
  	ADDRESS1 				VARCHAR(100),
  	ADDRESS2 				VARCHAR(100),
  	CITY 					VARCHAR(100) NOT NULL,
  	STATE 					VARCHAR(30) NOT NULL,
  	COUNTRY 				VARCHAR(30) NOT NULL,
  	PINCODE 				INT DEFAULT 0,
  	EMAIL_ID 				VARCHAR(50),
  	WEB_URL 				VARCHAR(30),
  	CUR_CD 					VARCHAR(10),
  	BASE_CURRENCY 			VARCHAR(20) NOT NULL,
  	COUNTRY_CODE 			VARCHAR(20) NOT NULL,
  	ACTIVE 					BOOLEAN DEFAULT TRUE,
  	LOGO_PATH               VARCHAR(300),
  	CREATED_BY 				VARCHAR(50),
  	CREATED_DT 				TIMESTAMP,
  	UPDATED_BY 				VARCHAR(50),
  	UPDATED_DT 				TIMESTAMP,
  	CONSTRAINT M_ORG_PKEY PRIMARY KEY (ORG_ID),
  	CONSTRAINT M_ORG_UKEY UNIQUE (ORG_NAME),
  	CONSTRAINT ORG_CODE_UKEY UNIQUE(ORG_NAME,ORG_CODE)
);

/*----------------------------------------------------------------------------------------
-- Table M_LOCATION_TYPE
----------------------------------------------------------------------------------------*/

CREATE SEQUENCE BASE.SEQ_LOCATION_TYPE_ID;

CREATE TABLE BASE.M_LOCATION_TYPE(
 LOCATION_TYPE_ID    		SMALLINT CHECK (LOCATION_TYPE_ID>=0) DEFAULT nextval('BASE.SEQ_LOCATION_TYPE_ID'),
 LOCATION_TYPE       		VARCHAR(20) NOT NULL,
 CREATED_BY 				VARCHAR(10),
 CREATED_DT					TIMESTAMP,
 UPDATED_BY    				VARCHAR(10),
 UPDATED_DT     			TIMESTAMP,
 PRIMARY KEY(LOCATION_TYPE_ID),
 CONSTRAINT M_LOCATION_TYPE_UKEY UNIQUE(LOCATION_TYPE)
);

/*----------------------------------------------------------------------------------------
-- Table M_LOCATION
----------------------------------------------------------------------------------------*/

CREATE SEQUENCE BASE.SEQ_LOCATION_ID;

CREATE TABLE BASE.M_LOCATION (
  	LOCATION_ID					INT CHECK (LOCATION_ID >= 0) DEFAULT nextval('BASE.SEQ_LOCATION_ID'),
  	ORG_ID						INT NOT NULL,
  	LOCATION_NAME				VARCHAR(100) NOT NULL,
  	LOCATION_TYPE				SMALLINT NOT NULL,
  	LOCATION_CODE               VARCHAR(10) NOT NULL,
  	ALT_PHONE_NUMBER 			VARCHAR(20),
  	CONTACT_NAME				VARCHAR(100),
  	CONTACT_PHONE_NUMBER		VARCHAR(20),
  	ADDRESS1 					VARCHAR(100) NOT NULL,
  	ADDRESS2 					VARCHAR(100),
  	CITY 						VARCHAR(100) NOT NULL,
  	STATE 						VARCHAR(30) NOT NULL,
  	COUNTRY						VARCHAR(100) NOT NULL,
  	PINCODE					    VARCHAR(10) NOT NULL,
  	EMAIL_ID					VARCHAR(50) NOT NULL,
  	WEB_URL						VARCHAR(30),
  	GSTIN_NO					VARCHAR(30),
  	PAN_NO						VARCHAR(30),
  	ACTIVE						VARCHAR(1) DEFAULT 'Y',
  	CUR_CD 						VARCHAR(4),
  	SMTP_PORT_NUMBER            INT DEFAULT 0,
  	SMTP_SERVER_NAME            VARCHAR(100),
    POP_SERVER_NAME             VARCHAR(100),
    POP_ACCOUNT_ID              VARCHAR(100),
    POP_ACCOUNT_PWD             VARCHAR(100),
    ACC_ID							INT,
  	BILLING_ACC						VARCHAR(50),
  	PRICE_LIST_ID                     INT DEFAULT 0,
  	PRICE_LIST_NAME                   VARCHAR(60),
  	PRINCIPAL_SIGN_PICTURE_PATH       VARCHAR(500),
 	ESSL_ACTIVE_FLAG 					VARCHAR(1),
  	ESSL_IP_ADDRESS 					VARCHAR(20),
  	ESSL_PORT_NUMBER 					VARCHAR(10),
  	ESSL_DB_NAME 						VARCHAR(100),
  	ESSL_USER_NAME 					VARCHAR(100),
  	ESSL_PASSWORD 					VARCHAR(100),
    CREATED_BY      			VARCHAR(50),
  	CREATED_DT	   				TIMESTAMP,
  	UPDATED_BY   	  			VARCHAR(50),
  	UPDATED_DT	   				TIMESTAMP,
  	PRIMARY KEY(LOCATION_ID),
  	CONSTRAINT ORG_LOCATION_UKEY UNIQUE(ORG_ID,LOCATION_NAME),
  	CONSTRAINT LOCATION_CODE_UKEY UNIQUE(ORG_ID,LOCATION_CODE),
    FOREIGN KEY(ORG_ID) REFERENCES BASE.M_ORG(ORG_ID),
    FOREIGN KEY(LOCATION_TYPE) REFERENCES BASE.M_LOCATION_TYPE(LOCATION_TYPE_ID)
);


/*----------------------------------------------------------------------------------------
-- TABLE M_GROUP
-----------------------------------------------------------------------------------------*/
CREATE SEQUENCE BASE.SEQ_GROUP_ID;

CREATE TABLE BASE.M_GROUP(
  GROUP_ID          		INT CHECK (GROUP_ID >= 0) DEFAULT nextval('BASE.SEQ_GROUP_ID'),
  ORG_ID			INT NOT NULL,
  GROUP_NAME        		VARCHAR(30),
  CREATED_BY        		VARCHAR(50),
  CREATED_DT        		TIMESTAMP,
  UPDATED_BY   	  			VARCHAR(50),
  	UPDATED_DT	   				TIMESTAMP,
  PRIMARY KEY(GROUP_ID),
  CONSTRAINT ORG_GROUP_UKEY UNIQUE(ORG_ID,GROUP_ID),
  FOREIGN KEY(ORG_ID) REFERENCES BASE.M_ORG(ORG_ID)
);

/*----------------------------------------------------------------------------------------
-- TABLE M_MENU
-----------------------------------------------------------------------------------------*/
CREATE SEQUENCE BASE.SEQ_MENU_ID;

CREATE TABLE BASE.M_MENU(
  MENU_ID	    			INT CHECK (MENU_ID>=0) DEFAULT nextval('BASE.SEQ_MENU_ID'),
  ORG_ID 					INT NOT NULL,
  MENU_NAME	    			VARCHAR(30),
  ROUTER_PATH 				VARCHAR(50),
  ICON_CLS          		VARCHAR(30),
  CREATED_BY        		VARCHAR(50),
  CREATED_DT        		TIMESTAMP,
  UPDATED_BY   	  			VARCHAR(50),
  	UPDATED_DT	   				TIMESTAMP,
  PRIMARY KEY(MENU_ID),
  CONSTRAINT ORG_MENU_UKEY UNIQUE(ORG_ID,MENU_NAME)
);

/*----------------------------------------------------------------------------------------
-- TABLE M_GROUP_MENU
-----------------------------------------------------------------------------------------*/
CREATE SEQUENCE BASE.SEQ_GROUP_MENU_ID;

CREATE TABLE BASE.M_GROUP_MENU(
  GROUP_MENU_ID 			INT CHECK (GROUP_MENU_ID >= 0) DEFAULT nextval('BASE.SEQ_GROUP_MENU_ID'),
  GROUP_ID 					INT NOT NULL,
  MENU_ID 					INT NOT NULL,
  MENU_SEQUENCE 			INT,
  PRIMARY KEY(GROUP_MENU_ID),
  CONSTRAINT UK1_GROUP_MENU UNIQUE(GROUP_ID,MENU_ID),  
  FOREIGN KEY(GROUP_ID) REFERENCES BASE.M_GROUP(GROUP_ID),
  FOREIGN KEY(MENU_ID)  REFERENCES BASE.M_MENU(MENU_ID)
);

/*----------------------------------------------------------------------------------------
-- Table M_MODULE
----------------------------------------------------------------------------------------*/
CREATE SEQUENCE BASE.SEQ_MODULE_ID;

CREATE TABLE BASE.M_MODULES(
  MODULE_ID         		INT CHECK (MODULE_ID >= 0) DEFAULT nextval('BASE.SEQ_MODULE_ID'),
  MODULE_NAME       		VARCHAR(100) NOT NULL,
  MODULE_DESC       		VARCHAR(100),
  MODULE_TYPE       		CHAR(1) DEFAULT 'F',
  MODULE_GROUP_NAME 		VARCHAR(100),
  MODULE_LOCAL_NAME 		VARCHAR(100),
  ICON_CLS          		VARCHAR(30),
  PARENT_MODULE_ID  		INT DEFAULT 0,
  ROUTER_PATH 				VARCHAR(50),
  CREATED_BY        		VARCHAR(30),
  CREATED_DT        		TIMESTAMP,
  UPDATED_BY   	  			VARCHAR(50),
  	UPDATED_DT	   				TIMESTAMP,
  PRIMARY KEY(MODULE_ID) 
);

/*----------------------------------------------------------------------------------------
-- TABLE M_MENU_MODULES
-----------------------------------------------------------------------------------------*/
CREATE SEQUENCE BASE.SEQ_MENU_MODULE_ID;

CREATE TABLE BASE.M_MENU_MODULES(
  MENU_MODULE_ID			INT CHECK (MENU_MODULE_ID >= 0) DEFAULT nextval('BASE.SEQ_MENU_MODULE_ID'),
  MENU_ID					INT CHECK (MENU_ID >= 0) NOT NULL,
  MODULE_ID					INT CHECK (MODULE_ID >= 0) NOT NULL,
  MODULE_SEQ    			INT CHECK (MODULE_SEQ >= 0),
  CREATED_BY    			VARCHAR(50),
  CREATED_DT    			TIMESTAMP,
  UPDATED_BY    			VARCHAR(50),
  UPDATED_DT    			TIMESTAMP,
  PRIMARY KEY(MENU_MODULE_ID),
  CONSTRAINT MENU_MODULE_UKEY UNIQUE(MENU_ID,MODULE_ID),  
  FOREIGN KEY(MODULE_ID) REFERENCES BASE.M_MODULES(MODULE_ID),
  FOREIGN KEY(MENU_ID) REFERENCES BASE.M_MENU(MENU_ID)
);

/*-----------------------------------------------------------------------------------------
-- TABLE M_GROUP_MODULE_ACCESS
------------------------------------------------------------------------------------------*/
CREATE SEQUENCE BASE.SEQ_GROUP_MODULE_ID;

CREATE TABLE BASE.M_GROUP_MODULE_ACCESS(
	GROUP_ACCESS_ID 	INT CHECK (GROUP_ACCESS_ID >= 0) DEFAULT nextval('BASE.SEQ_GROUP_MODULE_ID'),
	ORG_ID			    INT NOT NULL,
	GROUP_ID      		INT NOT NULL,
	MODULE_ID     		INT NOT NULL,
	CREATE_FLG    		BOOLEAN DEFAULT FALSE,
	READ_FLG      		BOOLEAN DEFAULT FALSE,
	UPDATE_FLG    		BOOLEAN DEFAULT FALSE,
	DELETE_FLG    		BOOLEAN DEFAULT FALSE,
	EXPORT_FLG    		BOOLEAN DEFAULT FALSE,
	IMPORT_FLG    		BOOLEAN DEFAULT FALSE,
	CREATED_BY    		VARCHAR(50),
	CREATED_DT    		TIMESTAMP,
	UPDATED_BY    		VARCHAR(50),
	UPDATED_DT    		TIMESTAMP,
	PRIMARY KEY(GROUP_ACCESS_ID),
	CONSTRAINT GROUP_MODULE_ACCESS_UKEY UNIQUE (ORG_ID,GROUP_ID,MODULE_ID),
	FOREIGN KEY (GROUP_ID)  REFERENCES BASE.M_GROUP(GROUP_ID),
	FOREIGN KEY (MODULE_ID) REFERENCES BASE.M_MODULES(MODULE_ID)
);


/*-----------------------------------------------------------------------------------------
-- TABLE M_USER
------------------------------------------------------------------------------------------*/

CREATE SEQUENCE BASE.SEQ_USER_ID;

CREATE TABLE BASE.M_USER(
  ORG_ID       				SMALLINT CHECK (ORG_ID>=0)  NOT NULL,
  USER_ID       			INT CHECK (USER_ID>=0) DEFAULT nextval('BASE.SEQ_USER_ID'),
  LOGIN_ID      			VARCHAR(10) NOT NULL,
  USER_NAME    				VARCHAR(30) NOT NULL,
  LOCATION_ID				SMALLINT CHECK (LOCATION_ID>=0) NOT NULL,
  LOCATION_CODE             VARCHAR(10) NOT NULL,
  GROUP_ID     				SMALLINT CHECK (GROUP_ID>=0),
  USER_SURNAME				VARCHAR(30),
  DOJ          				DATE,
  DOL          				DATE,
  DOB          	  			DATE,
  AGE          	  			SMALLINT CHECK (AGE>=0) DEFAULT 0,
  SEX                   	CHAR(1),
  MARRIED               	BOOLEAN DEFAULT FALSE,
  NO_OF_CHILDREN        	SMALLINT CHECK (NO_OF_CHILDREN>=0) DEFAULT 0,
  BLOOD_GROUP           	VARCHAR(3),
  BANK_NAME					VARCHAR(60),
  BANK_ACC_NO           	VARCHAR(30),
  PAN_NO         			VARCHAR(30),
  PF_NO                 	VARCHAR(30),
  ESI_NO                	VARCHAR(30),
  INSURANCE_POLICY_NO   	VARCHAR(30),
  PASSWORD          		VARCHAR(100) NOT NULL,
  EMAIL_ID     				VARCHAR(50),
  ACTIVE       				BOOLEAN DEFAULT TRUE,
  IMAGE_URL    				VARCHAR(100),
  ADDRESS1 					VARCHAR(100),
  ADDRESS2 					VARCHAR(100),
  CITY 						VARCHAR(100) NOT NULL,
  STATE 					VARCHAR(30) NOT NULL,
  COUNTRY 					VARCHAR(30) NOT NULL,
  PINCODE 					INT DEFAULT 0,
  PHONE_NO              	VARCHAR(20),
  MOBILE_NO             	VARCHAR(20),
  REMARKS               	VARCHAR(100),
  ACCOUNT_LOCK 				SMALLINT CHECK (ACCOUNT_LOCK>=0)  DEFAULT 0 ,
  LOGIN_STATUS 				BOOLEAN DEFAULT FALSE ,
  APPROVE_PROMOTION 	    BOOLEAN DEFAULT FALSE ,
  PWD_CHG_DT				DATE,
  VALID_FROM           		DATE NOT NULL,
  VALID_TO             		DATE,
  STAFF_ID					INT DEFAULT 0,
  STAFF_ATTENDANCE_ACCESS 	BOOLEAN DEFAULT FALSE ,
  EMPLOYMENT_TYPE 			VARCHAR(30),
  CREATED_BY   				VARCHAR(10),
  CREATED_DT   				TIMESTAMP,
  UPDATED_BY   				VARCHAR(10),
  UPDATED_DT   				TIMESTAMP,
  WORK_PLAN_DELETE_ACCESS   BOOLEAN DEFAULT FALSE,
  PRIMARY KEY(USER_ID,ORG_ID),
  CONSTRAINT USER_LOGIN_UKEY UNIQUE(LOGIN_ID),
  CONSTRAINT ORG_USER_UKEY UNIQUE (ORG_ID,USER_ID),
  FOREIGN KEY(ORG_ID,GROUP_ID) REFERENCES BASE.M_GROUP(ORG_ID,GROUP_ID),
  FOREIGN KEY(ORG_ID,LOCATION_CODE) REFERENCES BASE.M_LOCATION(ORG_ID,LOCATION_CODE)
 );

/*----------------------------------------------------------------------------------------
-- TABLE M_USER_LOCATION_ACCESS
-----------------------------------------------------------------------------------------*/
CREATE SEQUENCE BASE.SEQ_USER_LOCATION_ACCESS_ID;

CREATE TABLE BASE.M_USER_LOCATION_ACCESS
(USER_LOCATION_ACCESS_ID INT CHECK (USER_LOCATION_ACCESS_ID>=0) DEFAULT nextval('BASE.SEQ_USER_LOCATION_ACCESS_ID'),
 ORG_ID                  SMALLINT CHECK (ORG_ID>=0),
 LOCATION_ID             SMALLINT CHECK (LOCATION_ID>=0),
 LOCATION_CODE           VARCHAR(10) NOT NULL,
 USER_ID                  INT CHECK (USER_ID>=0),
 LOGIN_ID                 VARCHAR(10),
 GROUP_ID     			 SMALLINT CHECK (GROUP_ID>=0),
 ACCESS_LOCATION_ID      INT,
 ACCESS_LOCATION_NAME    VARCHAR(100),
 CREATED_BY   			 VARCHAR(10),
 CREATED_DT   			 TIMESTAMP,
 UPDATED_BY   	  			VARCHAR(50),
  	UPDATED_DT	   				TIMESTAMP,
 PRIMARY KEY(USER_LOCATION_ACCESS_ID),
 FOREIGN KEY (ORG_ID,USER_ID) REFERENCES BASE.M_USER(ORG_ID,USER_ID) ON UPDATE CASCADE ,
 FOREIGN KEY (ORG_ID,LOCATION_CODE) REFERENCES BASE.M_LOCATION(ORG_ID,LOCATION_CODE)
);
 
 
/*----------------------------------------------------------------------------------------
-- Table M_NUMBER_CONTROL_CODES
----------------------------------------------------------------------------------------*/
CREATE SEQUENCE BASE.SEQ_NUMBER_CONTROL_CD_ID;
 
CREATE TABLE BASE.M_NUMBER_CONTROL_CODES
(ORG_ID			          SMALLINT CHECK (ORG_ID>=0),
 NUMBER_CONTROL_CD_ID	  INT CHECK (NUMBER_CONTROL_CD_ID>=0) DEFAULT nextval('BASE.SEQ_NUMBER_CONTROL_CD_ID'),
 NUMBER_CONTROL_NAME      VARCHAR(50),
 NUMBER_CONTROL_DESC      VARCHAR(100),
 PRIMARY KEY(NUMBER_CONTROL_CD_ID,ORG_ID)
);


/*----------------------------------------------------------------------------------------
-- TABLE M_USER_SESSION_INFO
-----------------------------------------------------------------------------------------*/
CREATE SEQUENCE BASE.SEQ_SESS_ID;

CREATE TABLE BASE.M_USER_SESSION_INFO(
  ORG_ID       		SMALLINT CHECK (ORG_ID>=0),
  SESS_ID      		INT      DEFAULT nextval('BASE.SEQ_SESS_ID'),
  LOGIN_ID      	VARCHAR(10) NOT NULL,
  SESSION_IP   		VARCHAR(24),
  LOGIN_TIME   		TIMESTAMP,
  LOGOUT_TIME  		TIMESTAMP NULL DEFAULT NULL,
  PRIMARY KEY(SESS_ID,ORG_ID),
  FOREIGN KEY(LOGIN_ID) REFERENCES BASE.M_USER(LOGIN_ID)
);
 

/*----------------------------------------------------------------------------------------
-- Table M_NUMBER_CONTROL
----------------------------------------------------------------------------------------*/
CREATE SEQUENCE BASE.SEQ_NUMBER_CONTROL_ID;

CREATE TABLE BASE.M_NUMBER_CONTROL
(NUMBER_CONTROL_ID    SMALLINT CHECK (NUMBER_CONTROL_ID>=0) DEFAULT nextval('BASE.SEQ_NUMBER_CONTROL_ID'),
 ORG_ID               SMALLINT CHECK (ORG_ID>=0),
 LOCATION_ID  	      SMALLINT CHECK (LOCATION_ID>=0) NOT NULL,
 LOCATION_CODE        VARCHAR(10) NOT NULL, 
 NUMBER_CONTROL_CD_ID SMALLINT CHECK (NUMBER_CONTROL_CD_ID>=0) NOT NULL,
 NUMBER_CONTROL_NAME  VARCHAR(50)      NOT NULL,
 NUMBER_CONTROL_DESC  VARCHAR(100)     NOT NULL,
 PREFIX_CD            VARCHAR(5),
 SUFFIX_CD            VARCHAR(5),
 LAST_NUMBER          INT CHECK (LAST_NUMBER>=0),
 MAX_NUMBER           INT CHECK (MAX_NUMBER>=0),
 CREATED_BY           VARCHAR(10),
 CREATED_DT           TIMESTAMP,
 UPDATED_BY           VARCHAR(10),
 UPDATED_DT           TIMESTAMP,
 PRIMARY KEY (NUMBER_CONTROL_ID,ORG_ID),
 FOREIGN KEY (ORG_ID,LOCATION_CODE)          REFERENCES BASE.M_LOCATION(ORG_ID,LOCATION_CODE),
 FOREIGN KEY (NUMBER_CONTROL_CD_ID,ORG_ID) REFERENCES BASE.M_NUMBER_CONTROL_CODES(NUMBER_CONTROL_CD_ID,ORG_ID),
 CONSTRAINT  NUMBER_CONTROL_UKEY     UNIQUE (NUMBER_CONTROL_CD_ID,LOCATION_ID)
);