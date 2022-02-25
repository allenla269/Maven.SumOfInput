import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int numInput = in.nextInt();
            int sum = 0;
            for (int i = 1; i <= numInput; i++) {
                sum += i;
            }
            System.out.println("The sum of all numbers from 1 to " + numInput + " is " + sum);
        }
    }
