package server;
import com.sun.net.httpserver.HttpServer;
import java.io.IOException;



import javax.print.attribute.standard.Media;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Path("/participants")
public class ParticipantService {
    private static Map<String, Participant> participants = new HashMap<>();

    @GET
    @Path("/{nick}")
    @Produces(MediaType.APPLICATION_JSON)
    public Participant getParticipant(@PathParam("nick") String nick) {
        if (!participants.containsKey(nick)) {
            throw new NotFoundException("No participant with given nick");
        }
        return participants.get(nick);
    }


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<Participant> getParticipants() {
        return participants.values();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void addParticipant(Participant participant) {

        participants.put(participant.getNickname(), participant);
    }

    @PUT
    @Path("/{nick}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void incrementScore (@PathParam("nick") String nick/*, String score*/) {
        if (!participants.containsKey(nick)) {
            throw new NotFoundException("Fant ingen bruker med gitt navn");
        } else {
            participants.get(nick).incrementScore(1);
        }

    }
}






