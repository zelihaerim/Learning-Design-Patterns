public class PhoneFactoryInIstanbul implements IPhoneFactory {

    public IPhone createPhone(String brandName){
        if(brandName.equals("Samsung")){
            return new SamsungPhone();
        }
        else if(brandName.equals("Huawei")) {
            return new HuaweiPhone();
        }
        else{
            System.err.println("This phone model is not manufactured at "+this+"=> "+brandName);
            return null;
        }
    }
    @Override
    public String toString(){
        return "Istanbul Phone Factory";
    }
}
