package zadania1;

public class Matma {
    double PI = 3.14;
    double e = 2.71;
    int x;
    int y;
    int z;

    void podnies() {
        System.out.println("Liczba x do potegi 3 = " + x * x * x + "\n");
    }

    void Sumaroznicailoczyn() {
        System.out.println("Suma liczb x i y = " + (x + y) + "\n" + "Różnica liczb z i y = " + (z - y) + "\n" + "Iloczyn liczb x i z = " + (x * z) + "\n");
    }

    void trojkat() {
        if (x + y > z) {
            System.out.println("Można stworzyć trójkąt prostokątny");
        }
        else {
            System.out.println("Nie można stworzyć trójkąta prostokątnego");
        }
    }
}
