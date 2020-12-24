/*
* Problem: https://cses.fi/problemset/task/1094/
* 
* @author  Bivash Pandey
*/

import java.util.*;

public class IncreasingArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        int[] tempArr = new int[n];
        long turns = 0;
        int prev = 0;
        for(int i=0; i<n; i++) {
            arr[i] = input.nextInt();
            if(arr[i] > prev) prev = arr[i];
            tempArr[i] = prev;
        }
        for(int i=0; i<n; i++) {
            turns += tempArr[i]-arr[i];
        }
        System.out.println(turns);
    }
}