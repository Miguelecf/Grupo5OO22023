create database grupo_5_bdd;

use grupo_5_bdd; 


INSERT INTO user values(1,'2023-01-01',1,'$2a$10$mfYzu2fLjgC.Ko2hPrl0Eu6m05sIq08rDZfwYsMIRvkUqsKnD.yCi','2023-01-01','Auditor');
INSERT INTO user values(2,'2023-01-01',1,'$2a$10$GVdWb1Nx9YOA//Uy81LYLeMje.Dsn22rkpoFQqxt8l3ZQ1sh0Tvkq','2023-01-01','Admin');

INSERT INTO user_role VALUES(1,'2023-01-01','Admin','2023-01-01',2);
INSERT INTO user_role VALUES(2,'2023-01-01','Auditor','2023-01-01',1);
