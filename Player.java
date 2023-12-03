public class Player{
    String name;
    int numRemoved;
    public Player(String name){
        this.name = name;
    }
    // removes paper clips depending on user input
    public void removePaperClips(int remove, Game game){
        this.numRemoved = remove;
        // System.out.println("in player");
        if(remove <= game.totalPaperClips/2 || remove -game.totalPaperClips == 0){
            if(remove - game.totalPaperClips == 0){
                game.totalPaperClips = 0;
                game.checkWin();
            }
            game.totalPaperClips -= remove;
            game.turns += 1;
            game.checkWin();
        }
    }
}
