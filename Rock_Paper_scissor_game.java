import java.util.Scanner;
import java.util.Random;

public class Rock_Paper_scissor_game {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.print("Enter Your Strength: ");
        int u = src.nextInt();
        switch (u) {
            case 0 -> System.out.println("Stone");
            case 1 -> System.out.println("paper");
            case 2 -> System.out.println("Scissors");
        }

        Random r = new Random();
        int com_num = r.nextInt(2);
        System.out.print("Computer Strength: ");

        switch (com_num) {
            case 0 -> System.out.println("Stone");
            case 1 -> System.out.println("paper");
            case 2 -> System.out.println("Scissors");
        }
        if (u==0 && com_num==1 ||u==1 && com_num==2 || u==2 && com_num==0) {

            System.out.println("You Loss ! Computer Won");
        }
        else if (u==com_num){
            System.out.println("Draw the Match");
        }
        else {
            System.out.println(" Congratulation! You Won");
        }
    }

}
