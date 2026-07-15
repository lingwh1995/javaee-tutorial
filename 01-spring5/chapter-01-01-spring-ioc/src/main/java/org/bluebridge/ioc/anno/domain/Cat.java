package org.bluebridge.ioc.anno.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * 猫实体类
 *
 * @author lingwh
 * @date 2019/3/20 9:28
 */
@Component(value="cat")
public class Cat {

    @Value("Tom")
    private String catName;

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public void eat(){
        System.out.println("名字是"+catName+"的猫在喝水....");
    }
}
