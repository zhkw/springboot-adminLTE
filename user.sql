/*
 Navicat Premium Data Transfer

 Source Server         : KT
 Source Server Type    : MySQL
 Source Server Version : 50553
 Source Host           : localhost:3306
 Source Schema         : user

 Target Server Type    : MySQL
 Target Server Version : 50553
 File Encoding         : 65001

 Date: 20/05/2020 23:44:28
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for account
-- ----------------------------
DROP TABLE IF EXISTS `account`;
CREATE TABLE `account`  (
  `aid` int(11) NOT NULL,
  `aname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `age` int(11) NULL DEFAULT NULL,
  `address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`aid`) USING BTREE
) ENGINE = MyISAM CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of account
-- ----------------------------
INSERT INTO `account` VALUES (1, '路飞', 22, 'onepiece');

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin`  (
  `username` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `password` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL
) ENGINE = MyISAM CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('admin', '123456');
INSERT INTO `admin` VALUES ('123456', '123456');
INSERT INTO `admin` VALUES ('ooo', '111');
INSERT INTO `admin` VALUES ('abc', '666');
INSERT INTO `admin` VALUES ('ccc', '666');
INSERT INTO `admin` VALUES ('Nick', '666');
INSERT INTO `admin` VALUES ('路飞', '666');
INSERT INTO `admin` VALUES ('uj', '123');
INSERT INTO `admin` VALUES ('Nick', '666');
INSERT INTO `admin` VALUES ('bbb', '111');
INSERT INTO `admin` VALUES ('aaa', '666');
INSERT INTO `admin` VALUES ('amy', '123');
INSERT INTO `admin` VALUES ('王五', '6666');
INSERT INTO `admin` VALUES ('张三', '123');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `gender` varchar(5) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `age` int(11) NULL DEFAULT NULL,
  `address` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `qq` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `email` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 131 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, '罗罗诺亚*索隆', '男', 20, '上海', '1205529635', 'One Piece');
INSERT INTO `user` VALUES (47, '蒙奇D路飞', '男', 22, '陕西', '55555', 'One Piece');
INSERT INTO `user` VALUES (130, '妮可罗宾', '女', 33, 'OnePiece', '123456', '123456');
INSERT INTO `user` VALUES (10, '香吉士', '男', 13, '陕西', '12345', 'xiangjishi@qq.com');
INSERT INTO `user` VALUES (53, 'amy', '女', 20, '陕西', '6666', 'One Piece');
INSERT INTO `user` VALUES (15, '李四', '女', 15, '北京', '88888', 'ls@itcast.cn');
INSERT INTO `user` VALUES (16, '张三', '男', 13, '陕西', '12345', 'zhangsan@itcast.cn');
INSERT INTO `user` VALUES (17, '李四', '女', 15, '北京', '88888', 'ls@itcast.cn');
INSERT INTO `user` VALUES (18, '张三', '男', 13, '陕西', '12345', 'zhangsan@itcast.cn');
INSERT INTO `user` VALUES (19, '李四', '女', 15, '北京', '88888', 'ls@itcast.cn');
INSERT INTO `user` VALUES (21, '李四', '女', 15, '北京', '88888', 'ls@itcast.cn');
INSERT INTO `user` VALUES (22, '张三', '男', 13, '陕西', '12345', 'zhangsan@itcast.cn');
INSERT INTO `user` VALUES (23, '李四', '女', 15, '北京', '88888', 'ls@itcast.cn');
INSERT INTO `user` VALUES (24, '张三', '男', 13, '陕西', '12345', 'zhangsan@itcast.cn');
INSERT INTO `user` VALUES (25, '李四', '女', 15, '北京', '88888', 'ls@itcast.cn');
INSERT INTO `user` VALUES (26, '张三', '男', 13, '陕西', '12345', 'zhangsan@itcast.cn');
INSERT INTO `user` VALUES (27, '李四', '女', 15, '北京', '88888', 'ls@itcast.cn');
INSERT INTO `user` VALUES (28, '张三', '男', 13, '陕西', '12345', 'zhangsan@itcast.cn');
INSERT INTO `user` VALUES (29, '李四', '女', 15, '北京', '88888', 'ls@itcast.cn');
INSERT INTO `user` VALUES (30, '张三', '男', 13, '陕西', '12345', 'zhangsan@itcast.cn');
INSERT INTO `user` VALUES (31, '李四', '女', 15, '北京', '88888', 'ls@itcast.cn');
INSERT INTO `user` VALUES (33, '李四', '女', 15, '北京', '88888', 'ls@itcast.cn');
INSERT INTO `user` VALUES (35, '李四', '女', 15, '北京', '88888', 'ls@itcast.cn');
INSERT INTO `user` VALUES (36, '张三', '男', 13, '陕西', '12345', 'zhangsan@itcast.cn');
INSERT INTO `user` VALUES (37, '李四', '女', 15, '北京', '88888', 'ls@itcast.cn');
INSERT INTO `user` VALUES (38, '张三', '男', 13, '陕西', '12345', 'zhangsan@itcast.cn');
INSERT INTO `user` VALUES (39, '李四', '女', 15, '北京', '88888', 'ls@itcast.cn');
INSERT INTO `user` VALUES (40, '张三', '男', 13, '陕西', '12345', 'zhangsan@itcast.cn');
INSERT INTO `user` VALUES (54, '李四', '女', 15, '北京', '88888', 'ls@itcast.cn');
INSERT INTO `user` VALUES (55, '张三', '男', 13, '陕西', '12345', 'zhangsan@itcast.cn');
INSERT INTO `user` VALUES (56, '李四', '女', 15, '北京', '88888', 'ls@itcast.cn');
INSERT INTO `user` VALUES (57, '李四', '女', 15, '北京', '88888', 'ls@itcast.cn');
INSERT INTO `user` VALUES (58, '李四', '女', 15, '北京', '88888', 'ls@itcast.cn');
INSERT INTO `user` VALUES (59, '张三', '男', 13, '陕西', '12345', 'zhangsan@itcast.cn');
INSERT INTO `user` VALUES (60, '李四', '女', 15, '北京', '88888', 'ls@itcast.cn');
INSERT INTO `user` VALUES (63, '张三', '男', 13, '陕西', '12345', 'zhangsan@itcast.cn');
INSERT INTO `user` VALUES (64, '李四', '女', 15, '北京', '88888', 'ls@itcast.cn');
INSERT INTO `user` VALUES (65, 'amy', '女', 20, '陕西', '6666', 'One Piece');
INSERT INTO `user` VALUES (66, 'amy', '女', 20, '陕西', '6666', 'One Piece');
INSERT INTO `user` VALUES (68, 'amy', '女', 20, '陕西', '6666', 'One Piece');

SET FOREIGN_KEY_CHECKS = 1;
