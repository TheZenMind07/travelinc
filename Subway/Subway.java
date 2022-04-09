package travelinc.Subway;

import java.util.LinkedList;
import java.util.List;

public class Subway {
    private List stations, connections;
    public Subway(){
        stations = new LinkedList();
        connections = new LinkedList();
    }

    public void addStation(String st){
        if(!this.hasStation(st)){
            stations.add(new Station(st));
        }
    }

    public boolean hasStation(String st){
        return stations.contains(new Station(st));
    }

    public void addConnection(String st1, String st2, String line){
        if(this.hasStation(st1) && this.hasStation(st2)){
            Station one = new Station(st1);
            Station two = new Station(st2);
            connections.add(new Connection(one, two, line));
            connections.add(new Connection(two, one, line));
        }   
        else {
            throw new RuntimeException("Invalid connection");
        }
    }

}
