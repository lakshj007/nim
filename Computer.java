import java.lang.Math;
public class Computer {
    int numRemoved;
    String name;
    public Computer(){
        this.name = "Computer";
    }
    // removes paper clips depending on how many there are
    public void removePaperClips(int remove, Game game){
        // System.out.println("numRemoved: " + numRemoved + " and game.totalPaperClips/2: " + game.totalPaperClips/2);
        if(numRemoved <= game.totalPaperClips/2){
            game.totalPaperClips -= remove;
            game.turns += 1;
            System.out.println("Turns: " + game.turns);
        }
        game.checkWin();
        System.out.println(game.getPaperClips());
    }
    public int calculate(Game game){
        if(game.totalPaperClips == 0){
            return 0;
        }
        if(game.turns == 0){
            numRemoved = 10;
            // System.out.println("in first if");
            removePaperClips(numRemoved, game);
            return numRemoved;
        }
        else if(game.totalPaperClips == 1){
            System.out.println("Turns: " + (game.turns+1));
            System.out.println("Total paper clips: 0");
            game.win = true;
            return numRemoved;
        }
        else{
            int rand = (int)(Math.random()*(game.totalPaperClips/2));
            if(rand == 0){
                rand = 1;
            }
            // System.out.println("rand gen " + rand);
            numRemoved = rand;
            removePaperClips(numRemoved, game);
            return numRemoved;
        }

    }
}
