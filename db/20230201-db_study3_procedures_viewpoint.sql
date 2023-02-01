call insert_product('아이패드 프로');


select
	*
from
library_mst;

create view library_view as
select
	row_number() over(partition by 도서관명 order by 도서관명) as 도서관순번,
    도서관명
from
	library_mst
group by
	도서관명;
    
    
select
	*
from
	 library_view;