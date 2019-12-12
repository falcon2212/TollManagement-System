INSERT INTO employee(employeeId, salary,tollBoothId)
VALUES(1234, 20000, NULL);
INSERT INTO employee(employeeId, salary,tollBoothId)
VALUES(5678, 40000, NULL);

INSERT INTO serviceowner(serviceownerid, servicename, tollBoothId)
VALUES (9122,"ELECTRONIC CITY TOLL GATE MANAGEMENT", null);
INSERT INTO serviceowner(serviceownerid, servicename, tollBoothId)
VALUES (2017028,"NYC TOLL GATE MANAGEMENT", null);
INSERT INTO serviceowner(serviceownerid, servicename, tollBoothId)
VALUES (7446,"NH41", null);

INSERT INTO customer(customerId, customerName, vehicleType, vehicleRegNumber, isFasttag, proofOfIdentity)
VALUES (672, "tony stark", "Buggati Veron", "NYC02456",1,'PAN number: 123455679');
INSERT INTO customer(customerId, customerName, vehicleType, vehicleRegNumber, isFasttag, proofOfIdentity)
VALUES (673, "dark knight", "bat mobile", "NYC03456",1,'PAN number: 123455680');

INSERT INTO tollBooth(tollBoothId, location, costByVehicle, employeeId, serviceOwnerId)
VALUES (345, "NYC", "BuggatiVeron: 1500, BatMobile: 5500", 1234, 2017028);

INSERT INTO bill(billId, paymentMethod, paymentAmount, transactionTime, customerId, tollBoothId)
VALUES (123, "paypal", 1500, "10:05", 672, 345);
INSERT INTO bill(billId, paymentMethod, paymentAmount, transactionTime, customerId, tollBoothId)
VALUES (124, "paypal", 5500, "12:05", 673, 345);

UPDATE employee SET tollBoothId = 345 WHERE employeeId=1234;  
UPDATE employee SET tollBoothId = 345 WHERE employeeId=5678; 
 
UPDATE serviceowner SET tollBoothId = 345 WHERE serviceownerId=9122;  
UPDATE serviceowner SET tollBoothId = 345 WHERE serviceownerId=2017028;  
UPDATE serviceowner SET tollBoothId = 345 WHERE serviceownerId=7446;  

