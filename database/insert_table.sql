use new_servlet;
insert into role(code , name) values('ADMIN', 'Quản trị hệ thống');
insert into role(code , name) values('USER', 'Người dùng');

insert into user(username , password , fullname , roleid, status) values('admin','123456','admin',1,1);
insert into user(username , password , fullname , roleid, status) values('nguyenvana','123456','Nguyễn Văn A',2,1);
insert into user(username , password , fullname , roleid, status) values('nguyenvanb','123456','Nguyễn Văn B',2,1);