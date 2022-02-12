package io.aditya.covidtracker.model;

public class LocationStats {
    
    private String state;
    private String country;
    private long LatestTotalCases;
    private long diffFromPrevDay;

    public long getDiffFromPrevDay() {
        return diffFromPrevDay;
    }
    public void setDiffFromPrevDay(long diffFromPrevDay) {
        this.diffFromPrevDay = diffFromPrevDay;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public long getLatestTotalCases() {
        return LatestTotalCases;
    }
    public void setLatestTotalCases(long latestTotalCases) {
        LatestTotalCases = latestTotalCases;
    }
    @Override
    public String toString() {
        return "LocationStats [LatestTotalCases=" + LatestTotalCases + ", country=" + country + ", state=" + state
                + "]";
    } 

    
}
