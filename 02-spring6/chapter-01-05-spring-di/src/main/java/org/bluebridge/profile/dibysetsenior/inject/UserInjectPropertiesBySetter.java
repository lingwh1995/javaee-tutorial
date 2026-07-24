package org.bluebridge.profile.dibysetsenior.inject;

import java.util.Properties;

/**
 * set 方式注入专题之注入   Properties
 *
 * @author lingwh
 * @date 2026/1/10 11:05
 */
public class UserInjectPropertiesBySetter {

    //注入 Properties，Properties 和 Map 很像，但是其键值对只能是 String
    private Properties properties;

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "UserInjectPropertiesBySetter{" +
                "properties=" + properties +
                '}';
    }
}
