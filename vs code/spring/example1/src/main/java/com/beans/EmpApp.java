package com.beans;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import io.github.flylib.containerx.beans.factory.XmlBeanFactory;





public class EmpApp {
    public static void main(String[] args) {
        Resource rs =  new ClassPathResource("config.xml");
//        XmlBeanFactory factory = new XmlBeanFactory(rs);

        
    }
}
