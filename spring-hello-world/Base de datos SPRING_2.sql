SET GLOBAL time_zone = '+8:00';

DROP DATABASE IF EXISTS prueba;

CREATE DATABASE prueba;
USE prueba;

CREATE TABLE IF NOT EXISTS Paciente(
paciente_id int NOT NULL AUTO_INCREMENT COMMENT 'Id de Paciente',
 paciente_nombre varchar(100) NOT NULL COMMENT 'Nombres del paciente',
 paciente_dni varchar(11) NOT NULL COMMENT 'Documento de identidad del
paciente',
 paciente_nacimiento DATETIME COMMENT 'Fecha de nacimiento del paciente',
 PRIMARY KEY (`paciente_id`)
);
CREATE TABLE IF NOT EXISTS Personal(
personal_id int NOT NULL AUTO_INCREMENT COMMENT 'Id de Personal',
 personal_nombre varchar(100) NOT NULL COMMENT 'Nombres del personal',
 personal_cargo varchar(25) NOT NULL COMMENT 'cargo del personal',
 personal_estado varchar(50) COMMENT 'estado del personal ACTIVO o INACTIVO',
 PRIMARY KEY (`personal_id`)
);
CREATE TABLE IF NOT EXISTS Turno(
turno_id int NOT NULL AUTO_INCREMENT COMMENT 'Id de Turno',
 turno_descripcion varchar(75) NOT NULL COMMENT 'Descripcion del Turno',
 turno_doctor_id int COMMENT 'Id del doctor que atendera',
 turno_fecha DATETIME NOT NULL COMMENT 'Fecha del Turno de atencion',
 turno_paciente_id int COMMENT 'paciente Id',
 turno_create_date DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT 'Fecha y
hora de creacion del turno en el sistema',
 PRIMARY KEY (`turno_id`),
 FOREIGN KEY (turno_paciente_id) REFERENCES Paciente(paciente_id),
 FOREIGN KEY (turno_doctor_id) REFERENCES Personal(personal_id)
);

INSERT INTO Personal (personal_nombre, personal_cargo, personal_estado)
VALUES ('Juan Perez', 'Desarrollador', 'ACTIVO');

select * from Personal;

INSERT INTO Paciente (paciente_nombre, paciente_dni, paciente_nacimiento)
VALUES ('Ana López', '12345678901', '1990-05-20 00:00:00');

select * from Paciente;
