Feature: Customers
	Scenario: Add New Customer
			Given User Launch Chrome Browser
			When User opens URL "https://admin-demo.nopcommerce.com/login"
			And User enters Email as "admin@yourstore.com"and Password as "admin"
			And Click on Login
			Then User view Dashboard
			When User Click on Customers Menu
			And Click on Customers Menu Item
			And click on Add new button
			Then User can View Add New Customer Page
			When User enter Customer Info
			And click on Save button
			Then User can view Confirmation Message "The new customer has been added Succesfully."
			And Close Browser