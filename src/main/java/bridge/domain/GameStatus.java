package bridge.domain;

public class GameStatus {
    private boolean isCorrect;
    private int gameCount;


    public void setMatchCorrect(boolean isCorrect){
        this.isCorrect = isCorrect;
    }

    public boolean getMatchCorrect(){
        return this.isCorrect;
    }

    public void addGameCount(){
        this.gameCount += 1;
    }

    public Integer getGameCount(){
        return this.gameCount;
    }
}
