public interface IObservable {
    public void add(IObserver element);
    public void remove(IObserver element);
    public void notifyObservers();
}
