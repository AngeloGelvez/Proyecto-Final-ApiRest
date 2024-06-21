--INSERCIONES CLIENTES
INSERT INTO clientes(apellido, email, nombre, telefono) VALUES('Almeida', 'carlos@gmail.com', 'Carlos', '3158474895');
INSERT INTO clientes(apellido, email, nombre, telefono) VALUES('López', 'ana@gmail.com', 'Ana', '3102568741');
INSERT INTO clientes(apellido, email, nombre, telefono) VALUES('García', 'miguel@gmail.com', 'Miguel', '3189642578');
INSERT INTO clientes(apellido, email, nombre, telefono) VALUES('Martínez', 'laura@gmail.com', 'Laura', '3017534862');
INSERT INTO clientes(apellido, email, nombre, telefono) VALUES('Rodríguez', 'alejandro@gmail.com', 'Alejandro', '3176890452');


--OFICINA
INSERT INTO oficinas(ciudad, nombre, telefono, ubicacion) VALUES('Bucaramanga', 'Abitare', '3154874158', 'Cra 2 # 4-32 soledad');
INSERT INTO oficinas(ciudad, nombre, telefono, ubicacion) VALUES('Medellín', 'Alliance', '3001234567', 'Cra 5 # 10-15 barrio');
INSERT INTO oficinas(ciudad, nombre, telefono, ubicacion) VALUES('Bogotá', 'Home', '3119876543', 'Av. Principal #123');
INSERT INTO oficinas(ciudad, nombre, telefono, ubicacion) VALUES('Cota', 'Cota', '3224567890', 'Calle 7 # 20-30');
INSERT INTO oficinas(ciudad, nombre, telefono, ubicacion) VALUES('Cali', 'Reale', '3158765432', 'Diagonal 15 # 25-40');
INSERT INTO oficinas(ciudad, nombre, telefono, ubicacion) VALUES('Barranquilla', 'Reality', '3172345678', 'Cra 8 # 12-18');


--PROPIETARIO
INSERT INTO propietarios(apellido, ciudad, correo, nombre, pais, telefono) VALUES('Hernández', 'Cali', 'sofia@gmail.com', 'Sofía', 'Colombia', '3125896740');
INSERT INTO propietarios(apellido, ciudad, correo, nombre, pais, telefono) VALUES('Gómez', 'Cali', 'alejandro@gmail.com', 'Alejandro', 'Colombia', '3187654321');
INSERT INTO propietarios(apellido, ciudad, correo, nombre, pais, telefono) VALUES('Martínez', 'Cali', 'Fernanda@gmail.com', 'Fernanda', 'Colombia', '3109876543');
INSERT INTO propietarios(apellido, ciudad, correo, nombre, pais, telefono) VALUES('Rodríguez', 'Cali', 'miguel@gmail.com', 'Miguel', 'Colombia', '3158765432');
INSERT INTO propietarios(apellido, ciudad, correo, nombre, pais, telefono) VALUES('López', 'Cali', 'Martha@gmail.com', 'Martha', 'Colombia', '3012345678');
INSERT INTO propietarios(apellido, ciudad, correo, nombre, pais, telefono) VALUES('Almeida', 'Cali', 'carlos@gmail.com', 'Carlos', 'Colombia', '3145678901');

--OFERTA
INSERT INTO oferta VALUES(1, 'Alquiler', 'Apartemento completamentes nuevo', 'Nuevo', 1500, 2000);
INSERT INTO oferta VALUES(2, 'Alquiler', 'Apartamento recién remodelado', 'Remodelado', 1800, 2200);
INSERT INTO oferta VALUES(3, 'Alquiler', 'Apartamento recién remodelado', 'Remodelado', 1800, 2200);
INSERT INTO oferta VALUES(4, 'Venta', 'Ubicación céntrica cerca de todas las comodidades', 'Centrico', 1200, 1800);

--CARACTERISTICAS
INSERT INTO caracteristicas VALUES(1, 1, 2, 3, 500, 2);
INSERT INTO caracteristicas VALUES(2, 1, 2, 2, 600, 3);
INSERT INTO caracteristicas VALUES(3, 1, 1, 4, 700, 2);
INSERT INTO caracteristicas VALUES(4, 2, 2, 2, 800, 2);

--INMUEBLE
INSERT INTO inmuebles(ciudad, direccion, num_referencia, precio, superficie, propietario_id, oferta_id, caract_id, oficina_id) VALUES('Bucaramanga', 'Cra 2 # 40-69 portal loma', '34518', 1900, 300, 1, 1, 1, 1);

--VISITAS
INSERT INTO visitas(comentario, fecha_visita, cliente_id, inmueble_id) VALUES('Super buena la vivienda, pero no tenemos dinero para comprarla', '2023/07/08', 1, 1);