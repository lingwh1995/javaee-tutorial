package org.bluebridge.beaninstantiation.factorybeaninterface.demo;

import org.springframework.beans.factory.FactoryBean;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * DateFactoryBean
 *
 * @author lingwh
 * @date 2026/1/10 13:25
 */
public class DateFactoryBean implements FactoryBean<Date> {

    private String date;

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public Date getObject() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.parse(date);
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
