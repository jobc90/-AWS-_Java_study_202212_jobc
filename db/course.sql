insert into lecture_mst value (1, '트래핑', 1000000);
insert into lecture_mst value (2, '패스', 800000);
insert into lecture_mst value (3, '개인기', 900000);

select * from lecture_mst;


insert into university_mst value (1, '로마');
insert into university_mst value (2, '맨시티');
insert into university_mst value (3, '리버풀');

select * from university_mst;

insert into instructor_mst value (1, '무리뉴', 1);
insert into instructor_mst value (2, '펩', 2);
insert into instructor_mst value (3, '클롭', 3);

select * from instructor_mst;

insert into mento_mst value (1, '메시');
insert into mento_mst value (2, '음바페');

select * from mento_mst;


insert into student_mst value (1, '손흥민', 1);
insert into student_mst value (2, '김민재', 2);
insert into student_mst value (3, '황희찬', 1);

select * from student_mst;

insert into course_mst value (1, 1, 1, 1);
insert into course_mst value (2, 2, 1, 1);
insert into course_mst value (3, 3, 2, 2);
insert into course_mst value (4, 1, 3, 3);

select * from course_mst;

select
	*
from
	course_mst cm
    left outer join student_mst sm on(sm.student_id = cm.student_id)
    left outer join mentor_mst mm on(mm.mento_id = sm.mento_id)
    left outer join lecture_mst lm on(lm.lecture_id = cm.lecture_id)
    left outer join instructor_mst im on(im.instructor_id = cm.instructor_id)
    left outer join university_mst um on(um.university_id = im.university_id);
    
