package org.campus02;

import java.util.ArrayList;

public class NameRegister {

    private ArrayList<String> names;

    public void addName(String name) {
        if (names == null) {
            names = new ArrayList<>();
        }
        names.add(name); // !!!!!!!!!!!
    }

    public static void main(String[] args) {
        NameRegister nr = new NameRegister();
        nr.addName("max");
    }
}
