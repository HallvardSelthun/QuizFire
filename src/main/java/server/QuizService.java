package server;

/**
 * Created by Hallvard on 18.09.2017.
 */

import javax.print.attribute.standard.Media;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Path("/quizzes")
public class QuizService {

    private static Map<String, Quiz> quizzes = new HashMap<>();

    @GET
    @Path("/{quizName}")
    @Produces(MediaType.APPLICATION_JSON)
    public Quiz getQuiz(@PathParam("quizName") String quizName) {
        if (!quizzes.containsKey(quizName)) {
            throw new NotFoundException("Fant ingen quiz med gitt navn");
        }
        return quizzes.get(quizName);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<Quiz> getQuizzes() {
        return quizzes.values();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void addQuiz(Quiz quiz) {
        quizzes.put(quiz.getName(), quiz);
    }

    @PUT
    @Path("/{quizName}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void addQuestion(@PathParam("quizName") String quizName,Question question){
        quizzes.get(quizName).addQuestion(question);
    }
/*
    public void addUserToQuiz(String quizName, Participant p){
        quizzes.get(quizName).addParticipant(p);
    }*/
}




