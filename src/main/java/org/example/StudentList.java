package org.example;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class StudentList {

    private ArrayList<String> names;

    static void main() {
//        StudentList sl = new StudentList();
//
//        sl.addName("Ali");
//        sl.addName("Sara");
//        sl.addName("John");
//
//        sl.displayNames();
//
//        System.out.println(sl.contains("Sara"));

    }

    public StudentList() {
        names = new ArrayList<>();
    }

    public void addName(String name) {
        names.add(name);
    }

    public void displayNames() {
        for (String n: names) {
            System.out.println(n);
        }
    }

    public boolean contains(String name) {
        if (names.contains(name)) {
            return true;
        }
        return false;
    }

    public boolean remove(String name) {
        if (names.contains(name)) {
            names.remove(name);
            return true;
        }
        return false;
    }

    public int getNumberOfNames() {
        return names.size();
    }
}
