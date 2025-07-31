package br.com.igorfernandes;

/**
 * "Lazy" Singleton
 * @author Igor
 */
public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton() {
        super();
    }

    public static LazySingleton getInstance() {
        if (instance == null)
            instance = new LazySingleton();
        return instance;
    }
}
