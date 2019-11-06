Feature: Login to Appliaction
	In order to do something
	As someone
	I want something else to happen
	Scenario Outline: Positive Testing
	    Given Initialize brower 
	    And Navigate to "https://www.Amazon.com" Site
	    And Click on login link 
	    When When user enters <Username> and <Password> and click login
	    Then Verify login is success
	    
	    Examples:
	    |Username	|Password	|
	    |7760282007	|illusionwow@21	|
	    |test321312	|asdaf	|
	    
	    
	  