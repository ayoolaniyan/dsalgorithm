package com.example.helloworld;

public class Arithmetics {

    public int sumUp(int input) {
        var result = 0;
        for (int i = 0; i <= input; i++) {
            result = result + i;
        }
        return result;
    }
}
