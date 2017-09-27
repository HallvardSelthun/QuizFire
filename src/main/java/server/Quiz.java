package server;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Hallvard on 18.09.2017.
 */
public class Quiz {
    private String name;
    private ArrayList<Question> questions;
    private int questionTime;
    private int qAmount;
    private String startDay;
    private String startTime;
    private String endTime;

    public Quiz(){

    }
   /* public String getRemainingTime(){
        Date startDate = new Date(startDay+"T"+startTime+":00+02:00");
        Date now = new Date();
        Date remaining = new Date((startDate.getTime())-(now.getTime()));
        return ""+remaining.getSeconds();
    }
*/
    public String getStartDay() {
        return startDay;
    }

    public void setStartDay(String startDay) {
        this.startDay = startDay;
    }

    public int getqAmount() {
        return qAmount;
    }

    public void setqAmount(int qAmount) {
        this.qAmount = qAmount;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }


    public int getQuestionTime() {
        return questionTime;
    }
    public void addQuestion(Question q){
        questions.add(q);
    }

    public void setQuestionTime(int questionTime) {
        this.questionTime = questionTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<Question> questions) {
        this.questions = questions;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }
}
