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
| Routing takes user from page to page | 'Add Stylist' button is clicked | User redirected to the stylist-form page, url changes accordingly |
| When the stylist form is submitted, the stylist is added | Stylist form submitted | New stylist added with matching fields |
| When the client form is submitted, the client is added | Client form submitted | New client created with matching fields |
| Client instances are added to correct team | Client is created from the client form | New client belongs to a specific stylist |
| Stylist are able to be listed out | Viewing all stylists | Each stylist shows with the corresponding stylist name |
| Clients are able to be listed out under specific stylist | Viewing specific stylist | All clients are shown belonging to that stylist |



## Setup/Installation Requirements

* _Clone the repository_
* _Run the command 'gradle run'_
* _Open browser and go to localhost:4567_


### License

Copyright (c) 2017 **_Ryan Jones_**

This software is licensed under the MIT license.
