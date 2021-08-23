-- MySQL dump 10.13  Distrib 8.0.25, for Win64 (x86_64)
--
-- Host: localhost    Database: schooldatabase
-- ------------------------------------------------------
-- Server version	8.0.25

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
-- Table structure for table `dt_class`
--

DROP TABLE IF EXISTS `dt_class`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dt_class` (
  `class_id` int NOT NULL AUTO_INCREMENT,
  `school_id` int DEFAULT NULL,
  `class_name` varchar(10) DEFAULT NULL,
  `class_teacher` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`class_id`),
  KEY `school_id` (`school_id`),
  CONSTRAINT `dt_class_ibfk_1` FOREIGN KEY (`school_id`) REFERENCES `dt_school` (`school_id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `dt_exam`
--

DROP TABLE IF EXISTS `dt_exam`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dt_exam` (
  `exam_id` int NOT NULL AUTO_INCREMENT,
  `subject_id` int DEFAULT NULL,
  `class_id` int DEFAULT NULL,
  `exam_name` varchar(10) DEFAULT NULL,
  `exam_date` date DEFAULT NULL,
  `exam_time` varchar(15) DEFAULT NULL,
  `exam_status` enum('CONDUCTED','POSTPONED') DEFAULT NULL,
  PRIMARY KEY (`exam_id`),
  KEY `subject_id` (`subject_id`),
  KEY `class_id` (`class_id`),
  CONSTRAINT `dt_exam_ibfk_1` FOREIGN KEY (`subject_id`) REFERENCES `dt_subject` (`subject_id`),
  CONSTRAINT `dt_exam_ibfk_2` FOREIGN KEY (`class_id`) REFERENCES `dt_class` (`class_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `dt_school`
--

DROP TABLE IF EXISTS `dt_school`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dt_school` (
  `school_id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(40) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `phonenumber` int DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`school_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `dt_student`
--

DROP TABLE IF EXISTS `dt_student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dt_student` (
  `student_id` int NOT NULL AUTO_INCREMENT,
  `class_id` int DEFAULT NULL,
  `roll_number` int DEFAULT NULL,
  `student_name` varchar(10) DEFAULT NULL,
  `address` varchar(30) DEFAULT NULL,
  `phonenumber` int DEFAULT NULL,
  `email` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`student_id`),
  KEY `class_id` (`class_id`),
  CONSTRAINT `dt_student_ibfk_1` FOREIGN KEY (`class_id`) REFERENCES `dt_class` (`class_id`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `dt_subject`
--

DROP TABLE IF EXISTS `dt_subject`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dt_subject` (
  `subject_id` int NOT NULL AUTO_INCREMENT,
  `subject_name` varchar(10) DEFAULT NULL,
  `is_elective` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`subject_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `lt_school_subject`
--

DROP TABLE IF EXISTS `lt_school_subject`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `lt_school_subject` (
  `school_id` int NOT NULL,
  `subject_id` int NOT NULL,
  `subject_HOD` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`school_id`,`subject_id`),
  KEY `subject_id` (`subject_id`),
  CONSTRAINT `lt_school_subject_ibfk_1` FOREIGN KEY (`school_id`) REFERENCES `dt_school` (`school_id`),
  CONSTRAINT `lt_school_subject_ibfk_2` FOREIGN KEY (`subject_id`) REFERENCES `dt_subject` (`subject_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `lt_student_exam`
--

DROP TABLE IF EXISTS `lt_student_exam`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `lt_student_exam` (
  `student_id` int NOT NULL,
  `exam_id` int NOT NULL,
  `marks` decimal(6,3) DEFAULT NULL,
  `is_present` tinyint(1) DEFAULT NULL,
  `result_status` enum('PASS','FAIL') DEFAULT NULL,
  `grade` varchar(1) DEFAULT NULL,
  PRIMARY KEY (`student_id`,`exam_id`),
  KEY `exam_id` (`exam_id`),
  CONSTRAINT `lt_student_exam_ibfk_1` FOREIGN KEY (`student_id`) REFERENCES `dt_student` (`student_id`),
  CONSTRAINT `lt_student_exam_ibfk_2` FOREIGN KEY (`exam_id`) REFERENCES `dt_exam` (`exam_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `lt_student_subject`
--

DROP TABLE IF EXISTS `lt_student_subject`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `lt_student_subject` (
  `student_id` int NOT NULL,
  `subject_id` int NOT NULL,
  `attendance_percentage` decimal(6,3) DEFAULT NULL,
  `number_of_assignments` int DEFAULT NULL,
  PRIMARY KEY (`student_id`,`subject_id`),
  KEY `subject_id` (`subject_id`),
  CONSTRAINT `lt_student_subject_ibfk_1` FOREIGN KEY (`student_id`) REFERENCES `dt_student` (`student_id`),
  CONSTRAINT `lt_student_subject_ibfk_2` FOREIGN KEY (`subject_id`) REFERENCES `dt_subject` (`subject_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-07-02  9:49:17
