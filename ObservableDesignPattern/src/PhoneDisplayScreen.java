public class PhoneDisplayScreen implements IObserver{

    WeatherStation observableObj;

    public PhoneDisplayScreen(){
        observableObj=null;
    }
    public PhoneDisplayScreen(WeatherStation observableObj){
        this.observableObj=observableObj;
    }
    @Override
    public void update() {
        System.out.println("Phone display: Old wind speed value: "+observableObj.getOldWindSpeedValue()+
                " new wind speed value: "+ observableObj.getWindSpeedValue());
    }
}
