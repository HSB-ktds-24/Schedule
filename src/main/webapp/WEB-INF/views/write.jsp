<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri ="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Insert title here</title>
  </head>
  <body>
    <div class="table-box">
    <form:form method="post">
      <div>할일</div>
      <input type="text" id="subject" name="subject"/>
      <div>기간</div>
      <input type="date" id="deadline" name="deadline" />
      <input id="btn-regist" type="submit" value="저장" />
      </form:form>
    </div>
    
  </body>
</html>
