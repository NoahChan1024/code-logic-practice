import java.util.Scanner;

public class NumTree {
    public static void main(String[] args) {
        int i ,j = 1;
        Scanner input = new Scanner(System.in);

        System.out.print("Number? ");
        i = input.nextInt();


        while(j <= i){
           for(int k = 1; k <= j; k++){
               System.out.print(k);
           }

           System.out.println();
           j++;
        }


    }
}
