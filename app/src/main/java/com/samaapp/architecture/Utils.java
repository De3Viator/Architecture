package com.samaapp.architecture;

import java.util.ArrayList;

public class Utils {
    public ArrayList <UserModels> users;

    public ArrayList<UserModels> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<UserModels> users) {
        this.users = users;
    }

    public Utils (){
        users = new ArrayList <> ();
        users.add(new UserModels("password 1","login1"));
        users.add(new UserModels("password 2","login1"));
        users.add(new UserModels("password 3","login1"));
        users.add(new UserModels("password 4","login1"));
        users.add(new UserModels("password 5","login1"));
        users.add(new UserModels("password 6","login1"));


    }


}