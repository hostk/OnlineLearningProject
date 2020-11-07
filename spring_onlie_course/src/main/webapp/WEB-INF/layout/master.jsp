<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ include file="/WEB-INF/common/include.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ include file="/WEB-INF/bootstrap.jsp"%>

<!DOCTYPE html>
<html>
<head>

<!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
       <link rel="icon" href="img/favicon.png" type="image/png">
        <title>Learn IT Education</title>
        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="<c:url value='/resources/css/bootstrap.css'/> " >
        <link rel="stylesheet" href="<c:url value='/resources/vendors/linericon/style.css'/>" >
        <link rel="stylesheet" href="<c:url value='/resources/css/font-awesome.min.css'/>" type="text/css">
        <link rel="stylesheet" href="<c:url value='/resources/vendors/owl-carousel/owl.carousel.min.css'/> ">
        <link rel="stylesheet" href="<c:url value='/resources/vendors/lightbox/simpleLightbox.css'/>">
        <link rel="stylesheet" href="<c:url value='resources/vendors/nice-select/css/nice-select.css'/>">
        <link rel="stylesheet" href="<c:url value='/resources/vendors/animate-css/animate.css'/> ">
        <link rel="stylesheet" href="<c:url value='/resources/vendors/popup/magnific-popup.css'/> ">
        <!-- main css -->
        <link rel="stylesheet" href="<c:url value='/resources/css/style.css'/>" >
        <link rel="stylesheet" href="<c:url value='/resources/css/responsive.css'/>" >



 		<script src="<c:url value='/resources/js/jquery-3.3.1.min.js'/> "></script>
        <script src="<c:url value='/resources/js/popper.js'/> "></script>
        <script src="<c:url value='/resources/js/bootstrap.min.js'/> "></script>
        <script src="<c:url value='/resources/js/stellar.js'/> "></script>
        <script src="<c:url value='/resources/vendors/lightbox/simpleLightbox.min.js'/> "></script>
        <script src="<c:url value='/resources/vendors/nice-select/js/jquery.nice-select.min.js'/> "></script>
        <script src="<c:url value='/resources/vendors/isotope/imagesloaded.pkgd.min.js' />"></script>
        <script src="<c:url value='/resources/vendors/isotope/isotope.pkgd.min.js'/> "></script>
        <script src="<c:url value='/resources/vendors/owl-carousel/owl.carousel.min.js' />"></script>
        <script src="<c:url value='/resources/vendors/popup/jquery.magnific-popup.min.js' />"></script>
        <script src="<c:url value='/resources/js/jquery.ajaxchimp.min.js' /> "></script>
        <script src="<c:url value='/resources/vendors/counter-up/jquery.waypoints.min.js' />"></script>
        <script src="<c:url value='/resources/vendors/counter-up/jquery.counterup.js'/> "></script>
        <script src="<c:url value='/resources/js/mail-script.js' /> "></script>
        <script src="<c:url value='/resources/js/theme.js'/> "></script>

</head>
<body>
	<div>
		<tiles:insertAttribute name="header" />
		<tiles:insertAttribute name="body" />
		<tiles:insertAttribute name="footer" />
	</div>
</body>
</html>