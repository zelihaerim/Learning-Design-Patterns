public class HuaweiPhone implements IPhone{
    private final String brandName="Huawei";
    private Integer price;

    public HuaweiPhone(){
        price=1500;
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
