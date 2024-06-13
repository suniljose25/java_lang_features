package records.ex1;

import java.util.Objects;

class GPSPointAsClass {
    private final double latitude;
    private final double longitude;

    public GPSPointAsClass(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double latitude() {
        return latitude;
    }

    public double longitude() {
        return longitude;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GPSPointAsClass that)) return false;
        return Double.compare(latitude, that.latitude) == 0 && Double.compare(longitude, that.longitude) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(latitude, longitude);
    }

    @Override
    public String toString() {
        return "GPSPointAsClass{" +
                "latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}

record GPSPointAsRecord(double latitude, double longitude) {
}

public class Records {
    public static void main(String[] args) {
        GPSPointAsClass gpsPointAsClass = new GPSPointAsClass(4, 5);
        System.out.printf("point: %f, %f\n", gpsPointAsClass.latitude(), gpsPointAsClass.longitude());
        System.out.println(gpsPointAsClass);

        GPSPointAsRecord gpsPointAsRecord = new GPSPointAsRecord(4, 5);
        System.out.printf("point: %f, %f\n", gpsPointAsRecord.latitude(), gpsPointAsRecord.longitude());
        System.out.println(gpsPointAsRecord);

        /*
            Records are immutable so
             gpsPointAsRecord.setLatitude
         */


    }
}
