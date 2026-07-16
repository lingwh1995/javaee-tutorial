package org.bluebridge.profile.dibysetsenior.inject;

import java.util.Properties;

/**
 * set方式注入专题之注入   Properties
 *
 * @author lingwh
 * @date 2026/7/13 14:30
 */
public class UserInjectPropertiesBySetter {

    //注入Properties，Properties和Map很像，但是其键值对只能是String
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
