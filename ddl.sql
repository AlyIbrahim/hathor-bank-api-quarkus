create sequence hibernate_sequence start 1 increment 1;
create table Account (id int8 not null, accountId uuid, accountType varchar(255), balance int8, owner varchar(255), primary key (id));
create table AccountDetails (id int8 not null, accountId uuid, amount int8, time timestamp, transactionType varchar(255), primary key (id));
create table Transfer (id int8 not null, accountFrom uuid, accountTo uuid, amount int8, time timestamp, primary key (id));
