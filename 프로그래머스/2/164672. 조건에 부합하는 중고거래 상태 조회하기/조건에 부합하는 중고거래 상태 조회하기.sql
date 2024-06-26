-- 코드를 입력하세요
SELECT board_id, writer_id, title, price,
    case status
        when 'SALE' then '판매중'
        when 'RESERVED' then '예약중'
        else '거래완료'
    end STATUS
from used_goods_board
where created_date = '2022-10-05'
order by Board_id desc