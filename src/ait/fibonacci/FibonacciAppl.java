package ait.fibonacci;

import ait.fibonacci.model.Fibonacci;

public class FibonacciAppl {
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci(8);
        // TODO print all numbers, and calculate sum
        // 1,1,2,3,5,8,13,21
        // sum = 54
        int sum = 0;
        for (Integer num : fibonacci) {
            sum += num;
            System.out.println(num);
        }
        System.out.println("sum = "+sum);
    }
}