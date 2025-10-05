package org.example.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@TableName("user_order")
public class Order {
    long id;
    String name;
    @TableField("order_time")
    LocalDateTime orderTime;
    @TableField("order_good")
    String orderGood;
}
