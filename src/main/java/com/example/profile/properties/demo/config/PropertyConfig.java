package com.example.profile.properties.demo.config;

import com.example.profile.properties.demo.examplebeans.DummyDataSource;
import com.example.profile.properties.demo.examplebeans.JmsBroker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class PropertyConfig {
    @Value("${guru.username}")
    String user;
    @Value("${guru.password}")
    String password;
    @Value("${guru.jms.UserName}")
    String jmsUser;
    @Value("${guru.jms.Password}")
    String jmsPassword;
    @Bean
    public DummyDataSource dummyDataSource(){

        DummyDataSource dummyDataSource=new DummyDataSource();

        dummyDataSource.setUser(user);
        dummyDataSource.setPaasword(password);
        return dummyDataSource;
    }

    @Bean
    public JmsBroker jmsBroker(){

        JmsBroker jmsBroker=new JmsBroker();
        jmsBroker.setJmsUser(jmsUser);
        jmsBroker.setJsmPassword(jmsPassword);
        return jmsBroker;
    }
}
