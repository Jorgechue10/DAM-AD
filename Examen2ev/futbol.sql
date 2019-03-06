-- MySQL dump 10.13  Distrib 8.0.12, for macos10.13 (x86_64)
--
-- Host: 127.0.0.1    Database: futbol
-- ------------------------------------------------------
-- Server version	8.0.15

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `equipos`
--

DROP TABLE IF EXISTS `equipos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `equipos` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `fundacion` int(11) NOT NULL,
  `temp_primera` int(11) NOT NULL,
  `ligas` int(11) NOT NULL,
  `copas` int(11) NOT NULL,
  PRIMARY KEY (`codigo`),
  UNIQUE KEY `nombre_UNIQUE` (`nombre`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `equipos`
--

LOCK TABLES `equipos` WRITE;
/*!40000 ALTER TABLE `equipos` DISABLE KEYS */;
INSERT INTO `equipos` VALUES (1,'Recreativo de Huelva',1889,5,0,0),(2,'Athletic Club',1898,83,8,23),(3,'Barcelona',1899,83,22,26),(4,'Espanyol',1900,79,0,4),(5,'Real Madrid',1902,83,32,18),(6,'Sabadell',1903,14,0,0),(7,'Atlético de Madrid',1903,77,9,10),(8,'Sevilla',1905,70,1,5),(9,'Sporting de Gijón',1905,40,0,0),(10,'Deportivo de La Coruña',1906,42,1,2),(11,'Betis',1907,49,1,2),(12,'Europa',1907,3,0,0),(13,'Levante',1909,9,0,0),(14,'Arenas',1909,7,0,1),(15,'Real Sociedad',1909,67,2,1),(16,'Cádiz',1910,12,0,0),(17,'Mérida',1912,2,0,0),(18,'Racing de Santander',1913,44,0,0),(19,'Gimnàstic de Tarragona',1914,4,0,0),(20,'Real Unión',1915,4,0,4),(21,'Mallorca',1916,27,0,1),(22,'Valencia',1919,79,6,7),(23,'Murcia',1920,18,0,0),(24,'Osasuna',1920,36,0,0),(25,'Alavés',1921,11,0,0);
/*!40000 ALTER TABLE `equipos` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-03-06 16:54:54
