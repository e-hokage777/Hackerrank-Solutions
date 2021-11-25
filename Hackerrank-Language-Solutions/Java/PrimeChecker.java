import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import static java.lang.System.in;

class Prime{
    public void checkPrime(int...nums){

        ArrayList<Integer> primes = new ArrayList<Integer>();
        int counter = 0;
        for(int n : nums){
            BigInteger bigN = BigInteger.valueOf(n);
            if(bigN.isProbablePrime(5) == true){
                int prime = bigN.intValue();
                primes.add(prime);
        }
    }

    if(primes.size() > 0){
    for(int n : primes){
        if(counter == primes.size()-1){
            System.out.print(n);
        }
        else{
            System.out.print(n + " ");
        }
    

    counter++;
}
System.out.println();
    }
    else{
        System.out.println();
    }
    }

}

public class PrimeChecker {
    public static void main(String args[]) throws IOException{

        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        System.out.println("Enter five numbers: ");    
        int n1 = Integer.parseInt(reader.readLine());
        int n2 = Integer.parseInt(reader.readLine());
        int n3 = Integer.parseInt(reader.readLine());
        int n4 = Integer.parseInt(reader.readLine());
        int n5 = Integer.parseInt(reader.readLine());

        Prime prime = new Prime();

        prime.checkPrime(n1);
        prime.checkPrime(n1,n2);
        prime.checkPrime(n1,n2,n3);
        prime.checkPrime(n1,n2,n3,n4,n5);
    }
    
}
