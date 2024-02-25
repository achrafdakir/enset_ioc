package ma.enset.pres;


import ma.enset.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresentationVersionAnnotation {
    public static void main(String[] args) {
        ApplicationContext context = new
                AnnotationConfigApplicationContext("ma");
        IMetier metier = context.getBean(IMetier.class);
        System.out.println(metier.calcul());
    }
}
