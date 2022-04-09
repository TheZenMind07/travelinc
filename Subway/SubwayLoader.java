package travelinc.Subway;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class SubwayLoader {
    private Subway subway;

    public SubwayLoader(){
        this.subway = new Subway();
    }

    public Subway loadFromFile(File subwayFile) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(subwayFile));

        loadStations(subway, reader);
        String lineName = reader.readLine();
        while(lineName != null && lineName.length() > 0){
            loadLines(subway, reader, lineName);
            lineName = reader.readLine();
        }

        return subway;
    }

    public void loadLines(Subway subway, BufferedReader reader, String lineName) throws IOException{
        String stationOneName = reader.readLine();
        String stationTwoName = reader.readLine();
        while(stationOneName != null && stationTwoName != null && stationOneName.length() > 0 && stationTwoName.length() > 0){
            subway.addConnection(stationOneName, stationTwoName, lineName);
            stationOneName = stationTwoName;
            stationTwoName = reader.readLine();
        }
    }

    public void loadStations(Subway subway, BufferedReader reader) throws IOException{
        String currentLine;
        currentLine = reader.readLine();
        while(currentLine.length() > 0){
            subway.addStation(currentLine);
            currentLine = reader.readLine();
        }
    }

} 
