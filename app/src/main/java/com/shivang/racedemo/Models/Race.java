package com.shivang.racedemo.Models;

public class Race
{
    private String Race_name;
    private String Race_organizer;
    private String Race_guntime;
    private String Race_laps;
    private String Race_type;
    private String Race_distance;
    private String Race_associated;

    public Race(String race_name, String race_organizer, String race_guntime, String race_laps, String race_type, String race_distance, String race_associated) {
        Race_name = race_name;
        Race_organizer = race_organizer;
        Race_guntime = race_guntime;
        Race_laps = race_laps;
        Race_type = race_type;
        Race_distance = race_distance;
        Race_associated = race_associated;
    }

    public String getRace_name() {
        return Race_name;
    }

    public void setRace_name(String race_name) {
        Race_name = race_name;
    }

    public String getRace_organizer() {
        return Race_organizer;
    }

    public void setRace_organizer(String race_organizer) {
        Race_organizer = race_organizer;
    }

    public String getRace_guntime() {
        return Race_guntime;
    }

    public void setRace_guntime(String race_guntime) {
        Race_guntime = race_guntime;
    }

    public String getRace_laps() {
        return Race_laps;
    }

    public void setRace_laps(String race_laps) {
        Race_laps = race_laps;
    }

    public String getRace_type() {
        return Race_type;
    }

    public void setRace_type(String race_type) {
        Race_type = race_type;
    }

    public String getRace_distance() {
        return Race_distance;
    }

    public void setRace_distance(String race_distance) {
        Race_distance = race_distance;
    }

    public String getRace_associated() {
        return Race_associated;
    }

    public void setRace_associated(String race_associated) {
        Race_associated = race_associated;
    }
}
