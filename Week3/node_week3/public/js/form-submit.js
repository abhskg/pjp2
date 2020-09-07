
function formSubmit(form)
{
  console.log(form.date1.value);
    console.log("inisde click");

    var result;

    var option = form.myOption.value;
    var temp = form.date1.value.split("/");
    var date1 = new Date(temp[2],temp[1] - 1,temp[0]);
    console.log(date1);

    var date = new Date(date1);

    temp = form.date2.value.split("/");
    var date2 = new Date(temp[2] , temp[1] - 1 , temp[0]);

    var n = form.n.value;

    switch(option){
        case "Tomorrow":
            result = tomorrow(date);
            break;
        case "Yesterday":
            result = yesterday(date);
            break;
        case "Day-after tomorrow":
            result = dayAfterTomorrow(date);
            break;
        case "Day-before yesterday":
            result = dayBeforeYesterday(date);
            break;

        case "Add days":
            result = addDays(date, n);
            break;
        case "Add months":
            result = addDays(date, n);
            break;
        case "Add Weeks":
            result = addDays(date, n);
            break;
        case "Add years":
            result = addDays(date, n);
            break;     

        case "Minus days":
            result = minusDays(date, n);
            break;
        case "Minus months":
            result = minusMonths(date, n);
            break;
        case "Minus Weeks":
            result = minusWeeks(date, n);
            break;
        case "Minus years":
            result = minusYears(date, n);
            break;

        case "Difference between dates":
            result = diffBetweenDates(date1 , date2);
            break;
        case "Day of the week":
            result = getWeekOfTheYear(date1);
            break;
        case "Week of the year":
            result = getWeekOfTheYear(date);
            break;

        case "N weeks earlier":
            result = nWeekarlier(date , n);
            break;       
        case "N months earlier":
            result = nMonthEarlier(date , n);
            break;
        case "N years earlier":
            result = nYearEarlier(date , n);
            break;

        case "N weeks later":
            result = nWeeksLater(date , n);
            break;    
        case "N months later":
            result = nMonthsLater(date , n);
            break;
        case "N years later":
            result = nYearsLater(date , n);
            break;

        case "Last Week":
            result = lastWeek(date);
            break;
        case "Last month":
            result = lastWeek(date);
            break;     
        case "Last year":
            result = lastWeek(date);
            break;

        case "Next Week":
            result = nextWeek(date);
            break;
        case "Next month":
            result = nextMonth(date);
            break;     
        case "Next year":
            result = nextYear(date);
            break;
        
    }

    console.log(result);

    document.getElementById('result').value = result;
}
