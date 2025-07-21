import br.com.igorfersantos.persistence.FilePersistence;
import br.com.igorfersantos.persistence.IOFilePersistence;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FilePersistence persistence = new IOFilePersistence("User.csv");
        System.out.println("=================================");
        System.out.println(persistence.write("Igor;igorfercontato@gmail.com;05/03/1999;"));
        System.out.println("=================================");
        System.out.println(persistence.write("Maria;maria@gmail.com;06/04/2006;"));
        System.out.println("=================================");
        System.out.println(persistence.write("Joao;joao@gmail.com;25/07/2010;"));
        System.out.println("=================================");
        System.out.println(persistence.findAll());
        System.out.println("=================================");
        System.out.println("Find Igor: " + persistence.findBy("Igor;"));
        System.out.println("=================================");
        System.out.println("Remove Igor: " + persistence.remove("Igor"));
        System.out.println("=================================");
        System.out.println("Find Igor: " + persistence.findBy("Igor;"));
        System.out.println("=================================");
        System.out.println("Remove non-existent John: " + persistence.remove("Jhon"));
        System.out.println("=================================");
        System.out.println("Adding Igor back: " + persistence.write("Igor;igorfercontato@gmail.com;05/03/1999;"));
        System.out.println("=================================");
        System.out.println("Replace Igor: " + persistence.replace("Igor;", "Jhon;jhon@jhon.com;05/03/1999;"));
        System.out.println("=================================");
        System.out.println(persistence.findAll());
    }
}