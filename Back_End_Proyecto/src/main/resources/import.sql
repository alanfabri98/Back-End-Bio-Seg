--Usuario
INSERT INTO `usuarios` (`id_usuario`, `apellido`, `contrasena`, `email`, `estado_usuario`, `nombre`, `rol`, `telefono`, `token`) VALUES (NULL, 'Jaramillo', '12345', 'email@hotmail.com', b'1', 'Julio', 'Cliente', '0999989113', NULL);
INSERT INTO `usuarios` (`id_usuario`, `apellido`, `contrasena`, `email`, `estado_usuario`, `nombre`, `rol`, `telefono`, `token`) VALUES (NULL, 'Ona', '12345', 'email2@hotmail.com', b'1', 'Alan', 'Cliente', '0999989113', NULL);
INSERT INTO `usuarios` (`id_usuario`, `apellido`, `contrasena`, `email`, `estado_usuario`, `nombre`, `rol`, `telefono`, `token`) VALUES (NULL, 'Ona2', '12345', 'email3@hotmail.com', b'1', 'Alan2', 'Vendedor', '0999989113', NULL);

--Categoria
INSERT INTO `categorias` (`id_categoria`, `nombre_categoria`) VALUES (NULL, 'Guantes'), (NULL, 'Trajes'), (NULL, 'Mascarillas'), (NULL, 'Otros');

--Articulo
INSERT INTO `articulos` (`id_articulo`, `cantidad`, `detalle`, `estado_articulo`, `fecha_registro`, `nombre_articulo`, `precio`, `url_imagen`, `fk_categoria`, `fk_usuario`) VALUES (NULL, '15', 'Primer articulo', b'0', NULL, 'Articulo x', '15.00', NULL, '1', '1');

