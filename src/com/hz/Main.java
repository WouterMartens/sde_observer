package com.hz;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        Teacher andries = new Teacher();

        HashMap<String, Student> students = getStudents();

        Student gianni = students.get("Gianni");
        andries.subscribe(gianni);

        while(true) {
            andries.teach();

            String input = Console.readLine();
            if (input.length() >= 2) {
                String command = Console.getWords(input)[0];
                String name = Console.getWords(input)[1];
                Student student = students.get(name);

                if (!students.containsKey(name)) {
                    switch (command) {
                        case "add":
                            andries.subscribe(student);
                            break;
                        case "remove":
                            andries.unsubscribe(student);
                            break;
                        default:
                            Console.writeLine("No such command.");
                    }
                } else {
                    Console.writeLine("Try using 'add/remove name'.");
                }
            }
        }
    }

    private static HashMap<String, Student> getStudents(){

        HashMap<String, Student> students = new HashMap<>();

        students.put("Gianni", new Gianni());
        students.put("Wouter", new Wouter());

        return students;
    }
}
