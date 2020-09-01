<%@ include file="common/header.jsp"%>

    
  <h3>Day of the Week </h3>
  <form action="week_day" method="GET">
    <label for="week_day">Input Date:- </label>
    <input id="week_day" name="date" type="date"  required> <br>
    <input type="submit">    
  </form>
  <h4>Result:- </h4>

<%@ include file="common/footer.jsp"%>
