$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("signupValidation.feature");
formatter.feature({
  "line": 1,
  "name": "Registeration and validation of SignUp page",
  "description": "",
  "id": "registeration-and-validation-of-signup-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 63314094,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User navigate to the Registration page",
  "description": "",
  "id": "registeration-and-validation-of-signup-page;user-navigate-to-the-registration-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@SubmitSignupFormWithoutData"
    },
    {
      "line": 3,
      "name": "@AdhocTesting"
    },
    {
      "line": 3,
      "name": "@TC1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user navigates to website",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user clicks on the register here and clicks on the proceed as vendor",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "application displayed error messages for all fields",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.user_navigates_to_website()"
});
formatter.result({
  "duration": 71278979,
  "error_message": "java.lang.NullPointerException\n\tat stepDefinitions.StepDefination.user_navigates_to_website(StepDefination.java:23)\n\tat ✽.Given user navigates to website(signupValidation.feature:6)\n",
  "status": "failed"
});
formatter.match({
  "location": "StepDefination.user_clicks_on_the_register_here_and_clicks_on_the_proceed_as_vendor()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefination.application_displayed_error_messages_for_all_fields()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 42385,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 11,
  "name": "Signup new user registration and validation functionality",
  "description": "",
  "id": "registeration-and-validation-of-signup-page;signup-new-user-registration-and-validation-functionality",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 10,
      "name": "@RegisterNewUser"
    },
    {
      "line": 10,
      "name": "@Regression"
    },
    {
      "line": 10,
      "name": "@TC2"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "a browser navigate to the Market Cube login page",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "user does registration and verifies mail and then logs in to application \"\u003cemail\u003e\" \"\u003cpwd\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "application should be navigating to the home page of Market Cube",
  "keyword": "Then "
});
formatter.examples({
  "line": 18,
  "name": "",
  "description": "",
  "id": "registeration-and-validation-of-signup-page;signup-new-user-registration-and-validation-functionality;",
  "rows": [
    {
      "cells": [
        "email",
        "pwd"
      ],
      "line": 20,
      "id": "registeration-and-validation-of-signup-page;signup-new-user-registration-and-validation-functionality;;1"
    },
    {
      "cells": [
        "testsuccesstechnologies@gmail.com",
        "Success@123"
      ],
      "line": 21,
      "id": "registeration-and-validation-of-signup-page;signup-new-user-registration-and-validation-functionality;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 1472742,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "Signup new user registration and validation functionality",
  "description": "",
  "id": "registeration-and-validation-of-signup-page;signup-new-user-registration-and-validation-functionality;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 10,
      "name": "@Regression"
    },
    {
      "line": 10,
      "name": "@RegisterNewUser"
    },
    {
      "line": 10,
      "name": "@TC2"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "a browser navigate to the Market Cube login page",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "user does registration and verifies mail and then logs in to application \"testsuccesstechnologies@gmail.com\" \"Success@123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "application should be navigating to the home page of Market Cube",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.a_browser_navigate_to_the_market_cube_login_page()"
});
formatter.result({
  "duration": 1394275,
  "error_message": "java.lang.NullPointerException\n\tat stepDefinitions.StepDefination.a_browser_navigate_to_the_market_cube_login_page(StepDefination.java:55)\n\tat ✽.Given a browser navigate to the Market Cube login page(signupValidation.feature:13)\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "testsuccesstechnologies@gmail.com",
      "offset": 74
    },
    {
      "val": "Success@123",
      "offset": 110
    }
  ],
  "location": "StepDefination.user_does_registration_and_verifies_mail_and_then_logs_in_to_application_something_something(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefination.application_should_be_navigating_to_the_home_page_of_Market_Cube()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 20650,
  "status": "passed"
});
});