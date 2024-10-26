create database bookstore;
use bookstore;

create table user
(
uid char(4) not null primary key,
uname varchar(20),
email varchar(20),
tnum varchar(15),
score int
)engine=InnoDB default charset=gbk;

create table category
(
cid int not null primary key,
cname varchar(16)
)engine=InnoDB default charset=gbk;

create table book
(
bid int not null primary key,
bname varchar(50) not null,
author char(8),
price float,
publisher varchar(50),
discount float,
cid int ,
constraint fk_cid foreign key(cid) references category(cid)
)engine=InnoDB default charset=gbk;

create table b_order
(
uid char(4) not null,
bid int not null,
ordernum int default 1,
orderdate datetime,
deliverydate datetime
)engine=InnoDB default charset=gbk;
