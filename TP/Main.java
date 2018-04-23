package imie;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Hello World
        String b = "Hello";
        System.out.println(b);
        System.out.println(b.length());

        // exemple de nombre entier
        int a = 7;
        System.out.println(a);

        // exemple de condition
        if ( a > 5 ) {
            System.out.println(" a est plus grand que 5 ");
        }

        // exemple d'un intervalle de 0 à 9 inclus / 10 exclu
        for (int ii = 0 ; ii<10 ; ii++) {
            System.out.println(ii);
        }

        // exemple d'un tableau de taille de fixe
        int[] notes = {5,9,2};
        for (int ii = 0; ii < notes.length; ii++) {
            System.out.println(ii + " : " + notes[ii]);
            System.out.printf("%d : %d%n", ii, notes[ii]);
        }
        for (int note : notes) {
            System.out.println(note);
        }
        String[] saisons = {"Printemps","Ete","Automne","Hiver"};
        // version <= 1.4
        for (int ii = 0; ii < saisons.length; ii++) {
            String saison = saisons[ii];
            System.out.println(ii);
            System.out.println(saison);
        }
        // version >= 1.5
        for (String saison : saisons) {
            System.out.println(saison);
        }

        // création d'une personne : luke
        Person p1 = new Person();
        p1.firstName = "luke";
        p1.lastName = "skywalker";

        // création d'une personne : leia
        Person p2 = new Person();
        p2.firstName = "leïa";
        p2.lastName = "organa";

        // exemple d'une liste de taille de variable
        // création d'une liste de personnes
        ArrayList<Person> persons = new ArrayList<>();
        System.out.println(persons.size());

        // ajout de luke à la liste
        persons.add(p1);
        System.out.println(persons.size());

        // ajout de leia à la liste
        persons.add(p2);
        System.out.println(persons.size());

        // parcours de la liste de personnes
        // version <= 1.4
        for (int ii = 0; ii < persons.size(); ii++) {
            Person person = (Person) persons.get(ii);
            System.out.println(person.firstName);
            System.out.println(person.lastName);
        }
        // version <= 1.5
        for (Person person : persons) {
            System.out.println(person.firstName);
            System.out.println(person.lastName);
        }

        // présentation d'un passage d'un objet à une fonction
        save(p1);
        save(p2);

        // exemple de création d'objets

        Voiture v1 = new Voiture();
        //v1.nombreRoues = 4;
        v1.marque = "Renault";
        v1.couleur = "Rouge";
        v1.nombreRoues += 1;
        v1.detailsVoiture(); // methode d'instance

        System.out.println(Voiture.nombreVoiture);

        Voiture v2 = new Voiture();
        //v2.init();
        v2.marque = "Peugault";
        v2.couleur = "Noir";
        detailsVoiture(v2); // methode de classe

        System.out.println(Voiture.nombreVoiture);

        Avion aa = new Avion();
        //aa.nombreRoues = 10;
        System.out.println(aa.nombreRoues);

    }

    private static void save(Person p) {
        System.out.printf("Nous avons bien sauvegardé %s %s.%n",p.firstName,p.lastName);
    }

    private static void detailsVoiture(Voiture v) {
        System.out.printf("C'est une %s %s avec %d roues.%n",v.marque,v.couleur,v.nombreRoues);
    }

}
