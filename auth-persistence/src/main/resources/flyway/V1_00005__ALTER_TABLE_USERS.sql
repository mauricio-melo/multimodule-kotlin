UPDATE `users` set phone_number = replace(replace(replace(phone_number,")", ""), "(", ""), " ", "");

UPDATE `users` set phone_number = '5516991865212'
    where username = 'fg@poupachef.com.br';

UPDATE `users` set phone_number = '5511992002315'
    where username = 'jn@poupachef.com.br';

UPDATE `users` set phone_number = '5511987256815'
    where username = 'leocosta.black@gmail.com';

UPDATE `users` set phone_number = '5511971526593'
    where username = 'maluizafelix@gmail.com';

UPDATE `users` set phone_number = '5511996205600'
    where username = 'pc@poupachef.com.br';

UPDATE `users` set phone_number = '5511983831940'
    where username = 'ac@poupachef.com.br';

ALTER TABLE `users`
    add constraint UK_unique_phone_number unique (phone_number);