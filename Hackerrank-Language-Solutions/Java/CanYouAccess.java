package Challenges;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CanYouAccess {
    public static void main(String args[]) throws NumberFormatException, IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Number: ");
        int num = Integer.parseInt(reader.readLine());

        Object o = ((new Inner()).new Private());

        System.out.println(num  + " is " + (((CanYouAccess.Inner.Private)o).powerof2(num)));
        System.out.println("o belongs to class " + o.getClass().getCanonicalName());


    }

    static class Inner {
        private class Private {
            private String powerof2(int num) {
                return ((num&num-1) == 0? "power of 2":"not power of 2");
            }
        }
    }
}
