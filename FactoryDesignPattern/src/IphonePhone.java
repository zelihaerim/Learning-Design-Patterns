public class IphonePhone implements IPhone{
    private final String brandName="Iphone";
    private Integer price;

    public IphonePhone(){
        price=3000;
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
