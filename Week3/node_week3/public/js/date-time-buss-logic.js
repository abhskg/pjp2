

function diffBetweenDates(date1 , date2)
{

    let diffTime = Math.abs(date2 - date1);
    let diffDays = Math.ceil(diffTime / (1000 * 60 * 60 * 24)); 

    let years = Math.floor(diffDays / 365);
    let remainingDays = diffDays % 365;

    let months = Math.floor(remainingDays / 30.5);
    let days = Math.floor(remainingDays % 30.5);
    let diffInFormat = "";
    diffInFormat = days + " days-" + months + " months-" + years + " years";
    return diffInFormat;
}

//add to dates - days,month,year
function addDays(date, days) {
  var result = new Date(date);
  result.setDate(result.getDate() + days);
  return result;
}

function addMonths(date, months) {
  var result = new Date(date);
  let days = Math.floor(months * 30.5);
  result.setDate(result.getDate() + days);
  return result;
}

function addWeeks(date, n) {
  var result = new Date(date);
  let days = n * 7;
  result.setDate(result.getDate() + days);
  return result;
}

function addYears(date, years) {
  var result = new Date(date);
  let days = years * 365;
  result.setDate(result.getDate() + days);
  return result;
}

// subtract from dates - days,months,year
function minusDays(date, days) {
  var result = new Date(date);
  result.setDate(result.getDate() - days);
  return result;
}

function minusMonths(date, months) {
  var result = new Date(date);
  let days = Math.floor(months * 30.5);
  result.setDate(result.getDate() + days);
  return result;
}


function minusYears(date, years) {
  var result = new Date(date);
  let days = years * 365;
  result.setDate(result.getDate() + days);
  return result;
}

function minusWeeks(date, n) {
  var result = new Date(date);
  let days = n * 7;
  result.setDate(result.getDate() - days);
  return result;
}

//last week,month,year

function lastWeek(date) {
  var result = new Date(date);
  result.setDate(result.getDate() - 7);
  return result;
}



function lastMonth(date) {
  var result = new Date(date.getFullYear() , date.getMonth() - 1 , date.getDate() );
  return result;
}


function lastYear(date) {
  var result = new Date(date);
  var result = new Date(date.getFullYear() , date.getMonth() , date.getDate() - 1);
  return result;
}


//next week,month,year

function nextWeek(date) {
  var result = new Date(date);
  result.setDate(result.getDate() + 7);
  return result;
}



function nextMonth(date) {
  var result = new Date(date.getFullYear() , date.getMonth() + 1 , date.getDate() );
  return result;
}


function nextYear(date) {
  var result = new Date(date.getFullYear() , date.getMonth() , date.getDate() + 1);
  return result;
}

//n - weeks,months,years earlier

function nWeekarlier(date , n) {
  var result = new Date(date);
  result.setDate(result.getDate() - (7 * n));
  return result;
}



function nMonthEarlier(date , n ) {
  var result = new Date(date.getFullYear() , date.getMonth() - n , date.getDate() );
  return result;
}


function nYearEarlier(date , n) {
  var result = new Date(date);
  var result = new Date(date.getFullYear() , date.getMonth() , date.getDate() - n);
  return result;
}


//n - weeks,months,years later

function nWeeksLater(date , n) {
  var result = new Date(date);
  result.setDate(result.getDate() + (7 * n));
  return result;
}



function nMonthsLater(date , n ) {
  var result = new Date(date.getFullYear() , date.getMonth() + n , date.getDate() );
  return result;
}


function nYearsLater(date , n) {
  var result = new Date(date);
  var result = new Date(date.getFullYear() , date.getMonth() , date.getDate() + n);
  return result;
}

//today,tomorrow,yesterday,day-before yesterday , day-after tomorrow

function tomorrow(date)
{
  var result = new Date(date);
  result.setDate(result.getDate() + 1);
  return result;
}


function yesterday(date)
{
  var result = new Date(date);
  result.setDate(result.getDate() - 1);
  return result;
}


function dayAfterTomorrow(date)
{
  var result = new Date(date);
  result.setDate(result.getDate() + 2);
  return result;
}


function dayBeforeYesterday(date)
{
  var result = new Date(date);
  result.setDate(result.getDate() - 2);
  return result;
}


function getDayOfTheWeek(date)
{
    var days = ['Sunday','Monday','Tuesday','Wednesday','Thursday','Friday','Saturday'];
    return days[date.getDay()];
}

function getWeekOfTheYear(date)
{
    let diffTime = Math.abs(date);
    let diffDays = Math.ceil(diffTime / (1000 * 60 * 60 * 24)); 

    let years = Math.floor(diffDays / 365);
    let remainingDays = diffDays % 365;

    console.log(Math.floor(remainingDays / 7));
}