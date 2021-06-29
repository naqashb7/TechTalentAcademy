Use Naqash;
Create Table Item(
ITEMID varchar(100),
Dish varchar(100),
Price double,
Category varchar(100),
PRIMARY KEY (ITEMID));


insert into Item (ITEMID, Dish, Price, Category) values ('9009', 'Biryani' , 25.00, 'Specials');
insert into Item (ITEMID, Dish, Price, Category) values ('4565', 'Pilau' , 18.00, 'Mains');
insert into Item (ITEMID, Dish, Price, Category) values ('4568', 'Palak Paneer' , 17.00, 'Mains');
insert into Item (ITEMID, Dish, Price, Category) values ('1848', 'Lasagne' , 15.00, 'Italian');
insert into Item (ITEMID, Dish, Price, Category) values ('9320', 'Chicken Karahi' , 20.00, 'Mains');
insert into Item (ITEMID, Dish, Price, Category) values ('2349', 'Alfredo Fettucini' , 22.00, 'Italian');
insert into Item (ITEMID, Dish, Price, Category) values ('5783', 'Chow Mein' , 14.00, 'Chinese');
insert into Item (ITEMID, Dish, Price, Category) values ('2468', 'Stir Fried Rice' , 20.00, 'Chinese');
insert into Item (ITEMID, Dish, Price, Category) values ('2467', 'Cookie Dough' , 5.00, 'Desserts');
insert into Item (ITEMID, Dish, Price, Category) values ('2346', 'Cheesecake' , 5.00, 'Desserts');


/*Total number of dishes served in the hotel*/
 select count(dish) from item;

/*Selecting dishes as per certain categories*/
select * from item where category = 'Mains';

