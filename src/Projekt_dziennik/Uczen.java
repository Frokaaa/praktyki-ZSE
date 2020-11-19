package Projekt_dziennik;

public class Uczen extends Człowiek{
protected int numer_uczenia;
protected int ocena1;
protected int ocena2;
protected int ocena3;
protected boolean obecnosc;


     public String getNumer_uczenia() {
        return "Numer ucznia: " + this.numer_uczenia;
    }

    public void setNumer_uczenia(int numer_uczenia) {
        this.numer_uczenia = numer_uczenia;
    }



   public String getOcena1() {
        return "Ocena: " + this.ocena1;
    }
    public void setOcena1(int ocena1) {
        if (ocena1 >= 1 && ocena1 <= 6) {
            this.ocena1 = ocena1;
        }
    }

    public boolean isObecnosc() {
        return obecnosc;
    }

   public  void setObecnosc(boolean obecnosc) {
        this.obecnosc = obecnosc;
    }

    public int getOcena2() {
        return ocena2;
    }

    public void setOcena2(int ocena2) {
        this.ocena2 = ocena2;
    }

    public int getOcena3() {
        return ocena3;
    }

    public void setOcena3(int ocena3) {
        this.ocena3 = ocena3;
    }
}







