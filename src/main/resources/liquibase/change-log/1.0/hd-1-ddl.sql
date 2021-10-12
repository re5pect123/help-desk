CREATE TABLE IF NOT EXISTS hd_users (
      id number not null,
      username varchar2(30) not null,
      password varchar2(30),
      repeatable_password varchar2(30),
      roles varchar2(10)
);