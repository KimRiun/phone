public class Phone {
    protected String brand;
    protected String logo;

    public Phone(String brand, String logo) {
        this.brand = brand;
        this.logo = logo;
    }

    public String getBrand() {
        return brand;
    }

    public void turnOn() {
        System.out.println(brand + "을 켰습니다.");
        printLogo();
    }

    public void printLogo() {
        System.out.println(logo + " 폰 켜지는 중 " + logo);
    }
}
