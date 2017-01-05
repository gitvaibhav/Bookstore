use bookstore;

/* user*/
drop table if exists user_tb;
create table user_tb(
id int PRIMARY key auto_increment,
userName varchar(255) unique not null ,
pwd varchar(255) not null,
realName varchar(255) not null,
address varchar(255) not null,
zip_code varchar(255) not null,
phone varchar(255) not null,
email varchar(255)
);

/*kind*/
drop table if exists kind_tb;
create table kind_tb(
kID int primary key,
kName varchar(255),
kDes varchar(255)
);
/*order*/
drop table if exists order_tb;
create table order_tb(
oID int primary key,
oPay float,
oSend varchar(255),
oDate date,
uId int,
foreign key(uId) references user_tb(id)
);
/*item*/
drop table if exists item_tb;
create table item_tb(
id int primary key,
iCost float,
iNum int,
oID int,
foreign key(oID) references order_tb(oID)
);
/*book*/
drop table if exists book_tb;
create table book_tb(
bID int primary key,
bName varchar(255),
bDes varchar(255),
bAuth varchar(255),
bEitor varchar(255),
bPage int,
bPubDate date,
kID int,
iId int,
foreign key(kID) references kind_tb(kID),
foreign key(iId) references item_tb(id)
);






