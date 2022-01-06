create schema coupon_system;
use coupon_system;
create table company (
`id` int primary key auto_increment,
`name` varchar(50),
`email` varchar (50),
`password` varchar (50)
);

create table customer (
`id` int primary key auto_increment,
`first name` varchar(50),
`last name` varchar (50),
`email` varchar (50),
`password` varchar (50)
);

create table coupon (
`id` int primary key auto_increment,
`company_id` int,
`category` varchar(50),
`title` varchar(50),
`description` varchar(100),
`start_date` date,
`end_date` date,
`amount` int,
`price` float,
`image` varchar (255),
foreign key (`company_id`) references `company`(`id`)
);

create table customer_coupon(
customer_id int,
coupon_id int,
primary key(customer_id,coupon_id), 
foreign key (`customer_id`) references `customer`(`id`),
foreign key (`coupon_id`) references `coupon`(`id`)
);



