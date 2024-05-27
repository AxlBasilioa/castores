-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: localhost    Database: castores_interview
-- ------------------------------------------------------
-- Server version	8.0.37

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `logs`
--

DROP TABLE IF EXISTS `logs`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `logs` (
  `id_Logs` int unsigned NOT NULL AUTO_INCREMENT,
  `query` varchar(255) DEFAULT NULL,
  `Timestamp` timestamp NOT NULL,
  `Datetime` datetime NOT NULL,
  `id_Usuario` int unsigned NOT NULL,
  PRIMARY KEY (`id_Logs`),
  KEY `Logs_id_Usuario_Foreign` (`id_Usuario`),
  CONSTRAINT `Logs_id_Usuario_Foreign` FOREIGN KEY (`id_Usuario`) REFERENCES `usuarios` (`id_Usuario`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `logs`
--

LOCK TABLES `logs` WRITE;
/*!40000 ALTER TABLE `logs` DISABLE KEYS */;
INSERT INTO `logs` VALUES (1,'SELECT * FROM Productos','2024-05-25 18:34:56','2024-05-25 12:34:56',1),(2,'INSERT INTO Productos (Nombre, Precio) VALUES (\"Producto 1\", 100.00)','2024-05-25 18:35:00','2024-05-25 12:35:00',2),(4,'SELECT * FROM Productos','2024-05-25 18:34:56','2024-05-25 12:34:56',1),(5,'INSERT INTO Productos (Nombre, Precio) VALUES (\"Producto 1\", 100.00)','2024-05-25 18:35:00','2024-05-25 12:35:00',2),(6,'UPDATE Productos SET Precio = 150.00 WHERE id_Producto = 1','2024-05-25 18:36:00','2024-05-25 12:36:00',1),(7,'DELETE FROM Productos WHERE id_Producto = 2','2024-05-25 18:37:00','2024-05-25 12:37:00',1),(8,'SELECT * FROM Ventas','2024-05-25 18:38:00','2024-05-25 12:38:00',1),(9,'SELECT * FROM Productos','2024-05-25 18:34:56','2024-05-25 12:34:56',1),(10,'INSERT INTO Productos (Nombre, Precio) VALUES (\"Producto 1\", 100.00)','2024-05-25 18:35:00','2024-05-25 12:35:00',2),(11,'UPDATE Productos SET Precio = 150.00 WHERE id_Producto = 1','2024-05-25 18:36:00','2024-05-25 12:36:00',1),(12,'DELETE FROM Productos WHERE id_Producto = 2','2024-05-25 18:37:00','2024-05-25 12:37:00',1),(13,'SELECT * FROM Ventas','2024-05-25 18:38:00','2024-05-25 12:38:00',1);
/*!40000 ALTER TABLE `logs` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-05-25 18:53:09
