package org.myname;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {
        String name = "Yelyzaveta";
        String lastName = "Buhaychuk";

        Person person = new Person(name, lastName);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(person);

        System.out.println(json);

    }
}