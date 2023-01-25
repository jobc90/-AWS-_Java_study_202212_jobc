/*===================<< select >>===================*/

select * from student_mst;

/* 전체 컬럼 조회 */
select
	*
from
	student_mst;
    
/* 지정 컬럼 조회 */
select
	mentor_id,
    student_name,
    student_id
from
	student_mst;
    
/* 임시 컬럼 추가 */
select
	1 as '연봉',
    '손흥민' as '이름';
    
select
	student_id,
    student_name,
    '손흥민' as instructor_name
from
	student_mst;
    
/* 컬럼명을 임시로 바꾸는 방법 as(alias) 알리아스 (java에서 변수명과 매칭이 되기때문에 카멜표기법으로 바꿔준다.)*/ 
/* 컬럼에는 생략을 안하고 테이블명에는 생략이 가능하다.*/
select
	sm.student_id as studentId
from
	student_mst sm;
    
/* 조회조건 where */
select
	*
from
	student_mst
where
	mentor_id = (select
					mentor_id
				from
					mentor_mst
				where
					mentor_name = '메시');
                    
select
	*
from
	student_mst
where
	mentor_id = (select
					mentor_id
				from
					mentor_mst
				where
					mentor_name = '메시');
/*﻿like 문법 - %는 '상관없음'을 나타낸다.*/
                    
select
	*
from
	library_mst
where
	저작자 in('채사장 지음', '최인철 지음');
/*﻿in 문법 - '해당 문자열과 일치하는' 내용을 찾아낸다.*/
                    
select
	student_id,
    student_name,
    mentor_id,
    (select
		mentor_name
	from
		mentor_mst
	where
		mentor_id = student_mst.mentor_id) as mentor_name
from
	student_mst;
    
/*subquery를 쓸 때에는 하나의 값만 출력 되도록 한다.*/ 

/* 그룹으로 묶어서 조회하기 - 그룹끼리 묶어서 연산처리를 하기 위해 사용한다. */
/*count, min, max를 많이 사용한다.*/
select
	count(mentor_id),
    min(student_id),
    max(student_id),
    avg(student_id),
    sum(student_id),
    mentor_id
from
	student_mst
group by
	mentor_id;

/* 중복 제거 */
select distinct
	mentor_id
from
	student_mst;


/* 그룹으로 조회한 결과에 조건주는 방법  having은 group by이후에 조건을 주는 방법이다. */
select
	count(mentor_id) as mentor_count,
    min(student_id),
    max(student_id),
    avg(student_id),
    sum(student_id),
    mentor_id
from
	student_mst
group by
	mentor_id
having
	mentor_count = 6;


/* 정렬 - order by(기본적으로 오름차순, 내림차순은 + desc) */
select
	*
from
	student_mst
 order by
	mentor_id,
    student_id desc;
    
/* 전체 조합 실습 */
select
	count(*) as student_count,
    mentor_id
from
	student_mst
where
	student_id > 2
group by
	mentor_id
having 
	student_count = 1
order by
	mentor_id desc;
    
select
	*
from
	student_mst;

