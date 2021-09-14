import java.util.Date;
public class WeatherReading {
    private double latitude;
    private double longitude;
    private Date recordedAt;
    private double tempInCelsius;
    public static double kelvinToCelsius(double kelvin){
        return kelvin - 273.15;
    }

    public double getTempInCelsius() {
        return tempInCelsius;
    }

    public void setTempInCelsius(double tempInCelsius) {
       this.tempInCelsius = kelvinToCelsius(tempInCelsius);
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public Date getRecordedAt() {
        return recordedAt;
    }

    public void setRecordedAt(Date recordedAt) {
        this.recordedAt = recordedAt;
    }

    public WeatherReading(double tempInCelsius) {
        this.tempInCelsius = tempInCelsius;
    }

    public WeatherReading(double latitude, double longitude, Date recordedAt, double tempInKelvin) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.recordedAt = recordedAt;
        this.tempInCelsius = kelvinToCelsius(tempInKelvin);
    }

    public static void main(String[] args) {
        double latitude = -98.4936;
        double longitude = 29.4241;
        Date recordedAt = new Date();
        double tempInKelvin = 300;
        WeatherReading wr = new WeatherReading(latitude, longitude, recordedAt, tempInKelvin);
        System.out.printf("%.2f%n",wr.getTempInCelsius());
        System.out.printf("%s%n%s%n%s%n%s",wr.latitude,wr.longitude,wr.recordedAt,wr.tempInCelsius);
    }
}
