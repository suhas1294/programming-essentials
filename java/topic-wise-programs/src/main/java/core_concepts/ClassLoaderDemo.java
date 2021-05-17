package core_concepts;

import com.sun.javafx.util.Logging;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.Callable;

public class ClassLoaderDemo {
    public static void main(String[] args) {
        printClassLoaders();
        //System.out.println(System.getProperty("java.class.path"));
        System.out.println(System.getProperty("ipAddress"));
    }
    public static void printClassLoaders() {
        System.out.println("Classloader of Logging:"
                + Logging.class.getClassLoader());

        System.out.println("Classloader of ArrayList:"
                + ArrayList.class.getClassLoader());
    }
}

class FutureObject implements Callable {

    @Override
    public Object call() throws Exception {
        Random generator = new Random();
        Integer randomNumber = generator.nextInt(5);
        Thread.sleep(randomNumber * 1000);
        return randomNumber;

    }
}
