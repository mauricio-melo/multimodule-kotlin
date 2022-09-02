alter table `users` add column name VARCHAR(255);
update `users` set name = 'John Doe';
alter table `users` modify name varchar(255) not null;