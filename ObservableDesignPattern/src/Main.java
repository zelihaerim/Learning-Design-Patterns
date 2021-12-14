public class Main {
    public static void main(String[] args) {
        // Create objects
        WeatherStation observable = new WeatherStation(20);
        PhoneDisplayScreen phone=new PhoneDisplayScreen(observable);
        PilotDisplayScreen pilot=new PilotDisplayScreen(observable);
        WebDisplayScreen web=new WebDisplayScreen(observable);
        // add observers to observable object list.

        observable.add(phone);
        observable.add(pilot);
        observable.add(web);
        // Cahnge wind speed and automatically observers values will change.
        observable.changeWindSpeed(25);

    }
}
