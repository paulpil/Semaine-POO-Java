package rpg;

public class Factory {

    public static Ecrire getService () {
        return new EcrireCSV();
    }

}
