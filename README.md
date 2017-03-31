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
| User adds a strain (Boss OG) | Save method is called | Strain instance is saved in the database |
| User writes a review | Save method is called | Review is saved in database |
| User clicks on a classification (Sativa, Hybrid, Indica) | All method is called | List of strains belonging to that classification is returned |
| User clicks individual strain | Find method is called | Specific strain is returned |



## Setup/Installation Requirements

* _Clone the repository_
* _Run the command 'gradle run'_
* _Open browser and go to localhost:4567_


### License

CCopyright (c) 2017 **_Ryan Jones_**

This software is licensed under the MIT license.
