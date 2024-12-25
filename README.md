<<<<<<< HEAD
# About project
In this project, I have automated the checkout process on the https://automationexercise.com/ website using Selenium WebDriver and TestNG. The objective is to ensure the smooth functionality of the checkout process, including selecting a product, adding it to the cart, proceeding to checkout, entering shipping and billing information, and completing the order.

# Approach:
# Page Object Model (POM):
I implemented the Page Object Model design pattern to ensure that the test code is well-structured, maintainable, and reusable. Each page of the website is represented by a separate class containing the elements and actions that can be performed on that page.
This approach helps in separating the test logic from the page-specific details, making the test more modular and easier to update when the UI changes.

# Data-Driven Testing:
For the data-driven testing approach, I used a JSON file to store the test data, such as product details, user login credentials, and shipping/billing information.
The data is read from the JSON file during test execution, allowing the tests to run with different sets of data. This provides flexibility in testing multiple scenarios without modifying the test scripts.


# Tools Used:

# 1-Selenium WebDriver:
I used Selenium WebDriver as the primary tool to automate browser interactions. It allows interaction with various web elements, such as buttons, input fields and drop-down menus, to simulate real user actions on a website.

# 2-TestNG:
I used TestNG to execute the tests, organize them into test suites, and provide various reporting and assertion functionalities. It helps in defining the flow of tests and ensures that tests are executed as expected.

# 3-JSON for Test Data:
Test data, such as product selection, shipping and billing details, and user credentials, is stored in a JSON file. This allows for a structured and scalable approach to manage test data.

# 4- Allure Reporting (Optional):
I used Allure to generate test reports that provide detailed information about test execution, including test steps, statuses, and execution time


# Test Flow:
1- Open the website and Login
2- Select a product and add it to the cart.
3- Proceed to checkout.
4- Enter shipping and billing details.
5- Complete the order.
6 Validate each step to ensure the correct functionality of the checkout process.
=======
"# Automation-Exercise-Website" 
# Automation-Exercise-Website"
This project is a solution for the AAIB Technical Assessment. It includes:
- Web automation using Selenium with Java, TestNG and POM
- Data-driven testing with JSON.
- Allure reporting integration for test results.

## Features
- Adding products to the cart.
- Checkout process automation.
- Detailed test reports.

## Requirements
- Java 21
- Maven 4.0+
- ChromeDriver
>>>>>>> 56217b2d24feaaafc35d6a395a335e4b5ad44568
