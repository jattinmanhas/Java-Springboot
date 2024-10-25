INSERT INTO user_details (id, birth_date, name)
values (10001, current_date(), 'Cheon Woo');

INSERT INTO user_details (id, birth_date, name)
values (10002, current_date(), 'Heavenly Demon');

INSERT INTO user_details (id, birth_date, name)
values (10003, current_date(), 'Orthodox Faction');

INSERT INTO post (id, description, user_id)
values (20001, 'I want whole jingshu', 10001);

INSERT INTO post (id, description, user_id)
values (20002, 'I want to win over six saber school', 10001);

INSERT INTO post (id, description, user_id)
values (20003, 'I want whole some nano machine', 10001);

INSERT INTO post (id, description, user_id)
values (20004, 'I want some posts', 10003);

INSERT INTO post (id, description, user_id)
values (20005, 'I am corrupt', 10003);