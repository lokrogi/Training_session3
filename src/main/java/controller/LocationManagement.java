package controller;

import model.Location;

import java.util.List;

public class LocationManagement {
    public void addLocation(Location location) {
        CsvWriter csvWriter = new CsvWriter();
        csvWriter.write(location);
    }

    public List<Location> getListOfAllLocations(){
        CsvReader csvReader = new CsvReader();
        return csvReader.read();
    }

}