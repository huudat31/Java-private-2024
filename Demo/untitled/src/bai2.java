import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        String name = (new Scanner(System.in)).nextLine();
        int result = 1;
        for(int i = 0; i < name.length(); i++){
            result = result * (name.charAt(i) - '0' );
        }
        System.out.println(result);
    }
}
