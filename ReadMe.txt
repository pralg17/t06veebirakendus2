CREATE TABLE autod(
omanik VARCHAR(50) NOT NULL PRIMARY KEY,
mark VARCHAR(50) NOT NULL,
mudel VARCHAR(50) NOT NULL,
aasta INT NOT NULL,
voimsus INT NOT NULL,
);

INSERT INTO autod VALUES ('Mati', 'Volvo', 'S40', '2007', '120');
INSERT INTO autod VALUES ('Kalle', 'Ford', 'Focus', '2002', '81');


ALTER TABLE autod
ADD labisoit INT NOT NULL;

INSERT INTO autod VALUES ('Juhan', 'BMW', 'X6', '2013', '320', '65892');



CREATE TABLE kiirendused(
id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
juht VARCHAR(30),
aeg DECIMAL(8, 2),
FOREIGN KEY(juht) REFERENCES autod(omanik)
);

INSERT INTO kiirendused VALUES(DEFAULT, 'Mati', 8.8);
INSERT INTO kiirendused VALUES(DEFAULT, 'Mati', 9.2);
INSERT INTO kiirendused VALUES(DEFAULT, 'Juhan', 6.5);
INSERT INTO kiirendused VALUES(DEFAULT, 'Kalle',11.4);
