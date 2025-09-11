mysql -u root -p
drop database boardb;
create database boardb;
use boardb;

drop table user;
create table user(
	userid varchar(50) primary key comment '아이디',
	userpw varchar(100) not null comment '비밀번호',
	name varchar(50) not null comment '이름',
	gender varchar(2) not null comment '성별',
	hobby varchar(2) not null comment '취미',
	fav varchar(50) comment '관심분야',
	retire varchar(2) default 'N' comment '탈퇴여부',
	joindate datetime default now() comment '가입일자'
) comment '회원정보';

desc user;


drop table board;
create table board(
	no int primary key auto_increment comment '게시물번호',
	userid varchar(50) not null comment '아이디',
	title varchar(200) not null comment '제목',
	kind varchar(2) comment '구분',
	note text not null comment '내용',
	pname varchar(200) comment '물리파일명',
	fname varchar(200) comment '논리파일명',
	wdate datetime default now() comment '작성일',
	hit int default 0 comment '조회수',
	foreign key(userid) references user(userid)
) comment '게시물정보';
desc board;


drop table reply;
create table reply(
	rno int primary key auto_increment comment '댓글번호',
	no int not null comment '게시물번호',
	userid varchar(50) not null comment '아이디',
	rnote text comment '댓글내용',
	rwdate datetime comment '댓글작성일',
	foreign key(no) references board(no),
	foreign key(userid) references user(userid)
) comment '댓글정보';
desc reply;
