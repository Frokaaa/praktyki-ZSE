package Projekt_dziennik;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;

public class Dziennik {

    public static void main(String[] args) {
        Uczen uczen1 = new Uczen();
        uczen1.imie = "Mariusz";
        uczen1.nazwisko = " Włodarczyk  ";
        uczen1.numer_uczenia = 1;
        uczen1.ocena1 = 5;
        uczen1.ocena2 = 2;
        uczen1.ocena3 = 4;
        uczen1.obecnosc = true;

        Uczen uczen2 = new Uczen();
        uczen2.imie = "Paweł  ";
        uczen2.nazwisko = " Wiszniewski ";
        uczen2.numer_uczenia = 2;
        uczen2.ocena1 = 2;
        uczen2.ocena2 = 5;
        uczen2.ocena3 = 3;
        uczen2.obecnosc = false;

        Uczen uczen3 = new Uczen();
        uczen3.imie = "Paweł  ";
        uczen3.nazwisko = " Nagiel      ";
        uczen3.numer_uczenia = 3;
        uczen3.ocena1 = 6;
        uczen3.ocena2 = 1;
        uczen3.ocena3 = 3;
        uczen3.obecnosc = true;

        Uczen uczen4 = new Uczen();
        uczen4.imie = "Wiktoria";
        uczen4.nazwisko = "Majewska    ";
        uczen4.numer_uczenia = 4;
        uczen4.ocena1 = 3;
        uczen4.ocena2 = 4;
        uczen4.ocena3 = 5;
        uczen4.obecnosc = true;

        Uczen uczen5 = new Uczen();
        uczen5.imie = "Mateusz";
        uczen5.nazwisko = " Kołodziejski";
        uczen5.numer_uczenia = 5;
        uczen5.ocena1 = 4;
        uczen5.ocena2 = 5;
        uczen5.ocena3 = 3;
        uczen5.obecnosc = false;

        Uczen uczen6 = new Uczen();
        uczen6.imie = "Kacper";
        uczen6.nazwisko = "  Kabak       ";
        uczen6.numer_uczenia = 6;
        uczen6.ocena1 = 1;
        uczen6.ocena2 = 5;
        uczen6.ocena3 = 6;
        uczen6.obecnosc = true;



        ArrayList lista = new ArrayList();
        lista.add(uczen1);  //numer 0
        lista.add(uczen2);  //numer 1
        lista.add(uczen3);  //numer 2
        lista.add(uczen4);  //numer 3
        lista.add(uczen5);  //numer 4
        lista.add(uczen6);  //numer 5


        System.out.println("Nr  Imię      Nazwisko          Oceny      Obecność");
        for(Object u : lista){
            System.out.println(   (((Uczen)u).numer_uczenia) +"   "+ (((Uczen)u).imie) +"  "+ (((Uczen)u).nazwisko) +"      "+ (((Uczen)u).ocena1) + ","+ (((Uczen)u).ocena2)+","+ (((Uczen)u).ocena3) + "      " +(((Uczen)u).obecnosc)   );
        }

 // Wywołanie jednego ucznia z listy (w tym przypadku pierwszego na liscie) // System.out.println(((Uczen)lista.get(0)).numer_uczenia +"   "+ (((Uczen)lista.get(0)).imie) +"  "+ (((Uczen)lista.get(0)).nazwisko) +"      "+ (((Uczen)lista.get(0)).ocena1) + ","+ (((Uczen)lista.get(0)).ocena2)+","+ (((Uczen)lista.get(0)).ocena3) + "      " +(((Uczen)lista.get(0)).obecnosc));


    }
}