package com.waqar.problems;

public class RecursionFibonachi {
    
    public static void main(String[] args) {
        int findF = 8;

        System.out.println(fibonachi(8));
    }

    private static int calculateFibonachi(int previousNumer, int sum, int fibo,int findF) {

        if(fibo == findF){    
            return sum;
        }
        fibo++;
        int number = sum;
        sum = sum+previousNumer;
        sum = calculateFibonachi(number, sum,fibo,findF);
        return sum;
    }
    
    private static int fibonachi(int n) {

        if(n < 2){    
            return n;
        }
        return fibonachi(n-1)+fibonachi(n-2);
    }
}
