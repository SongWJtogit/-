package com.example.sureoa.dao.entity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author SWJ
 * @since 2018-08-24
 */
@TableName("TAB_问题件类型")
public class WtjlxInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private Double 序号;
    private String 问题件类型;


    public Double get序号() {
        return 序号;
    }

    public void set序号(Double 序号) {
        this.序号 = 序号;
    }

    public String get问题件类型() {
        return 问题件类型;
    }

    public void set问题件类型(String 问题件类型) {
        this.问题件类型 = 问题件类型;
    }

    @Override
    public String toString() {
        return "WtjlxInfo{" +
        ", 序号=" + 序号 +
        ", WtjlxInfo=" + 问题件类型 +
        "}";
    }
}
