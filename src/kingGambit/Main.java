package objectCommunicationsAndEvents.kingGambit;

import objectCommunicationsAndEvents.kingGambit.models.Footman;
import objectCommunicationsAndEvents.kingGambit.models.King;
import objectCommunicationsAndEvents.kingGambit.models.PersonImpl;
import objectCommunicationsAndEvents.kingGambit.models.RoyalGuard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        Server server = new Server();

        String kingName = bfr.readLine();
        PersonImpl king = new King(kingName);
        server.addCharacter(king);

        String[] royalGuardsNames = bfr.readLine().split(" ");
        for (String royalGuardsName : royalGuardsNames) {
            PersonImpl guard = new RoyalGuard(royalGuardsName);
            server.addCharacter(guard);
        }

        String[] footmenNames = bfr.readLine().split(" ");
        for (String footmenName : footmenNames) {
            PersonImpl footman = new Footman(footmenName);
            server.addCharacter(footman);
        }

        String[] input = bfr.readLine().split(" ");

        while (!input[0].equalsIgnoreCase("end")){
            server.processCommand(input);

            input = bfr.readLine().split(" ");
        }
    }
}
