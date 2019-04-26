### Final Project - Object-Oriented Analysis & Design
### Automated Restaurant Ordering and Service System

#### Team : Abhinav Gupta, Divya Athoopallil, Sravanth Yajamanam, Sowmya Ramakrishnan

##### Basic Project Overview :

An object-oriented model/prototype of an automated restaurant prdering and service system was designed and implemented in Java, primarily using the MVC Design Pattern with a MongoDB database, Java controller and Bootstrap-HTML-CSS front-end. The system presents an interactive webpage which serves as a restaurant portal through which customers/food critics can sign up/login, view menu, place order, view order, view and pay bills, submit feedback/reviews, view chef profiles, contact the restaurant management, order online for home delivery and log out when finished.  
Language used : Java
Design Pattern: MVC 

##### Description of Files in Repo :

* pom.xml - Consists of details of dependencies like Spring, Spring Security, Thymeleaf, Maven, Tomcat which exist and are installed accordingly.

###### Views (webapp/WEB-INF/views) :

* footer.jspf - A common footer for all webpages
* header.jspf - A common header for all webpages
* navigation.jspf - A common navigation bar for all webpages
* Access_Denied.css - CSS for Access Denied page
* Access_Denied.jsp - Access is denied to Crtics Review page for customers who are not food critics 
* Critics.css - CSS for Critics page
* Critics.jsp - A page wherein food critics can enter their rating and review
* PaymentConfirmation.jsp - A page confirming that payment has been made and thanking the customer for his business
* ReviewsFinal.css - CSS for reviews page
* reviews.jsp - A page wherein customers can leave their reviews
* chefPage.css - CSS for chef profile page
* chefPage.jsp - A page showing brief profiles of various chefs at the restaurant.
* contactUs.css - CSS for Contact page
* contactUs.jsp - Restaurant management contact details webpage - Phone, E-mail, Address etc
* criticsThank.jsp - Webpage thanking food critics for their feedback/review
* employee.jsp - Critic review page for a paticular extremely important critic!
* getBill.jsp - Webpage to get bill for items ordered
* list-reviews.jsp - Page that lists reviews that have been given by customers 
* login.css - CSS for ogin page
* login.jsp - Login page
* makeOrder.jsp - Page that allows customers to choose quantities of various dishes and place the order
* menu.css - CSS for menu page
* menu.jsp - Page showing various menu items along with their prices and calories 
* onlineOrder.jsp - Page allowing customers to choose items for online ordering/home delivery
* onlineOrderConfirm.jsp - Page confirming online order
* payBill.jsp - Payment portal where customer can enter credit card details to make payment
* restaurantOrderConfirm.jsp - Page showing/confirming details of order placed 
* signup.jsp - Sign up page
* welcome.jsp - Welcome the customer after he logs in and allow him to place order/view bill

###### Controller and Model (java/com/OOAD) :

* EmployeeManagement.java - Manage employee page
* exceptionController.java - Manage and route to Access denied page appropriately
* LogoutConroller.java - Manage logging out action and redirect to login page
* MongoFactory.java - Establishing mongo connections
* PayBill.java - Route to bill payment and confirmation pages
* SignUp.java - Manage sign up credentials and check against database for presence of username
* UserDBService.java - Manage user database - add, search
* UserDb.java - Class for user database
* WelcomeController.java - Route appropriately to welcome page
* ContactUs.java - Manage Contact Us page
* Reviews.java - Manage reviews page
* CalculateBill.java - Class for calculating bill based on quantities of menu items ordered
* ChefPage.java - Appropriate routing to chef page
* MakeAnOrder.java - Control of quantities of items ordered/menu page/routing to bill
* MenuDBService.java - Manage menu db 
* MenuItemDb.java - Class for menu database
* OnlineOrder.java - Appropriate routing to order/confirmation pages
* CriticsReview.java - Routing to critics review thank you page
* ReviewsController.java - Manage addition, edition, deletion, display of reviews
* SecurityConfiguration.java - Spring security config for log in page

##### Installation/Execution Notes :

* Clone the repository
* Extract and import project in a Java IDE as a Maven Project
* Run as -> Maven Build 
* In the pop-up, under 'Goals', enter tomcat7:run
* The server should be running on port 8080
* Navigate to localhost:8080 on a browser to view webpage 

###### MongoDB Notes and Credentials :

from cmd:
Install MongoDB
##Read tables into collection from csv files:

C:\Users\divya\Desktop\Semester2\OOAD\OOAD_Project> mongoimport --db restaurants --collection MenuService --type csv --headerline --file ../menu.csv
C:\Users\divya\Desktop\Semester2\OOAD\OOAD_Project> mongoimport --db restaurants --collection UserDatabase --type csv --headerline --file ../user.csv

C:\Users\divya\Desktop\Semester2\OOAD\OOAD_Project> mongo
>>use  restaurants ##shows the database
admin        0.000GB
config       0.000GB
local        0.000GB
restaurants  0.000GB

>>show collections ##shows the tables
MenuService
UserDatabase

>>db.MenuService.findone()
{ "_id" : ObjectId("5cc1615965e96e8160818078"), "price" : 6, "name" : "Veggie Burger", "description" : "Classic Double Roti with a healthy Quinoa patty, onions, tomatoes, lettuce and oodles of cheese", "calories" : 135 }

>>db.UserDatabase.findone()
{ "_id" : ObjectId("5cbeacdaac8da71d00c35792"), "id" : 2, "username" : "Abhinav", "password" : "blahblah", "role" : "ADMIN" }

Creds: "id" : "67", "username" : "OOAD", "password" : "User", "role" : null

