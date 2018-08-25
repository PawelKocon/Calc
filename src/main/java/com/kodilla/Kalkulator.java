package com.kodilla;

import java.util.*;
import java.lang.*;
import java.io.*;

class SimpleCalculator

    double a;
    double b;
{
    public int plus(int a, int b) {
        return a + b;
    }

    public int minus(int a, int b) {
        return a - b;
    }
}

class Application
{
    public static void main(String[] args) {

        SimpleCalculator calculator = new SimpleCalculator();

    }
}