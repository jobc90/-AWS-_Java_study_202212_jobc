
show variables like 'AUTOCOMMIT';
set autocommit = 0;

start transaction;

savepoint sp1;

insert into user_mst
values (0, 'jjjj', '1234', '김준일', 'jjjj@gmail.com');

rollback to sp2;

commit;

select
	*
from user_mst;

