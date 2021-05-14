package Template.main;

import Template.clase.Spectator;
import Template.clase.SpectatorAbstract;
import Template.clase.SpectatorVIP;

public class Main {
    public static void main(String[] args) {

        SpectatorAbstract spectator=new Spectator("Ion");
        SpectatorAbstract spectatorVIP= new SpectatorVIP("Marian");

        spectator.intrareInStadion();
        spectatorVIP.intrareInStadion();
    }
}
