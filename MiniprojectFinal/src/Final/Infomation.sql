create table member(
    name varchar2(20),
    tel  varchar2(20) constraint member_tel_nn not null,
    id   varchar2(20) constraint member_id_pk primary key,
    pw   varchar2(20)

);


create table movie(
     name   varchar2(20),
     mname  varchar2(40),
     mdate  varchar2(20),
     time   varchar2(20),
     theaternum  varchar2(20),
     seatnum varchar2(20)
);


select * from member;
select * from movie;