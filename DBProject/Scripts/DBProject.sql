--member 테이블 
CREATE TABLE member (
	"MEMBER_ID" NUMBER	NOT NULL,
	"MEMBER_LOGINID"	VARCHAR2(20)	NOT NULL,
	"MEMBER_PASSWORD"	VARCHAR2(20)	NOT NULL,
	"MEMBER_NAME"	VARCHAR2(20)		NOT NULL,
	"MEMBER_NICKNAME"	VARCHAR2(20)	,
	"MEMBER_PHONENUMBER"	VARCHAR2(20)	,
	"MEMBER_BIRTH"	DATE	,
	"MEMBER_REGDATE"	DATE	,
	"MEMBER_DEL"	VARCHAR2(1)	DEFAULT 'N'	NOT NULL,
	"MEMBER_ADDRESS"	VARCHAR2(100) ,
	"MEMBER_EMAIL"	VARCHAR2(50),
	CONSTRAINT member_PK PRIMARY KEY (MEMBER_ID)
);
CREATE SEQUENCE MEMBER_MEMBER_ID START WITH 1 INCREMENT BY 1;
--coupon테이블
CREATE TABLE coupon (
	"COUPON_ID"	NUMBER 	NOT NULL,
	"COUPON_NAME"	VARCHAR(20)		,
	"COUPON_DISCOUNT"	NUMBER(10)		,
	"COUPON_SDATE"	DATE		,
	"COUPON_EDATE"	DATE	,	
	CONSTRAINT coupon_PK PRIMARY KEY (COUPON_ID)
);
CREATE SEQUENCE coupon_COUPON_ID START WITH 1 INCREMENT BY 1;
--member_coupon 테이블
CREATE TABLE MEMBER_COUPON(
	"COUPON_ID"	NUMBER 	NOT NULL,
	"MEMBER_ID"	NUMBER 	NOT NULL,
	CONSTRAINT MEMBER_COUPON_FK1 FOREIGN KEY (COUPON_ID) REFERENCES coupon (COUPON_ID),
	CONSTRAINT MEMBER_COUPON_FK2 FOREIGN KEY (MEMBER_ID) REFERENCES member(MEMBER_ID)
);
--product 테이블
CREATE TABLE product (
	"PRODUCT_ID"	NUMBER NOT NULL,
	"PRODUCT_NAME"	VARCHAR2(20)	NOT NULL,
	"PRODUCT_PRICE"	NUMBER(20)		NOT NULL,
	"PRODUCT_INVENTORY"	NUMBER(38)		,
	"PRODUCT_DETAIL"	VARCHAR2(50)	,
	"PRODUCT_SOLD"	VARCHAR2(2)		,
	"PRODUCT_REGDATE"	DATE	,
	CONSTRAINT product_PK PRIMARY KEY (PRODUCT_ID)
);
CREATE SEQUENCE product_PRODUCT_ID START WITH 1 INCREMENT BY 1;
--order 테이블
CREATE TABLE "ORDER"(
	"ORDER_ID"	NUMBER 	NOT NULL,
	"MEMBER_ID"	NUMBER NOT NULL,
	"ORDER_DATE"	DATE	,
	"ORDER_ADDRESS"	VARCHAR2(20)	,
	"ORDER_SUMPRICE"	NUMBER(38),
	CONSTRAINT ORDER_PK PRIMARY KEY (ORDER_ID),
	CONSTRAINT ORDER_FK FOREIGN KEY (MEMBER_ID) REFERENCES MEMBER(MEMBER_ID)
);
CREATE SEQUENCE ORDER_ORDER_ID START WITH 1 INCREMENT BY 1;
--order_detail 테이블
CREATE TABLE order_detail(
	"PRODUCT_ID"	NUMBER 	NOT NULL,
	"ORDER_ID"	NUMBER 	NOT NULL,
	"odCOUNT"	NUMBER(38)	,
	"odPRICE"	NUMBER(38)	,
	CONSTRAINT order_detail_FK1 FOREIGN KEY (PRODUCT_ID) REFERENCES product(PRODUCT_ID),
	CONSTRAINT order_detail_FK2 FOREIGN KEY (ORDER_ID) REFERENCES "ORDER"(ORDER_ID)
);
--qua 테이블 
CREATE TABLE qna(
	"QNA_ID"	NUMBER 	NOT NULL,
	"QNA_TITLE"	VARCHAR2(20)	,
	"QNA_CONTENT"	VARCHAR2(200)		,
	"QNA_REGDATE"	DATE		,
	"QNA_SECRET"	NUMBER(1)	,
	CONSTRAINT qna_QNA_ID PRIMARY KEY (QNA_ID)
);
CREATE SEQUENCE qna_QNA_ID START WITH 1 INCREMENT BY 1;
--qua-c 테이블 
CREATE TABLE "QNA-C" (
	"QNA_ ANSWER"	VARCHAR2(100)		NULL
);
--admin 테이블
CREATE TABLE "ADMIN" (
	"ADMIN_ID"	NUMBER 	NOT NULL,
	"ADMIN_LOGINID"	VARCHAR2(10)	,
	"ADMIN_PASSWORD"	VARCHAR2(10)	,
	"ADMIN_NAME"	VARCHAR2(20)	,
	CONSTRAINT ADMIN_ADMIN_ID PRIMARY KEY (ADMIN_ID)
);
CREATE SEQUENCE ADMIN_ADMIN_ID START WITH 1 INCREMENT BY 1;
--board 테이블
CREATE TABLE board(
	"BOARD_ID"	NUMBER(10)	NOT NULL,
	"BOARD_WRITER"	VARCHAR2(20)	,
	"BOARD_TITLE"	VARCHAR2(20)	,
	"BOARD_CONTENT"	VARCHAR2(200)		,
	"BOARD_REGDATE"	DATE	,
	CONSTRAINT board_BOARD_ID PRIMARY KEY (BOARD_ID)
);
CREATE SEQUENCE board_BOARD_ID START WITH 1 INCREMENT BY 1;
--cart_item 테이블
CREATE TABLE cart_item (
	"CART_ID"	NUMBER 	NOT NULL,
	"PRODUCT_QUANTITY"	NUMBER(10)	,
	"PRODUCT_PRICE"	NUMBER(38)	,
	CONSTRAINT cart_item_CART_ID PRIMARY KEY (CART_ID)
);
CREATE SEQUENCE cart_item_CART_ID START WITH 1 INCREMENT BY 1;
--cart_order 테이블
CREATE TABLE cart_order (
	"CART_PRICE" 	NUMBER(20)	
);







