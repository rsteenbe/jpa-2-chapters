# JPA 2 - Chapters

*Author* : [Renco Steenbergen](https://www.linkedin.com/in/renco-steenbergen-87b52a119/)

*Summary* : Custom examples based on the Pro JPA 2 book 'Mastering the Java Persistence API'

*IDE & Technologies* : IntelliJ IDEA, Notepad++, Java SE, Maven 3.5.0, JPA 2.0, Slf4j, Liquibase, Hibernate, Vagrant, Bash (Shell scripting), Wildfly 11, PostgreSQL 9.5

## Purpose
The JPA examples in this project are meant to see how the 'theory' from the JPA book can be used in practise using an easy to use Vagrant Ubuntu box.

## Getting Started with Vagrant

* Download [Vagrant](https://www.vagrantup.com/) and [VirtualBox](https://www.virtualbox.org/wiki/Downloads).

* Clone this project by using `git clone https://github.com/rsteenbe/jpa-2-chapters.git`

* Jump into the project directory (`cd jpa-2-chapters`) and run the following command: `vagrant up --provider=virtualbox`

* After installing the box is finished run: `vagrant ssh` and the linux command line will show up

* At this point a nice environment is running containing the following components: Java and Maven with a Wildfly application server connected to a Postgres database

## Chapter 2 - Getting Started
In this chapter a Java SE application will be executed as a JAR file. The application is connected to the Postgres database configured in the persistence.xml. Maven is used to build the application.

* After entering the `vagrant ssh` commando, go to the 'vagrant' directory (`cd /vagrant/`)

* To run the main method of the class `CustomerTest.java` run the following command `sudo sh ./ch2-getting-started.sh`

* The logging will print the CRUD operations that are done.




