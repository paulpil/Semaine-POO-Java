package override;

// redéfinition
public class MainOverriding {

    public static void main(String[] args) {

        new Dog().bark();
        new Hound().bark();

        Dog d = new Hound();
        d.bark();

        // Hound h = new Dog(); // not possible

    }

}
