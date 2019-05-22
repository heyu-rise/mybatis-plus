/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : mybatis-plus

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2018-08-27 15:35:25
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for action_log
-- ----------------------------
DROP TABLE IF EXISTS `action_log`;
CREATE TABLE `action_log` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `service_code` varchar(255) DEFAULT NULL,
  `code` varchar(255) DEFAULT NULL,
  `user` varchar(255) DEFAULT NULL COMMENT 'eda系统会员号',
  `action` varchar(255) NOT NULL COMMENT '操作类型',
  `value` varchar(10000) DEFAULT NULL COMMENT '记录值',
  `param1` varchar(255) DEFAULT NULL COMMENT '操作参数',
  `param2` varchar(255) DEFAULT NULL,
  `param3` varchar(255) DEFAULT NULL,
  `param4` varchar(255) DEFAULT NULL,
  `record_time` datetime NOT NULL COMMENT '记录时间',
  PRIMARY KEY (`id`),
  KEY `index_count` (`record_time`,`code`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of action_log
-- ----------------------------

-- ----------------------------
-- Table structure for config
-- ----------------------------
DROP TABLE IF EXISTS `config`;
CREATE TABLE `config` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cfg_name` varchar(255) NOT NULL COMMENT '记录名称',
  `value_str` varchar(255) DEFAULT NULL COMMENT '字符串值',
  `value_int` int(11) DEFAULT NULL COMMENT '数字值',
  `value_time` datetime DEFAULT NULL COMMENT '时间值',
  `description` varchar(255) DEFAULT NULL COMMENT '描述',
  `usable` int(11) DEFAULT '1' COMMENT '是否可用 1-可用 0-不可用',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `index_name` (`cfg_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of config
-- ----------------------------

-- ----------------------------
-- Table structure for dictionary
-- ----------------------------
DROP TABLE IF EXISTS `dictionary`;
CREATE TABLE `dictionary` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `type` varchar(255) NOT NULL COMMENT '类型',
  `inner_id` int(11) DEFAULT NULL COMMENT '内部系统id',
  `inner_code` varchar(255) DEFAULT NULL COMMENT '内部系统code',
  `value_str` varchar(2047) NOT NULL COMMENT '字符串值',
  `value_int` int(11) DEFAULT NULL COMMENT '数字值',
  `value_time` datetime DEFAULT NULL COMMENT '时间值',
  `param_str1` varchar(255) DEFAULT NULL,
  `param_str2` varchar(255) DEFAULT NULL,
  `param_int1` int(11) DEFAULT NULL,
  `param_int2` int(11) DEFAULT NULL,
  `enable` int(11) DEFAULT '1' COMMENT '是否可用 1-可用 0-不可用',
  `description` varchar(255) DEFAULT NULL COMMENT '描述',
  `inner_create_time` datetime DEFAULT NULL COMMENT '内部创建时间',
  `inner_update_time` datetime DEFAULT NULL COMMENT '内部更新时间',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`),
  KEY `index_type_id` (`type`,`inner_id`),
  KEY `index_type_code` (`type`,`inner_code`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dictionary
-- ----------------------------
INSERT INTO `dictionary` VALUES ('1', 'express_status', null, 'error', '无法配送', null, null, null, null, null, null, '1', null, null, null, '2017-09-09 11:10:22', '2017-09-21 09:39:44');
INSERT INTO `dictionary` VALUES ('2', 'express_status', null, 'wait.push', '顺丰确认中', null, null, null, null, null, null, '1', null, null, null, '2017-09-09 11:10:25', '2017-09-21 09:41:41');
INSERT INTO `dictionary` VALUES ('3', 'express_status', null, 'wait.pick.up', '待收货', null, null, null, null, null, null, '1', null, null, null, '2017-09-09 11:10:27', '2017-09-21 09:41:55');
INSERT INTO `dictionary` VALUES ('4', 'express_status', null, 'deleiver', '配送中', null, null, '50,51,46,41,43,30,31,44', '50', null, null, '1', null, null, null, '2017-09-09 11:10:29', '2017-12-05 11:27:07');
INSERT INTO `dictionary` VALUES ('5', 'express_status', null, 'received', '完成', null, null, '80,8000', null, null, null, '1', null, null, null, '2017-09-09 11:10:32', '2017-09-21 09:42:00');
INSERT INTO `dictionary` VALUES ('6', 'pay_method', '1', null, '寄付现结', null, null, null, null, null, null, '1', null, null, null, '2017-09-09 11:10:34', '2017-09-30 09:06:38');
INSERT INTO `dictionary` VALUES ('7', 'pay_method', '2', null, '收方付', null, null, null, null, null, null, '1', null, null, null, '2017-09-09 11:10:36', '2017-09-09 11:11:00');
INSERT INTO `dictionary` VALUES ('8', 'pay_method', '3', null, '第三方付', null, null, null, null, null, null, '1', null, null, null, '2017-09-09 11:10:39', '2017-09-09 11:11:03');
INSERT INTO `dictionary` VALUES ('9', 'pay_method', '4', null, '寄付月结', null, null, null, null, null, null, '1', null, null, null, '2017-09-14 16:21:12', '2017-09-15 16:30:44');

-- ----------------------------
-- Table structure for log
-- ----------------------------
DROP TABLE IF EXISTS `log`;
CREATE TABLE `log` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `level` varchar(255) DEFAULT NULL COMMENT '日志等级',
  `file_name` varchar(255) DEFAULT NULL COMMENT '产生日志所在的文件',
  `class_name` varchar(255) DEFAULT NULL COMMENT '产生日志所在的类',
  `method_name` varchar(255) DEFAULT NULL COMMENT '产生日志所在的方法',
  `line_number` int(11) DEFAULT NULL COMMENT '产生日志所在的行数',
  `title` varchar(255) DEFAULT NULL COMMENT '日志标题',
  `content` varchar(1024) DEFAULT NULL COMMENT '日志详细内容',
  `record_time` datetime DEFAULT NULL COMMENT '记录时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of log
-- ----------------------------

-- ----------------------------
-- Table structure for record_utils
-- ----------------------------
DROP TABLE IF EXISTS `record_utils`;
CREATE TABLE `record_utils` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `record_name` varchar(255) NOT NULL COMMENT '记录名称',
  `value_str` varchar(255) DEFAULT NULL COMMENT '字符串值',
  `value_int` int(11) DEFAULT NULL COMMENT '数字值',
  `value_time` datetime DEFAULT NULL COMMENT '时间值',
  `param` varchar(255) DEFAULT NULL COMMENT '参数',
  `description` varchar(255) DEFAULT NULL COMMENT '描述',
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `index_name` (`record_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for task_clock
-- ----------------------------
DROP TABLE IF EXISTS `task_clock`;
CREATE TABLE `task_clock` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `task` varchar(255) NOT NULL COMMENT '任务代码',
  `clock` time DEFAULT NULL COMMENT '时分秒',
  `enable` varchar(255) DEFAULT '1' COMMENT '是否可用 1-可用 0-不可用',
  PRIMARY KEY (`id`),
  KEY `index_task` (`task`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

