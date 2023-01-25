select
	*
from
	library_mst
where
	도서명 like '%나를%'
and
	순번 > 20000;
    
select
	*
from
	library_mst
where
	저작자 in('채사장', '최인철');
    

select distinct
	순번, 
    저작자
from
	library_mst;
    
/*-------------------------------<< select insert >>----------------------------------------*/
insert into author_mst 
	(author_name)
select distinct
	저작자
from
	library_mst
order by
	저작자;
    
select * from author_mst;

insert into publisher_mst
	(publisher_name)
select distinct
	출판사
from
	library_mst
order by
	출판사;
    
select * from publisher_mst;

/*-------------------------------<< select update >>----------------------------------------*/
update library_mst lm, author_mst am
set 
	lm.저작자 = am.author_id
where
	am.author_name = lm.저작자;
    
update library_mst lm, publisher_mst pm
set
	lm.출판사 = pm.publisher_id
where
	pm.publisher_name = lm.출판사;

select
	*
from
library_mst
order by
저작자;
               

select
	도서관명, 
    도서명
from
	library_mst lm
	left outer join author_mst am on(am.author_id = lm.저작자)
    left outer join publisher_mst pm on(pm.publisher_id = lm.출판사)
where
	author_name like '%지방%';

/*==================================================================*/

select
	도서관명,
    도서명
from
	library_mst lm
where
	저작자 in (select author_id from author_mst where author_name like '%지방%') ;

set profiling = 1;
set profiling_history_size = 30;
show profiles;

    






