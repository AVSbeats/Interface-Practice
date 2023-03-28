public class Main {
    public static void main(String[] args) {

        Goku goku = new Goku();
        Vegeta vegeta = new Vegeta();
        Jiren jiren = new Jiren();

        System.out.println();
        goku.attack();
        vegeta.defense();
        System.out.println();

        System.out.println("Goku and Vegeta starts attacking Jiren!!!");
        jiren.defense();
        jiren.attack();
        System.out.println();

        goku.setTransformation("Goku is going Ultra Instinct!!!");

        System.out.println(goku.getTransformation());
        goku.attack();
        System.out.println();

    }
}
