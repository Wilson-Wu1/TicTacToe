import java.util.Scanner;
// need to fix bug where we continue playing after an old taken row + new col = prooceed. it need to restart so fix your if statements
public class Main {

    int[] array1 = {0,0,0};
    int[] array2 = {0,0,0};
    int[] array3 = {0,0,0};

    public void table(){

        System.out.println("  | |  ");
        System.out.println ("--+ +--");
        System.out.println ("       ");
        System.out.println("--+ +--");
        System.out.println("  | |  ");

        System.out.println();
        System.out.println("New game has started!");



    }

    public void startGame() {
        Scanner input = new Scanner(System.in);
        System.out.println("Go Player 1. Enter a Row (1 or 2 or 3)");
        int playerRow1 = input.nextInt();



        boolean valid = false;
        while(valid == false)
        {
            while (!((playerRow1==1) || playerRow1==2|| playerRow1==3)) {
                System.out.println("Invalid choice, please try again!");
                playerRow1 = input.nextInt();
            }

            System.out.println("Player 1. Enter a Column (1 or 2 or 3)");
            int playerCol1 = input.nextInt();

            while (!((playerCol1==1 || playerCol1==2|| playerCol1==3))) {
                System.out.println("Invalid choice, please try again!");
                playerCol1 = input.nextInt();
            }
            // change our
            int j = playerCol1-1;

            if(playerRow1==1){
                if(array1[j]!=1) {
                    array1[j] = 1;
                    valid = true;
                }
                else{
                    System.out.println("This spot is already taken!");
                }
            }
            if(playerRow1==2){
                if(array2[j]!=1) {
                    array1[j] = 1;
                    valid = true;
                }
                else{
                    System.out.println("This spot is already taken!");
                }
            }
            if(playerRow1==2){
                if(array3[j]!=1) {
                    array1[j] = 1;
                    valid = true;
                }
                else{
                    System.out.println("This spot is already taken!");
                }
            }

        }

        System.out.println("Player 2, Enter a Row (1 or 2 or 3)");
        int playerRow2 = input.nextInt();

        boolean valid2 = false;
        while(valid2 == false)
        {
            while (!((playerRow2==1) || playerRow2==2|| playerRow2==3)) {
                System.out.println("Invalid choice, please try again!");
                playerRow2 = input.nextInt();
            }

            System.out.println("Player 2. Enter a Column (1 or 2 or 3)");
            int playerCol2 = input.nextInt();

            while (!((playerCol2==1 || playerCol2==2|| playerCol2==3))) {
                System.out.println("Invalid choice, please try again!");
                playerCol2 = input.nextInt();
            }
            // change our
            int i = playerCol2-1;

            if(playerRow2==1){
                if(array1[i]!=1) {
                    array1[i] = 1;
                    valid2 = true;
                }
                else{
                    System.out.println("This spot is already taken!");
                    System.out.println("Player 2, Enter a Row (1 or 2 or 3)");
                    playerRow2 = input.nextInt();
                }
            }
            if(playerRow2==2){
                if(array2[i]!=1) {
                    array1[i] = 1;
                    valid2 = true;
                }
                else{
                    System.out.println("This spot is already taken!");
                    System.out.println("Player 2, Enter a Row (1 or 2 or 3)");
                    playerRow2 = input.nextInt();
                }
            }
            if(playerRow2==2){
                if(array3[i]!=1) {
                    array1[i] = 1;
                    valid2 = true;
                }
                else{
                    System.out.println("This spot is already taken!");
                    System.out.println("Player 2, Enter a Row (1 or 2 or 3)");
                    playerRow2 = input.nextInt();
                }
            }

        }


    }

    public static void main(String[] args){

        Main newgame = new Main();
        newgame.table();
        newgame.startGame();











    }
}
