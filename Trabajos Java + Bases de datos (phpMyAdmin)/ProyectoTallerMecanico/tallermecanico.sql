-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 06-07-2022 a las 18:38:26
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
-- Base de datos: `tallermecanico`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientevehiculo`
--

CREATE TABLE `clientevehiculo` (
  `placa` varchar(255) NOT NULL,
  `identificacion` int(11) NOT NULL,
  `nombre` varchar(255) NOT NULL,
  `apellidos` varchar(255) NOT NULL,
  `modelo` int(11) NOT NULL,
  `color` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `clientevehiculo`
--

INSERT INTO `clientevehiculo` (`placa`, `identificacion`, `nombre`, `apellidos`, `modelo`, `color`) VALUES
('AGH430', 55225302, 'Maria del Socorro', 'Herrera Vargas', 2007, 'Blanco'),
('AJG351', 1129535980, 'ELIAS JOSE', 'HERNANDEZ MIRANDA', 2012, 'Amarillo'),
('CHK107', 55221700, 'CARMEN ALICIA', 'GONZALEZ TEHERAN', 2014, 'Gris'),
('EPX932', 22491510, 'shirley isabel', 'mariano mendoza', 1927, 'Verde'),
('GER178', 73188414, 'HENRY', 'GARCIA ARNEDO', 2017, 'Plateado'),
('JXV359', 24079950, 'LUZ ALBA', 'MOLINA TURRIAGO', 1985, 'Rojo'),
('MYR544', 1051817367, 'Luz Deris', 'Estrada Vasquez', 1995, 'Cafe'),
('NSG586', 8728000, 'Luis Cayetano', 'Pacheco Muñoz', 1986, 'Blanco'),
('OHJ397', 73593681, 'JHON JAIRO', 'PEREZ ARELLANO', 2002, 'Azul'),
('VXI926', 32882986, 'HEIDI CATALINA', 'CACERES TEJEDOR', 1975, 'Negro');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_cliente`
--

CREATE TABLE `tbl_cliente` (
  `apellidos` varchar(255) NOT NULL,
  `correo` varchar(255) NOT NULL,
  `domicilio` varchar(255) NOT NULL,
  `identificacion` int(11) NOT NULL,
  `nombre` varchar(255) NOT NULL,
  `telefono` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `tbl_cliente`
--

INSERT INTO `tbl_cliente` (`apellidos`, `correo`, `domicilio`, `identificacion`, `nombre`, `telefono`) VALUES
('garcia', 'pepe@gmail.com', 'edificio', 2020, 'pep', '473'),
('macia', 'cra 92 # 20-06', 'edificio', 52393, 'ana', '3123'),
('Pacheco Muñoz', 'luispachecom@gmail.com', 'CRA. 18 C #\r\n112 - 25', 8728000, 'Luis Cayetano', '3008093605'),
('macias', 'andres@gmail.com', 'casa', 10101010, 'felipe', '321321321'),
('mariano mendoza', 'shirley.mariano@gmail.com', 'CRA. 6 # 123 -\r\n45', 22491510, 'shirley isabel', '3032558'),
('MOLINA TURRIAGO', 'luzalbam@gmail.com', 'CRA. 17 A #\r\n116 - 36', 24079950, 'LUZ ALBA', '3187274669'),
('CACERES TEJEDOR', 'angelcaceresh@hotmail.com', 'CRA 56 # 61 - 66 P 2', 32882986, 'HEIDI CATALINA', '3205155467'),
('GONZALEZ TEHERAN', 'alicia2130@hotmail.com', 'CALLE 100 NO.\r\n17A- 55 LOCAL 103', 55221700, 'CARMEN ALICIA', '3017142182'),
('Herrera Vargas', 'desarrollo.maria@gmail.com', 'CRA. 14 # 88 -\r\n09 APTO. 702', 55225302, 'Maria del Socorro', '3012457'),
('GARCIA ARNEDO', 'hgarciaarnedo@hotmail.com', 'CLL 109 # 14\r\nB - 60', 73188414, 'HENRY', '3145318029'),
('PEREZ ARELLANO', 'arellano0901@hotmail.com', 'CLL 65 NO 3B-\r\n30 APTO 506', 73593681, 'JHON JAIRO', '3145445453'),
('Estrada Vasquez', 'luzd1225@gmail.com', 'CRA 7G NO.\r\n151A - 07 APTO 502', 1051817367, 'Luz Deris', '3002446317'),
('HERNANDEZ MIRANDA', 'eliashernandezmiranda77@gmail.com', 'CRA 15 # 79-\r\n36', 1129535980, 'ELIAS JOSE', '3016827410');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_especialidad`
--

CREATE TABLE `tbl_especialidad` (
  `codigo` int(11) NOT NULL,
  `nombre` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `tbl_especialidad`
--

INSERT INTO `tbl_especialidad` (`codigo`, `nombre`) VALUES
(1, 'Soldadura'),
(2, 'Montaje sistemas'),
(3, 'Mecánico Automotriz'),
(4, 'Electricista Automotriz'),
(5, 'Mecánico de Automotores Diesel'),
(6, 'Mecánico de Maquinaria Pesada '),
(7, 'Mecánico de Motores Menores'),
(8, 'Mecatrónica de Buses y Camiones'),
(9, 'Mecánico de Maquinaria Agrícola');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_marca`
--

CREATE TABLE `tbl_marca` (
  `codigo` int(11) NOT NULL,
  `nombre` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `tbl_marca`
--

INSERT INTO `tbl_marca` (`codigo`, `nombre`) VALUES
(1, 'BMW'),
(2, 'Mercedes-Benz'),
(3, 'Audi'),
(4, 'Lexus'),
(5, 'Renault'),
(6, 'Ford'),
(7, 'Opel'),
(8, 'Seat'),
(9, 'Bentley'),
(10, 'Chevrolet');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_mecanico`
--

CREATE TABLE `tbl_mecanico` (
  `apellidos` varchar(255) NOT NULL,
  `id_Especialidad` int(11) NOT NULL,
  `identificacion` int(11) NOT NULL,
  `nombre` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `tbl_mecanico`
--

INSERT INTO `tbl_mecanico` (`apellidos`, `id_Especialidad`, `identificacion`, `nombre`) VALUES
('ACOSTA', 1, 10516932, 'PEREGRINO'),
('AYALA', 5, 10529631, 'CARLOS HUGO'),
('ACOSTA FAUSTO', 2, 10547808, 'JOSE'),
('GONZALEZ MARTINEZ', 1, 34529465, 'ELIZABETH'),
('AGREDO TOBAR', 3, 34531725, 'XIMENA LUCIA'),
('AGUIRRE GARCIA', 5, 42870562, 'JUAN CARLOS'),
('ABELLA HERRERA', 4, 76307332, 'WILLIAM EFRAIN'),
('ANDRADE SOSSA', 2, 79459964, 'CAMILO ERNESTO');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_ordenreparacion`
--

CREATE TABLE `tbl_ordenreparacion` (
  `concecutivo` int(11) NOT NULL,
  `fechaIngreso` varchar(255) NOT NULL,
  `fechaSalida` varchar(255) NOT NULL,
  `horaIngreso` varchar(255) NOT NULL,
  `horaSalida` varchar(255) NOT NULL,
  `placaVehiculo` varchar(255) NOT NULL,
  `idMecanico` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `tbl_ordenreparacion`
--

INSERT INTO `tbl_ordenreparacion` (`concecutivo`, `fechaIngreso`, `fechaSalida`, `horaIngreso`, `horaSalida`, `placaVehiculo`, `idMecanico`) VALUES
(1, '03/07/2022', '05/07/2022', '10:20 am', '9:20 am', 'AGH430', 10516932),
(2, '12/07/2022', '17/07/2022', '8:40 am', '10:15 am', 'AJG351', 10529631),
(3, '14/07/2022', '17/07/2022', '1:20 pm', '10:43 am', 'GER178', 10547808),
(4, '17/07/2022', '20/07/2022', '3:27 pm', '8:10 am', 'JXV359', 34529465),
(5, '18/07/2022', '19/07/2022', '12:15 am', '1:21 am', 'MYR544', 42870562),
(6, '07/08/2022', '15/08/2022', '8:34 am', '4:38 pm', 'NSG586', 34531725),
(7, '12/08/2022', '17/08/2022', '4:23 pm', '9:30 am', 'OHJ397', 42870562),
(8, '21/08/2022', '15/09/2022', '2:12 pm', '10:20 am', 'OHJ397', 76307332),
(9, '13/08/2022', '20/08/2022', '5:20 pm', '1:54 pm', 'CHK107', 10516932),
(10, '18/08/2022', '23/08/2022', '8:30 am', '10:20 am', 'EPX932', 10547808);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_usuario`
--

CREATE TABLE `tbl_usuario` (
  `identificacion` int(11) NOT NULL,
  `nombre` varchar(255) NOT NULL,
  `nombreUsuario` varchar(255) NOT NULL,
  `contrasenia` varchar(255) NOT NULL,
  `correo` varchar(255) NOT NULL,
  `telefono` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `tbl_usuario`
--

INSERT INTO `tbl_usuario` (`identificacion`, `nombre`, `nombreUsuario`, `contrasenia`, `correo`, `telefono`) VALUES
(52393827, 'ana maria', 'anita', '2020', 'ana@gmail.com', '3123581535'),
(1010114567, 'andres felipe', 'felipo', '1010', 'pipe@gmail.com', '3219954916');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_vehiculo`
--

CREATE TABLE `tbl_vehiculo` (
  `color` varchar(255) NOT NULL,
  `idCliente` int(11) NOT NULL,
  `codMarca` int(11) NOT NULL,
  `modelo` int(11) NOT NULL,
  `placa` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `tbl_vehiculo`
--

INSERT INTO `tbl_vehiculo` (`color`, `idCliente`, `codMarca`, `modelo`, `placa`) VALUES
('p', 2020, 2, 6600, 'abc123'),
('Blanco', 55225302, 5, 2007, 'AGH430'),
('Amarillo', 1129535980, 9, 2012, 'AJG351'),
('Gris', 55221700, 4, 2014, 'CHK107'),
('Verde', 22491510, 1, 1927, 'EPX932'),
('Plateado', 73188414, 6, 2017, 'GER178'),
('amarillo', 52393, 10, 5000, 'hjk456'),
('Rojo', 24079950, 2, 1985, 'JXV359'),
('Cafe', 1051817367, 8, 1995, 'MYR544'),
('Blanco', 8728000, 10, 1986, 'NSG586'),
('Azul', 73593681, 7, 2002, 'OHJ397'),
('Negro', 32882986, 3, 1975, 'VXI926');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `tbl_cliente`
--
ALTER TABLE `tbl_cliente`
  ADD PRIMARY KEY (`identificacion`);

--
-- Indices de la tabla `tbl_especialidad`
--
ALTER TABLE `tbl_especialidad`
  ADD PRIMARY KEY (`codigo`);

--
-- Indices de la tabla `tbl_marca`
--
ALTER TABLE `tbl_marca`
  ADD PRIMARY KEY (`codigo`);

--
-- Indices de la tabla `tbl_mecanico`
--
ALTER TABLE `tbl_mecanico`
  ADD PRIMARY KEY (`identificacion`),
  ADD KEY `id_Especialidad` (`id_Especialidad`);

--
-- Indices de la tabla `tbl_ordenreparacion`
--
ALTER TABLE `tbl_ordenreparacion`
  ADD KEY `idMecanico` (`idMecanico`),
  ADD KEY `placaVehiculo` (`placaVehiculo`);

--
-- Indices de la tabla `tbl_usuario`
--
ALTER TABLE `tbl_usuario`
  ADD PRIMARY KEY (`identificacion`);

--
-- Indices de la tabla `tbl_vehiculo`
--
ALTER TABLE `tbl_vehiculo`
  ADD PRIMARY KEY (`placa`),
  ADD KEY `idCliente` (`idCliente`),
  ADD KEY `codMarca` (`codMarca`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `tbl_mecanico`
--
ALTER TABLE `tbl_mecanico`
  ADD CONSTRAINT `tbl_mecanico_ibfk_1` FOREIGN KEY (`id_Especialidad`) REFERENCES `tbl_especialidad` (`codigo`);

--
-- Filtros para la tabla `tbl_ordenreparacion`
--
ALTER TABLE `tbl_ordenreparacion`
  ADD CONSTRAINT `tbl_ordenreparacion_ibfk_1` FOREIGN KEY (`idMecanico`) REFERENCES `tbl_mecanico` (`identificacion`),
  ADD CONSTRAINT `tbl_ordenreparacion_ibfk_2` FOREIGN KEY (`placaVehiculo`) REFERENCES `tbl_vehiculo` (`placa`);

--
-- Filtros para la tabla `tbl_vehiculo`
--
ALTER TABLE `tbl_vehiculo`
  ADD CONSTRAINT `tbl_vehiculo_ibfk_1` FOREIGN KEY (`idCliente`) REFERENCES `tbl_cliente` (`identificacion`),
  ADD CONSTRAINT `tbl_vehiculo_ibfk_2` FOREIGN KEY (`codMarca`) REFERENCES `tbl_marca` (`codigo`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
