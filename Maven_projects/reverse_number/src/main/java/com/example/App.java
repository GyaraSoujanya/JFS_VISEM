package com.example;

public class App 
{
    public static void main(String[] args) 
    {
        int num = 12345;  // number to reverse
        int reversed = 0;
        int original = num;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        System.out.println("Original Number: " + original);
        System.out.println("Reversed Number: " + reversed);
    }
}

