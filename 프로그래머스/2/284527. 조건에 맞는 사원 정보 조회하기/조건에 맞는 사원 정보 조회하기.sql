-- HR_DEPARTMENT(부서 정보 테이블), HR_EMPLOYEES(사원 정보 테이블), HR_GRADE(사원 평가 테이블)
SELECT SUM(G.SCORE) AS SCORE, E.EMP_NO, E.EMP_NAME, E.POSITION, E.EMAIL
FROM HR_EMPLOYEES E
JOIN HR_GRADE G ON E.EMP_NO = G.EMP_NO
GROUP BY E.EMP_NO, E.EMP_NAME, E.POSITION, E.EMAIL
HAVING SUM(G.SCORE) >= ALL (SELECT SUM(G1.SCORE) FROM HR_GRADE G1 GROUP BY G1.EMP_NO);