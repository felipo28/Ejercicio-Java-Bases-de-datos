-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 06-07-2022 a las 18:28:50
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `ejerciciofactura`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tblcliente`
--

CREATE TABLE `tblcliente` (
  `id` int(11) NOT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `direccion` varchar(255) DEFAULT NULL,
  `telefono` varchar(255) DEFAULT NULL,
  `imagen` longblob DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `tblcliente`
--

INSERT INTO `tblcliente` (`id`, `nombre`, `direccion`, `telefono`, `imagen`) VALUES
(1, 'maria', 'cra 101', '321', '');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbldetallefactura`
--

CREATE TABLE `tbldetallefactura` (
  `consecutivo` int(11) NOT NULL,
  `numFactura` int(11) DEFAULT NULL,
  `codProducto` int(11) DEFAULT NULL,
  `cantidad` int(11) DEFAULT NULL,
  `vlrUnitario` decimal(10,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `tbldetallefactura`
--

INSERT INTO `tbldetallefactura` (`consecutivo`, `numFactura`, `codProducto`, `cantidad`, `vlrUnitario`) VALUES
(1, 1, 1, 4, '42300.00'),
(2, 1, 3, 1, '750000.00'),
(5, 1, 1, 2, '25000.00');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tblfactura`
--

CREATE TABLE `tblfactura` (
  `numero` int(11) NOT NULL,
  `fecha` varchar(255) DEFAULT NULL,
  `idCliente` int(11) DEFAULT NULL,
  `fechaHoraCreacion` varchar(255) DEFAULT NULL,
  `fechaHoraModificacion` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `tblfactura`
--

INSERT INTO `tblfactura` (`numero`, `fecha`, `idCliente`, `fechaHoraCreacion`, `fechaHoraModificacion`) VALUES
(1, '01/07/2022', 1, '01/07/2022', '01/07/2022'),
(123, '01/07/2022', 1, '01/07/2022', '01/07/2022');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tblproducto`
--

CREATE TABLE `tblproducto` (
  `codigo` int(11) NOT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `imagen` longblob DEFAULT NULL,
  `codTipoProducto` int(11) DEFAULT NULL,
  `fechaCreacion` varchar(255) DEFAULT NULL,
  `fechaModificacion` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `tblproducto`
--

INSERT INTO `tblproducto` (`codigo`, `nombre`, `imagen`, `codTipoProducto`, `fechaCreacion`, `fechaModificacion`) VALUES
(1, 'Pantalon', '', 1, '01/07/2022', '01/07/2022'),
(2, 'Lg 24 Pg', '', 2, '01/07/2022', '01/07/2022'),
(3, 'Motorola one fusion', '', 3, '01/07/2022', '01/07/2022'),
(4, 'SAMSUNG Galaxy A32', '', 3, '01/07/2022', '01/07/2022'),
(5, 'Camisas', '', 1, '01/07/2022', '01/07/2022');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbltipoproducto`
--

CREATE TABLE `tbltipoproducto` (
  `codigo` int(11) NOT NULL,
  `nombre` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `tbltipoproducto`
--

INSERT INTO `tbltipoproducto` (`codigo`, `nombre`) VALUES
(1, 'Ropa'),
(2, 'Tv'),
(3, 'Celulares'),
(4, 'Muebles');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tblusuario`
--

CREATE TABLE `tblusuario` (
  `id` int(11) NOT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `usuario` varchar(255) DEFAULT NULL,
  `clave` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `tblusuario`
--

INSERT INTO `tblusuario` (`id`, `nombre`, `usuario`, `clave`) VALUES
(1, 'andres', 'and', '123'),
(2, 'felipe', 'fel', '123'),
(3, 'maria', 'mar', '123');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `tblcliente`
--
ALTER TABLE `tblcliente`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `tbldetallefactura`
--
ALTER TABLE `tbldetallefactura`
  ADD PRIMARY KEY (`consecutivo`),
  ADD KEY `numFactura` (`numFactura`),
  ADD KEY `codProducto` (`codProducto`);

--
-- Indices de la tabla `tblfactura`
--
ALTER TABLE `tblfactura`
  ADD PRIMARY KEY (`numero`),
  ADD KEY `idCliente` (`idCliente`);

--
-- Indices de la tabla `tblproducto`
--
ALTER TABLE `tblproducto`
  ADD PRIMARY KEY (`codigo`),
  ADD KEY `codTipoProducto` (`codTipoProducto`);

--
-- Indices de la tabla `tbltipoproducto`
--
ALTER TABLE `tbltipoproducto`
  ADD PRIMARY KEY (`codigo`);

--
-- Indices de la tabla `tblusuario`
--
ALTER TABLE `tblusuario`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `tblcliente`
--
ALTER TABLE `tblcliente`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `tbldetallefactura`
--
ALTER TABLE `tbldetallefactura`
  MODIFY `consecutivo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `tblfactura`
--
ALTER TABLE `tblfactura`
  MODIFY `numero` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=124;

--
-- AUTO_INCREMENT de la tabla `tblproducto`
--
ALTER TABLE `tblproducto`
  MODIFY `codigo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `tbltipoproducto`
--
ALTER TABLE `tbltipoproducto`
  MODIFY `codigo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `tblusuario`
--
ALTER TABLE `tblusuario`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `tbldetallefactura`
--
ALTER TABLE `tbldetallefactura`
  ADD CONSTRAINT `tbldetallefactura_ibfk_1` FOREIGN KEY (`numFactura`) REFERENCES `tblfactura` (`numero`),
  ADD CONSTRAINT `tbldetallefactura_ibfk_2` FOREIGN KEY (`codProducto`) REFERENCES `tblproducto` (`codigo`);

--
-- Filtros para la tabla `tblfactura`
--
ALTER TABLE `tblfactura`
  ADD CONSTRAINT `tblfactura_ibfk_1` FOREIGN KEY (`idCliente`) REFERENCES `tblcliente` (`id`);

--
-- Filtros para la tabla `tblproducto`
--
ALTER TABLE `tblproducto`
  ADD CONSTRAINT `tblproducto_ibfk_1` FOREIGN KEY (`codTipoProducto`) REFERENCES `tbltipoproducto` (`codigo`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
