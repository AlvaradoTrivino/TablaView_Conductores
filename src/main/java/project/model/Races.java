package project.model;


public class Races {
    private int raceID;
    private int year;
    private int round;
    private int circuitid;
    private String name;
    private String date;
    private String time;
    private String url;

    

    public Races(int raeID, int yar, int rond, int circitid, String nme, String dte, String tme, String ul) {
        this.raceID = raeID;
        this.year = yar;
        this.round = rond;
        this.circuitid = circitid;
        this.name = nme;
        this.date = dte;
        this.time = tme;
        this.url = ul;
    }


    public int getRaceID() {
        return raceID;
    }
    public void setRadeID(int radeID) {
        this.raceID = radeID;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getRound() {
        return round;
    }
    public void setRound(int round) {
        this.round = round;
    }
    public int getCircuitid() {
        return circuitid;
    }
    public void setCircuitid(int circuitid) {
        this.circuitid = circuitid;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    
}
