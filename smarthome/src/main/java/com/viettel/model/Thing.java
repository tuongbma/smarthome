package com.viettel.model;

import java.io.Serializable;

public class Thing implements Serializable {
    private int id;
    private String name;
    private String loc;
    private String status;

    public Thing(int id, String name, String loc, String status) {
        this.id = id;
        this.name = name;
        this.loc = loc;
        this.status = status;
    }

    public Thing() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o){
        if(o instanceof Thing){
            Thing temp = (Thing) o;
            if(temp.getId() == this.getId()) return true;
        }
        return false;
    }
}
