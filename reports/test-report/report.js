$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri('sample.feature');
formatter.feature({
  "line": 2,
  "name": "To test my cucumber test is running",
  "description": "I want to run a sample feature file.",
  "id": "to-test-my-cucumber-test-is-running",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@smokeTest"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "cucumber setup",
  "description": "",
  "id": "to-test-my-cucumber-test-is-running;cucumber-setup",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "sample feature file is ready",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I run the feature file",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "run should be successful",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.givenStatment()"
});
formatter.result({
  "duration": 126418535,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.whenStatement()"
});
formatter.result({
  "duration": 52948,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.thenStatment()"
});
formatter.result({
  "duration": 151132,
  "status": "passed"
});
});