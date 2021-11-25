package Challenges;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;


interface PerformOperation {
    public boolean check(int a);
}

class MyMath {
    public static boolean checker (PerformOperation p, int num){
        return p.check(num);
    }

    public PerformOperation isOdd(){
        PerformOperation p  = (int a) -> {
            return a%2!=0;
        };

        return p;
    }


    public PerformOperation isPrime(){
        PerformOperation p = (int a) -> {
            BigInteger num = BigInteger.valueOf(a);
            return num.isProbablePrime(1);
        };

        return p;
    }

    public PerformOperation isPalindrome(){
        PerformOperation p = (int a) -> {
            String temp = String.valueOf(a);
            StringBuilder builder = new StringBuilder(temp);
            String rev = builder.reverse().toString();
            int res = Integer.parseInt(rev);

            return a==res;
        };
        return p;
    }
}

class Solution {
    public static void main(String args[]) throws NumberFormatException, IOException{
    MyMath ob = new MyMath();
    PerformOperation op;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    boolean res = false;
    String ans = null;
    System.out.print("Number of operations: ");
    int counter  = Integer.parseInt(reader.readLine());

    while(counter-- > 0){
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int operation = Integer.parseInt(tokenizer.nextToken());
        int number = Integer.parseInt(tokenizer.nextToken());

        switch(operation){
            case 1:
                op = ob.isOdd();
                res = MyMath.checker(op, number);
                ans = res? "ODD":"EVEN";
                break;

            case 2:
                op = ob.isPrime();
                res = MyMath.checker(op, number);
                ans = res? "PRIME":"COMPOSITE";
                break;

            case 3:
                op = ob.isPalindrome();
                res = MyMath.checker(op, number);

                ans = res? "PALINDROME":"NOT PALINDROME";

        }

        System.out.println(ans);
    }
}
}