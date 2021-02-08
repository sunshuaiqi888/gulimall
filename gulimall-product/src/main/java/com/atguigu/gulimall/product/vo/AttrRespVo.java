package com.atguigu.gulimall.product.vo;

import lombok.Data;

/**
 * 响应给前端的vo
 */
@Data
public class AttrRespVo extends AttrVo{

    private String catelogName;

    private String groupName;

    private String catelogPath;//属性的完整路径
}
