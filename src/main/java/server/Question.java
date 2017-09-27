package server;


import java.util.ArrayList;

/**
 * Created by Hallvard on 18.09.2017.
 */


public class Question {
    private String questionName;
    private ArrayList<String> alternatives;
    private int corrAlt;

    public Question(){}

    public String getQuestionName() {
        return questionName;
    }

    public void setQuestionName(String name) {
        this.questionName= name;
    }

    public ArrayList<String> getAlternatives() {
        return alternatives;
    }

    public void setAlternatives(ArrayList<String> alternatives) {
        this.alternatives = alternatives;
    }

    public int getCorrAlt() {
        return corrAlt;
    }

    public void setCorrAlt(int corrAlt) {
        this.corrAlt = corrAlt;
    }
}
