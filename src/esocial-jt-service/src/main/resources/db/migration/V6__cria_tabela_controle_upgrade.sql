create table EST_CONTROLE_UPGRADE (
       COD_UPGRADE integer not null,
       DES_UPGRADE varchar(200) not null);

alter table EST_CONTROLE_UPGRADE add constraint EST_CONTROLE_UPGRADE_PK primary key (COD_UPGRADE);
