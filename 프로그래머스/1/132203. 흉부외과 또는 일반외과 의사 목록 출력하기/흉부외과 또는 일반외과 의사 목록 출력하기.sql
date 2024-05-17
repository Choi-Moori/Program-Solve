-- 코드를 입력하세요
SELECT DR_NAME, DR_ID, MCDP_CD, DATE_FORMAT(HIRE_YMD, '%Y-%m-%d') as HIRE_YMD
from doctor
where MCDP_CD in('CS', 'GS')
order by HIRE_YMD DESC, DR_NAME;
