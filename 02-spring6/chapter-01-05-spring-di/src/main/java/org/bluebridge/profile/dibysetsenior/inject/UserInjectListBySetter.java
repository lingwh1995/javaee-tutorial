package org.bluebridge.profile.dibysetsenior.inject;

import org.bluebridge.profile.dibysetsenior.domain.Friend;

import java.util.List;

/**
 * set 方式注入专题之注入   List 集合
 *
 * @author lingwh
 * @date 2026/1/10 16:22
 */
public class UserInjectListBySetter {

    //注入 List，且数组元素数据类型为非引用类型数组
    private List<String> hobbies;

    //注入 List，且数组元素数据类型为引用类型数组
    private List<Friend> friends;

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public void setFriends(List<Friend> friends) {
        this.friends = friends;
    }

    @Override
    public String toString() {
        return "UserInjectListBySetter{" +
                "hobbies=" + hobbies +
                ", friends=" + friends +
                '}';
    }
}
