package zadania1;

public class Main {
        public static void main(String[] args) {
                Uczen jeden = new Uczen();
                jeden.imie = "Mariusz";
                jeden.nazwisko = "Włodarczyk";
                jeden.wiek = 18;
                jeden.info();

                Matma liczby = new Matma();
                liczby.x = 4;
                liczby.y = 5;
                liczby.z = 10;
                liczby.podnies();
                liczby.Sumaroznicailoczyn();
                liczby.trojkat();


        }

}
