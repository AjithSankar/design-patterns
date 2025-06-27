package creational.singleton.enumeration;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class EnumTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException, InvocationTargetException {

        Singleton singleton = Singleton.INSTANCE;
        System.out.println(singleton.hashCode());

        // 1. Test enum singleton using Serialization
        // Serialize
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
        out.writeObject(singleton);
        out.close();

        //Deserialize
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("singleton.ser"));
        Singleton singleton2 = (Singleton) in.readObject();
        in.close();

        System.out.println("Instance1 hashcode: " + singleton.hashCode());
        System.out.println("Instance2 hashcode: " + singleton2.hashCode());
        System.out.println(singleton == singleton2);  // Both hash codes will be identical. Java ensures that enum constants are never duplicated, even after deserialization.

        // 2. Using Reflection
        Constructor<?>[] constructors = Singleton.class.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            System.out.println("In Constructor");
            constructor.setAccessible(true);
            try {
                Singleton newInstance = (Singleton) constructor.newInstance();
                System.out.println(newInstance.hashCode());
            } catch (InstantiationException e) {
                System.out.println(e);
            } catch (IllegalAccessException e) {
                System.out.println(e);
            }
        }

    }
}
