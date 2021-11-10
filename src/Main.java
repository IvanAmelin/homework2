import java.nio.file.FileSystemNotFoundException;

public class Main {
    public static void main(String[] args) {

        double ticketPrice = 1019.99;
        int bonus = 20;
        double bonusMiles = ticketPrice / bonus;
        int bonusMilesint = (int)bonusMiles;
        System.out.println("Бонусные мили: "+bonusMilesint);
        // стоимости билета, другую для хранения количества
        // рублей для одной бонусной милли

        // Рассчитываете количество бонусных милль, используя
        // значения заведённых переменных. Ответ сохраняете в
        // новую переменную и выводите на экран
    }
}