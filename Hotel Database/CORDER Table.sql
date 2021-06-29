Use  Naqash;
Create table CORDER (
ORDERID int AUTO_INCREMENT,
CNAME varchar (100),
Phone varchar (100),
Address varchar (100),
Itemid varchar (100),
QTY int,
Total double,
Date varchar (100),
PRIMARY KEY (ORDERID),
FOREIGN KEY (Itemid) References Item (ITEMID)) ;
insert into CORDER(orderid,cname,phone,address,qty,total, date) values(376 , 'Facebook' , '01937493738', 'California', 2, 150.00, 'July 2021');
insert into CORDER(orderid,cname,phone,address,qty,total,date) values(837 , 'Twitter' , '08365947592', 'New York', 2, 200.00, 'June 2021');
insert into CORDER(orderid,cname,phone,address,qty,total,date) values(745 , 'Instagram' , '07592836583', 'London', 2, 300.00, 'September 2021');
insert into CORDER(orderid,cname,phone,address,qty,total,date) values(985 , 'Snapchat' , '02983562029', 'Beijing', 1, 100.00, 'March 2021');
insert into CORDER(orderid,cname,phone,address,qty,total,date) values(234 , 'Tinder' , '01309583855', 'Paris', 2, 80.00, 'April 2021');
insert into CORDER(orderid,cname,phone,address,qty,total,date) values(177 , 'Messenger' , '02985724895', 'Shanghai', 1, 330.00, 'January 2021');
insert into CORDER(orderid,cname,phone,address,qty,total,date) values(546 , 'Tiktok' , '02089457024', 'Moscow', 1, 370.00, 'December 2021');
insert into CORDER(orderid,cname,phone,address,qty,total,date) values(474 , 'WhatsApp' , '04698025931', 'Los Angeles', 1, 260.00, 'August 2021');
insert into CORDER(orderid,cname,phone,address,qty,total,date) values(754 , 'BBC News' , '01215928457', 'Birmingham', 4, 340.00, 'June 2021');
insert into CORDER(orderid,cname,phone,address,qty,total,date) values(843 , 'Manchester United' , '01928376563', 'Manchester', 1, 90.00, 'October 2021');


update corder set itemid= '1848' where orderid= '376';
update corder set itemid= '2346' where orderid= '837';
update corder set itemid= '2349' where orderid= '745';
update corder set itemid= '2467' where orderid= '985';
update corder set itemid= '2468' where orderid= '234';
update corder set itemid= '4565' where orderid= '177';
update corder set itemid= '4568' where orderid= '546';
update corder set itemid= '5783' where orderid= '474';
update corder set itemid= '9009' where orderid= '754';
update corder set itemid= '9320' where orderid= '843';


/*Displaying the total number of orders in a specific date */
Select count(qty) from CORDER where date= 'June 2021';




/* Total number of orders per day (total quantity of orders)*/

select count(qty) from corder;

select * from corder;