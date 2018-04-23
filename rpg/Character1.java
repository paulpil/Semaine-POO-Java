package rpg;

public class Character {

    private int healthPoints;
    private int magicPoints;
    private int experience;
    private int level;
    private int force;
    private int money;
    private int armor;

    private Object head;
    private Object leftShoulder;
    private Object rightShoulder;
    private Object leftArm;
    private Object rightArm;
    private HandItem leftHand = new Shield();
    private HandItem rightHand = new Sword();
    private Object leftRing;
    private Object rightRing;
    private Object neck;
    private Object torso;
    private Object legs;
    private Object feet;

   void changerItemMainGauche(HandItem i) {
        leftHand = i;
    }

    private Item[] inventory = { new Sword(), new Shield() };

}
