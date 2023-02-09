package com.yoursoft.creational.singleton;

public class Main {

    public static void main(String[] args) {

        for(int index = 0; index < 3 ; index++){
            System.out.println(String.format("Process number %s",index));
            Process process = new Process();
            process.run();
        }

    }
}
