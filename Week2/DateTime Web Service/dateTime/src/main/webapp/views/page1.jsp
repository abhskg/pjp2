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
  <title>Date Arithmetic in Natural Language</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
</head>


<body>


  <h3>Add N Days to an Input Date</h3>
  <form action="add" method="GET">
    <label for="date_add">Input Date:- </label>
    <input id="date_add" name="date" type="date" min="1979-12-31" max="2020-01-02" required> <br>
    <label for="numOfDays_add">Number of Days to be Added:- </label>
    <input id="numOfDays_add" name="numOfDays" type="number" required><br>
    <input type="submit">    
  </form>
  <h4>Result:- </h4>

    <h3>Subtract N Days to an Input Date</h3>
    <form action="subtract" method="GET">
      <label for="date_subtract">Input Date:- </label>
      <input id="date_subtract" name="date" type="date" min="1979-12-31" max="2020-01-02" required> <br>
      <label for="numOfDays_subtract">Number of Days to be Subtracted:- </label>
      <input id="numOfDays_subtract" name="numOfDays" type="number" required><br>
      <input type="submit">    
    </form>
    <h4>Result:- </h4>

    <h3>Difference between two dates </h3>
    <form action="difference" method="GET">
      <label for="diff_bw_date1">Input Date 1:- </label>
      <input id="diff_bw_date1" name="date" type="date" min="1979-12-31" max="2020-01-02" required> <br>
      <label for="diff_bw_date2">Input Date 2:- </label>
      <input id="diff_bw_date2" name="date" type="date" min="1979-12-31" max="2020-01-02" required> <br>
      <input type="submit">    
    </form>
    <h4>Result:- </h4>

  </body>

</html>