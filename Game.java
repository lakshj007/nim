public class Game {
    int totalPaperClips;
    Boolean win = false;
    int turns = 0;
    public Game(){
        totalPaperClips = 20;
    }
    // checks to see if there are 0 paper clips left
    public Boolean checkWin(){
        if(totalPaperClips <= 0){
            win = true;
        }
        else{
            win = false;
        }
        return win;
    }
    public String getPaperClips(){
        String total = "Total paper clips: " + totalPaperClips;
        return total;
    }
}
