<%@ page import="java.util.*" %>
<%@ page import="com.sapient.dateTime.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>


<c:set var="theLocale" value="${not empty param.theLocale?param.theLocale:pageConext.request.Locale }"
  scope="session" />
<fmt:setLocale value="${theLocale}" />
<fmt:setBundle basename="com.sapient.i18n"/>

<!DOCTYPE html>
<html>

<head>
  <title>Day of Week finder</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
</head>

<body>
    
    
  <h3>Day of the Week </h3>
  <form action="week_day" method="GET">
    <label for="week_day">Input Date:- </label>
    <input id="week_day" name="date" type="date" min="1979-12-31" max="2020-01-02" required> <br>
    <input type="submit">    
  </form>
  <h4>Result:- </h4>

</body>

</html>