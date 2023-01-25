-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: db_study3
-- ------------------------------------------------------
-- Server version	8.0.32

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
-- Table structure for table `publisher_mst`
--

DROP TABLE IF EXISTS `publisher_mst`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `publisher_mst` (
  `publisher_id` int NOT NULL AUTO_INCREMENT,
  `publisher_name` varchar(45) DEFAULT NULL,
  `publisher_year` date DEFAULT NULL,
  PRIMARY KEY (`publisher_id`)
) ENGINE=InnoDB AUTO_INCREMENT=512 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `publisher_mst`
--

LOCK TABLES `publisher_mst` WRITE;
/*!40000 ALTER TABLE `publisher_mst` DISABLE KEYS */;
INSERT INTO `publisher_mst` VALUES (1,'',NULL),(2,' 사람\"',NULL),(3,' 천천히\"\"\"',NULL),(4,'[대구광역시] 수성구',NULL),(5,'2002년월드컵축구대회조직위원회',NULL),(6,'2003대구하계유니버시아드대회조직위원회',NULL),(7,'21세기북스',NULL),(8,'ace',NULL),(9,'Angle books(앵글북스)',NULL),(10,'Digital Books(디지털북스)',NULL),(11,'Jinhan M&B(진한엠앤비)',NULL),(12,'KFDA식품의약품안전처',NULL),(13,'Korea.com',NULL),(14,'RHK(알에이치코리아)',NULL),(15,'Ritec Contents(리텍 콘텐츠)',NULL),(16,'가람문학사',NULL),(17,'가람어린이',NULL),(18,'감사원',NULL),(19,'감사원 감사연구원',NULL),(20,'거름',NULL),(21,'건설교통부',NULL),(22,'검은숲',NULL),(23,'경제기획원 조사통계국',NULL),(24,'계림',NULL),(25,'계림닷컴',NULL),(26,'골프아카데미',NULL),(27,'과학기술부',NULL),(28,'과학기술처',NULL),(29,'교보문고',NULL),(30,'교원',NULL),(31,'국가균형발전위원회',NULL),(32,'국가청렴위원회',NULL),(33,'국립대구박물관',NULL),(34,'국무조정실',NULL),(35,'국무조정실 규제개혁기획단',NULL),(36,'국무총리수질개선기획단','2023-01-25'),(37,'국무총리행정심판위원회','2023-01-25'),(38,'국민건강보험',NULL),(39,'국민건강보험공단.건강보험심사평가원',NULL),(40,'국민권익위원회',NULL),(41,'국세청',NULL),(42,'국토해양부',NULL),(43,'규제개혁위원회',NULL),(44,'그리고책',NULL),(45,'그린북',NULL),(46,'글담',NULL),(47,'글담출판사',NULL),(48,'글송이',NULL),(49,'길벗',NULL),(50,'김천시',NULL),(51,'깊은책속옹달샘',NULL),(52,'꿈결',NULL),(53,'꿈꾸는사람들',NULL),(54,'나무의꿈',NULL),(55,'내무부',NULL),(56,'내무부 법무담당관실',NULL),(57,'내일여행',NULL),(58,'넥서스Books',NULL),(59,'농림부',NULL),(60,'농림수산부',NULL),(61,'다락원',NULL),(62,'다른',NULL),(63,'다산북스',NULL),(64,'대구광역시',NULL),(65,'대구광역시 건축주택과',NULL),(66,'대구광역시 남구',NULL),(67,'대구광역시 남구청',NULL),(68,'대구광역시 달성구',NULL),(69,'대구광역시 달성군',NULL),(70,'대구광역시 동구',NULL),(71,'대구광역시 북구',NULL),(72,'대구광역시 서구',NULL),(73,'대구광역시 세정담당관',NULL),(74,'대구광역시 수성구',NULL),(75,'대구광역시 재해대책본부',NULL),(76,'대구광역시 중구',NULL),(77,'대구광역시남구',NULL),(78,'대구광역시달서구',NULL),(79,'대구광역시달성군',NULL),(80,'대구광역시동구',NULL),(81,'대구광역시립도서관',NULL),(82,'대구광역시립중앙도서관',NULL),(83,'대구광역시보건환경연구원',NULL),(84,'대구광역시북구',NULL),(85,'대구광역시서구',NULL),(86,'대구직할시',NULL),(87,'대원키즈',NULL),(88,'대한민국농림수산부',NULL),(89,'더난출판',NULL),(90,'도우미출판사',NULL),(91,'돌게개',NULL),(92,'동북아정보문화센터',NULL),(93,'동북지방통계청',NULL),(94,'동양문고·상상공방',NULL),(95,'들녘',NULL),(96,'들녘미디어',NULL),(97,'디딤돌',NULL),(98,'라사라패션월드',NULL),(99,'랜덤하우스',NULL),(100,'로그인',NULL),(101,'로그인(이퍼블릭)',NULL),(102,'리더스하우스',NULL),(103,'링거스',NULL),(104,'매일경제신문사',NULL),(105,'명지출판사',NULL),(106,'문예춘추사',NULL),(107,'문학나무',NULL),(108,'문학동네',NULL),(109,'문학사상',NULL),(110,'문학사상사',NULL),(111,'문학세계사',NULL),(112,'문화재청',NULL),(113,'문화체육부',NULL),(114,'물주는아이(백도씨)',NULL),(115,'미디어윌',NULL),(116,'미래M＆B',NULL),(117,'미래엔',NULL),(118,'미래엔 :아이세움',NULL),(119,'민음사',NULL),(120,'밀리언하우스',NULL),(121,'박문각',NULL),(122,'보건복지부',NULL),(123,'봄봄',NULL),(124,'부산광역시 해운대구',NULL),(125,'북로드',NULL),(126,'북스톤',NULL),(127,'북클라우드',NULL),(128,'사과나무',NULL),(129,'사람의무늬',NULL),(130,'사월의책',NULL),(131,'산수야',NULL),(132,'삼성출판사',NULL),(133,'상상아카데미',NULL),(134,'상상출판',NULL),(135,'상수리',NULL),(136,'서사원',NULL),(137,'서울문화사',NULL),(138,'서울특별시영등포구',NULL),(139,'세경사',NULL),(140,'시나리오친구들',NULL),(141,'시사문화사',NULL),(142,'식품의약품안전처',NULL),(143,'식품의약품안전청',NULL),(144,'식품의약품안정청',NULL),(145,'씨앗을뿌리는사람',NULL),(146,'아울북',NULL),(147,'아이세움',NULL),(148,'아이세움(미래엔)',NULL),(149,'아이앤북',NULL),(150,'알키',NULL),(151,'알키(시공사)',NULL),(152,'언어세상',NULL),(153,'역사넷',NULL),(154,'연합뉴스',NULL),(155,'열번째행성',NULL),(156,'영교출판',NULL),(157,'영진닷컴',NULL),(158,'영천시',NULL),(159,'예담friend',NULL),(160,'예림당',NULL),(161,'예문',NULL),(162,'움직이는서재',NULL),(163,'웅진리빙하우스',NULL),(164,'웅진윙스',NULL),(165,'웅진지식하우스',NULL),(166,'웨일북',NULL),(167,'웰북',NULL),(168,'위즈덤하우스',NULL),(169,'은행나무',NULL),(170,'이밥차',NULL),(171,'이야기',NULL),(172,'이지북',NULL),(173,'인더북스',NULL),(174,'인천광역시 계양구',NULL),(175,'인천광역시 남동구',NULL),(176,'일빛',NULL),(177,'자음과모음',NULL),(178,'재정경제부 교육홍보팀',NULL),(179,'전국시장.군수.구청장협의회',NULL),(180,'전국시장·군수·구청장협의회',NULL),(181,'정보문화사',NULL),(182,'정부간행물제작소',NULL),(183,'정부혁신지방분권위원회',NULL),(184,'조달청',NULL),(185,'조선북스',NULL),(186,'주니어김영사',NULL),(187,'주니어랜덤',NULL),(188,'중앙books',NULL),(189,'중앙공무원교육원',NULL),(190,'중앙북스',NULL),(191,'중앙일보',NULL),(192,'지경사',NULL),(193,'지방행정연수원',NULL),(194,'지방행정연수원 교육1과',NULL),(195,'지엔씨미디어',NULL),(196,'지혜로',NULL),(197,'진주시',NULL),(198,'질병관리본부',NULL),(199,'창녕군',NULL),(200,'창비',NULL),(201,'책 만드는 집',NULL),(202,'책만드는집',NULL),(203,'천우',NULL),(204,'철수와영희',NULL),(205,'청년사',NULL),(206,'청람',NULL),(207,'총무처',NULL),(208,'토마토하우스',NULL),(209,'토피',NULL),(210,'통계청',NULL),(211,'통일부',NULL),(212,'통일원',NULL),(213,'포북',NULL),(214,'푸른사상',NULL),(215,'푸른책들',NULL),(216,'풀빛',NULL),(217,'하늘아래',NULL),(218,'하양인',NULL),(219,'하이퍼북',NULL),(220,'학은미디어',NULL),(221,'한국경제신문',NULL),(222,'한국노동연구원',NULL),(223,'한국물가정보',NULL),(224,'한국소비자연맹대구직할시지부',NULL),(225,'한국실명예방재단',NULL),(226,'한국여성정책연구원',NULL),(227,'한국전산원',NULL),(228,'한국편집기자협의회',NULL),(229,'한국편집기자협회',NULL),(230,'한국행정연구원',NULL),(231,'한빛미디어',NULL),(232,'한스미디어',NULL),(233,'행복한아침',NULL),(234,'행성비',NULL),(235,'행정안전부',NULL),(236,'행정자치부',NULL),(237,'행정중심복합도시건설추진위원회 행정중심복합도시건설추진단',NULL),(238,'홍',NULL),(239,'화남Br',NULL),(240,'환경부',NULL),(241,'황금가지',NULL),(242,'황금부엉이',NULL),(243,'효리원',NULL),(244,'휘슬러',NULL),(245,'흐름출판',NULL),(246,'三英社',NULL),(247,'內務部',NULL),(248,'內務部地方行政硏修院',NULL),(249,'大邱廣域市',NULL),(250,'大邱廣域市 中區',NULL),(251,'大邱廣域市 北區',NULL),(252,'大邱廣域市 南區',NULL),(253,'大邱廣域市 東區',NULL),(254,'大邱廣域市 西區',NULL),(255,'大邱廣域市 達城郡',NULL),(256,'大邱廣域市 達西區',NULL),(257,'大邱廣域市災害對策本部',NULL),(258,'大邱直轄市',NULL),(259,'大邱直轄市 北區',NULL),(260,'大邱直轄市 南區',NULL),(261,'大邱直轄市 壽城區',NULL),(262,'大邱直轄市 西區',NULL),(263,'大邱直轄市 達西區',NULL),(264,'大邱直轄市上水道事業本部',NULL),(265,'統計廳',NULL),(266,'韓國地方行政硏究院',NULL);
/*!40000 ALTER TABLE `publisher_mst` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-01-25 17:08:55
