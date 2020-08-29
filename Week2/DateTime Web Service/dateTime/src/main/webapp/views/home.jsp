<%@ page import="java.util.*" %>
<%@ page import="com.sapient.dateTime.util.DatePOJO" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<c:set var="theLocale" value="${not empty param.theLocale?param.theLocale:pageConext.request.Locale }"
  scope="session" />
<fmt:setLocale value="${theLocale}" />
<fmt:setBundle basename="com.sapient.i18n.home"/>

<!DOCTYPE html>
<html>

<head>
  <title>Date Time Calculator</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
</head>

<body>

  <div class="lang_select">
    <p class="lang-txt">Display Language</p>
    <a href="home.jsp?theLocale=en_UK">English UK</a>
    <a href="home.jsp?theLocale=es_ES">Spanish ES</a>
    <a href="home.jsp?theLocale=de_DE">German DE</a>
    <a href="home.jsp?theLocale=fr_FR">French FR</a>
  </div>
  

  <form action="selection" method="get">
    <fmt:message key="label.message" />
    <!-- <select name="choice" id="choice">
      <option value="1">
        <fmt:message key="label.add_subtract" />
      </option>
      <option value="2">
        <fmt:message key="label.get_week_day" />
      </option>
      <option value="3">
        <fmt:message key="label.get_week_number" />
      </option>
      <option value="4">
        <fmt:message key="label.natural_lang" />
      </option>
    </select> -->

    <input type="radio" name="choice" value="add_subtract" id="add_subtract"> <label for="add_subtract">
      <fmt:message key="label.add_subtract" /></label>
    <input type="radio" name="choice" value="get_week_day" id="get_week_day"> <label for="get_week_day">
      <fmt:message key="label.get_week_day" /></label>
    <input type="radio" name="choice" value="get_week_number" id="get_week_number"> <label for="get_week_number">
      <fmt:message key="label.get_week_number" /></label>
    <input type="radio" name="choice" value="natural_lang" id="natural_lang"> <label for="natural_lang">
      <fmt:message key="label.natural_lang" /></label>

    <button type="submit">
      <fmt:message key="label.submit" />
    </button>


  </form>
</body>

</html>

