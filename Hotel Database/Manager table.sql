Use Naqash;
Create table MANAGER(
mid int,
Name varchar(100),
SHIFT varchar(100),
SALARY double,
PRIMARY KEY (mid)
);

insert into Manager(mid , Name , SHIFT , SALARY) values(1 , 'Archer' , 'Morning', 40000.00);
insert into Manager(mid , Name , SHIFT , SALARY) values(2 , 'Sterling' , 'Morning', 30000.00);
insert into Manager(mid , Name , SHIFT , SALARY) values(3 , 'Cyril' , 'Afternoon', 20000.00);
insert into Manager(mid , Name , SHIFT , SALARY) values(4 , 'Lana' , 'Evening', 50000.00);
insert into Manager(mid , Name , SHIFT , SALARY) values(5 , 'Rick' , 'Afternoon', 60000.00);
insert into Manager(mid , Name , SHIFT , SALARY) values(6 , 'Morty' , 'Full Day', 35000.00);
insert into Manager(mid , Name , SHIFT , SALARY) values(7 , 'Iroh' , 'Post-tea', 60000.00);
insert into Manager(mid , Name , SHIFT , SALARY) values(8 , 'Aang' , 'Full Day', 33000.00);
insert into Manager(mid , Name , SHIFT , SALARY) values(9 , 'Sokka' , 'Afternoon', 30000.00);
insert into Manager(mid , Name , SHIFT , SALARY) values(10 , 'Tommy' , 'Night', 80000.00);



/*Average salary of managers*/
select avg(salary) as MSalary from Manager;


