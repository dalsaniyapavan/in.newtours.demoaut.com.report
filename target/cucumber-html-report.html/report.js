$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/bookTicket.feature");
formatter.feature({
  "line": 1,
  "name": "Login in Newtours",
  "description": "",
  "id": "login-in-newtours",
  "keyword": "Feature"
});
formatter.before({
  "duration": 13217258110,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Verify Login in Newtours.demoaut.com",
  "description": "",
  "id": "login-in-newtours;verify-login-in-newtours.demoaut.com",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is on the main page of Newtours",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enter UserName value",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "user enter Password value",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user click on Sign-In button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Flight Finder page display",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user enter Passenger value",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user enter Departing From value",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user enter Arriving In value",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user click on Continue button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Select Flight page display",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user select Departure Flight",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user select Return Flight",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user click on Continue button in Select Flight",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Book a Flight page display",
  "keyword": "Then "
});
formatter.match({
  "location": "login.user_is_on_the_main_page_of_Newtours()"
});
formatter.result({
  "duration": 120414496,
  "status": "passed"
});
formatter.match({
  "location": "login.user_enter_UserName_value()"
});
formatter.result({
  "duration": 223470120,
  "status": "passed"
});
formatter.match({
  "location": "login.user_enter_Password_value()"
});
formatter.result({
  "duration": 1305198950,
  "status": "passed"
});
formatter.match({
  "location": "login.user_click_on_Sign_In_button()"
});
formatter.result({
  "duration": 7647856532,
  "status": "passed"
});
formatter.match({
  "location": "login.flight_Finder_page_display()"
});
formatter.result({
  "duration": 124514,
  "status": "passed"
});
formatter.match({
  "location": "flightFinder.user_enter_Passenger_value()"
});
formatter.result({
  "duration": 94200930,
  "status": "passed"
});
formatter.match({
  "location": "flightFinder.user_enter_Departing_From_value()"
});
formatter.result({
  "duration": 121660020,
  "status": "passed"
});
formatter.match({
  "location": "flightFinder.user_enter_Arriving_In_value()"
});
formatter.result({
  "duration": 102941388,
  "status": "passed"
});
formatter.match({
  "location": "flightFinder.user_click_on_Continue_button()"
});
formatter.result({
  "duration": 962019486,
  "status": "passed"
});
formatter.match({
  "location": "flightFinder.select_Flight_page_display()"
});
formatter.result({
  "duration": 28673386,
  "status": "passed"
});
formatter.match({
  "location": "selectFlight.user_select_Departure_Flight()"
});
formatter.result({
  "duration": 177190486,
  "status": "passed"
});
formatter.match({
  "location": "selectFlight.user_select_Return_Flight()"
});
formatter.result({
  "duration": 181813848,
  "status": "passed"
});
formatter.match({
  "location": "selectFlight.user_click_on_Continue_button_in_Select_Flight()"
});
formatter.result({
  "duration": 2483928366,
  "status": "passed"
});
formatter.match({
  "location": "selectFlight.Book_a_Flight_page_display()"
});
formatter.result({
  "duration": 98214,
  "status": "passed"
});
});