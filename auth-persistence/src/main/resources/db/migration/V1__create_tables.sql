CREATE TABLE users(
  idt_user			            BIGINT AUTO_INCREMENT NOT NULL,
  name  	                    VARCHAR(60) NOT NULL,
  profile  	                    VARCHAR(15) NOT NULL,
  PRIMARY KEY user_pk (idt_user),
  UNIQUE (name)
);

INSERT INTO users(name, profile)
VALUES ('Mauricio Melo', 'MASTER'),
('Alexandre Hideki', 'MASTER');