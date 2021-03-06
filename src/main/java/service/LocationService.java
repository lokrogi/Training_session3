package service;

import dao.LocationDao;
import model.entity.Location;

import java.util.List;

public class LocationService {
    private static LocationDao locationDao = new LocationDao();

    public void addLocation(Location location) {
        locationDao.addLocation(location);
    }

    public List<Location> getListOfAllLocations(){
        LocationDao locationDao = new LocationDao();
        return locationDao.getAllLocations();
    }

    public void deleteLocation(Location location) {
        locationDao.deleteLocation(location);
    }

    public void updateLocation(Location location) {
        locationDao.updateLocation(location);
    }

}
