import br.com.dio.challenge.domain.Bootcamp;
import br.com.dio.challenge.domain.Content;
import br.com.dio.challenge.domain.Course;
import br.com.dio.challenge.domain.Dev;
import br.com.dio.challenge.domain.Mentoring;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Course course = new Course();
        course.setTitle("Java Course");
        course.setDescription("Java course description");
        course.setWorkload(50);
        System.out.println(course);


        Course course1 = new Course();
        course1.setTitle("Java Best Practices");
        course1.setDescription("Java Best Practices description");
        course1.setWorkload(50);
        System.out.println(course1);

        Mentoring mentoring = new Mentoring();
        mentoring.setTitle("Java Mentoring");
        mentoring.setDescription("Java mentoring description");
        mentoring.setDate(LocalDate.now());
        System.out.println(mentoring);

        Content content = new Course();
        content.setTitle("A new course");
        content.setDescription("A new course description");

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Java developer");
        bootcamp.setDescription("Java Bootcamp Description");
        bootcamp.getContents().add(course);
        bootcamp.getContents().add(course1);
        bootcamp.getContents().add(mentoring);

        System.out.println();

        Dev devIgor = new Dev();
        devIgor.setName("Igor");
        devIgor.subscribeToBootcamp(bootcamp);
        System.out.printf("Subscribed contents from %s: %s\n", devIgor.getName(), devIgor.getSubscribedContents());
        devIgor.advanceContentTrackProgress();
        devIgor.advanceContentTrackProgress();
        devIgor.advanceContentTrackProgress();
        System.out.printf("Subscribed contents from %s: %s\n", devIgor.getName(), devIgor.getSubscribedContents());
        System.out.printf("Subscribed contents from %s that have been finished: %s\n", devIgor.getName(),
                devIgor.getCompletedContents());
        System.out.printf("Experience: %s\n", devIgor.calculateTotalExperience());

        System.out.println();

        Dev devCamila = new Dev();
        devCamila.setName("Camila");
        devCamila.subscribeToBootcamp(bootcamp);
        System.out.printf("Subscribed contents from %s: %s\n", devCamila.getName(), devCamila.getSubscribedContents());
        devCamila.advanceContentTrackProgress();
        System.out.printf("Subscribed contents from %s: %s\n", devCamila.getName(), devCamila.getSubscribedContents());
        System.out.printf("Subscribed contents from %s that have been finished: %s\n", devCamila.getName(),
                devCamila.getCompletedContents());
        System.out.printf("Experience: %s\n", devCamila.calculateTotalExperience());
    }
}
