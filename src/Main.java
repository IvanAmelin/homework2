import java.nio.file.FileSystemNotFoundException;

public class Main {
    public static void main(String[] args) {

        double ticket_price = 1019.99;
        int bonus = 20;
        double bonusmiles = ticket_price / bonus;
        int bonusmilesint = (int)bonusmiles;
        System.out.println("Бонусные мили: "+bonusmilesint);
        // стоимости билета, другую для хранения количества
        // рублей для одной бонусной милли

        // Рассчитываете количество бонусных милль, используя
        // значения заведённых переменных. Ответ сохраняете в
        // новую переменную и выводите на экран
    }
}