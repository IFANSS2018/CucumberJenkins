#Author: your.email@your.domain.com
#Keywords Summary :

Feature: To test add customer functionality
@mani @muthu
  Scenario: the user perform Add Cust details
    Given The user is in add customer page
    When The user fill the valid customer details
   | fname   |  siva |
   | lname   |  mani |
   | email   | siva@gmail.com|
   | address | chennai|
   | phnum   |   7894561233 |
    When The user click the submit button
    Then The user should see the customer id generate
@rohit
     Scenario: the user perform Add Cust details
    Given The user is in add customer page
    When The user fill the valid customer details
   | fname   |  kalai |
   | lname   |  vani |
   | email   | siva@gmail.com|
   | address | chennai|
   | phnum   |   456664444 |
    When The user click the submit button
    Then The user should see the customer id generate