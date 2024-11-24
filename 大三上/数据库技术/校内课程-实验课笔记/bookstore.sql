/*
 Navicat Premium Data Transfer

 Source Server         : mysql
 Source Server Type    : MySQL
 Source Server Version : 50528
 Source Host           : localhost:3306
 Source Schema         : bookstore

 Target Server Type    : MySQL
 Target Server Version : 50528
 File Encoding         : 65001

 Date: 01/11/2024 14:27:34
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for b_order
-- ----------------------------
DROP TABLE IF EXISTS `b_order`;
CREATE TABLE `b_order`  (
  `uid` char(4) CHARACTER SET gbk COLLATE gbk_chinese_ci NOT NULL,
  `bid` int(11) NOT NULL,
  `ordernum` int(11) NULL DEFAULT 1,
  `orderdate` datetime NULL DEFAULT NULL,
  `deliverydate` datetime NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = gbk COLLATE = gbk_chinese_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of b_order
-- ----------------------------
INSERT INTO `b_order` VALUES ('1001', 1, 2, '2016-03-12 00:00:00', NULL);
INSERT INTO `b_order` VALUES ('1001', 3, 1, '2016-04-15 00:00:00', NULL);
INSERT INTO `b_order` VALUES ('1001', 1, 1, '2016-09-15 00:00:00', NULL);
INSERT INTO `b_order` VALUES ('1003', 7, 1, '2015-12-14 00:00:00', NULL);
INSERT INTO `b_order` VALUES ('1003', 3, 1, '2016-10-10 00:00:00', NULL);
INSERT INTO `b_order` VALUES ('1005', 5, 1, '2015-08-17 00:00:00', NULL);
INSERT INTO `b_order` VALUES ('1005', 7, 3, '2016-11-12 00:00:00', NULL);
INSERT INTO `b_order` VALUES ('1006', 5, 1, '2016-09-18 00:00:00', NULL);
INSERT INTO `b_order` VALUES ('1006', 1, 2, '2016-10-21 00:00:00', NULL);
INSERT INTO `b_order` VALUES ('1006', 7, 2, '2015-11-21 00:00:00', NULL);
INSERT INTO `b_order` VALUES ('1001', 1, 2, '2016-03-12 00:00:00', NULL);
INSERT INTO `b_order` VALUES ('1001', 3, 1, '2016-04-15 00:00:00', NULL);
INSERT INTO `b_order` VALUES ('1001', 1, 1, '2016-09-15 00:00:00', NULL);
INSERT INTO `b_order` VALUES ('1003', 7, 1, '2015-12-14 00:00:00', NULL);
INSERT INTO `b_order` VALUES ('1003', 3, 1, '2016-10-10 00:00:00', NULL);
INSERT INTO `b_order` VALUES ('1005', 5, 1, '2015-08-17 00:00:00', NULL);
INSERT INTO `b_order` VALUES ('1005', 7, 3, '2016-11-12 00:00:00', NULL);
INSERT INTO `b_order` VALUES ('1006', 5, 1, '2016-09-18 00:00:00', NULL);
INSERT INTO `b_order` VALUES ('1006', 1, 2, '2016-10-21 00:00:00', NULL);
INSERT INTO `b_order` VALUES ('1006', 7, 2, '2015-11-21 00:00:00', NULL);
INSERT INTO `b_order` VALUES ('1001', 1, 2, '2016-03-12 00:00:00', NULL);
INSERT INTO `b_order` VALUES ('1001', 3, 1, '2016-04-15 00:00:00', NULL);
INSERT INTO `b_order` VALUES ('1001', 1, 1, '2016-09-15 00:00:00', NULL);
INSERT INTO `b_order` VALUES ('1003', 7, 1, '2015-12-14 00:00:00', NULL);
INSERT INTO `b_order` VALUES ('1003', 3, 1, '2016-10-10 00:00:00', NULL);
INSERT INTO `b_order` VALUES ('1005', 5, 1, '2015-08-17 00:00:00', NULL);
INSERT INTO `b_order` VALUES ('1005', 7, 3, '2016-11-12 00:00:00', NULL);
INSERT INTO `b_order` VALUES ('1006', 5, 1, '2016-09-18 00:00:00', NULL);
INSERT INTO `b_order` VALUES ('1006', 1, 2, '2016-10-21 00:00:00', NULL);
INSERT INTO `b_order` VALUES ('1006', 7, 2, '2015-11-21 00:00:00', NULL);
INSERT INTO `b_order` VALUES ('1001', 1, 2, '2016-03-12 00:00:00', NULL);
INSERT INTO `b_order` VALUES ('1001', 3, 1, '2016-04-15 00:00:00', NULL);
INSERT INTO `b_order` VALUES ('1001', 1, 1, '2016-09-15 00:00:00', NULL);
INSERT INTO `b_order` VALUES ('1003', 7, 1, '2015-12-14 00:00:00', NULL);
INSERT INTO `b_order` VALUES ('1003', 3, 1, '2016-10-10 00:00:00', NULL);
INSERT INTO `b_order` VALUES ('1005', 5, 1, '2015-08-17 00:00:00', NULL);
INSERT INTO `b_order` VALUES ('1005', 7, 3, '2016-11-12 00:00:00', NULL);
INSERT INTO `b_order` VALUES ('1006', 5, 1, '2016-09-18 00:00:00', NULL);
INSERT INTO `b_order` VALUES ('1006', 1, 2, '2016-10-21 00:00:00', NULL);
INSERT INTO `b_order` VALUES ('1006', 7, 2, '2015-11-21 00:00:00', NULL);

-- ----------------------------
-- Table structure for book
-- ----------------------------
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book`  (
  `bid` int(11) NOT NULL,
  `bname` varchar(50) CHARACTER SET gbk COLLATE gbk_chinese_ci NOT NULL,
  `author` char(8) CHARACTER SET gbk COLLATE gbk_chinese_ci NULL DEFAULT NULL,
  `price` float NULL DEFAULT NULL,
  `publisher` varchar(50) CHARACTER SET gbk COLLATE gbk_chinese_ci NULL DEFAULT NULL,
  `discount` float NULL DEFAULT NULL,
  `cid` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`bid`) USING BTREE,
  INDEX `fk_cid`(`cid`) USING BTREE,
  CONSTRAINT `fk_cid` FOREIGN KEY (`cid`) REFERENCES `category` (`cid`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = gbk COLLATE = gbk_chinese_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of book
-- ----------------------------
INSERT INTO `book` VALUES (1, '中国时代', '师永刚', 39, '作家出版社', 27.8, 1);
INSERT INTO `book` VALUES (2, '中国历史的屈辱', '王重旭', 26, '华夏出版社', 18.2, 2);
INSERT INTO `book` VALUES (3, '择业要趁早', '海文', 28, '海天出版社', 19.3, 3);
INSERT INTO `book` VALUES (4, '房间', '爱玛', 37.6, '人民文学出版社', 26.3, 4);
INSERT INTO `book` VALUES (5, '平凡的世界', '路遥', 75, '北京出版社', 63.75, 4);
INSERT INTO `book` VALUES (6, '心灵鸡汤', '关然', 27, '大豫出版社', 20, 3);
INSERT INTO `book` VALUES (7, '蜕', '赵婷', 32, '上海出版社', 28.5, 3);

-- ----------------------------
-- Table structure for category
-- ----------------------------
DROP TABLE IF EXISTS `category`;
CREATE TABLE `category`  (
  `cid` int(11) NOT NULL,
  `cname` varchar(16) CHARACTER SET gbk COLLATE gbk_chinese_ci NULL DEFAULT NULL,
  PRIMARY KEY (`cid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = gbk COLLATE = gbk_chinese_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of category
-- ----------------------------
INSERT INTO `category` VALUES (1, '历史');
INSERT INTO `category` VALUES (2, '家教');
INSERT INTO `category` VALUES (3, '文化');
INSERT INTO `category` VALUES (4, '小说');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `uid` char(4) CHARACTER SET gbk COLLATE gbk_chinese_ci NOT NULL,
  `uname` varchar(20) CHARACTER SET gbk COLLATE gbk_chinese_ci NULL DEFAULT NULL,
  `email` varchar(20) CHARACTER SET gbk COLLATE gbk_chinese_ci NULL DEFAULT NULL,
  `tnum` varchar(15) CHARACTER SET gbk COLLATE gbk_chinese_ci NULL DEFAULT NULL,
  `score` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`uid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = gbk COLLATE = gbk_chinese_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1001', '何仙姑', 'Hxg18@163.com', '13320101991', 20);
INSERT INTO `user` VALUES ('1002', '平平人生', 'Lp011@126.com', '13545158219', 300);
INSERT INTO `user` VALUES ('1003', '四十不惑', '12345@qq.com', '18688168818', 1000);
INSERT INTO `user` VALUES ('1004', '桃花岛主', '810124@qq.com', '13068011234', 600);
INSERT INTO `user` VALUES ('1005', '水灵', 'zs123@371.com', '15838182503', 150);
INSERT INTO `user` VALUES ('1006', '感动心灵', 'gandong@tom.com', '13641151234', 500);

SET FOREIGN_KEY_CHECKS = 1;
