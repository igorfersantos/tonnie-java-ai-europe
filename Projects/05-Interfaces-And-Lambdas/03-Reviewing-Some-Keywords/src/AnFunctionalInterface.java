@FunctionalInterface
public interface AnFunctionalInterface {
    void loadResource();

    // Added later not breaking classes that previously implemented AnFunctionalInterface
    default void removeResource(){
        System.out.println("Resource removed!");
    }

    static void print(String text) {
        System.out.printf("Text\n\"\n%s\n\"\nfrom %s static method!\n",text, AnFunctionalInterface.class);
    }
}
