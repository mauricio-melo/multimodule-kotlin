UPDATE `authorities` set `authority` = 'ROLE_ADMIN_INTRANET'
WHERE `authority` = 'ROLE_ADMIN';

UPDATE `authorities` set `authority` = 'ROLE_USER_INTRANET'
WHERE `authority` = 'ROLE_USER';

INSERT INTO `authorities` (`username`, `authority`)
(SELECT DISTINCT(username), 'ROLE_USER_POUPAPAY' FROM `authorities`);
