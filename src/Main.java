import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public static void main(String[] args) {
    //Zaliczenie.Zadanie1();
    //Zaliczenie.Zadanie2MinNaGodz(60);
    //Zaliczenie.Zadanie2GodzNaMin(3);
    //Zaliczenie.Zadanie3();
    //Zaliczenie.Zadanie4(3, 4, 5);
    //Zaliczenie.Zadanie5(2);
    //Zaliczenie.Zadanie6();
    //Zaliczenie.Zadanie7(5);
    //Zaliczenie.Zadanie8(haslo1234);
    //Zaliczenie.Zadanie9(2);
    //Zaliczenie.Zadanie10(4,2);
    //Zaliczenie.Zadanie11();
    //Zaliczenie.Zadanie12();
    //Zaliczenie.Zadanie13();
    //Zaliczenie.Zadanie14();
    //Zaliczenie.Zadanie15();
    //Zaliczenie.Zadanie16();
    //Zaliczenie.Zadanie17();
    //Zaliczenie.Zadanie18();
    //Zaliczenie.Zadanie19();
    //Zaliczenie.Zadanie20();
    //Zaliczenie.Zadanie21();
    //Zaliczenie.Zadanie22();
    //Zaliczenie.Zadanie23();
    //Zadanie24
    List<Pojazd> pojazdy = new ArrayList<>();
    pojazdy.add(new Samochod());

}
public static class Zaliczenie{
    private static void Zadanie1() {
        System.out.println("""
                | ---  /---\\  |    |  /---\\
                    |  |   |  |    |  |   |
                    |  |   |  |    |  |   |
                    |  |---|  |    |  |---|
                    |  |   |   \\  /   |   |
                 \\__/  |   |    \\/    |   |
                """);
    }

    private static void Zadanie2MinNaGodz(double minuty){
        double godziny;
        godziny = minuty / 60;
        System.out.println(godziny);
    }

    private static void Zadanie2GodzNaMin(double godziny){
        double minuty;
        minuty = godziny * 60;
        System.out.println(minuty);
    }

    private static void Zadanie3(){
        int a = 20;
        int b = 11;
        int c = 2;
        int x = a % b % c;
        System.out.println(x);
    }

    private static void Zadanie4(double a, double b, double c){
        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Równanie ma dwa rozwiązania: x1 = " + x1 + ", x2 = " + x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Równanie ma jedno podwójne rozwiązanie: x = " + x);
        } else {
            System.out.println("Równanie nie ma rozwiązań rzeczywistych.");
        }
    }

    private static void Zadanie5 (double x){
        if(x%2==0){
            System.out.println("Liczba jest parzysta");
        }
        else System.out.println("Liczba jest nie parzysta");
    }

    private static void Zadanie6 (){
        Scanner reader = new Scanner(System.in);

        System.out.println("Podaj jakis wyraz: ");
        String x = reader.next();

        switch (x){
            case "dupa" -> System.out.println("Kreatywnie...");
            case "wyraz" -> System.out.println("Sprytne");
            case "aaa" -> System.out.println("bbb");
            default ->  System.out.println("Dzięki!");
        }
    }

    private static void Zadanie7(double x) {

        if (x > 10) {
            System.out.println("Liczba jest większa niż 10");
        } else {
            System.out.println("Liczba nie jest większa niż 10");
        }

        if (x > 0) {
            System.out.println("Liczba jest dodatnia");
        } else if (x < 0) {
            System.out.println("Liczba jest ujemna");
        } else {
            System.out.println("Liczba jest równa zero");
        }

        if (x % 5 == 0) {
            System.out.println("Liczba jest podzielna przez 5");
        } else {
            System.out.println("Liczba nie jest podzielna przez 5");
        }
    }

       private static void Zadanie8(String haslo) {

            if (haslo.length() >= 8 && haslo.matches(".*\\d.*")) {
                System.out.println("Hasło jest długie i zawiera cyfrę.");
            } else {
                System.out.println("Hasło nie spełnia wymagań długości lub nie zawiera cyfry.");
            }

            if (haslo.matches(".*[A-Z].*") || haslo.matches(".*[!@#$%^&*].*")) {
                System.out.println("Hasło zawiera wielką literę lub znak specjalny.");
            } else {
                System.out.println("Hasło nie zawiera wielkiej litery ani znaku specjalnego.");
            }

            if (!haslo.contains(" ")) {
                System.out.println("Hasło nie zawiera spacji.");
            } else {
                System.out.println("Hasło zawiera spacje.");
            }

            if (haslo.length() >= 6 && haslo.length() <= 12) {
                System.out.println("Długość hasła jest w odpowiednim zakresie.");
            } else {
                System.out.println("Hasło jest za krótkie lub za długie.");
            }

            if (haslo.matches(".*[a-z].*") && !haslo.matches("(.)\\1+")) {
                System.out.println("Hasło zawiera małą literę i nie składa się z powtarzających się znaków.");
            } else {
                System.out.println("Hasło nie zawiera małej litery lub składa się z powtarzających się znaków.");
            }

    }


    private static void Zadanie9(int x) {
        switch (x) {
            case 0:
                System.out.println("Liczba to 0");
                break;
            case 1:
                System.out.println("Liczba to 1");
                break;
            case 2:
                System.out.println("Liczba to 2");
                break;
            case 3:
                System.out.println("Liczba to 3");
                break;
            case 4:
                System.out.println("Liczba to 4");
                break;
            case 5:
                System.out.println("Liczba to 5");
                break;
            case 6:
                System.out.println("Liczba to 6");
                break;
            case 7:
                System.out.println("Liczba to 7");
                break;
            case 8:
                System.out.println("Liczba to 8");
                break;
            case 9:
                System.out.println("Liczba to 9");
                break;
            default:
                System.out.println("Liczba jest poza zakresem 0-9");
        }
    }

    private static void Zadanie10(double x, double y){
        boolean isModulo = y != 0 && x % y == 0;
        System.out.println(isModulo);

    }

   private static void Zadanie11(){
        int liczba = -10;

        liczba = liczba < 0 ? Math.abs(liczba) : liczba;

        System.out.println("Wartość bezwzględna liczby: " + liczba);
    }

    private static void Zadanie12(){
        int liczba = 5;

        switch (liczba) {
            case 1:
            case 4:
            case 8:
                System.out.println("Zmienna ma wartość 1, 4, lub 8");
                break;
            case 2:
            case 3:
            case 7:
                System.out.println("Zmienna ma wartość 2, 3, lub 7");
                break;
            default:
                System.out.println("Zmienna ma inną wartość");
        }
    }

    private static void Zadanie13() {
        double stanKonta = 5000.0;
        double podatek = stanKonta * 0.10;
        System.out.println("Opłata za prowadzenie konta wynosi: " + podatek);
    }

    private static void Zadanie14() {
        int month = 7;
        String[] months = {"Styczeń", "Luty", "Marzec", "Kwiecień", "Maj", "Czerwiec", "Lipiec", "Sierpień", "Wrzesień", "Październik", "Listopad", "Grudzień"};
        System.out.println("Wybrany miesiąc to: " + months[month - 1]);
    }

    private static void Zadanie15() {
        String colorCode = "G";
        switch (colorCode) {
            case "R":
                System.out.println("Red");
                break;
            case "G":
                System.out.println("Green");
                break;
            case "B":
                System.out.println("Blue");
                break;
            default:
                System.out.println("Nieznany kolor");
        }
    }

    private static void Zadanie16() {
        int month = 8;
        String season;
        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "Zima";
                break;
            case 3:
            case 4:
            case 5:
                season = "Wiosna";
                break;
            case 6:
            case 7:
            case 8:
                season = "Lato";
                break;
            case 9:
            case 10:
            case 11:
                season = "Jesień";
                break;
            default:
                season = "Nieznany";
        }
        System.out.println("Miesiąc należy do sezonu: " + season);
    }

    private static void Zadanie17() {
        double masa = 70.5;
        double wzrost = 1.75;
        double bmi = masa / (wzrost * wzrost);
        System.out.println("BMI wynosi: " + bmi);
    }


    private static void Zadanie18() {
        double dochod = 50000.0;
        double podatek = dochod * 0.23;
        System.out.println("Podatek dochodowy: " + podatek);
    }

    private static void Zadanie19() {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) continue;
            System.out.println(i);
        }
    }

    private static void Zadanie20() {
        int i = 1;
        while (i <= 20) {
            if (i % 2 == 0) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }

    private static void Zadanie21() {
        for (int i = 1; i <= 100; i++) {
            if (i % 4 != 0 || i % 8 == 0 || i % 10 == 0) continue;
            System.out.println(i);
        }
    }

    private static void Zadanie22() {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Podaj pierwszą liczbę: ");
            double num1 = scanner.nextDouble();

            System.out.print("Podaj drugą liczbę: ");
            double num2 = scanner.nextDouble();

            System.out.print("Wybierz operację (+, -, *, /): ");
            String operation = scanner.next();

            switch (operation) {
                case "+":
                    System.out.println("Wynik: " + (num1 + num2));
                    break;
                case "-":
                    System.out.println("Wynik: " + (num1 - num2));
                    break;
                case "*":
                    System.out.println("Wynik: " + (num1 * num2));
                    break;
                case "/":
                    if (num2 != 0) {
                        System.out.println("Wynik: " + (num1 / num2));
                    } else {
                        System.out.println("Nie można dzielić przez zero.");
                    }
                    break;
                default:
                    System.out.println("Niepoprawna operacja.");
                    break;
            }

        }
    }

    private static void Zadanie23() {
        int[] tablica = {1, 2, 3, 4, 5, 6};
        for (int i : tablica) {
            System.out.println(i);
        }
    }


}

