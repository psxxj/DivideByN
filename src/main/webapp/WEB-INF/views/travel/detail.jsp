<%@ page pageEncoding="UTF-8" contentType="text/html;charset=utf-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
 <head>
  <title>여행 상세</title>
 </head>
 <body>
  <h1>여행 상세</h1>
  <p>이름 : ${ data.TravelName } </p>

  <p>
   <a href="/update?Travel_id=${Travel_id}">수정</a>
  </p>
  <form method="POST" action="/delete">
   <input type="hidden" name="Travel_id" value="${Travel_id}" />
   <input type="submit" value="삭제" />
  </form>
  <p>
   <a href="/list">목록으로</a>
  </p>
 </body>
</html>