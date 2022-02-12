import java.util.*;
import java.util.stream.*;

public class DivisibleSumPairs {
    public static int divisibleSumPairs(int n, int k, List<Integer> ar){
        int counter = 0;
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n;j++){
                if(j == i)
                    continue;
                else if (i>j&& (ar.get(i)+ar.get(j))%k == 0)
                    counter++;
            }
        }

        return counter;
    }

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Length and Dividend: ");
        String nandk []  = input.nextLine().split(" ");
        int n = Integer.parseInt(nandk[0]);
        int k = Integer.parseInt(nandk[1]);

        System.out.print("Values: ");

        List<Integer> ar = Stream.of(input.nextLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt).collect(Collectors.toList());


        System.out.println(divisibleSumPairs(n,k,ar));
        input.close();

    }
}