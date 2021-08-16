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
-- Dumping data for table `dt_class`
--

LOCK TABLES `dt_class` WRITE;
/*!40000 ALTER TABLE `dt_class` DISABLE KEYS */;
INSERT INTO `dt_class` VALUES (1,1,'STD_1','ANURADHA'),(2,1,'STD_2','ASHOK'),(3,1,'STD_3','DYNE'),(4,1,'STD_4','SMITHA'),(5,1,'STD_5','RAMESH'),(6,1,'STD_6','DIVAKAR'),(7,1,'STD_7','AISWARYA'),(8,2,'STD_1','ROOPESH'),(9,2,'STD_2','ANIRUDH'),(10,2,'STD_3','DAVIS'),(11,2,'STD_4','SARANYA'),(12,2,'STD_5','RAHUL'),(13,2,'STD_6','DEEPESH'),(14,2,'STD_7','RAMA'),(15,3,'STD_1','SEEMA'),(16,3,'STD_2','RAM'),(17,3,'STD_3','ANIL'),(18,3,'STD_4','ANOOP'),(19,3,'STD_5','DILEEP'),(20,3,'STD_6','RADHA'),(21,3,'STD_7','UMA');
/*!40000 ALTER TABLE `dt_class` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `dt_exam`
--

LOCK TABLES `dt_exam` WRITE;
/*!40000 ALTER TABLE `dt_exam` DISABLE KEYS */;
INSERT INTO `dt_exam` VALUES (1,101,1,'unit_test1','2021-06-01','9:30AM','CONDUCTED'),(2,101,2,'unit_test1','2021-06-01','1:30PM','CONDUCTED'),(3,102,1,'unit_test1','2021-06-02','9:30AM','CONDUCTED'),(4,102,2,'unit_test1','2021-06-02','1:30PM','CONDUCTED'),(5,103,1,'unit_test1','2021-06-03','9:30AM','CONDUCTED'),(6,103,2,'unit_test1','2021-06-03','1:30PM','CONDUCTED'),(7,101,3,'unit_test1','2021-06-04','9:30AM','CONDUCTED'),(8,101,4,'unit_test1','2021-06-04','1:30PM','CONDUCTED'),(9,102,3,'unit_test1','2021-06-05','9:30AM','CONDUCTED'),(10,102,4,'unit_test1','2021-06-05','1:30PM','CONDUCTED'),(11,103,3,'unit_test1','2021-06-06','9:30AM','CONDUCTED'),(12,103,4,'unit_test1','2021-06-06','1:30PM','CONDUCTED'),(13,104,3,'unit_test1','2021-06-08','9:30AM','CONDUCTED'),(14,104,4,'unit_test1','2021-06-08','1:30PM','CONDUCTED'),(15,101,5,'unit_test1','2021-06-09','9:30AM','CONDUCTED'),(16,102,5,'unit_test1','2021-06-09','1:30PM','CONDUCTED'),(17,103,5,'unit_test1','2021-06-10','9:30AM','CONDUCTED'),(18,104,5,'unit_test1','2021-06-10','1:30PM','CONDUCTED'),(19,105,5,'unit_test1','2021-06-11','1:30PM','CONDUCTED'),(20,106,5,'unit_test1','2021-06-12','1:30PM','POSTPONED'),(21,101,5,'unit_test2','2021-07-09','9:30AM','CONDUCTED'),(22,102,5,'unit_test2','2021-07-09','1:30PM','CONDUCTED'),(23,103,5,'unit_test2','2021-07-10','9:30AM','CONDUCTED'),(24,104,5,'unit_test2','2021-07-10','1:30PM','CONDUCTED'),(25,105,5,'unit_test2','2021-07-11','1:30PM','CONDUCTED'),(26,106,5,'unit_test2','2021-07-12','1:30PM','POSTPONED');
/*!40000 ALTER TABLE `dt_exam` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `dt_school`
--

LOCK TABLES `dt_school` WRITE;
/*!40000 ALTER TABLE `dt_school` DISABLE KEYS */;
INSERT INTO `dt_school` VALUES (1,'AV EDUCATION SOCIETY','#13, 15th Cross, 20th Main 5th Phase, JP Nagar Bangalore -78',640952,'www.avschool.com'),(2,'ADITI SCHOOL','5th Mile, Bellary Road Bangalore -24',3331814,'www.aditi.com'),(3,'ANANDA SOCIAL EDUCN.SOCIETY','1/28 Haleguddahalli Bangalore - 26',626724,'www.anandaSES.com'),(4,'ASSUMPTION SCHOOL','2nd Block, Rajajinagar Bangalore -10',3325723,'www.assumptionschool.com'),(5,'SHASHTRY MEMORIAL SCHOOL','Kamala Nehru Extn. Bangalore - 22',3375582,'www.shashtrymrl.com'),(6,'SARASWATHI EDUCATION SOCIETY','Maruthi Extn. Circle Bangalore -21',3321002,'www.saraswathiES.com'),(7,'HOLY CHRIST HIGH SCHOOL','284, 2nd Phase, JP Nagar Bangalore - 78',645292,'www.holychrist.com'),(8,'HOLY SHEPHERD HIGH SCHOOL','1st Stage, Indiranagar Bangalore - 38',5543650,'www.holyshepherd.com'),(9,'ROYAL ENGLISH SCHOOL','254, 5th Main, 1st Phase West of Chord Road Bangalore - 10',3350120,'www.royal.com'),(10,'PANDIT JAWAHARLAL NEHRU MEMORIAL SCHOOL','6/22-1, 9th Cross, 4th Main Chamrajpet Bangalore - 18',607725,'www.jawaharnehruschool.com');
/*!40000 ALTER TABLE `dt_school` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `dt_student`
--

LOCK TABLES `dt_student` WRITE;
/*!40000 ALTER TABLE `dt_student` DISABLE KEYS */;
INSERT INTO `dt_student` VALUES (1,1,1,'ASHISH K','HR layout,5thcross,Dream Villa',23456778,'ashish@gmail.com'),(2,1,2,'ASWITHA K','HR layout,5thcross,Rose Villa',23456798,'aswitha@gmail.com'),(3,1,3,'BANU S','HR layout,6thcross,Jaynagar',23487798,'bhanus@gmail.com'),(4,1,4,'BIPIN A','SR layout,orchid Villa',23656798,'bipin@gmail.com'),(5,1,5,'DHARSHAN M','HR layout,5thcross,Rose Villa',23456798,'dharshan@gmail.com'),(6,1,6,'ESWAR C','Girinagar,BN house',2823904,'eswar@gmail.com'),(7,1,7,'FATHIMA K','Girinagar,fathima house',2903904,'fathima@gmail.com'),(8,1,8,'GAYATRI K','MR Layout, Lilly ',2903906,'gayatri@gmail.com'),(9,1,9,'SINU P','MR Layout, SN house ',2918906,'sinu@gmail.com'),(10,1,10,'SANU P','MR Layout, SN house ',2918906,'sanu@gmail.com'),(11,2,1,'ANOOP K','HR layout,Seaview Villa',23456778,'anoop@gmail.com'),(12,2,2,'AVANIKA K','HR layout,Avanthika house',23456798,'avanthika@gmail.com'),(13,2,3,'BINU S','SR layout,6thcross,Jaynagar',23487798,'binus@gmail.com'),(14,2,4,'BOOMIKA A','SR layout,SN Villa',23656798,'bhoomika@gmail.com'),(15,2,5,'DHARSHNA','HR layout, Dharsan Villa',23456798,'dharshanam@gmail.com'),(16,2,6,'ESWARI C','Girinagar,TN house',2823904,'eswaric@gmail.com'),(17,2,7,'JOE JAMES','Girinagar,Loveland',2903904,'joe@gmail.com'),(18,2,8,'GAYATRI M','MR Layout, GN House ',2903906,'gayatri@gmail.com'),(19,2,9,'SREERAG P','MR Layout, TN house ',2918906,'sreerag@gmail.com'),(20,2,10,'STALIN C','MR Layout, Stalin house ',2918906,'stalin@gmail.com'),(21,5,1,'ANOOP K','HR layout,Seaview Villa',23456778,'anoop@gmail.com'),(22,5,2,'ASWATHI K','HR layout,Aswathi house',23453456,'aswathi@gmail.com'),(23,5,3,'BINU S','SR layout,6thcross,Jaynagar',23487798,'binus@gmail.com'),(24,5,4,'BALA C','SR layout,KN Villa',23656778,'balac@gmail.com'),(25,5,5,'DAYANA T','MR layout, Daliya',23956798,'dayanat@gmail.com'),(26,5,6,'ESWARI M','DAS nagar,CN house',2523904,'eswarim@gmail.com'),(27,5,7,'JOHN JAMES','Girinagar,Loveland',2903904,'john@gmail.com'),(28,5,8,'GAYATRI T','Sth cross, Gayu House ',2908906,'gayatrit@gmail.com'),(29,5,9,'SREESHNA P','MR Layout, Sree house ',2917906,'sree@gmail.com'),(30,5,10,'SIVANI C','MR Layout, Siva house ',2913406,'sivani@gmail.com'),(31,5,11,'TINU JAMES','MR Layout, THR House ',2993906,'tinusames@gmail.com'),(32,5,12,'WICKEY P','MR Layout, Dream Land ',2718906,'wickey@gmail.com'),(33,5,13,'ZIVA C','HR Layout, Ziva house ',2910906,'zivac@gmail.com'),(35,2,11,'DEV C','MR Layout, KR house ',2918906,'devc@gmail.com'),(36,2,12,'VIGNESH C','NEAR LAL PARK,  house no#34 ',2918906,'vignesh@gmail.com');
/*!40000 ALTER TABLE `dt_student` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `dt_subject`
--

LOCK TABLES `dt_subject` WRITE;
/*!40000 ALTER TABLE `dt_subject` DISABLE KEYS */;
INSERT INTO `dt_subject` VALUES (101,'ENGLISH',0),(102,'MATHS',0),(103,'SCIENCE',0),(104,'HISTORY',0),(105,'SANSKRIT',1),(106,'ECONOMICS',1);
/*!40000 ALTER TABLE `dt_subject` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `lt_school_subject`
--

LOCK TABLES `lt_school_subject` WRITE;
/*!40000 ALTER TABLE `lt_school_subject` DISABLE KEYS */;
INSERT INTO `lt_school_subject` VALUES (1,101,'ANURADHA'),(1,102,'RAMESH'),(1,103,'RADHA'),(1,104,'ANNAPOORNA'),(1,105,'JAYRAM'),(1,106,'RANVEER'),(2,101,'ANUPAMA'),(2,102,'RAMYA'),(2,103,'RAMA'),(2,104,'HARI'),(2,105,'JAGADEESH'),(2,106,'RAM'),(3,101,'ANUPRIYA'),(3,102,'SREEPESH'),(3,103,'RAVI'),(3,104,'VENUGOPAL'),(3,105,'ASHA'),(3,106,'SACHIN'),(4,101,'SREENATH'),(4,102,'MURUKAN'),(4,103,'PRAVEEN'),(4,104,'SARITH'),(4,105,'RAHUL'),(4,106,'SEEMA'),(5,101,'PRAVEEN'),(5,102,'BINOY'),(5,103,'SHYAM'),(5,104,'NAMITHA'),(5,105,'ANCY'),(5,106,'AARDRA');
/*!40000 ALTER TABLE `lt_school_subject` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `lt_student_exam`
--

LOCK TABLES `lt_student_exam` WRITE;
/*!40000 ALTER TABLE `lt_student_exam` DISABLE KEYS */;
INSERT INTO `lt_student_exam` VALUES (1,1,48.000,1,'PASS','C'),(1,3,45.000,1,'PASS','C'),(1,5,0.000,0,'FAIL','N'),(21,15,95.000,1,'PASS','A'),(21,16,85.000,1,'PASS','A'),(21,17,90.000,1,'PASS','A'),(21,18,87.000,1,'PASS','A'),(21,19,93.000,1,'PASS','A'),(21,20,96.000,1,'PASS','A'),(21,21,95.000,1,'PASS','A'),(21,22,85.000,1,'PASS','A'),(21,23,90.000,1,'PASS','A'),(21,24,87.000,1,'PASS','A'),(21,25,93.000,1,'PASS','A'),(21,26,96.000,1,'PASS','A'),(22,15,90.000,1,'PASS','A'),(22,16,83.000,1,'PASS','A'),(22,17,90.000,1,'PASS','A'),(22,18,87.000,1,'PASS','A'),(22,19,94.000,1,'PASS','A'),(22,20,92.000,1,'PASS','A'),(22,21,95.000,1,'PASS','A'),(22,22,65.000,1,'PASS','B'),(22,23,90.000,1,'PASS','A'),(22,24,55.000,1,'PASS','C'),(22,25,93.000,1,'PASS','A'),(22,26,96.000,1,'PASS','A'),(23,15,90.000,1,'PASS','A'),(23,16,70.000,1,'PASS','B'),(23,17,75.000,1,'PASS','B'),(23,18,66.000,1,'PASS','B'),(23,19,94.000,1,'PASS','A'),(23,20,92.000,1,'PASS','A'),(24,15,40.000,1,'PASS','C'),(24,16,20.000,1,'FAIL','E'),(24,17,55.000,1,'PASS','C'),(24,18,56.000,1,'PASS','C'),(24,19,44.000,1,'PASS','C'),(24,20,22.000,1,'FAIL','E'),(25,15,40.000,1,'PASS','C'),(25,16,20.000,1,'FAIL','E'),(25,17,65.000,1,'PASS','B'),(25,18,76.000,1,'PASS','B'),(25,19,44.000,1,'PASS','C'),(25,20,44.000,1,'PASS','C'),(26,15,90.000,1,'PASS','A'),(26,16,90.000,1,'PASS','A'),(26,17,65.000,1,'PASS','B'),(26,18,76.000,1,'PASS','B'),(26,19,94.000,1,'PASS','A'),(26,20,85.000,1,'PASS','A'),(27,15,90.000,1,'PASS','A'),(27,16,90.000,1,'PASS','A'),(27,17,85.000,1,'PASS','A'),(27,18,96.000,1,'PASS','A'),(27,19,94.000,1,'PASS','A'),(27,20,85.000,1,'PASS','A'),(28,15,40.000,1,'PASS','A'),(28,16,25.000,1,'FAIL','E'),(28,17,55.000,1,'PASS','C'),(28,18,66.000,1,'PASS','B'),(28,19,70.000,1,'PASS','B'),(28,20,85.000,1,'PASS','A'),(29,15,40.000,1,'PASS','A'),(29,16,89.000,1,'PASS','A'),(29,17,65.000,1,'PASS','B'),(29,18,66.000,1,'PASS','B'),(29,19,90.000,1,'PASS','A'),(29,20,85.000,1,'PASS','A'),(30,15,90.000,1,'PASS','A'),(30,16,89.000,1,'PASS','A'),(30,17,95.000,1,'PASS','A'),(30,18,64.000,1,'PASS','B'),(30,19,90.000,1,'PASS','A'),(30,20,82.000,1,'PASS','A'),(31,15,90.000,1,'PASS','A'),(31,16,69.000,1,'PASS','B'),(31,17,95.000,1,'PASS','A'),(31,18,58.000,1,'PASS','C'),(31,19,40.000,1,'PASS','C'),(31,20,46.000,1,'PASS','C'),(32,15,91.000,1,'PASS','A'),(32,16,63.000,1,'PASS','B'),(32,17,95.000,1,'PASS','A'),(32,18,58.000,1,'PASS','C'),(32,19,45.000,1,'PASS','C'),(32,20,46.000,1,'PASS','C'),(33,15,98.000,1,'PASS','A'),(33,16,69.000,1,'PASS','B'),(33,17,95.000,1,'PASS','A'),(33,18,48.000,1,'PASS','C'),(33,19,45.000,1,'PASS','C'),(33,20,0.000,0,'FAIL','N');
/*!40000 ALTER TABLE `lt_student_exam` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `lt_student_subject`
--

LOCK TABLES `lt_student_subject` WRITE;
/*!40000 ALTER TABLE `lt_student_subject` DISABLE KEYS */;
INSERT INTO `lt_student_subject` VALUES (1,101,80.000,3),(1,102,75.000,3),(1,103,80.000,3),(21,101,75.000,3),(21,102,76.000,3),(21,103,80.000,3),(21,104,80.000,3),(21,105,90.000,3),(21,106,80.000,3),(22,101,75.000,3),(22,102,76.000,3),(22,103,80.000,3),(22,104,80.000,3),(22,105,90.000,3),(22,106,80.000,3),(23,101,75.000,3),(23,102,76.000,3),(23,103,80.000,3),(23,104,80.000,3),(23,105,90.000,3),(23,106,80.000,3),(24,101,75.000,3),(24,102,76.000,3),(24,103,80.000,3),(24,104,80.000,3),(24,105,90.000,3),(24,106,80.000,3),(25,101,75.000,3),(25,102,76.000,3),(25,103,80.000,3),(25,104,80.000,3),(25,105,90.000,3),(25,106,80.000,3),(26,101,75.000,3),(26,102,76.000,3),(26,103,80.000,3),(26,104,80.000,3),(26,105,90.000,3),(26,106,80.000,3),(27,101,75.000,3),(27,102,76.000,3),(27,103,80.000,3),(27,104,80.000,3),(27,105,90.000,3),(27,106,80.000,3),(28,101,75.000,3),(28,102,76.000,3),(28,103,80.000,3),(28,104,80.000,3),(28,105,90.000,3),(28,106,80.000,3),(29,101,75.000,3),(29,102,76.000,3),(29,103,80.000,3),(29,104,80.000,3),(29,105,90.000,3),(29,106,80.000,3),(30,101,75.000,3),(30,102,76.000,3),(30,103,80.000,3),(30,104,80.000,3),(30,105,90.000,3),(30,106,80.000,3),(31,101,75.000,3),(31,102,76.000,3),(31,103,80.000,3),(31,104,80.000,3),(31,105,90.000,3),(31,106,80.000,3),(32,101,75.000,3),(32,102,76.000,3),(32,103,80.000,3),(32,104,80.000,3),(32,105,90.000,3),(32,106,80.000,3),(33,101,75.000,3),(33,102,76.000,3),(33,103,80.000,3),(33,104,80.000,3),(33,105,90.000,3),(33,106,80.000,3);
/*!40000 ALTER TABLE `lt_student_subject` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-07-05  9:18:42
