-- WILLIAM KAGOIYO WABUIYA ADM NO : 105241, 21/03/2024...
-- Creating database dbBooks...
CREATE DATABASE IF NOT exists dbBooks;
-- Use the DaimaFleetManagementCompany database
USE dbBooks;
-- create table : tblBooks with 4 columns....
create table if not exists tblBooks(
ISBN INT(20) primary KEY,
Author VARCHAR(50),
Title VARCHAR(50),
Edition VARCHAR(30)
);
-- Inserting 3 random records....
INSERT INTO tblbooks (ISBN,Author, Title, Edition)
VALUES
('10541', 'William Kariuki','The Red Hood','1st edition'),
('14654','Kenneth Mwangi', 'Leviathan', '2nd edition'),
('6542', 'Jane Muthoni Kamau', 'King Maker','5th edition');

-- Retrieving all records...
select *
from tblbooks t ;

-- Update on of the Records....
update tblbooks set Author = 'Mwazo Kibaba ' where ISBN = '14654';

-- Delete Record from tblBooks...
delete from tblbooks where ISBN = '6542';