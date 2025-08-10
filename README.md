# Spring Data JPA Demo

## Overview

Practice creating an application to store and access data from a database using Spring Data JPA. The data is stored as customer objects, as JPA allows the entire process to be done with Java. This project gave me experience with Spring, JPA, Maven, and interfaces.

## Features

### Customer Class

As the datatype, Customer stores a first name, last name, and id. The id is used for the table in the database and I use JPA to automatically generate one on initialization. There are also some getter and setter methods in this class, as well as a toString that prints out the stored data.

### Customer Repository Interface

This interface extends the Crud Repository interface to inherit some methods that look through the data, like findByLastName and findById. JPA also implements Customer Repository when the application is run, so I don't need to myself.

### Accessing Data JPA Application Class
This is the main class where the application runs and I test some of the methods to access the data. I first add some objects to the database, then print the values of findAll, findById, and findByLastName to the console using the Logger class. The values came out correct and I ran into no issues here.

### Running the Application

I used Maven to build and run, as well as compile a jar executable. I had some issues with the syntax at first, but after using the pom.xml file to find the correct snapshot dependency, I was able to correct it.


