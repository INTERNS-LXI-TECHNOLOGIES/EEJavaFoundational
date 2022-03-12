create schema carshowroom;
use carshowroom;
create table CAR (
    car_id int not null auto_increment, 
    manufacturer varchar(100) not null,
    model varchar(100) not null,
    variant varchar(10) not null,
    year int not null,
    total_kilometers int not null,
	expected_price int not null,
    other_details varchar(500),
    primary key (car_id)
);