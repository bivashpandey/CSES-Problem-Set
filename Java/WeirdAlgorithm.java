/*
* Problem: https://cses.fi/problemset/task/1068
* 
* @author  Bivash Pandey
*/

import java.util.Scanner;

public class WeirdAlgorithm{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();
        while(n!= 1){
            System.out.print(n + " ");
            n = (n%2 == 0)?n/2: 3*n + 1;
        }
        System.out.print(1);
    }
}
