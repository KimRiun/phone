public class Main {
    public static void main(String[] args) {


/*
잡스님이 애플폰을 구매했습니다.

잡스님이 애플폰을 켰습니다.

@@@ 폰 켜지는 중 @@@

재용님이 삼송폰을 구매했습니다.

재용님이 삼송폰을 켰습니다.

*** 폰 켜지는 중 ***

*/

        Person jabs = new Person("잡스");
        jabs.buy(new Apple());
        jabs.turnOnPhone();

        System.out.println();
        Person jaeyong = new Person("재용");
        jaeyong.buy(new Samsung());
        jaeyong.turnOnPhone();

    }
}