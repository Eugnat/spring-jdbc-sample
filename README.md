# spring-jdbc-sample
A small demo project where Spring Data JDBC technology is demonstrated (JdbcTemplate is used).

Some JDBC queries are demonstrated using a simplified DAO approach (DAO interface and Service implementation).
JavaConfig is applied, so no XML configuration, only annotations are used. The current Spring JDBC and Spring Context versions
were used, so you may apply it as a Spring JDBC template.

Use the following script to create a test MySQL database for the project:
CREATE DATABASE spring_jdbc;
USE spring_jdbc;
CREATE TABLE book(id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, title VARCHAR(50), author VARCHAR(50));

INSERT INTO book(title, author) VALUES
	('title one', 'author one'),
    ('title two', 'author two'),
    ('title three', 'author three');
