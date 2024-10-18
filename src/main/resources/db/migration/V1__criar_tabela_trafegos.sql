CREATE TABLE tbl_trafegos (
    numero_trafego INT NOT NULL AUTO_INCREMENT,
    estado VARCHAR(100) NOT NULL,
    cidade VARCHAR(100) NOT NULL,
    cituacao VARCHAR(100) NOT NULL,
    data_ocorrido DATE NOT NULL,
    PRIMARY KEY (numero_trafego)
);
