package com.iset.activite_liste_v3;

public class User {
    public String name;
    public String hometown;

    public User(String name, String hometown){
        this.name = name;
        this.hometown = hometown;
    }

    public String getName() {
        return name;
    }

    public String getHometown() {
        return hometown;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }


}
