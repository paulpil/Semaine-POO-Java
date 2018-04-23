package overload;

public class Dog {

    public void bark(int a){
        System.out.println("int : " + a);
    }

    public void bark(String str){
        System.out.println("str : " + str);
    }

    public void bark(String str, int a){
        System.out.println("int : " + a);
        System.out.println("str : " + str);
    }

    public void bark(int a, String str){
        System.out.println("int : " + a);
        System.out.println("str : " + str);
    }

}
