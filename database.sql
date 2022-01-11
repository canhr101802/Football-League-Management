-- MySQL dump 10.13  Distrib 8.0.26, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: newschema
-- ------------------------------------------------------
-- Server version	8.0.26

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
-- Table structure for table `bxh`
--

DROP TABLE IF EXISTS `bxh`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bxh` (
  `vitri` int NOT NULL,
  `mavong` int NOT NULL,
  `madoi` int NOT NULL,
  `sotran` int NOT NULL,
  `stthang` int NOT NULL,
  `stthua` int NOT NULL,
  `sthoa` int NOT NULL,
  `sobanthang` int NOT NULL,
  `sobanthua` int NOT NULL,
  `hieuso` int NOT NULL,
  `diem` int NOT NULL,
  KEY `mavong` (`mavong`),
  KEY `madoi` (`madoi`),
  CONSTRAINT `bxh_ibfk_1` FOREIGN KEY (`mavong`) REFERENCES `vongdau` (`mavongdau`),
  CONSTRAINT `bxh_ibfk_2` FOREIGN KEY (`madoi`) REFERENCES `clb` (`madoi`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bxh`
--

LOCK TABLES `bxh` WRITE;
/*!40000 ALTER TABLE `bxh` DISABLE KEYS */;
INSERT INTO `bxh` VALUES (3,1,78,1,0,1,0,2,3,-1,0),(1,1,75,1,1,0,0,3,2,1,3),(4,1,76,1,0,1,0,2,3,-1,0),(1,2,75,2,2,0,0,7,3,4,6),(4,2,78,2,0,2,0,3,7,-4,0),(3,2,76,2,0,1,1,5,6,-1,1),(1,3,75,3,3,0,0,11,5,6,9),(4,3,76,3,0,2,1,6,11,-5,1),(3,3,78,3,1,2,0,8,8,0,3),(2,1,77,1,1,0,0,3,2,1,3),(2,2,77,2,1,0,1,6,5,1,4),(2,3,77,3,1,1,1,8,9,-1,4);
/*!40000 ALTER TABLE `bxh` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `clb`
--

DROP TABLE IF EXISTS `clb`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `clb` (
  `madoi` int NOT NULL AUTO_INCREMENT,
  `tendoi` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `doitruong` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `HLV` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `socauthu` int NOT NULL,
  PRIMARY KEY (`madoi`)
) ENGINE=InnoDB AUTO_INCREMENT=79 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clb`
--

LOCK TABLES `clb` WRITE;
/*!40000 ALTER TABLE `clb` DISABLE KEYS */;
INSERT INTO `clb` VALUES (75,'FC Anh Sơn','Kiều Đình Long','Nguyễn Đình Hoàng',7),(76,'FC Diễn Châu','Nguyễn Hữu Hiếu','Trần Quang Hải',7),(77,'FC TP Vinh','Trần Văn Mạnh','Phạm Văn Đức',7),(78,'FC Thanh Chương','Nguyễn Minh Bắc','Nguyễn Công Hùng',7);
/*!40000 ALTER TABLE `clb` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `kqtd`
--

DROP TABLE IF EXISTS `kqtd`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `kqtd` (
  `matran` int NOT NULL,
  `madoi1` int NOT NULL,
  `madoi2` int NOT NULL,
  `SVD` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `thoigian` date NOT NULL,
  `banthang1` int NOT NULL,
  `banthang2` int NOT NULL,
  KEY `matran` (`matran`),
  KEY `madoi1` (`madoi1`),
  KEY `madoi2` (`madoi2`),
  CONSTRAINT `kqtd_ibfk_1` FOREIGN KEY (`matran`) REFERENCES `trandau` (`matran`),
  CONSTRAINT `kqtd_ibfk_2` FOREIGN KEY (`madoi1`) REFERENCES `clb` (`madoi`),
  CONSTRAINT `kqtd_ibfk_3` FOREIGN KEY (`madoi2`) REFERENCES `clb` (`madoi`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kqtd`
--

LOCK TABLES `kqtd` WRITE;
/*!40000 ALTER TABLE `kqtd` DISABLE KEYS */;
INSERT INTO `kqtd` VALUES (2,78,77,'Thanh Chương','2021-12-01',2,3),(3,75,78,'Anh Sơn','2001-12-02',4,1),(4,76,77,'Diễn Châu','2021-12-02',3,3),(5,75,77,'Anh Sơn','2021-12-03',4,2),(1,75,76,'Anh Sơn','2021-12-01',3,2),(6,76,78,'Diễn Châu','2021-12-03',1,5);
/*!40000 ALTER TABLE `kqtd` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `taikhoan`
--

DROP TABLE IF EXISTS `taikhoan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `taikhoan` (
  `id` int NOT NULL AUTO_INCREMENT,
  `tk` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `email` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `mk` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `tinhtrang` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `taikhoan`
--

LOCK TABLES `taikhoan` WRITE;
/*!40000 ALTER TABLE `taikhoan` DISABLE KEYS */;
INSERT INTO `taikhoan` VALUES (5,'dinhcanh','Canhr101802@gmail.com','123456',1),(8,'user1','user@gmail.com','user123',0);
/*!40000 ALTER TABLE `taikhoan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `thongtincauthu`
--

DROP TABLE IF EXISTS `thongtincauthu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `thongtincauthu` (
  `macauthu` int NOT NULL AUTO_INCREMENT,
  `madoi` int NOT NULL,
  `tencauthu` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `ngaysinh` date NOT NULL,
  `soao` int NOT NULL,
  `vitri` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`macauthu`),
  KEY `madoi` (`madoi`),
  CONSTRAINT `thongtincauthu_ibfk_1` FOREIGN KEY (`madoi`) REFERENCES `clb` (`madoi`)
) ENGINE=InnoDB AUTO_INCREMENT=58 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `thongtincauthu`
--

LOCK TABLES `thongtincauthu` WRITE;
/*!40000 ALTER TABLE `thongtincauthu` DISABLE KEYS */;
INSERT INTO `thongtincauthu` VALUES (29,75,'Nguyễn Đình Cảnh','2000-02-18',11,'Trung vệ'),(30,75,'Nguyễn Đức Lâm','2000-10-01',10,'Tiền đạo cánh trái'),(31,75,'Kiều Đình Long','2000-06-01',17,'Thủ môn'),(32,75,'Trần Văn Mạnh','2004-02-10',19,'Tiền đạo cánh phải'),(33,75,'Nguyễn Đức Cường','2003-12-01',4,'Hậu vệ phải'),(34,75,'Phạm Văn Đức','2001-02-01',6,'Tiền vệ'),(36,76,'Nguyễn Hữu Hiếu','2001-10-01',10,'Tiền đạo'),(37,76,'Trần Hữu Hào','2001-03-18',15,'Tiền vệ'),(38,76,'Hồ Việt Anh','2002-02-20',14,'Hậu vệ phải'),(39,76,'Vũ Việt Anh','2000-03-08',32,'Thủ môn'),(40,76,'Lê Văn Bình','2002-08-09',18,'Hậu vệ trái'),(41,76,'Trần Thái Đan','2004-03-08',16,'Tiền vệ'),(42,76,'Vũ Quang Duy','2000-05-04',6,'Trung vệ'),(43,78,'Vũ Nguyên Hạ','2001-10-09',12,'Tiền đạo'),(44,78,'Nguyễn  Duy Hiếu','2001-02-02',5,'Tiền vệ'),(45,78,'Lê Văn Hiệp','2002-09-18',14,'Tiền vệ'),(46,78,'Nguyễn Việt Hùng','2002-06-04',19,'Hậu vệ phải'),(47,78,'Hà Tuấn Hùng','2001-07-07',17,'Hậu vệ trái'),(48,78,'Nguyễn Quang Huy','2002-04-03',13,'Tiền đạo'),(49,78,'Nguyễn Trọng Khải','2000-02-19',1,'Thủ môn'),(57,75,'Trần Quốc Đam','2001-08-18',3,'Hậu vệ trái');
/*!40000 ALTER TABLE `thongtincauthu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `trandau`
--

DROP TABLE IF EXISTS `trandau`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `trandau` (
  `matran` int NOT NULL AUTO_INCREMENT,
  `mavong` int NOT NULL,
  `tentran` int NOT NULL,
  PRIMARY KEY (`matran`),
  KEY `mavong` (`mavong`),
  CONSTRAINT `trandau_ibfk_1` FOREIGN KEY (`mavong`) REFERENCES `vongdau` (`mavongdau`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `trandau`
--

LOCK TABLES `trandau` WRITE;
/*!40000 ALTER TABLE `trandau` DISABLE KEYS */;
INSERT INTO `trandau` VALUES (1,1,1),(2,1,2),(3,2,3),(4,2,4),(5,3,5),(6,3,6),(7,4,7),(8,4,8),(9,5,9),(10,5,10),(11,6,11),(12,6,12),(13,7,13),(14,7,14),(15,8,15),(16,8,16),(17,9,17),(18,9,18),(19,10,19),(20,10,20),(21,11,21),(22,11,22);
/*!40000 ALTER TABLE `trandau` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vongdau`
--

DROP TABLE IF EXISTS `vongdau`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vongdau` (
  `mavongdau` int NOT NULL AUTO_INCREMENT,
  `tenvongdau` int NOT NULL,
  PRIMARY KEY (`mavongdau`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vongdau`
--

LOCK TABLES `vongdau` WRITE;
/*!40000 ALTER TABLE `vongdau` DISABLE KEYS */;
INSERT INTO `vongdau` VALUES (1,1),(2,2),(3,3),(4,4),(5,5),(6,6),(7,7),(8,8),(9,9),(10,10),(11,11),(12,12);
/*!40000 ALTER TABLE `vongdau` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-01-11 23:09:18
