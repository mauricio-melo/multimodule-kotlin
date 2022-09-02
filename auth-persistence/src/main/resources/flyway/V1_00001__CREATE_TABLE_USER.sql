CREATE TABLE `users` (
  public_id CHAR(36) not null,
  username VARCHAR(50) NOT NULL UNIQUE,
  password VARCHAR(100) NOT NULL,
  phone_number CHAR(36) not null,
  enabled TINYINT NOT NULL DEFAULT 1,
  created_at DATETIME NOT NULL,
  updated_at DATETIME NOT NULL,
  PRIMARY KEY (username)
 );

 alter table `users`
    add constraint UK_unique_public_id_owner unique (public_id);

CREATE TABLE `authorities` (
  id bigint not null auto_increment,
  username VARCHAR(50) NOT NULL,
  authority VARCHAR(50) NOT NULL,
  FOREIGN KEY (username) REFERENCES users(username),
  PRIMARY KEY (id)
);

CREATE UNIQUE INDEX ix_auth_username
  on authorities (username,authority);
