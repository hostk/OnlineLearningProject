<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/common/include.jsp"%>
<%@ page isELIgnored="false" %>





<div class="container-fluid">

 



<c:forEach items="${questionlist}" var="question" varStatus="row">

		
			${row.count }
			${question.question_name }<br>
		
				 <c:forEach items="${question.answers }" var="ans">
					<input type="radio" name="radio${question.question_id }" value="${question.question_id }"/>
					 ${ans.answer_name }
				   
			 <br>
				</c:forEach> 
		
			
</c:forEach>

<button type="submit" class="btn btn-primary">Submit</button>

</div>
