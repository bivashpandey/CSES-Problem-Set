/*
* Problem: https://cses.fi/problemset/task/1083
* 
* @author  Bivash Pandey
*/

import java.util.*;

public class MissingNumber{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        String str = input.nextLine();
        List<Integer> list = new ArrayList<>();
        Arrays.asList(str.split(" ")).forEach(s -> list.add(Integer.parseInt(s)));
   
        Collections.sort(list);
        if(list.get(0) != 1) System.out.println(1);
        else if(list.get(n-2)!= n) System.out.println(n);
        else {
            for(int i=0; i<list.size(); i++) {
                if(i+1 != list.get(i)) {
                    System.out.println(i+1);
                    break;
                }
            }
        }
    }
}