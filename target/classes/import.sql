INSERT INTO Moneda (codMoneda, nombre) VALUES ('USD', 'Dolares');
INSERT INTO Moneda (codMoneda, nombre) VALUES ('PEN', 'Soles');
INSERT INTO Moneda (codMoneda, nombre) VALUES ('EUR', 'Euro');
INSERT INTO Moneda (codMoneda, nombre) VALUES ('GBP', 'Libras');
INSERT INTO Moneda (codMoneda, nombre) VALUES ('JPY', 'Yenes');

INSERT INTO TipoCambio (codcambio, monedaOrigen, monedaDestino, montotipocambio) VALUES (1, 'USD', 'PEN', 4.00);
INSERT INTO TipoCambio (codcambio, monedaOrigen, monedaDestino, montotipocambio) VALUES (2, 'PEN', 'USD', 0.25);

INSERT INTO Cambio (monto, montoCambio, fechaCambio, tipoCambio) VALUES (100.0, 400.0, '2023-10-16 10:00:00', 1);
INSERT INTO Cambio (monto, montoCambio, fechaCambio, tipoCambio) VALUES (200.0, 50.0, '2023-10-16 11:00:00', 2);