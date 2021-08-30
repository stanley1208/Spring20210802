-- 建立 web 資料庫
create database web character set utf8mb4 collate utf8mb4_general_ci;

-- 建立 Emp 資料表
create table emp(
	eid int not null auto_increment, -- 主鍵 (自行產生序號: 1, 2, 3, ...)
	ename varchar(50) not null unique, -- 員工姓名
	age int, -- 員工年齡
	createtime timestamp default current_timestamp, -- 建檔時間
	primary key(eid)
);

-- 建立 Emp 範例資料
insert into emp(ename, age) values('john', 28);
insert into emp(ename, age) values('mary', 30);
insert into emp(ename, age) values('bobo', 29);

-- 查詢 Emp 資料
select eid, ename, age, createtime from emp;




