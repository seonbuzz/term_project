create database retoree_TermProject DEFAULT char set UTF8 COLLATE UTF8_GENERAL_CI ;

use retoree_TermProject ;

CREATE TABLE ANSWERS
(
  QUESTIONS_UID VARCHAR(200) NOT NULL COMMENT '문항 대표값',
  EXAMPLE_UID   VARCHAR(200) NOT NULL COMMENT '설문답항 대표값'
) COMMENT '답변';

CREATE TABLE EXAMPLE_LIST
(
  EXAMPLE_UID VARCHAR(200) NOT NULL COMMENT '설문답항 대표값',
  EXAMPLE     VARCHAR(200) NOT NULL COMMENT '설문답항',
   ORDERS        VARCHAR(200) NOT NULL COMMENT '주문',
  PRIMARY KEY (EXAMPLE_UID)
) COMMENT '설문답항목록';

CREATE TABLE QUESTIONS_LIST
(
  QUESTIONS_UID VARCHAR(200) NOT NULL COMMENT '문항 대표값',
  QUESTIONS     VARCHAR(200) NOT NULL COMMENT '설문문항',
  ORDERS        VARCHAR(200) NOT NULL COMMENT '주문',
  PRIMARY KEY (QUESTIONS_UID)
) COMMENT '설문문항 목록';

CREATE TABLE SURVEY
(
  USERS_UID     VARCHAR(200) NOT NULL COMMENT '사용자 대표값',
  QUESTIONS_UID VARCHAR(200) NOT NULL COMMENT '설문문항 대표값',
  EXAMPLE_UID   VARCHAR(200) NOT NULL COMMENT '설문답항 대표값'
) COMMENT '설문';

CREATE TABLE USERS_LIST
(
  USERS_UID VARCHAR(200) NOT NULL COMMENT '사용자 대표값',
  PHONE     VARCHAR(200) NOT NULL COMMENT '핸드폰번호',
  NAME      VARCHAR(200) NOT NULL COMMENT '이름',
  EMAIL		VARCHAR(200) NOT NULL COMMENT '이메일',
  ID		VARCHAR(200) NOT NULL COMMENT '아이디',
  PWD		VARCHAR(200) NOT NULL COMMENT '비밀번호',
  PRIMARY KEY (USERS_UID)
) COMMENT '사용자(설문자) 목록';

ALTER TABLE ANSWERS
  ADD CONSTRAINT FK_QUESTIONS_LIST_TO_ANSWERS
    FOREIGN KEY (QUESTIONS_UID)
    REFERENCES QUESTIONS_LIST (QUESTIONS_UID);

ALTER TABLE SURVEY
  ADD CONSTRAINT FK_QUESTIONS_LIST_TO_SURVEY
    FOREIGN KEY (QUESTIONS_UID)
    REFERENCES QUESTIONS_LIST (QUESTIONS_UID);

ALTER TABLE SURVEY
  ADD CONSTRAINT FK_USERS_LIST_TO_SURVEY
    FOREIGN KEY (USERS_UID)
    REFERENCES USERS_LIST (USERS_UID);

ALTER TABLE ANSWERS
  ADD CONSTRAINT FK_EXAMPLE_LIST_TO_ANSWERS
    FOREIGN KEY (EXAMPLE_UID)
    REFERENCES EXAMPLE_LIST (EXAMPLE_UID);

ALTER TABLE SURVEY
  ADD CONSTRAINT FK_EXAMPLE_LIST_TO_SURVEY
    FOREIGN KEY (EXAMPLE_UID)
    REFERENCES EXAMPLE_LIST (EXAMPLE_UID);