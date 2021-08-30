CREATE TABLE if not exists Book (
    bid INTEGER NOT NULL auto_increment, -- 主鍵序號
    bname varchar(20) not null, -- 書名
    price INTEGER, -- 價格 
    ct timestamp default current_timestamp, -- 建檔時間
    PRIMARY KEY (bid)
);

CREATE TABLE if not exists Stock (
    sid INTEGER NOT NULL auto_increment, -- 主鍵序號
    bid INTEGER NOT NULL, -- Book 主鍵
    amount INTEGER, -- 數量 
    PRIMARY KEY (sid)
);

CREATE TABLE if not exists Wallet (
    wid INTEGER NOT NULL auto_increment, -- 主鍵序號
    money INTEGER, -- 數量 
    PRIMARY KEY (wid)
);

Insert into wallet(money) values(100);
Insert into book(bname,price) values('Java',80);
Insert into stock(bid,amount) values(1,3);
