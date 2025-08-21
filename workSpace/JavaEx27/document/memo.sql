drop database memodb;
create database memodb;
use memodb;

drop table memo;
create table memo(
	no int primary key auto_increment comment '메모번호',
	title varchar(200)  comment '제목',
	note text comment '내용',
	wdate datetime default now() comment '작성일자'
)comment '메모장';

desc memo;

//'' = \', 
insert into memo(title, note)
value ('this is title', 'this is note');

insert into memo(title, note)
value ('she''s gone', 'this is song');
insert into memo(title, note)
value ('she''''s gone', 'this is song');
insert into memo(title, note)
value ('she""s gone', 'this is song');
select *from memo;
