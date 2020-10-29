<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="/WEB-INF/common/include.jsp"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<embed src="/images/${levelmaterial.pdfPath}#toolbar=0&navpanes=0&scrollbar=0" type="application/pdf" width="100%" height="600px" />

</body>
</html>