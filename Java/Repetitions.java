/*
* Problem: https://cses.fi/problemset/task/1069
* 
* @author  Bivash Pandey
*/

import java.util.*;

public class Repetitions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String dna = input.next();
        int max_length = 1;
        int count = 1;
        for(int i=0; i<dna.length()-1; i++) {
            if(dna.charAt(i+1) == dna.charAt(i)) count++;
            else count = 1;
            if(count > max_length) max_length = count;
        }
        System.out.println(max_length);
    }
}