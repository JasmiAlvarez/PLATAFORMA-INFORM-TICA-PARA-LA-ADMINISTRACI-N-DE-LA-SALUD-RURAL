-- Crear base de datos
CREATE DATABASE RegistrarCitas;
GO

USE RegistrarCitas;
GO

-- Tabla Especialidad 
CREATE TABLE Especialidad (
    id_especialidad INT IDENTITY(1,1) PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL UNIQUE,
    descripcion VARCHAR(255) NULL,
    area VARCHAR(50) NULL,
    nivel_importancia INT NULL,
    activo BIT NOT NULL DEFAULT 1,
    fecha_creacion DATETIME NOT NULL DEFAULT GETDATE(),
    fecha_modificacion DATETIME NULL
);
GO

-- Tabla CentroSalud (7 atributos)
CREATE TABLE CentroSalud (
    id_centro INT IDENTITY(1,1) PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    direccion VARCHAR(150) NOT NULL,
    telefono VARCHAR(20) NULL,
    email VARCHAR(100) NULL,
    capacidad INT NULL,
    horario_atencion VARCHAR(100) NULL,
    fecha_creacion DATETIME NOT NULL DEFAULT GETDATE()
);
GO

-- Tabla Paciente (7 atributos)
CREATE TABLE Paciente (
    id_paciente INT IDENTITY(1,1) PRIMARY KEY,
    dni VARCHAR(15) NOT NULL UNIQUE,
    nombres VARCHAR(50) NOT NULL,
    apellidos VARCHAR(50) NOT NULL,
    sexo CHAR(1) NOT NULL, -- M/F/O
    fecha_nacimiento DATE NULL,
    telefono VARCHAR(20) NULL,
    direccion VARCHAR(150) NULL,
    email VARCHAR(100) NULL
);
GO

-- Tabla PersonalMedico (7 atributos)
CREATE TABLE PersonalMedico (
    id_medico INT IDENTITY(1,1) PRIMARY KEY,
    cmp VARCHAR(20) NOT NULL UNIQUE,
    nombres VARCHAR(50) NOT NULL,
    apellidos VARCHAR(50) NOT NULL,
    especialidad_id INT NOT NULL,
    telefono VARCHAR(20) NULL,
    email VARCHAR(100) NULL,
    estado BIT NOT NULL DEFAULT 1,
    FOREIGN KEY (especialidad_id) REFERENCES Especialidad(id_especialidad)
);
GO

-- Tabla HistorialClinico (7 atributos)
CREATE TABLE HistorialClinico (
    id_historial INT IDENTITY(1,1) PRIMARY KEY,
    fecha DATE NOT NULL,
    diagnostico VARCHAR(500) NOT NULL,
    tratamiento VARCHAR(500) NULL,
    observaciones VARCHAR(500) NULL,
    id_paciente INT NOT NULL,
    id_medico INT NOT NULL,
    estado BIT NOT NULL DEFAULT 1,
    FOREIGN KEY (id_paciente) REFERENCES Paciente(id_paciente),
    FOREIGN KEY (id_medico) REFERENCES PersonalMedico(id_medico)
);
GO

-- Tabla CitaMedica (7 atributos)
CREATE TABLE CitaMedica (
    id_cita INT IDENTITY(1,1) PRIMARY KEY,
    fecha DATE NOT NULL,
    hora TIME NOT NULL,
    estado VARCHAR(20) NOT NULL,
    motivo VARCHAR(255) NULL,
    id_paciente INT NOT NULL,
    id_medico INT NOT NULL,
    id_centro INT NOT NULL,
    FOREIGN KEY (id_paciente) REFERENCES Paciente(id_paciente),
    FOREIGN KEY (id_medico) REFERENCES PersonalMedico(id_medico),
    FOREIGN KEY (id_centro) REFERENCES CentroSalud(id_centro)
);
GO

-- Tabla ReporteEstadistico (7 atributos)
CREATE TABLE ReporteEstadistico (
    id_reporte INT IDENTITY(1,1) PRIMARY KEY,
    tipo VARCHAR(50) NOT NULL,
    fecha DATE NOT NULL,
    datos TEXT NOT NULL,
    id_medico INT NOT NULL,
    descripcion VARCHAR(255) NULL,
    creado_por VARCHAR(50) NULL,
    estado BIT NOT NULL DEFAULT 1,
    FOREIGN KEY (id_medico) REFERENCES PersonalMedico(id_medico)
);
GO

-- Tabla Usuario (7 atributos)
CREATE TABLE Usuario (
    id_usuario INT IDENTITY(1,1) PRIMARY KEY,
    username VARCHAR(30) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    rol VARCHAR(20) NOT NULL,
    email VARCHAR(100) NULL,
    fecha_creacion DATETIME NOT NULL DEFAULT GETDATE(),
    estado BIT NOT NULL DEFAULT 1
);
GO
