DROP TABLE IF EXISTS user;

CREATE TABLE user
(
	id BIGINT(20) NOT NULL COMMENT '主键ID',
	name VARCHAR(30) NULL DEFAULT NULL COMMENT '姓名',
	age INT(11) NULL DEFAULT NULL COMMENT '年龄',
	email VARCHAR(50) NULL DEFAULT NULL COMMENT '邮箱',
	is_deleted TINYINT NULL DEFAULT 0 COMMENT '逻辑删除',
	state INT(11) NULL DEFAULT 0 COMMENT '状态',
	create_time DATETIME  NULL COMMENT '创建时间',
	update_time DATETIME  NULL COMMENT '创建时间',
	PRIMARY KEY (id)
);