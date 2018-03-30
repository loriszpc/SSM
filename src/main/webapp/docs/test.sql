/*
Navicat MariaDB Data Transfer

Source Server         : 192.168.197.111
Source Server Version : 50556
Source Host           : 192.168.197.111:3306
Source Database       : test

Target Server Type    : MariaDB
Target Server Version : 50556
File Encoding         : 65001

Date: 2018-03-30 16:55:27
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `user_name` varchar(255) DEFAULT '',
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '1', '1');
INSERT INTO `user` VALUES ('111', '111', '111');
