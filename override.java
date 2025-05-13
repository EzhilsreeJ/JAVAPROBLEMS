public class override {
    public static void main(String[] args) {
        Anil anil=new Anil();
        anil.makesound();

    }
}
class Anil{
    public void makesound(){
        System.out.println("Anil is making sound");
    }
}
class Dog extends Anil{
    public void makesound(){
        System.out.println("Dog is barking");
    }
}
