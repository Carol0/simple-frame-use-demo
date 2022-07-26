/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 80029
Source Host           : localhost:3306
Source Database       : simple_frame_use_demo

Target Server Type    : MYSQL
Target Server Version : 80029
File Encoding         : 65001

Date: 2022-07-26 15:13:03
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for sign
-- ----------------------------
DROP TABLE IF EXISTS `sign`;
CREATE TABLE `sign` (
  `id` bigint unsigned NOT NULL AUTO_INCREMENT,
  `owner` bigint NOT NULL DEFAULT '-1' COMMENT '工单发起人',
  `state` int NOT NULL COMMENT '工单状态',
  `create_time` timestamp NOT NULL COMMENT '创建时间',
  `create_user` bigint NOT NULL DEFAULT '-1' COMMENT '创建人',
  `update_time` timestamp NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `update_user` bigint NOT NULL DEFAULT '-1' COMMENT '修改人',
  `deleted` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否删除0否 1是',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1551827790381969411 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Table structure for sign_operator_log
-- ----------------------------
DROP TABLE IF EXISTS `sign_operator_log`;
CREATE TABLE `sign_operator_log` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `last_state` int NOT NULL COMMENT '上一个状态',
  `state` int NOT NULL COMMENT '当前状态',
  `remark` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '备注',
  `deleted` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
