public class WebDisplayScreen implements IObserver{

    WeatherStation observableObj;

    public WebDisplayScreen(){
        observableObj=null;
    }
    public WebDisplayScreen(WeatherStation observableObj){
        this.observableObj=observableObj;
    }



    @Override
    public void update() {
        System.out.println("Web display: Old wind speed value: "+observableObj.getOldWindSpeedValue()+
                " new wind speed value: "+ observableObj.getWindSpeedValue());
    }
}
