# AutomationTestFor34.94.151.29Site

Automation Test Cases for http://34.94.151.29/

Automation test cases was created for ChromeDriver v 84.0.4147.30 and GecoDriver v 0.27.0

25 test of 25 worked 100% on 28.12.20

1.Add Itesm Test	
	TC1.1
		Test Steps:
		1. Go to HomePage http://34.94.151.29/
		2. Add Item to chart ( selected using xpath selector )
		Expected Result
		3. Check is selected Item added to chart.

2. Apply Coupon Test
	TC2.1
		Test Steps:
		1. Go to HomePage http://34.94.151.29/
		2. Add Item to chart ( selected using xpath selector )
		3. Fill coupon code filed using "softie"
		4. Click "Apply Coupon" Button
		Expected Result
		5. The alert message is shown: "This coupon has expired."

3. Change My Billing Address Test
	TC3.1
		Test Steps:
		1. Go to HomePage http://34.94.151.29/
		2. Login using correct login and password
		3. Go to "shipping and billing addresses"
		4. Click box on the right of "Billing Address"
		5. Change Name = "Adam", and City = "Warszawa"
		6. Click "Save Address" Button
		Expected Result
		7. The alert message is shown: "Address changed successfully."

	TC3.2
		Test Steps:
		1. Go to HomePage http://34.94.151.29/
		2. Login using correct login and password
		3. Go to "shipping and billing addresses"
		4. Click box on the right of "Billing Address"
		5. Change Name = "", and City = "Warszawa"
		6. Click "Save Address" Button
		Expected Result
		7. The alert message is shown: "First name is a required field."

	TC3.3
		Test Steps:
		1. Go to HomePage http://34.94.151.29/
		2. Login using correct login and password
		3. Go to "shipping and billing addresses"
		4. Click box on the right of "Billing Address"
		5. Change Zipcode = "000"
		6. Click "Save Address" Button
		Expected Result
		7. The alert message is shown: "Please enter a valid postcode / ZIP."

	TC3.4
		Test Steps:
		1. Go to HomePage http://34.94.151.29/
		2. Login using correct login and password
		3. Go to "shipping and billing addresses"
		4. Click box on the right of "Billing Address"
		5. Change Zipcode = "00000"
		6. Click "Save Address" Button
		Expected Result
		7. The alert message is shown: "Address changed successfully."

4. Login Test
	TC4.1
		Test Steps:
		1. Go to HomePage http://34.94.151.29/
		2. Login using correct login and password
		Expected Result
		3. After log in, the log out button ist Displayed.

	TC4.2
		Test Steps:
		1. Go to HomePage http://34.94.151.29/
		2. Login using incorrect login and correct password
		Expected Result
		3. The alert message is shown: "Unknown username. Check again or try your email address."

	TC4.3
		Test Steps:
		1. Go to HomePage http://34.94.151.29/
		2. Login using correct login and incorrect password
		Expected Result
		3. The alert message is shown: "Error: The password you entered for the username "
                + user + " is incorrect. Lost your password?"

	TC4.4
		Test Steps:
		1. Go to HomePage http://34.94.151.29/
		2. Login using no login and correct password
		Expected Result
		3. The alert message is shown: "Error: Username is required."

	TC4.5
		Test Steps:
		1. Go to HomePage http://34.94.151.29/
		2. Login using no login and no password
		Expected Result
		3. The alert message is shown: "Error: Username is required."

	TC4.6
		Test Steps:
		1. Go to HomePage http://34.94.151.29/
		2. Login using correct login and no password
		Expected Result
		3. The alert message is shown: "Error: The password field is empty."

5. Log Out Test
	TC5
		Test Steps:
		1. Go to HomePage http://34.94.151.29/
		2. Login using correct login and password
		3. Click log Out Button
		Expected Result
		4. After log out, the log in button ist Displayed.

6. Make Order Test
	TC6.1
		Test Steps:
		1. Go to HomePage http://34.94.151.29/
		2. Add iteam to cart
		3. Click "View Cart" Button
		4. Click "Proceed to Check Out"
		5. Fill in all required filed in Billing details
		6. Click "Place Order"
		Expected Result
		7. The alert message is shown: "Thank you. Your order has been received."

	TC6.2
		Test Steps:
		1. Go to HomePage http://34.94.151.29/
		2. Add iteam to cart
		3. Click "View Cart" Button
		4. Click "Proceed to Check Out"
		5. Fill in Billing details, without streetAddres, city
		6. Click "Place Order"
		Expected Result
		7. The alert message is shown: 
						"Billing Street address is a required field."
						"Billing Town / City is a required field."

7. Navigate Test
	TC7.1
		Test Steps:
		1. Go to HomePage http://34.94.151.29/
		2. Login using correct login and correct password
		3. Navigate throughout the main bar: Home, About us, Cart, Checkout, My account
		Expected Result
		4. Check if the proper page is displayed
	TC7.2
		Test Steps:
		1. Go to HomePage http://34.94.151.29/
		2. Login using correct login and correct password
		3. Navigate throughout the search bar: gold, gold coins, silver bars, silver coins, Uncategorized
		Expected Result
		4. Check if the proper page is displayed

8. Register Test
	TC8.1
		Test Steps:
		1. Go to HomePage http://34.94.151.29/
		2. Go to My account 
		3. Fill data User Name, Email Address, Password, click register
		Expected Result
		4. Check if the user is logged in
	TC8.2
		Test Steps:
		1. Go to HomePage http://34.94.151.29/
		2. Go to My account 
		3. Fill User Name, Email Address, click register
		Expected Result
		4. The alert message is shown:"Error: Please enter an account password."
	TC8.3
		Test Steps:
		1. Go to HomePage http://34.94.151.29/
		2. Go to My account 
		3. Fill Email Address, Password, click register
		Expected Result
		4. The alert message is shown:"Error: Please enter a valid account username."
	TC8.4
		Test Steps:
		1. Go to HomePage http://34.94.151.29/
		2. Go to My account 
		3. Fill  User Name, Password, click register
		Expected Result
		4. The alert message is shown:"Error: Please provide a valid email address."

9. Search Test
	TC9.1
		Test Steps:
		1. Go to HomePage http://34.94.151.29/
		2. Fill the search field: "gold"
		3. press enter
		Expected Result
		4. The top topic is: Search results: “gold”
	TC9.2
		Test Steps:
		1. Go to HomePage http://34.94.151.29/
		2. Fill the search field: ""
		3. press enter
		Expected Result
		4. The top topic is: Search results: “”
	TC9.3
		Test Steps:
		1. Go to HomePage http://34.94.151.29/
		2. Fill the search field: "silver"
		3. press enter
		Expected Result
		4. The top topic is: Search results: “silver”
	TC9.4
		Test Steps:
		1. Go to HomePage http://34.94.151.29/
		2. Fill the search field: "bars"
		3. press enter
		Expected Result
		4. The top topic is: Search results: “bars”


