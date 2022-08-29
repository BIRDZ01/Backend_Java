drop table if exists users;

create table users(
    bird_id integer not null,
    screen_name varchar(100) not null unique,
    name varchar(100) not null unique,
    address varchar(255) not null,
    city varchar(255) not null,
    state char(2) not null,
    zipcode integer(5) not null,
    user_code integer(6) not null,
    pass_code integer(6) not null,
    num_children integer(2) not null,
    er_contact_name varchar(100) not null,
    er_contact_number integer(10) not null,
    er_contact_email varchar(255),
    primary key(bird_id)
);
