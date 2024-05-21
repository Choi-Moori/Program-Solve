-- 코드를 입력하세요
SELECT date_format(datetime, '%H') as HOUR, count(*) as COUNT
from animal_outs
where date_format(datetime, '%H') between 09 and 20
group by HOUR
order by HOUR;