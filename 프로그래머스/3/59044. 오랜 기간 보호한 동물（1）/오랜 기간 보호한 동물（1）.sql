-- 코드를 입력하세요
SELECT NAME, DATETIME
FROM ANIMAL_INS
WHERE ANIMAL_ID NOT IN (SELECT ANIMAL_ID
                       FROM ANIMAL_OUTS)
ORDER BY DATETIME
LIMIT 3