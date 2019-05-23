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
