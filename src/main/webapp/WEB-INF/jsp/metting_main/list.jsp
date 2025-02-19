<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>리스트</title>
<style>

.container {
    display: flex;
    flex-direction: column;
    align-items: center; /* 전체 가운데 정렬 */
    width: 100%;
    margin-top: 30px; /* 위로 올리기 */
}

/* 버튼 컨테이너 */
.btn-container {
    display: flex;
    justify-content: flex-end; /* 버튼을 오른쪽 정렬 */
    gap: 10px;
    margin-bottom: 10px;
    width: 70%; /* 테이블과 동일한 너비 */
}
/* 버튼 스타일 */
.btn-container button {
    padding: 8px 16px;
    border: none;
    border-radius: 5px;
    cursor: pointer;
    font-size: 14px;
    background-color: #6c757d;
    color: white;
}

/* 제목 중앙 정렬 */
h2 {
    text-align: center;
}

/* 테이블 크기 조절 */
table {
    width: 70%; /* 테이블 폭 조정 */
    max-width: 900px; /* 최대 너비 제한 */
    margin: 0 auto; /* 가운데 정렬 */
    border-top: 3px solid #6c757d;
    border-collapse: collapse;
}

th {
    background-color: #f8f9fa;
    text-align: center;
}

th, td {
    padding: 10px;
    border-bottom: 1px solid #ddd;
    text-align: center; /* 셀 안의 텍스트도 중앙 정렬 */
}
     </style>



</style>
</head>
<div class="container">

     <!--버튼-->
    <div class="btn-container">
        <button>글쓰기</button>
        <button>조회</button>
    </div>

    <!-- 제목 -->
    <h2>회의록 목록</h2>

    <!-- 테이블 -->
    <table>
        <tr>
            <th>회의록 번호</th>
            <th>제목</th>
            <th>일시</th>
            <th>장소</th>
            <th>작성자</th>
        </tr>
        <tr>
            <td>${meeting_id}</td>
            <td>${title}</td>
            <td>${meeting_date}</td>
            <td>${location}</td>
            <td>${writer}</td>
        </tr>
    </table>
</div>
</body>
</html>