use retoree_TermProject ;

INSERT INTO QUESTIONS_LIST (QUESTIONS_UID, QUESTIONS, ORDERS)
VALUES ('Q1', "현재 사용중인 제품을 선택해주세요. (답은 한가지만 선택 가능)", 1);

INSERT INTO QUESTIONS_LIST (QUESTIONS_UID, QUESTIONS, ORDERS)
VALUES ('Q2', "현재 사용중인 제품의 가격이 적당하다고 생각하십니까? (답은 한가지만 선택 가능) ", 2);

INSERT INTO QUESTIONS_LIST (QUESTIONS_UID, QUESTIONS, ORDERS)
VALUES ('Q3', "사용중인 제품의 음향은 만족스러우신가요? (답은 한가지만 선택 가능)", 3);

INSERT INTO QUESTIONS_LIST (QUESTIONS_UID, QUESTIONS, ORDERS)
VALUES ('Q4', "사용중인 제품의 디자인은 만족스러우신가요? (답은 한가지만 선택 가능)", 4);

INSERT INTO QUESTIONS_LIST (QUESTIONS_UID, QUESTIONS, ORDERS)
VALUES ('Q5', "사용중인 제품은 사용이 편리한가요? (답은 한가지만 선택 가능)", 5);

INSERT INTO EXAMPLE_LIST (EXAMPLE_UID, EXAMPLE, ORDERS)
VALUES ('E1-1', "무선 이어폰", 1);

INSERT INTO EXAMPLE_LIST (EXAMPLE_UID, EXAMPLE, ORDERS)
VALUES ('E1-2', "헤드셋", 2); 

INSERT INTO EXAMPLE_LIST (EXAMPLE_UID, EXAMPLE, ORDERS)
VALUES ('E1-3', "유선 이어폰", 3); 

INSERT INTO EXAMPLE_LIST (EXAMPLE_UID, EXAMPLE, ORDERS)
VALUES ('E1', "전혀 아니다", 1); 

INSERT INTO EXAMPLE_LIST (EXAMPLE_UID, EXAMPLE, ORDERS)
VALUES ('E2', "아니다", 2);

INSERT INTO EXAMPLE_LIST (EXAMPLE_UID, EXAMPLE, ORDERS)
VALUES ('E3', "보통이다", 3);

INSERT INTO EXAMPLE_LIST (EXAMPLE_UID, EXAMPLE, ORDERS)
VALUES ('E4', "그렇다", 4);

INSERT INTO EXAMPLE_LIST (EXAMPLE_UID, EXAMPLE, ORDERS)
VALUES ('E5', "매우 그렇다", 5);

INSERT INTO USERS_LIST (USERS_UID, PHONE, NAME, EMAIL, ID, PWD)
VALUES ('U1', '010-1234-1234', "아리아나 그란데", "ariana@gmail.com", "ariana", "ariana");

INSERT INTO USERS_LIST (USERS_UID, PHONE, NAME, EMAIL, ID, PWD)
VALUES ('U2', '010-2345-2345', "머라이어 캐리", "mariah@gmail.com", "mariah", "mariah");

INSERT INTO USERS_LIST (USERS_UID, PHONE, NAME, EMAIL, ID, PWD)
VALUES ('U3', '010-3456-3456', "테일러 스위프트", "taylor@gmail.com", "taylor", "taylor");

INSERT INTO USERS_LIST (USERS_UID, PHONE, NAME, EMAIL, ID, PWD)
VALUES ('U4', '010-4567-4567', "아델", "adele@gmail.com", "adele", "adele");

INSERT INTO USERS_LIST (USERS_UID, PHONE, NAME, EMAIL, ID, PWD)
VALUES ('U5', '010-5678-5678', "시아", "sia@gmail.com", "sia", "sia");

INSERT ANSWERS (QUESTIONS_UID, EXAMPLE_UID)
VALUES ('Q1', 'E1-1'),('Q1', 'E1-2'),('Q1', 'E1-3'),
('Q2', 'E1'),('Q2', 'E2'),('Q2', 'E3'),('Q2', 'E4'),('Q2', 'E5'),
('Q3', 'E1'),('Q3', 'E2'),('Q3', 'E3'),('Q3', 'E4'),('Q3', 'E5'),
('Q4', 'E1'),('Q4', 'E2'),('Q4', 'E3'),('Q4', 'E4'),('Q4', 'E5'),
('Q5', 'E1'),('Q5', 'E2'),('Q5', 'E3'),('Q5', 'E4'),('Q5', 'E5')
;

 INSERT SURVEY (USERS_UID, QUESTIONS_UID, EXAMPLE_UID)
VALUES ('U1', 'Q1', 'E1-1'), ('U1', 'Q2', 'E2'), ('U1', 'Q3', 'E5'), ('U1', 'Q4', 'E3'), ('U1', 'Q5', 'E3'),
('U2', 'Q1', 'E1-1'), ('U2', 'Q2', 'E2'), ('U1', 'Q3', 'E4'), ('U2', 'Q4', 'E5'), ('U1', 'Q5', 'E3'),
('U3', 'Q1', 'E1-2'), ('U3', 'Q2', 'E2'), ('U3', 'Q3', 'E5'), ('U3', 'Q4', 'E4'), ('U3', 'Q5', 'E5'),
('U4', 'Q1', 'E1-2'), ('U4', 'Q2', 'E2'), ('U4', 'Q3', 'E4'), ('U4', 'Q4', 'E1'), ('U1', 'Q5', 'E1'),
('U5', 'Q1', 'E1-1'), ('U5', 'Q2', 'E2'), ('U5', 'Q3', 'E4'), ('U5', 'Q4', 'E3'), ('U5', 'Q5', 'E2')
;
 