package br.com.igorfernandes;

public class Test {

    public static void main(String[] args) {
        LazyHolderSingleton lazyHolderSingleton = LazyHolderSingleton.getInstance();
        System.out.println(lazyHolderSingleton);
        lazyHolderSingleton = LazyHolderSingleton.getInstance();
        System.out.println(lazyHolderSingleton);


        LazySingleton lazySingleton = LazySingleton.getInstance();
        System.out.println(lazySingleton);
        lazySingleton = LazySingleton.getInstance();
        System.out.println(lazySingleton);


        EagerSingleton eagerSingleton = EagerSingleton.getInstance();
        System.out.println(eagerSingleton);
        eagerSingleton = EagerSingleton.getInstance();
        System.out.println(eagerSingleton);
    }
}
