import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import static java.util.Collections.sort;

public class bai3 {
    public static void main(String[] args) {
        // create new arraylist
        ArrayList<Integer> intergerarrays = new ArrayList<Integer>();
        for(int i = 0;i< 5;i++){
            int number = (new Scanner(System.in)).nextInt();
            intergerarrays.add(number);
        }
        Collections.sort(intergerarrays);
        System.out.print(intergerarrays.get(3) +" ");
        System.out.println(intergerarrays.get(4));
    }
}
