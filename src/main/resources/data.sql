DROP TABLE IF EXISTS poll;
DROP TABLE IF EXISTS answer;

CREATE TABLE poll(
    id int  NOT NULL AUTO_INCREMENT ,
    title VARCHAR(255) NOT NULL DEFAULT '',
    first_answer VARCHAR(255) NOT NULL DEFAULT '' ,
    second_answer VARCHAR(255) NOT NULL DEFAULT '' ,
    third_answer VARCHAR(255) NOT NULL DEFAULT '' ,
    fourth_answer VARCHAR(255) NOT NULL DEFAULT '',
    PRIMARY KEY(id)
);

CREATE TABLE answer(
    id int NOT NULL AUTO_INCREMENT,
    poll_id int NOT NULL ,
    user_id int NOT NULL ,
    answer VARCHAR(255) NOT NULL ,
    PRIMARY KEY (user_id,poll_id),
    FOREIGN KEY (poll_id) REFERENCES poll(id)
);

INSERT INTO poll (title,first_answer,second_answer,third_answer,fourth_answer)
VALUES ('aaa','aa','ab','ac','ad'),
       ('bbb','ba','bb','bc','bd'),
       ('ccc','ca','cb','cc','cd');

INSERT INTO answer (poll_id, user_id, answer)
VALUES (1,1,'aa'),
       (1,2,'ba'),
       (2,3,'aa');