create user RESTSERV
identified by <password>
default tablespace TS_RESTSERV
temporary tablespace temp;

alter user RESTSERV quota unlimited on TS_RESTSERV;

grant connect to RESTSERV;
grant resource to RESTSERV;
