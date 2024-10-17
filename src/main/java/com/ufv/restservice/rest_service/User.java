package com.ufv.restservice.rest_service;

import java.util.Arrays;

public class User {
    private String name;
    private String email;
    private String []_roles;
    private boolean admin;

    public User(String name, String email, String[] _roles, boolean admin) {
        this.name = name;
        this.email = email;
        this._roles = _roles;
        this.admin = admin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String[] get_roles() {
        return _roles;
    }

    public void set_roles(String[] _roles) {
        this._roles = _roles;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", _roles=" + Arrays.toString(_roles) +
                ", admin=" + admin +
                '}';
    }
}
