package com.company;

public class Geolocation {
    private Double latitude;
    private Double longitude;

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Geolocation(Double latitude, Double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String showMap(int zoomLevel){
//        https://www.google.com/maps/place/49.46800006494457,17.11514008755796/@49.46800006494457,17.11514008755796,7z
        String url = "https://www.google.com/maps/place/";
        url = url+latitude+","+longitude+"/@"+latitude+","+longitude+","+zoomLevel+"z";
        return url;
    }
}
