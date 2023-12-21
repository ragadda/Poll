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
    poll_id int NOT NULL ,
    user_id int NOT NULL ,
    answer VARCHAR(255) NOT NULL ,
    PRIMARY KEY (user_id,poll_id),
    FOREIGN KEY (poll_id) REFERENCES poll(id)
);
