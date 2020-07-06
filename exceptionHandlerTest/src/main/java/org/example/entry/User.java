package org.example.entry;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;

import java.io.Serializable;

/**
 * @author YueZhiMing
 * @create 2020-06-28 16:01
 */
@Data
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    /** 编号 */
    private int id;
    /** 姓名 */
    private String name;
    /** 年龄 */
    private int age;

    public User(){
    }

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }
}