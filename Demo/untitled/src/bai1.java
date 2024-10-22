import java.util.Scanner;

public class bai1 {
    public static void test(int number, int bit) {
        if(bit == 2 ){
            while(number > 0){
                System.out.print(number % 2);
                number = number / 2;
            }
        }
        else if(bit == 8){
            while(number > 0){
                System.out.print(number % 8);
                number = number / 8;
            }
        }
        else if(bit == 16){
            while(number > 0){
                if((number % 16) <= 9 ){
                    System.out.print(number % 16);
                };
                 if(number % 16 == 10){
                    System.out.print("A");
                }
                 if(number % 16 == 11){
                    System.out.print("B");
                }
                 if(number % 16 == 12){
                    System.out.print("C");
                }
                if(number % 16 == 13){
                    System.out.print("D");

                }
                 if(number % 16 == 14){
                    System.out.print("E");
                }
                else{
                    System.out.print("F");
                }
                number = number / 16;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int bit = sc.nextInt();
        test(number,bit);

    }
}