

CREATE DATABASE citas_medicas;
GO

USE citas_medicas;
GO



CREATE TABLE especialidad (
    idespecialidad INT IDENTITY(1,1) PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL
);
GO




CREATE TABLE paciente (
    codigopaciente INT IDENTITY(1,1) PRIMARY KEY,
    nombres VARCHAR(100) NOT NULL,
    apellidos VARCHAR(100) NOT NULL,
    dni CHAR(8) NOT NULL UNIQUE,
    telefono VARCHAR(20),
    fechanacimiento DATE,
    seguro VARCHAR(20) NOT NULL CHECK (seguro IN ('SIS','EsSalud','Privado','SaludPol')),
    motivo VARCHAR(MAX)
);
GO




CREATE TABLE medico (
    codigomedico INT IDENTITY(1,1) PRIMARY KEY,
    nombrecompleto VARCHAR(150) NOT NULL,
    idespecialidad INT NOT NULL,
    horarios_disponible VARCHAR(100),
    turno VARCHAR(10) CHECK (turno IN ('Mañana','Tarde','Noche')),
    telefono VARCHAR(20),
    email VARCHAR(100),
    FOREIGN KEY (idespecialidad) REFERENCES especialidad(idespecialidad)
);
GO



CREATE TABLE agendar_cita (
    codigocita INT IDENTITY(1,1) PRIMARY KEY,
    fecha DATE NOT NULL,
    hora TIME NOT NULL,
    codigopaciente INT NOT NULL,
    idespecialidad INT NOT NULL,
    codigomedico INT NOT NULL,
    estado VARCHAR(MAX),
    FOREIGN KEY (codigopaciente) REFERENCES paciente(codigopaciente),
    FOREIGN KEY (idespecialidad) REFERENCES especialidad(idespecialidad),
    FOREIGN KEY (codigomedico) REFERENCES medico(codigomedico)
);
GO



CREATE TABLE usuario (
    idusuario INT IDENTITY(1,1) PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    contraseña VARCHAR(100) NOT NULL,
    tipo_usuario VARCHAR(20) NOT NULL CHECK (tipo_usuario IN ('Administrador','Médico','Paciente','Recepcionista'))
);
GO





INSERT INTO paciente (nombres, apellidos, dni, telefono, fechanacimiento, seguro, motivo) VALUES
(N'pepe', N'torres', '98745470', '954125474', '2000-05-10', 'SIS', N'para salud'),
(N'Ana', N'Roca', '98452140', '954120140', '2000-05-07', 'SIS', N'el braso muscular');
GO

INSERT INTO usuario (nombre, email, contraseña, tipo_usuario) VALUES
(N'Administrador General', 'admin@gmail.com', '123', 'Administrador'),
(N'Dr. Luis Pérez', 'perez@gmail.com', '12345', 'Médico'),
(N'Saul Roca', 'Saul@gmail.com', '123456', 'Paciente'),
(N'María Torres', 'mtorres@gmail.com', '1234567', 'Recepcionista');
GO

INSERT INTO especialidad (nombre) VALUES
(N'Pediatría'),
(N'Medicina Interna'),
(N'Cardiología'),
(N'Dermatología');
GO


INSERT INTO medico (nombrecompleto, idespecialidad, horarios_disponible, turno, telefono, email) VALUES
(N'Jorge Perales', 1, N'44', 'Mañana', '5656', 'sgdgd@gmail.com'),
(N'Ruben Roca', 2, N'11:00', 'Tarde', '98745144', 'RubenRoca@gmail.com'),
(N'Sara', 3, N'10:00', 'Mañana', '954147777', 'sara@gmail.com'),
(N'Javier Lomas', 4, N'08:00', 'Noche', '984521474', 'javierw@gmail.com');
GO



INSERT INTO agendar_cita (fecha, hora, codigopaciente, idespecialidad, codigomedico, estado) VALUES
('2025-06-17', '10:10:00', 1, 1, 1, N'ATENDIDO'),
('2025-06-18', '12:57:00', 2, 2, 2, N'Pendiente');
GO
