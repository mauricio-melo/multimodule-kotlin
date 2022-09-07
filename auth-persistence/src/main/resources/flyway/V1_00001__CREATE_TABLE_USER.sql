CREATE TABLE users (
  idt_user                   BIGINT AUTO_INCREMENT NOT NULL,
  username                   VARCHAR(50) NOT NULL,
  phone_number               VARCHAR(50) NOT NULL,
  PRIMARY KEY (idt_user),
  UNIQUE (username)
 );