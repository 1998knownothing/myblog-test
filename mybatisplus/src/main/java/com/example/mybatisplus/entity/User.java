package com.example.mybatisplus.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.util.Date;

@Data
public class User {
/*    @TableId
    描述：主键注解
    属性	类型	必须指定	默认值	描述
    value	String	否	""	主键字段名
    type	Enum	否	IdType.NONE	主键类型*/
   /* AUTO	数据库ID自增
    NONE	无状态,该类型为未设置主键类型(注解里等于跟随全局,全局里约等于 INPUT)
    INPUT	insert前自行set主键值
    ASSIGN_ID	分配ID(主键类型为Number(Long和Integer)或String)(since 3.3.0),使用接口IdentifierGenerator的方法nextId(默认实现类为DefaultIdentifierGenerator雪花算法)
    ASSIGN_UUID	分配UUID,主键类型为String(since 3.3.0),使用接口IdentifierGenerator的方法nextUUID(默认default方法)
    ID_WORKER	分布式全局唯一ID 长整型类型(please use ASSIGN_ID)
    UUID	32位UUID字符串(please use ASSIGN_UUID)
    ID_WORKER_STR	分布式全局唯一ID 字符串类型(please use ASSIGN_ID)*/
    @TableId(type=IdType.ASSIGN_ID)
    private String id;
    private String name;
    private Integer age;
    private String email;
    @TableLogic(value = "0",delval = "1")
    private Integer isDeleted;
    @TableField(fill = FieldFill.INSERT )
    private Date createTime;
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;
}