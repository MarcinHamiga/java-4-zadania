import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DniSemestruLetniego {
    public static void main(String[] args){
        LocalDate początek = LocalDate.of(2023, 2, 27);
        LocalDate koniec = LocalDate.of(2023, 9, 30);
        long ilośćDni = ChronoUnit.DAYS.between(początek, koniec);
        System.out.println("Ilość dni w semestrze letnim: " + ilośćDni);
    }
}