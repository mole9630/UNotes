/*
Navicat MySQL Data Transfer

Source Server         : 1
Source Server Version : 50547
Source Host           : localhost:3306
Source Database       : book

Target Server Type    : MYSQL
Target Server Version : 50547
File Encoding         : 65001

Date: 2022-09-30 10:22:23
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `studentNumber` int(9) NOT NULL,
  `studentName` varchar(20) NOT NULL,
  `studentBirthday` date NOT NULL,
  `studentClass` varchar(20) NOT NULL,
  PRIMARY KEY (`studentNumber`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('220930001', 'Zhangsan', '2000-01-01', '计科221');
INSERT INTO `student` VALUES ('220930002', 'Lisi', '2001-01-01', '计科221');
INSERT INTO `student` VALUES ('220930003', 'Wangwu', '2000-01-02', '计科222');
