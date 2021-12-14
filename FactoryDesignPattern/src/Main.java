public class Main {
    public static void main(String[] args) {

        IPhoneFactory istFactory=new PhoneFactoryInIstanbul();
        IPhone phone1Ist= istFactory.createPhone("Samsung");
        if(phone1Ist!=null) {
            System.out.println("Manufactured phone brand name is: " + phone1Ist.getBrandName() + " in " + istFactory.toString());
        }
        IPhone phone2Ist= istFactory.createPhone("Huawei");
        if(phone2Ist!=null) {
            System.out.println("Manufactured phone brand name is: " + phone2Ist.getBrandName() + " in " + istFactory.toString());
        }
        /***************************************************************************************************************/
        IPhoneFactory ankaraFactory=new PhoneFactoryInAnkara();
        IPhone phone1Ankara= ankaraFactory.createPhone("Iphone");
        if(phone1Ankara!=null) {
            System.out.println("Manufactured phone brand name is: " + phone1Ankara.getBrandName() + " in " + ankaraFactory.toString());
        }
        IPhone phone2Ankara= ankaraFactory.createPhone("Casper");
        if(phone2Ankara!=null) {
            System.out.println("Manufactured phone brand name is: " + phone2Ankara.getBrandName() + " in " + ankaraFactory.toString());
        }



    }
}
