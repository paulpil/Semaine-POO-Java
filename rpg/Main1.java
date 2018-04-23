package rpg;

public class Main {

    public static void main(String[] args) {

        Ecrire service = Factory.getService();

        service.sauver(new Person());

    }

}
