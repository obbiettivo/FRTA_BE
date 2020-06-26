create table CAR (
  ID	   	   NUMBER not null,
  NAME             VARCHAR2(20) not null,
  constraint CAR_PK primary key (ID)
) tablespace TS_RESTSERV;

grant insert, update, delete, select on CAR to RESTSERV;

CREATE SEQUENCE "RESTSERV"."CAR_SEQ" MINVALUE 1 MAXVALUE 9999999 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER  NOCYCLE  NOKEEP  NOSCALE  GLOBAL;