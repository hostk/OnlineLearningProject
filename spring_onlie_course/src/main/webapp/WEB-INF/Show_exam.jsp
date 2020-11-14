<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/common/include.jsp"%>
<%@ page isELIgnored="false" %>





<div class="container-fluid">

 
<form:form action="/save_result" method="POST" modelAttribute="result"  >

<c:forEach items="${questionlist}" var="question" varStatus="row">

		<input type="hidden" name="resultList[${row.index }].question_id" value="${question.question_id }" />
		
			${question.question_name }<br>
		
				 <c:forEach items="${question.answers }" var="ans">
					<input type="radio" name="resultList[${row.index }].answer_id" value="${ans.answer_id }"/>
					 ${ans.answer_name }
				   
			 <br>
				</c:forEach> 
		
			
</c:forEach>

<button type="submit" class="btn btn-primary">Submit</button>
</form:form>
</div>
