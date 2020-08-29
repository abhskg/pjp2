<%@ page import="java.util.*" %>
<%@ page import="com.sapient.dateTime.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>



<c:set var="theLocale" value="${not empty param.theLocale?param.theLocale:pageConext.request.Locale }"
  scope="session" />
<fmt:setLocale value="${theLocale}" />
<fmt:setBundle basename="com.sapient.i18n"/>
