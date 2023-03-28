public class Jiren implements Attack, Defense {

    @Override
    public void defense() {

        System.out.println("Jiren is blocking all the attacks!!!");
    }

    @Override
    public void attack() {

        System.out.println("Jiren uses super attack and says: It's Over.");
    }

}
