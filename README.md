# Reward application
#The rest API to get customer rewards based on customer Id

#A retailer offers a rewards program to its customers, awarding points based on each recorded purchase.   A customer receives 2 points for every dollar spent over $100 in each transaction, plus 1 point for every dollar spent over $50 in each transaction (e.g. a $120 purchase = 2x$20 + 1x$50 = 90 points).   Given a record of every transaction during a three month period, calculate the reward points earned for each customer per month and total. 

- The package name is structured as com.reward
- Exception is thrown if customer does not exists.
- Mysql database to store the information.
- Please check PDF file provided in the project
- Install mysql db locally and run it . change the db settings in application.properties file.
- copy the data from sql.txt and run it in your mysql work bench and run it.

#Tools used for developing this application.

- Eclipse
- MySQL workbench
- Postman
- Gradle (build tool)

#Technology used for this application.

- Java 8
- Spring Rest
- SQL

#Detail about application architecture

- RestController : used for rest API  endpoint.
- Service : used for build logic.
- Repository : used to communicate with DB.

#Steps to setup application in your system.

- Clone projects in your local Using git clone <git-project-url>
- Open project in any IDE with gradle project.
- Change the DB name, username, password in application.properties file for Mysql
- Table will be automatically created in DB which you will give in dataSource url in application properties.
- You have to insert data into table for that use follow the instructions below.
- there is one file called sql.txt in project strcuture.
- copy and paste into your mysql workbench and select all and run and check data is inserted into
table or not.
- Now you are good to run your application.


#Endpoint link
```
 http://localhost:8080/customers/{customerId}/rewards
