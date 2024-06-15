package patternMatching.recordPatternMatching;

record GPSPoint(double latitude, double longitude) {
}

record Location(String name, GPSPoint gpsPoint) {
}

public class Main {
    public static void main(String[] args) {
        GPSPoint point = new GPSPoint(13.04, 80.17);
        Location chennaiLocation = new Location("Chennai", point);

        printName(chennaiLocation);
//        printNameWithRecordPattern1(chennaiLocation);
//        printNameWithRecordPattern2(chennaiLocation);
    }



    static void printName(Object object) {
        if (object instanceof Location location) {
            System.out.printf(
                    "Name: %s, Lat: %f, Lng: %f\n",
                    location.name(),
                    location.gpsPoint().latitude(),
                    location.gpsPoint().longitude()
            );
        }
    }



    static void printNameWithRecordPattern1(Object object) {
        if (object instanceof Location (String name, GPSPoint gpsPoint)) {
            System.out.printf(
                    "Name: %s, Lat: %f, Lng: %f\n",
                    name,
                    gpsPoint.latitude(),
                    gpsPoint.longitude()
            );
        }
    }


    static void printNameWithRecordPattern2(Object object) {
        if (object instanceof Location (String name, GPSPoint (double latitude, double longitude))) {
            System.out.printf(
                    "Name: %s, Lat: %f, Lng: %f\n",
                    name,
                    latitude,
                    longitude
            );
        }
    }
}
