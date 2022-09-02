alter table `users` add column password_change_required TINYINT;
update `users` set password_change_required = false;
alter table `users` modify password_change_required TINYINT not null default 1;
