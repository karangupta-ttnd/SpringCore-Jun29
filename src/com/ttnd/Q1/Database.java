package com.ttnd;

/**
 * Created by karan on 12/7/17.
 */
public class Database {

    private int port;
    private String name;

    @Override
    public String toString() {
        return "Database{" +
                "port=" + port +
                ", name='" + name + '\'' +
                '}';
    }

    public void setPort(int port) {
        this.port = port;
    }

    public void setName(String name) {
        this.name = name;
    }
}
