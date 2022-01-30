#Application Guide
##Phone numbers project
Phone numbers should be categorized by country, state (valid or not valid), country code and number.
The page should render a list of all phone numbers available in the DB. It should be possible to filter by country and state.

###Technologies
Backend: Java 11 ,Spring Boot 2.6.3, JDBC , Maven, Junit
Database: SQLite
Frontend: Thymeleaf, HTML, bootstrap, external lib

###Build
mvn clean install -Dmaven.test.skip=true

###Run
From IDE, Run class "CountryApplication"
Open in browser http://localhost:8080/