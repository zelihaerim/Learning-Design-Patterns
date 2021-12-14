import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements IObservable{
    private List<IObserver> myObservers = new ArrayList<>();
    private Integer windSpeedValue;

    private Integer oldWindSpeedValue;
    public WeatherStation(){
        oldWindSpeedValue=windSpeedValue=0;
    }
    public WeatherStation(Integer windSpeedValue){
        if(windSpeedValue>=0){
            this.windSpeedValue=windSpeedValue;
            oldWindSpeedValue=windSpeedValue; // at first make old value as current value
        }
        else{
            System.err.println("Wind speed value can not be lower than zero.");
        }
    }

    public Integer changeWindSpeed(Integer newWindSpeedValue){
        oldWindSpeedValue=windSpeedValue;
        this.windSpeedValue=newWindSpeedValue;
        notifyObservers(); // notify observers because wind value is changed.
        return oldWindSpeedValue;
    }

    @Override
    public void add(IObserver element) {
        myObservers.add(element);
    }

    @Override
    public void remove(IObserver element) {
        myObservers.remove(element);
    }

    @Override
    public void notifyObservers() {
        for (IObserver obj: myObservers) {
            obj.update();
        }
    }

    public List<IObserver> getMyObservers() {
        return myObservers;
    }

    public void setMyObservers(List<IObserver> myObservers) {
        this.myObservers = myObservers;
    }

    public Integer getWindSpeedValue() {
        return windSpeedValue;
    }

    public void setWindSpeedValue(Integer windSpeedValue) {
        this.windSpeedValue = windSpeedValue;
    }

    public Integer getOldWindSpeedValue() {
        return oldWindSpeedValue;
    }

    public void setOldWindSpeedValue(Integer oldWindSpeedValue) {
        this.oldWindSpeedValue = oldWindSpeedValue;
    }
}
