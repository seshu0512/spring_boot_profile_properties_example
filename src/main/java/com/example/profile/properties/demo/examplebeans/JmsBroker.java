package com.example.profile.properties.demo.examplebeans;

public class JmsBroker {
    private String jmsUser;
    private String jsmPassword;
    private String dbUrl;

    public String getDbUrl() {
        return dbUrl;
    }

    public void setDbUrl(String dbUrl) {
        this.dbUrl = dbUrl;
    }

    public String getJmsUser() {
        return jmsUser;
    }

    public void setJmsUser(String jmsUser) {
        this.jmsUser = jmsUser;
    }

    public String getJsmPassword() {
        return jsmPassword;
    }

    public void setJsmPassword(String jsmPassword) {
        this.jsmPassword = jsmPassword;
    }
}
