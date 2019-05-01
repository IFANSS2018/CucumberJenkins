$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/feature/AddCust.feature");
formatter.feature({
  "name": "To test add customer functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "the user perform Add Cust details",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@mani"
    },
    {
      "name": "@muthu"
    }
  ]
});
formatter.step({
  "name": "The user is in add customer page",
  "keyword": "Given "
});
formatter.match({
  "location": "AddCustomer.the_user_is_in_add_customer_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user fill the valid customer details",
  "rows": [
    {
      "cells": [
        "fname",
        "siva"
      ]
    },
    {
      "cells": [
        "lname",
        "mani"
      ]
    },
    {
      "cells": [
        "email",
        "siva@gmail.com"
      ]
    },
    {
      "cells": [
        "address",
        "chennai"
      ]
    },
    {
      "cells": [
        "phnum",
        "7894561233"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "AddCustomer.the_user_fill_the_valid_customer_details(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user click the submit button",
  "keyword": "When "
});
formatter.match({
  "location": "AddCustomer.the_user_click_the_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should see the customer id generate",
  "keyword": "Then "
});
formatter.match({
  "location": "AddCustomer.the_user_should_see_the_customer_id_generate()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "the user perform Add Cust details",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@rohit"
    }
  ]
});
formatter.step({
  "name": "The user is in add customer page",
  "keyword": "Given "
});
formatter.match({
  "location": "AddCustomer.the_user_is_in_add_customer_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user fill the valid customer details",
  "rows": [
    {
      "cells": [
        "fname",
        "kalai"
      ]
    },
    {
      "cells": [
        "lname",
        "vani"
      ]
    },
    {
      "cells": [
        "email",
        "siva@gmail.com"
      ]
    },
    {
      "cells": [
        "address",
        "chennai"
      ]
    },
    {
      "cells": [
        "phnum",
        "456664444"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "AddCustomer.the_user_fill_the_valid_customer_details(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user click the submit button",
  "keyword": "When "
});
formatter.match({
  "location": "AddCustomer.the_user_click_the_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should see the customer id generate",
  "keyword": "Then "
});
formatter.match({
  "location": "AddCustomer.the_user_should_see_the_customer_id_generate()"
});
formatter.result({
  "status": "passed"
});
});