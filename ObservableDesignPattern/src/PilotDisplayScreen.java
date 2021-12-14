public class PilotDisplayScreen implements IObserver{

    WeatherStation observableObj;

    public PilotDisplayScreen(){
        observableObj=null;
    }
    public PilotDisplayScreen(WeatherStation observableObj){
        this.observableObj=observableObj;
    }

    @Override
    public void update() {
        System.out.println("Pilot display: Old wind speed value: "+observableObj.getOldWindSpeedValue()+
                " new wind speed value: "+ observableObj.getWindSpeedValue());
    }
}
