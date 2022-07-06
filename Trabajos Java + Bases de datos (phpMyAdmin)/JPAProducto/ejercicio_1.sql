-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 06-07-2022 a las 18:29:57
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
-- Base de datos: `ejercicio_1`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tblproducto`
--

CREATE TABLE `tblproducto` (
  `producto` varchar(255) NOT NULL,
  `piezas_caja` int(11) NOT NULL,
  `precio_publico` int(11) NOT NULL,
  `Precio_mayoreo` int(11) NOT NULL,
  `id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `tblproducto`
--

INSERT INTO `tblproducto` (`producto`, `piezas_caja`, `precio_publico`, `Precio_mayoreo`, `id`) VALUES
('Mini Mazon Jar 4 oz', 12, 360, 288, 1),
('Mason Jar Boca Regular 8 oz', 12, 390, 312, 2),
('Mason Jar Boca Regular 16 oz', 12, 490, 392, 3),
('Mason Jar Boca Regular 32 oz', 12, 590, 472, 4),
('Mason Jar Boca Ancha 8 oz', 14, 480, 384, 5),
('Mason Jar Boca Ancha 16 oz', 12, 560, 448, 6),
('Mason Jar Boca Ancha 32 oz', 12, 680, 544, 7),
('Mason Jar Grande 64 oz', 6, 580, 464, 8),
('Paquete Muestrario', 8, 420, 336, 9),
('Paquete Fiestero', 12, 620, 496, 10),
('Tapa Regular', 12, 80, 64, 11),
('Tapa con banda Regular', 12, 160, 128, 12),
('Tapa Ancha', 12, 110, 88, 13),
('Tapa Con banda Ancha', 12, 220, 176, 14),
('asd', 123, 123, 123, 22),
('asd', 3, 234, 234, 23);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_usuario`
--

CREATE TABLE `tbl_usuario` (
  `id` int(11) NOT NULL,
  `nombre` varchar(255) NOT NULL,
  `contrasenia` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `tbl_usuario`
--

INSERT INTO `tbl_usuario` (`id`, `nombre`, `contrasenia`) VALUES
(1, 'andres', '123'),
(2, 'maria', '123');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `tblproducto`
--
ALTER TABLE `tblproducto`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `tbl_usuario`
--
ALTER TABLE `tbl_usuario`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `tblproducto`
--
ALTER TABLE `tblproducto`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;

--
-- AUTO_INCREMENT de la tabla `tbl_usuario`
--
ALTER TABLE `tbl_usuario`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
