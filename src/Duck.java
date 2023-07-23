public class Duck extends Animal implements Flyable{
    @Override
    void sound(){
        System.out.println("Quack!");
    }
    @Override
    public void fly(){
        System.out.println("fly!");
    }
    @Override
    public void glide(){
        System.out.println("glide!");
    }
    public void clean(Animal animal){
        System.out.println(animal.toString() + "is being cleaned");
    }
}
