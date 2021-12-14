/* The best method of making singleton in Java is by using enum.
public enum Singleton {
   INSTANCE;

   private String value;

   public void setValue(String value) {
       this.value = value;
   }

   public String getValue() {
       return value;
   }
}
 */

class SingletonSynchronized {
    private static SingletonSynchronized instance;

    private SingletonSynchronized(){}

    public static SingletonSynchronized getInstance() {
        if(instance == null) {// if the already instance is initialized, then return it directly
            // if instance is null then enter synchorinized to create instance,
            synchronized (SingletonSynchronized.class) { // to prevent race condition
                if(instance == null) {
                    instance = new SingletonSynchronized();
                }
            }
        }
        return instance; // if it is created then return.
    }
}

public class Main {

    public static void main(String[] args) {
        SingletonSynchronized instance = SingletonSynchronized.getInstance();

        System.out.println(instance);

        SingletonSynchronized instance1 = SingletonSynchronized.getInstance();

        System.out.println(instance1);
    }
}