
<%@ include file="common/header.jsp"%>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!--  <%@ include file="common/navigation.jsp"%>-->


  <div class="lang_select">
    <p class="lang-txt">Display Language</p>
    <a href="home.jsp?theLocale=en_UK">English UK</a>
    <a href="home.jsp?theLocale=es_ES">Spanish ES</a>
    <a href="home.jsp?theLocale=de_DE">German DE</a>
    <a href="home.jsp?theLocale=fr_FR">French FR</a>
    <a href="home.jsp?theLocale=in_HI">Hindi IND</a>
  </div>
  

  <form action="/selection" method="get">
	<div>
		<fmt:message key="label.message" />		
	</div>
    
    <div>
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
    </div>

  </form>
<%@ include file="common/footer.jsp"%>

