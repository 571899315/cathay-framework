
CREATE TABLE `cathay-config` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `app_name` varchar(200) NOT NULL COMMENT '应用名称',
  `app_env` varchar(200) NOT NULL COMMENT '应用环境名称',
  `key` varchar(200) NOT NULL COMMENT 'key',
  `value` varchar(2000) NOT NULL DEFAULT '' COMMENT 'value',
  `COMMENT` varchar(200) DEFAULT '' COMMENT '注释',
  `gmt_created` datetime NOT NULL,
  `gmt_modified` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='配置信息表';

