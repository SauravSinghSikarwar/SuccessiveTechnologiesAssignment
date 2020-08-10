Feature: Registeration and validation of SignUp page

@SubmitSignupFormWithoutData @AdhocTesting @TC1
Scenario: User navigate to the Registration page

	Given user navigates to website
	When user clicks on the register here and clicks on the proceed as vendor
	Then application displayed error messages for all fields
	
@RegisterNewUser @Regression @TC2
Scenario Outline: Signup new user registration and validation functionality

	Given a browser navigate to the Market Cube login page
	When user does registration and verifies mail and then logs in to application "<email>" "<pwd>"
	Then application should be navigating to the home page of Market Cube
	
	
Examples:

         |               email                     |             pwd                |
	     |     testsuccesstechnologies@gmail.com   |          Success@123           |
	      
	




	
		
	
	
	
	
	
	

	
	
	