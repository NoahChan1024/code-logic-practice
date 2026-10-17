import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] pAns = {"Paper", "Scissor", "Stone"};
        String[] cAns = {"Paper", "Scissor", "Stone"};

        while (true) {
            int rand = (int) (Math.random() * 3);
            System.out.print("0:Paper 1:Scissor 2:Stone 3:Exit? ");
            int check = input.nextInt();

            if (check == 3) {
                System.out.println("Bye Bye!");
                break;
            } else if (check == rand) {
               
               
                System.out.println("You choose " + pAns[check] + " VS CPU choose " + cAns[rand]);
                System.out.println("It is Draw");
                continue;
            }

            System.out.println("You choose " + pAns[check] + " VS CPU choose " + cAns[rand]);


            if ((check == 0 && rand == 2) || (check == 1 && rand == 0) || (check == 2 && rand == 1)) {
                System.out.println("You win");
            } else {
                System.out.println("You Lose");
            }
        }
        input.close();
    }
}
