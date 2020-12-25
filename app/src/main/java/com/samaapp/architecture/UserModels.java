package com.samaapp.architecture;

public class UserModels {
    private String password;
    private String login;

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public UserModels(String password,String login) {
        this.password = password;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

