package com.spring3.demo.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;

/**
 * Created with:IntelliJ IDEA.
 * Created by: taoyong
 * Time: 2017-03-26 13:10
 * Description:
 */

public class BeanOperationDemon {

    private static Logger logger = Logger.getLogger(BeanOperationDemon.class);

    private String desc ;

    private List<Integer> values;

    @Value("#{configSetting[name]}")
    private String name;

    public BeanOperationDemon() {
    }

    public BeanOperationDemon(String desc) {
        logger.error(String.format("bean构造方法被调用了,desc=%s",desc));
        logger.info("webapp.root path ======================"+ System.getProperty("webapp.root"));
        this.desc = desc;
    }

    public static  BeanOperationDemon instance(String desc) {
        return new BeanOperationDemon(desc);
    }

    public void initDesc(String desc){
        this.desc = desc;
    }
    public void sayHi(){
        System.out.println("hi,boy!");

        System.out.println(this);
    }


    @Override
    public String toString() {
        return "BeanOperationDemon{" +
                "desc='" + desc + '\'' +
                ", values=" + values +
                ", name='" + name + '\'' +
                '}';
    }

    public List<Integer> getValues() {
        return values;
    }

    public void setValues(List<Integer> values) {
        this.values = values;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
