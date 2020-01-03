$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/myfeatures.feature");
formatter.feature({
  "name": "Is it Friday yet?",
  "description": "  Everybody wants to know when it\u0027s Friday",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Sunday isn\u0027t Friday",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "today is Sunday",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.today_is_Sunday()"
});
formatter.result({
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat com.nos.cucumber.steps.today_is_Sunday(steps.java:20)\r\n\tat ✽.today is Sunday(file:src/test/resources/myfeatures.feature:5)\r\n",
  "status": "pending"
});
formatter.step({
  "name": "I ask whether it\u0027s Friday yet",
  "keyword": "When "
});
formatter.match({
  "location": "steps.i_ask_whether_it_s_Friday_yet()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I should be told \"Nope\"",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.i_should_be_told(String)"
});
formatter.result({
  "status": "skipped"
});
});