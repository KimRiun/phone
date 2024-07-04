public class Person {
    private String name;
    private Phone phone;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public void buy(Phone phone) {
        this.phone = phone;
        printName();
        System.out.println(phone.getBrand() +"을 구매했습니다.");
    }

    public Phone getPhone() {
        return phone;
    }

    public void turnOnPhone() {
        printName();
        phone.turnOn();
    }

    public void printName() {
        System.out.print(name + "님이 ");
    }
}
