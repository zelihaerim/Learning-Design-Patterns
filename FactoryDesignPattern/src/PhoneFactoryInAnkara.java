public class PhoneFactoryInAnkara implements IPhoneFactory{

    public IPhone createPhone(String brandName){
        if(brandName.equals("Samsung")){
            return new SamsungPhone();
        }
        else if(brandName.equals("Huawei")){
            return new HuaweiPhone();
        }
        else if(brandName.equals("Iphone")){
            return new IphonePhone();
        }
        else{
            System.err.println("This phone model is not manufactured "+this+" => "+brandName);
            return null;
        }
    }

    @Override
    public String toString(){
        return "Ankara Phone Factory";
    }



}
