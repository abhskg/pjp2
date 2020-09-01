<%@ page import="java.util.*" %>
<%@ page import="com.sapient.dateTime.util.DatePOJO" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>


<c:set var="theLocale" value="${not empty param.theLocale?param.theLocale:pageConext.request.Locale }"
  scope="session" />
<fmt:setLocale value="${theLocale}" />
<fmt:setBundle basename="com.sapient.i18n.home"/>


<!DOCTYPE html>
<head>
<title>Date Time Calculator</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
</head>

<body>