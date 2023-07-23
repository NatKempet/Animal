import java.util.jar.JarEntry;

public class App {
    public static void main(String[] args) throws Exception {
        Cow mgua = new Cow();
        // mgua.sound();
        Duck kuy = new Duck();
        // kuy.sound();
        // kuy.fly();
        // kuy.glide();
        Owl James = new Owl();
        // James.sound();
        // James.fly();
        // James.glide();
        Pig lol = new Pig();
        // lol.sound();
        Duck daisy = new Pekingduck();
        daisy.sound();
        daisy.clean(daisy);
        kuy.clean(lol);
    }
}