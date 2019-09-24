Feature: Login in Newtours

Scenario: Verify Login in Newtours.demoaut.com
Given User is on the main page of Newtours
And user enter UserName value
And user enter Password value
And user click on Sign-In button
Then Flight Finder page display 
And user enter Passenger value
And user enter Departing From value
And user enter Arriving In value
And user click on Continue button
Then Select Flight page display 
And user select Departure Flight
And user select Return Flight
And user click on Continue button in Select Flight
Then Book a Flight page display
And user enter First name of First Passenger
And user enter Last name of First Passenger
And user enter First name of Second Passenger
And user enter Last name of Second Passenger
And user click on Secure Purchase
Then Flight Confirmation page display
And user LOG OUT
Then Browser Close