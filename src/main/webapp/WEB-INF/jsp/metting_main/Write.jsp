<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글쓰기</title>
 <style>
   body {
            font-family: Arial /*폰트설정*/
            background-color: #f8f9fa; /*배경코드 회색으로 설정*/
            display: flex;
            justify-content: center; /*가로 중앙 정렬*/
            align-items: center; /*세로 중앙 정렬*/
            flex-direction: column; /* 세로 배치  이거 안하면 가로로 배치 됨*/
            padding-top: 20px; /* 화면 상단으로 올리기 */
        }

 		.container, .content-wrapper {
            background: white; /*배경 흰색*/
            padding: 15px; /*내부 여백*/
            width: 600px; /* 양쪽 폼의 너비를 통일 */
            max-width: 10%;
            width: 600px; /* 너비 600px 설정 */
            max-width: 100%; /* 최대 너비는 화면의 100% */
        }
        h2 {
            text-align: center;
            margin-bottom: 10px;
        }

        table {
            width: 100%;
            border-collapse: collapse;
        }

        th, td {
            padding: 8px;
            text-align: left;
            vertical-align: middle;
        }

        input, textarea {
            width: 100%;
            padding: 8px;
            border: 1px solid #ccc;
            border-radius: 5px;
            box-sizing: border-box;
        }

        textarea {
            height: 120px;
            resize: none;
        }

        .short-input {
            width: 45%;
        }

        .inline-group {
            display: flex;
            align-items: center;
            gap: 10px;
        }

        .inline-group label {
            white-space: nowrap;
        }

        .btn-container {
            display: flex;
            justify-content: flex-start;
            gap: 5px;
            margin-bottom: 10px;
        }

        .btn-container button {
            padding: 6px 12px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            font-size: 14px;
            background-color: #6c757d;
            color: white;
        }

        .meeting-notes-label {
            font-weight: bold;
            font-size: 16px;
            margin-bottom: 5px;
        }
        .inline-group {
            display: flex;
            align-items: center;
            gap: 5px; /* 간격을 줄여서 작성자가 줄바꿈되지 않도록 함 */
        }

    .inline-group span {
            white-space: nowrap; /* 작성자가 줄바꿈되지 않도록 설정 */
    }

    .meeting-plan-container {
        background: white;
        padding: 15px;
        border-radius: 10px;
        box-shadow: 0px 4px 8px rgba(0, 0, 0, 0.1);
        margin-top: 20px;
    }

    .meeting-plan-label {
        font-weight: bold;
        font-size: 16px;
        margin-bottom: 10px;
        display: block;
    }

    .meeting-plan-table {
        width: 100%;
        border-collapse: collapse;
    }

    .meeting-plan-table th,
    .meeting-plan-table td {
        border: 1px solid #ccc;
        padding: 8px;
        text-align: center;
    }

    .meeting-plan-table input {
        width: 100%;
        padding: 6px;
        border: 1px solid #ccc;
        border-radius: 5px;
        box-sizing: border-box;
    }

    </style>
</head>


<body>
	   
    <div class="container">
        <h2>회의록</h2>
        <div class="btn-container">
            <button type="submit" value="등록">저장</button>
            <button type="reset">취소</button>
            <button type="submit">수정</button>
            <button type="submit">삭제</button>
        </div>
        <table>
            <tr>
                <td>1.회의록 번호</td>
                <td><input type="text" name="meeting_id" value="${meeting_id}"></td>
            </tr>
            <tr>
                <td>2.제목</td>
                <td><input type="text" name="title" value="${title}" ></td>
            </tr>
            <tr>
                <td>3.일시</td>
                <td><input type="date" name="meeting_date" value="${meeting_date}"></td>
            </tr>
            <tr>
                <td>4.장소</td>
                <td>
                    <div class="inline-group">
                        <input type="text" name="location" value="${location}"  class="short-input">
                        <span> 5.작성자</span>
                        <input type="text" name="attendees" value="${writer}" class="short-input">
                    </div>
                </td>
            </tr>
            <tr>
                <td>6.참석자</td>
                <td><input type="text" name="meeting_attendees" value="${meeting.attendees}"></td>
            </tr>
            <tr>
                <td>7.서명</td>
                <td><input type="text" name="signature"></td>
            </tr>
        </table>
    </div>

    <!-- 회의 안건 및 내용 폼 (회의록 폼 아래 배치) -->
    <div class="content-wrapper">
        <div class="meeting-notes-label">회의 안건 및 내용</div>
        <textarea class="meeting-notes">${meetingNotes.content}</textarea>
    </div>


<div class="content-wrapper">
<div class="memeeting-plan-containe">
    <label class="meeting-plan-label">향후 계획(Action Item)</label>
    <table class="meeting-plan-table">
        <colgroup>
            <col style="width: 50%;">
            <col style="width: 25%;">
            <col style="width: 25%;">
        </colgroup>
        <thead>
            <tr>
                <th>내용</th>
                <th>일정</th>
                <th>일정 및 주관</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td><input type="text" name="action_note" value="${action_note}"></td>
                <td><input type="date" name="action_date" value="${action_date}"></td>
                <td><input type="text" name="action_person" value="${action_person}"></td>
            </tr>
        </tbody>
    </table>
</div>
</div>
    
<!-- 회의 결과 및 이슈/리스크 -->
<div class="content-wrapper">
    <div class="meeting-notes-label">희의 결과 및 이슈/리스크</div>
    <textarea class="meeting_issue"> ${action_person}</textarea>
</div>

</body>
</html>