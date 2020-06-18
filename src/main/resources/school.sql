/*
Navicat MySQL Data Transfer

Source Server         : 3306
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : school

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2020-06-18 13:53:48
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for s_homework
-- ----------------------------
DROP TABLE IF EXISTS `s_homework`;
CREATE TABLE `s_homework` (
  `homeworkid` bigint(20) NOT NULL AUTO_INCREMENT,
  `homeworktitle` varchar(20) DEFAULT NULL,
  `homeworkcontent` text,
  `homeworkcreate_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `homeworkupdate_time` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`homeworkid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of s_homework
-- ----------------------------
INSERT INTO `s_homework` VALUES ('1', '作业一', '第一课练习', '2020-06-17 08:09:12', '6.17');
INSERT INTO `s_homework` VALUES ('2', '作业二', '第二次课练习', '2020-06-17 08:09:15', '6.18');
INSERT INTO `s_homework` VALUES ('3', '作业三', '第三次课练习', '2020-06-17 08:09:21', '6.19');

-- ----------------------------
-- Table structure for s_student
-- ----------------------------
DROP TABLE IF EXISTS `s_student`;
CREATE TABLE `s_student` (
  `id` bigint(20) NOT NULL,
  `name` varchar(20) DEFAULT NULL,
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `update_time` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of s_student
-- ----------------------------
INSERT INTO `s_student` VALUES ('19940061', '张三', '2020-06-18 00:53:48', null);
INSERT INTO `s_student` VALUES ('19940062', '小马', '2020-06-18 00:53:53', null);
INSERT INTO `s_student` VALUES ('19940063', '笑啦', '2020-06-18 00:53:58', null);
INSERT INTO `s_student` VALUES ('19940064', '小吴', '2020-06-18 00:54:41', null);

-- ----------------------------
-- Table structure for s_studenthomework
-- ----------------------------
DROP TABLE IF EXISTS `s_studenthomework`;
CREATE TABLE `s_studenthomework` (
  `sthomeworkid` int(5) NOT NULL AUTO_INCREMENT,
  `homeworktitle` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `sthomeworkcontent` varchar(255) DEFAULT NULL,
  `stworkcreatetime` datetime DEFAULT NULL,
  PRIMARY KEY (`sthomeworkid`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of s_studenthomework
-- ----------------------------
INSERT INTO `s_studenthomework` VALUES ('1', '作业三', '小刘', '啦啦啦', '2020-06-18 11:46:44');
INSERT INTO `s_studenthomework` VALUES ('2', '作业一', '小美', '啦啦啦', '2020-06-17 21:47:13');
INSERT INTO `s_studenthomework` VALUES ('6', '作业一', '张三', '啦啦啦', null);
INSERT INTO `s_studenthomework` VALUES ('7', '作业四', '小王', '啦啦啦', null);

-- ----------------------------
-- Table structure for user1
-- ----------------------------
DROP TABLE IF EXISTS `user1`;
CREATE TABLE `user1` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user1
-- ----------------------------
INSERT INTO `user1` VALUES ('1', 'root', '123456');
INSERT INTO `user1` VALUES ('2', 'liu', '123456');
