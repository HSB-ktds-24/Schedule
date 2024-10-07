<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Insert title here</title>
 <link href="/css/main.css" rel="stylesheet" type="text/css"/>
  </head>
  <body>

    <div class="table-box">
        <div class="table-header">
          <div class="number">번호</div>
          <div class="state">상태</div>
          <div class="subject">제목</div>
          <div class="deadline">기한</div>
          <div class="confirm-btn"></div>
          <div class="delete-btn"></div>
        </div>
		
		<c:choose>
		<c:when test="${not empty scheduleList }">
		<c:forEach items="${scheduleList}" var="schedule">	
	      <div class="table-row">
          <div class="number">${schedule.id}</div>
          <c:if test="${schedule.isdone == 'Y'}">
          	<div class="state">done</div>
			</c:if>
		  <c:if test="${schedule.isdone != 'Y'}">
    		<div class="state">-</div> <!-- "In Progress" in Korean -->
			</c:if>
          <div class="subject">${schedule.subject}</div>
          <div class="deadline">${schedule.deadline}</div>
          <div class="confirm-btn"><a href="<c:url value ='/post/done/${schedule.id}'/>">완료</a></div>
          <div class="delete-btn"><a href="/post/remove/${schedule.id}">삭제</a></div>
          </div>
		</c:forEach>
		</c:when>
		
		<c:otherwise>
	
		게시글이 없습니다 
		
		</c:otherwise>
		</c:choose>
      </div>
</html>
