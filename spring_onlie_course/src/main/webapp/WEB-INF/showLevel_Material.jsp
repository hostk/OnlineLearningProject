<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/common/include.jsp"%>
<%@ page isELIgnored="false" %>

<div class="container">

<table class="table table-borderless">
	<thead>
		<tr>
			<th>No</th>
			<th>Name</th>
			<th>Type</th>
			<th>Test</th>
			
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${levelmaterialList }" var="m" varStatus="row">
			<tr>
				<td>${row.count}</td>
				<td>${m.name}</td>
			<td><a href="/show/vedio/${m.vedioPath}">Video</a>
				<a href="/show/pdf/${m.pdfPath}">PDF</a></td>
				
				<td><c:forEach items="${m.questions }" var="question" varStatus="row">
			
			
				
			<a href="/show/exam/${question.question_id}">Exam Test</a>
				
				
		</c:forEach></td>
				
				</tr>
				
		</c:forEach>
		
		
		
	</tbody>
</table>
</div>
