package server;

/**
 * Created by Hallvard on 18.09.2017.
 */
public class Participant {
    private String nickname;
    private int score;


    public Participant(){

    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    public void incrementScore(int score){
        this.score+=score;
    }

    public String getNickname() {
        return nickname;
    }


    public void setNickname(String nickname) {
        this.nickname = nickname;
    }


}
