$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("End2End_Test.feature");
formatter.feature({
  "line": 1,
  "name": "Login feature",
  "description": "",
  "id": "login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Login Test Scenario",
  "description": "",
  "id": "login-feature;login-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of login page is MercuryTours",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enter username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user logins",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user is on homepage",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user exits application",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_is_on_login_page()"
});
formatter.result({
  "duration": 22229414600,
  "status": "passed"
});
formatter.match({
  "location": "Steps.title_of_login_page_is_MercuryTours()"
});
formatter.result({
  "duration": 25020300,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_enter_username_and_password()"
});
formatter.result({
  "duration": 601389900,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_logins()"
});
formatter.result({
  "duration": 5083253300,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_is_on_homepage()"
});
formatter.result({
  "duration": 18856500,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_exits_application()"
});
formatter.result({
  "duration": 1123522500,
  "status": "passed"
});
});