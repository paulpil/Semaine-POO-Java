package imie;

public class Voiture extends Vehicule {

  public static int nombreVoiture = 0;

  public String couleur;
  public String marque;

  /* public void init () {
    nombreRoues = 4;
  } */

  public Voiture () {
    nombreVoiture += 1;
    nombreRoues = 4;
  }

  public void detailsVoiture() {
    System.out.printf("C'est une %s %s avec %d roues.%n",marque,couleur,nombreRoues);
  }

}
