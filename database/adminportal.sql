-- MySQL dump 10.13  Distrib 8.0.28, for Win64 (x86_64)
--
-- Host: localhost    Database: adminportal
-- ------------------------------------------------------
-- Server version	8.0.28

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `classes`
--

DROP TABLE IF EXISTS `classes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `classes` (
  `id` int NOT NULL AUTO_INCREMENT,
  `section` int NOT NULL,
  `teacher` int NOT NULL,
  `subject` int NOT NULL,
  `time` varchar(44) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `subject_id` (`subject`),
  KEY `teacher_id` (`teacher`),
  CONSTRAINT `subject_id` FOREIGN KEY (`subject`) REFERENCES `subjects` (`id`),
  CONSTRAINT `teacher_id` FOREIGN KEY (`teacher`) REFERENCES `teachers` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `classes`
--

LOCK TABLES `classes` WRITE;
/*!40000 ALTER TABLE `classes` DISABLE KEYS */;
INSERT INTO `classes` VALUES (1,1,1,1,'9:00'),(2,3,2,2,'11:30');
/*!40000 ALTER TABLE `classes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `modifyclasses`
--

DROP TABLE IF EXISTS `modifyclasses`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `modifyclasses` (
  `id` int DEFAULT NULL,
  `teacher` int DEFAULT NULL,
  `subject` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `modifyclasses`
--

LOCK TABLES `modifyclasses` WRITE;
/*!40000 ALTER TABLE `modifyclasses` DISABLE KEYS */;
INSERT INTO `modifyclasses` VALUES (1,1,1),(2,2,1),(3,1,3);
/*!40000 ALTER TABLE `modifyclasses` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `modifystudents`
--

DROP TABLE IF EXISTS `modifystudents`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `modifystudents` (
  `id` int DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `aclass` int DEFAULT NULL,
  `age` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `modifystudents`
--

LOCK TABLES `modifystudents` WRITE;
/*!40000 ALTER TABLE `modifystudents` DISABLE KEYS */;
INSERT INTO `modifystudents` VALUES (1,'Aman',3,7),(22,'bablu',4,12),(24,'biki',8,22),(33,'jdsbjsa',7,15),(2222,'Viki',9,13),(1,'visishdnd',45,87),(44,'Biki Prasad',10,18),(55,'hihdhis',8,112),(11,'Helloworld',22,77),(33,'Heloooooooe',3,77),(12,'dsbhjbdfkjsjbjde',12,44),(222,'dhfsigidknadsnla',12,55),(22,'wdhqgdkg',23,66),(1111,'kjdskjnjnsdanjnj',36,77),(1,'dabsbsjknjsnkj',73,77);
/*!40000 ALTER TABLE `modifystudents` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `modifysubjects`
--

DROP TABLE IF EXISTS `modifysubjects`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `modifysubjects` (
  `id` int DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `modifysubjects`
--

LOCK TABLES `modifysubjects` WRITE;
/*!40000 ALTER TABLE `modifysubjects` DISABLE KEYS */;
INSERT INTO `modifysubjects` VALUES (1,'Maths'),(2,'English'),(3,'Science');
/*!40000 ALTER TABLE `modifysubjects` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `modifyteachers`
--

DROP TABLE IF EXISTS `modifyteachers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `modifyteachers` (
  `id` int DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `age` int DEFAULT NULL,
  `subject` varchar(255) DEFAULT NULL,
  `aclass` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `modifyteachers`
--

LOCK TABLES `modifyteachers` WRITE;
/*!40000 ALTER TABLE `modifyteachers` DISABLE KEYS */;
INSERT INTO `modifyteachers` VALUES (1,'Tom Hank',33,'English',1),(2,'Harry',23,'Maths',2);
/*!40000 ALTER TABLE `modifyteachers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `students`
--

DROP TABLE IF EXISTS `students`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `students` (
  `id` int NOT NULL AUTO_INCREMENT,
  `fname` varchar(55) NOT NULL,
  `lname` varchar(55) NOT NULL,
  `age` int DEFAULT NULL,
  `class` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `class_id` (`class`),
  CONSTRAINT `class_id` FOREIGN KEY (`class`) REFERENCES `classes` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `students`
--

LOCK TABLES `students` WRITE;
/*!40000 ALTER TABLE `students` DISABLE KEYS */;
INSERT INTO `students` VALUES (1,'Ali','Ahsan',21,1),(2,'Hassan','Ahmed',23,2),(4,'Gazi','Dani',21,1),(5,'Tony','Fadel',18,2),(6,'Lami','Saro',24,1),(7,'Yazen','Rawn',24,2);
/*!40000 ALTER TABLE `students` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `subjects`
--

DROP TABLE IF EXISTS `subjects`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `subjects` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(55) NOT NULL,
  `shortcut` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `subjects`
--

LOCK TABLES `subjects` WRITE;
/*!40000 ALTER TABLE `subjects` DISABLE KEYS */;
INSERT INTO `subjects` VALUES (1,'English','ENG'),(2,'Mathematics','MATH');
/*!40000 ALTER TABLE `subjects` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `teachers`
--

DROP TABLE IF EXISTS `teachers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `teachers` (
  `id` int NOT NULL AUTO_INCREMENT,
  `fname` varchar(55) NOT NULL,
  `lname` varchar(55) NOT NULL,
  `age` varchar(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `teachers`
--

LOCK TABLES `teachers` WRITE;
/*!40000 ALTER TABLE `teachers` DISABLE KEYS */;
INSERT INTO `teachers` VALUES (1,'Sami','Rashed','55'),(2,'Rami','Sari','66');
/*!40000 ALTER TABLE `teachers` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-03-01 14:25:18
