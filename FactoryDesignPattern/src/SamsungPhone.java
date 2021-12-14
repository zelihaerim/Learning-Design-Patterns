public class SamsungPhone implements  IPhone{
    private final String brandName="Samsung";
    private Integer price;

    public SamsungPhone(){
        price=1000;
    }

    @Override
    public String getBrandName() {
        return this.brandName;
    }

    @Override
    public Integer getPrice() {
        return this.price;
    }

    @Override
    public void setPrice(Integer e) {
        price=e;
    }
}
