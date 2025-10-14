package recordemo;

public record WeatherData(double temperatureCelsius, String conditions) {

    // Instance method to convert Celsius to Fahrenheit
    public double temperatureFahrenheit() {
        return (double) temperatureCelsius * 9 / 5 + 32;

    }

    // Instance method to get a formatted summary string
    public String getSummary() {
        String formattedString = String.format("Current Weather : %.2f°C( %.2f°F) and %s",temperatureCelsius,temperatureFahrenheit(),conditions);
        return formattedString;
    }

    // Static factory method to create a WeatherData record from Fahrenheit
    public static WeatherData fromFahrenheit(double tempFahrenheit, String conditions) {
        double temperatureCelcius =  5 * (tempFahrenheit - 32) / 9;
        return new WeatherData(temperatureCelcius,conditions);

    }

    public static void main(String[] args) {
        WeatherData weather1 = new WeatherData(25.0, "Sunny");
        System.out.print("Today's weather: ");
        System.out.println(weather1.getSummary());

        // create record using Fahrenheit ( factory method)
        System.out.print("Yesterday's weather: ");
        WeatherData weather2 = WeatherData.fromFahrenheit(77.0, "Cloudy");
        System.out.println(weather2.getSummary());

    }
}
