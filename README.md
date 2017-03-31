# _Barber Shop_

#### _Web Application for a small barber shop that manages both clients and stylists in the Portland area, 03-31-2017_

#### By _**Ryan Jones**_

## Description
_This web application uses, Java, IntelliJ, JUnit, PostgreSQL, RESTful routes, and spark._


## User Stories
* _As a salon employee, I need to be able to see a list of all our stylists._
* _As an employee, I need to be able to select a stylist, see their details, and see a list of all clients that belong to that stylist._
* _As an employee, I need to add new stylists to our system when they are hired._
* _As an employee, I need to be able to add new clients to a specific stylist._
* _As an employee, I need to be able to update a stylist's details._
* _As an employee, I need to be able to update a client's details._
* _As an employee, I need to be able to delete a stylist if they're no longer employed here._
* _As an employee, I need to be able to delete a client if they no longer visit our salon._


## Specifications

| Behavior                   | Input Example     | Output Example    |
| -------------------------- | -----------------:| -----------------:|
| Routing takes user from page to page | 'Create Team' button is clicked | User redirected to the team-form page, url changes accordingly |
| When the team form is submitted, a team instance is created | Team form submitted | New team created with matching fields |
| When the member form is submitted, a member instance is created | Member form submitted | New member created with matching fields |
| Member instances are added to correct team | Member is created from the member form | New member belongs to a specific team |
| Teams are able to be listed out | Viewing all teams | Each team shows with the corresponding team name |
| Members are able to be listed out under specific team | Viewing specific team | All members are shown belonging to that team |



## Setup/Installation Requirements

* _Clone the repository_
* _Run the command 'gradle run'_
* _Open browser and go to localhost:4567_


### License

Copyright (c) 2017 **_Ryan Jones_**

This software is licensed under the MIT license.
