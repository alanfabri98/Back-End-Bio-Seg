--Usuario
INSERT INTO `usuarios` (`id_usuario`, `apellido`, `contrasena`, `email`, `estado_usuario`, `nombre`, `rol`, `telefono`, `token`) VALUES (NULL, 'Jaramillo', '12345', 'email@hotmail.com', b'1', 'Julio', 'Cliente', '0999989113', NULL);
INSERT INTO `usuarios` (`id_usuario`, `apellido`, `contrasena`, `email`, `estado_usuario`, `nombre`, `rol`, `telefono`, `token`) VALUES (NULL, 'Ona', '12345', 'email2@hotmail.com', b'1', 'Alan', 'Cliente', '0999989113', NULL), (NULL, 'Ona2', '12345', 'email3@hotmail.com', b'1', 'Alan2', 'Vendedor', '0999989113', NULL);
INSERT INTO `usuarios` (`id_usuario`, `apellido`, `contrasena`, `email`, `estado_usuario`, `nombre`, `rol`, `telefono`, `token`) VALUES (NULL, 'Ona3', '12345', 'email4@hotmail.com', b'1', 'Alan3', 'Vendedor', '0999989113', NULL), (NULL, 'Ona4', '12345', 'email5@hotmail.com', b'1', 'Alan4', 'Vendedor', '0999989113', NULL);

--Categoria
INSERT INTO `categorias` (`id_categoria`, `nombre_categoria`) VALUES (NULL, 'Guantes'), (NULL, 'Trajes'), (NULL, 'Mascarillas'), (NULL, 'Otros');

--Articulo
INSERT INTO `articulos` (`id_articulo`, `cantidad`, `detalle`, `estado_articulo`, `fecha_registro`, `nombre_articulo`, `precio`, `url_imagen`, `fk_categoria`, `fk_usuario`) VALUES (NULL, '15', 'Nuevo producto', b'1', '2020-12-02', 'Articulo 1', '0.5', 'https://rockcontent.com/es/wp-content/uploads/2019/02/o-que-e-produto-no-mix-de-marketing-1280x720.png', '1', '3');
INSERT INTO `articulos` (`id_articulo`, `cantidad`, `detalle`, `estado_articulo`, `fecha_registro`, `nombre_articulo`, `precio`, `url_imagen`, `fk_categoria`, `fk_usuario`) VALUES (NULL, '16', 'Nuevo producto', b'1', '2020-12-03', 'Articulo 2', '1.5', 'https://rockcontent.com/es/wp-content/uploads/2019/02/o-que-e-produto-no-mix-de-marketing-1280x720.png', '1', '4');
INSERT INTO `articulos` (`id_articulo`, `cantidad`, `detalle`, `estado_articulo`, `fecha_registro`, `nombre_articulo`, `precio`, `url_imagen`, `fk_categoria`, `fk_usuario`) VALUES (NULL, '17', 'Nuevo producto', b'1', '2020-12-04', 'Articulo 3', '2.5', 'https://rockcontent.com/es/wp-content/uploads/2019/02/o-que-e-produto-no-mix-de-marketing-1280x720.png', '2', '5');
INSERT INTO `articulos` (`id_articulo`, `cantidad`, `detalle`, `estado_articulo`, `fecha_registro`, `nombre_articulo`, `precio`, `url_imagen`, `fk_categoria`, `fk_usuario`) VALUES (NULL, '18', 'Nuevo producto', b'1', '2020-12-05', 'Articulo 4', '3.5', 'https://rockcontent.com/es/wp-content/uploads/2019/02/o-que-e-produto-no-mix-de-marketing-1280x720.png', '2', '3');
INSERT INTO `articulos` (`id_articulo`, `cantidad`, `detalle`, `estado_articulo`, `fecha_registro`, `nombre_articulo`, `precio`, `url_imagen`, `fk_categoria`, `fk_usuario`) VALUES (NULL, '19', 'Nuevo producto', b'1', '2020-12-06', 'Articulo 5', '4.5', 'https://rockcontent.com/es/wp-content/uploads/2019/02/o-que-e-produto-no-mix-de-marketing-1280x720.png', '3', '4');
INSERT INTO `articulos` (`id_articulo`, `cantidad`, `detalle`, `estado_articulo`, `fecha_registro`, `nombre_articulo`, `precio`, `url_imagen`, `fk_categoria`, `fk_usuario`) VALUES (NULL, '20', 'Nuevo producto', b'1', '2020-12-07', 'Articulo 6', '5.5', 'https://rockcontent.com/es/wp-content/uploads/2019/02/o-que-e-produto-no-mix-de-marketing-1280x720.png', '3', '5');
INSERT INTO `articulos` (`id_articulo`, `cantidad`, `detalle`, `estado_articulo`, `fecha_registro`, `nombre_articulo`, `precio`, `url_imagen`, `fk_categoria`, `fk_usuario`) VALUES (NULL, '21', 'Nuevo producto', b'1', '2020-12-08', 'Articulo 7', '6.5', 'https://rockcontent.com/es/wp-content/uploads/2019/02/o-que-e-produto-no-mix-de-marketing-1280x720.png', '4', '3');
INSERT INTO `articulos` (`id_articulo`, `cantidad`, `detalle`, `estado_articulo`, `fecha_registro`, `nombre_articulo`, `precio`, `url_imagen`, `fk_categoria`, `fk_usuario`) VALUES (NULL, '22', 'Nuevo producto', b'1', '2020-12-09', 'Articulo 8', '7.5', 'https://rockcontent.com/es/wp-content/uploads/2019/02/o-que-e-produto-no-mix-de-marketing-1280x720.png', '4', '4');
INSERT INTO `articulos` (`id_articulo`, `cantidad`, `detalle`, `estado_articulo`, `fecha_registro`, `nombre_articulo`, `precio`, `url_imagen`, `fk_categoria`, `fk_usuario`) VALUES (NULL, '23', 'Nuevo producto', b'1', '2020-12-10', 'Articulo 9', '0.5', 'https://rockcontent.com/es/wp-content/uploads/2019/02/o-que-e-produto-no-mix-de-marketing-1280x720.png', '1', '5');

--Carrito
INSERT INTO `carritos` (`id_carrito`, `fk_articulo`, `fk_usuario`) VALUES (NULL, '1', '1'), (NULL, '2', '1');
INSERT INTO `carritos` (`id_carrito`, `fk_articulo`, `fk_usuario`) VALUES (NULL, '3', '1'), (NULL, '4', '1');
INSERT INTO `carritos` (`id_carrito`, `fk_articulo`, `fk_usuario`) VALUES (NULL, '5', '2'), (NULL, '2', '2');
INSERT INTO `carritos` (`id_carrito`, `fk_articulo`, `fk_usuario`) VALUES (NULL, '7', '2'), (NULL, '8', '2');
INSERT INTO `carritos` (`id_carrito`, `fk_articulo`, `fk_usuario`) VALUES (NULL, '9', '2');

--Venta
INSERT INTO `ventas` (`id_venta`, `fecha_venta`, `fk_usuario`) VALUES (NULL, '2020-12-30', '1'), (NULL, '2020-12-30', '1');
INSERT INTO `ventas` (`id_venta`, `fecha_venta`, `fk_usuario`) VALUES (NULL, '2020-12-30', '2');

--Negocio
INSERT INTO `negocios` (`id_negocio`, `cantidad`, `precio`, `sub_total`, `total`, `fk_carrito`, `fk_venta`) VALUES (NULL, '10', '0.5', '5', '5.12', '1', '1'), (NULL, '11', '3.5', '38.5', '38.62', '4', '1');
INSERT INTO `negocios` (`id_negocio`, `cantidad`, `precio`, `sub_total`, `total`, `fk_carrito`, `fk_venta`) VALUES (NULL, '10', '0.5', '5', '5.12', '1', '1'), (NULL, '11', '3.5', '38.5', '38.62', '4', '2');
INSERT INTO `negocios` (`id_negocio`, `cantidad`, `precio`, `sub_total`, `total`, `fk_carrito`, `fk_venta`) VALUES (NULL, '9', '4.5', '5', '40.62', '5', '2');






