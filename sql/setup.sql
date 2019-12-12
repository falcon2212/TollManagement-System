drop database tolldb;
create database tolldb;
use tolldb;
create table employee(
        employeeId int , 
        salary int,
        tollBoothId int,
        PRIMARY KEY (employeeId)
        );
create table serviceowner(
        serviceownerid int, 
        servicename varchar(100), 
        tollBoothId int,
        PRIMARY KEY (serviceOwnerId)
        );
create table customer(
        customerId int, 
        customerName varchar(30), 
        vehicleType varchar(30), 
        vehicleRegNumber varchar(30), 
        isFasttag int,
        proofOfIdentity varchar(200),
        PRIMARY KEY (customerId)
        );
create table tollBooth(
        tollBoothId int , 
        serviceOwnerId int,
        employeeId int,
        location varchar(50), 
        costByVehicle varchar(500), 
        PRIMARY KEY(tollBoothId),
        FOREIGN KEY (employeeId) REFERENCES employee(employeeId),
        FOREIGN KEY (serviceOwnerId) REFERENCES serviceowner(serviceOwnerId)
        );
create table bill(
        billId int, 
        customerId int,
        tollBoothId int,
        paymentAmount varchar(30), 
        paymentMethod varchar(30), 
        transactionTime varchar(30),
        PRIMARY KEY (billId), 
        FOREIGN KEY (customerId) REFERENCES customer(customerId),
        FOREIGN KEY (tollBoothId) REFERENCES tollBooth(tollBoothId)
        );

alter table employee 
        add constraint fk_tollbooth_emp FOREIGN KEY(tollBoothId) REFERENCES tollBooth(tollBoothId);
alter table serviceowner 
        add constraint fk_tollbooth_owner FOREIGN KEY(tollBoothId) REFERENCES tollBooth(tollBoothId);           
