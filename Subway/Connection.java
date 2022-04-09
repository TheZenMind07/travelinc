package travelinc.Subway;

public class Connection {
    private Station stationOne, stationTwo;
    private String lineName;
    
    public Connection(Station stationOne, Station stationTwo, String line ){
        this.stationOne = stationOne;
        this.stationTwo = stationTwo;
        this.lineName = line;
    }

    public Station getStationOne(){
        return stationOne;
    }

    public Station getStationTwo(){
        return stationTwo;
    }

    public String getLineName(){
        return lineName;
    }

    public boolean equals(Connection conn){
        if(this.stationOne.equals(conn.getStationOne()) && this.stationTwo.equals(conn.getStationTwo()) && this.getLineName().equalsIgnoreCase(conn.getLineName()))
            return true;
        return false;
    }

}
