package Projekt_dziennik;

public class Człowiek {
    protected String imie;
    protected String nazwisko;

     public String getImie() {
        return "Imię: " + this.imie;
    }

   public void setImie(String imie) {
        this.imie = imie;
    }



     public String getNazwisko() {
        return "Nazwisko: " + this.nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }


}




