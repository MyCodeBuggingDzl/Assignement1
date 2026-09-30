package org.example;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class StudentList {

    private ArrayList<String> names;

    static void main() {
        StudentList sl = new StudentList();

        sl.addName("Ali");
        sl.addName("Sara");
        sl.addName("John");
    }

    public StudentList() {
        names = new ArrayList<>();
    }

    public void addName(String name) {
        names.add(name);
    }
}
