Feature: Login Feature

Background:user is sucessfully logged in
When user opens the "gecko browser and exe  "D:\\banking project\\icBank\\src\\test\\resources\\DRIVERS\\geckodiver.exe"
when user opens the url "http://primusbank.qedgetech.com/"

@smoke Test

Scenario: Login Functionality for valid username and password
When user enters "Admin" as usernsme
When user enters "Admin" as password
When user clicks on login button
Then user is on the "Admin" main page and get message as welcome to Admin
   