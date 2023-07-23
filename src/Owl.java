public class Owl extends Animal implements Flyable{
    @Override
    void sound(){
        System.out.println("HOO! HOO!");
    }
    @Override
    public void fly(){
        System.out.println("fly!");
    }
    @Override
    public void glide(){
        System.out.println("glide!");
    }
}