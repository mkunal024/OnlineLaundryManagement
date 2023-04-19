create table customer(
custid int primary key,
custname varchar(20) not null,
custmobile varchar(12),
custemail varchar(30),
custaddress varchar(100)
);

create table payment(
pid int primary key,
pmode varchar(10),
pamt double(6,2)
);

create table employee(
eid int primary key,
ename varchar(20) not null,
eaddress varchar(30)
);


create table category(
catid int primary key,
type varchar(20),
price double(6,2)
);

create table bill(
orderid int primary key,
custid int,
catid int,
qty int,
tamount double(6,2),
constraint foreign key fk_custid(custid) references customer(custid),
constraint foreign key fk_catid(catid) references category(catid)
);

 
create table reviews(
custid int primary key,
comment varchar(50),
rating int,
constraint foreign key fk_reviews(custid) references customer(custid)
);


//demo data

insert into customer values(1,'Ravi',8888,'ravi@gmail.com','Ravi house');
insert into customer values(2,'Sham',9999,'sham@gmail.com','Sham house');
insert into customer values(3,'Vijay',6666,'vijay@gmail.com','Vijay house');
insert into customer values(4,'Raju',3333,'raju@gmail.com','Raju house');
insert into customer values(5,'Vicky',2222,'vicky@gmail.com','Vicky house');
insert into customer values(6,'Tina',6667,'tina@gmail.com','Tina house');

//category
insert into category values(101,'Shoe Washing',50);
insert into category values(102,'Clothes Washing/kg',60);
insert into category values(103,'Washing+iron/kg',90);
//bill
insert into bill values(550,1,102,3,180);
insert into bill values(552,1,101,2,100);
