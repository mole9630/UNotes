/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 50528
 Source Host           : localhost:3306
 Source Schema         : shop

 Target Server Type    : MySQL
 Target Server Version : 50528
 File Encoding         : 65001

 Date: 05/12/2024 08:41:57
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for product
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `price` decimal(10, 2) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of product
-- ----------------------------
INSERT INTO `product` VALUES (1, 'Apple', 1.00);
INSERT INTO `product` VALUES (2, 'Banana', 0.50);
INSERT INTO `product` VALUES (3, 'Orange', 0.75);

SET FOREIGN_KEY_CHECKS = 1;
