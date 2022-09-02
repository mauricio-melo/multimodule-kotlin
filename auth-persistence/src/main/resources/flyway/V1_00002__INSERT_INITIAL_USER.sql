INSERT INTO users (public_id, username, password, phone_number, enabled, created_at, updated_at)
  values ('3b0494bd-c39a-4b8a-bccb-cf83ef9d7d80','admin@poupachef.com.br',
  '$2a$10$wgWCmq6iou//s/7dvCcwj.BiX8BebhuBMKVCtbzoBh9bmEiQ449cG', '55 (11) 98765 4321', 1, now(),now());

INSERT INTO authorities (username, authority)
  values ('admin@poupachef.com.br', 'ROLE_ADMIN');

INSERT INTO authorities (username, authority)
  values ('admin@poupachef.com.br', 'ROLE_USER');