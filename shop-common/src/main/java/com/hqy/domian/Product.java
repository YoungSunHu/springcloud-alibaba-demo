package com.hqy.domian;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//商品
@Entity(name = "shop_product")
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //主键
    private Integer pid;
    //商品名称    
    private String pname;
    //商品价格    
    private Double pprice;
    //库存
    private Integer stock;
}
