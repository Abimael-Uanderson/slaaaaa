CREATE DATABASE FriendlyConnection;
USE FriendlyConnection;

CREATE TABLE pessoa (
    pessoa_id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    telefone VARCHAR(15) NOT NULL
);

CREATE TABLE evento (
    evento_id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    descricao TEXT,
    data DATE,
    horario TIME,
    endereco_id INT,
    cep VARCHAR(20) NOT NULL,
    bairro VARCHAR(50) NOT NULL,
    rua VARCHAR(100) NOT NULL,
    referencia VARCHAR(100)
);


