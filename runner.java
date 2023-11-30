import java.util.Scanner;
public class runner {
    public static void main(String[] args) {
        System.out.println("Hello! Welcome to the game of nim! Today, you will be playing against a computer. There are 20 total pieces on the board.");
        System.out.println("Total paper clips: 20");
        Player player1 = new Player("player1");
        Game game1 = new Game();
        Computer computer1 = new Computer();


        Scanner sc = new Scanner(System.in);
        while(game1.win == false){
        Boolean win1 = game1.checkWin();
        if(win1 == true){
            continue;
        }
        if(game1.turns%2 == 0){
            System.out.println("Computer's turn!");
            computer1.calculate(game1);
        }
        else{
            System.out.println("Your turn!");
            if(game1.totalPaperClips == 1){
                System.out.println("The max you can take out is: 1");

            }
            else{
            System.out.println("The max you can take out is: " + game1.totalPaperClips/2);
            }
            System.out.println("Enter how many you would like to take: ");
            int numTake = sc.nextInt();
            player1.removePaperClips(numTake, game1);
        }
        }
        System.out.println("The game is over!");
        if(game1.turns %2 == 0){
            System.out.println("Computer wins!");
        }
        else{
            System.out.println("You win!");
        }

    }
        // computer1.calculate(game1);
        // computer1.calculate(game1);
        // computer1.calculate(game1);
        // computer1.calculate(game1);
        // computer1.calculate(game1);
        // computer1.calculate(game1);
        // computer1.calculate(game1);
        // computer1.calculate(game1);


    }

