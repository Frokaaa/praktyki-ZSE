package cwiczenia;

public class Human {
   private double wzrost;
    private char plec; // m - mezczyzna // k - kobieta // c - cos innego
    private double rozmiar_buta;
    private boolean czy_lysy;
    private String color_wlosow;
    private int wiek;
    private Human[] rodzice;

    void setColor_wlosow(String color){
        if(!czy_lysy){
            color_wlosow = color;
        }
        else{
            System.out.println("przeciez jest łysy, lol");
        }
    }

    public void setWzrost(double wzrost) {
        this.wzrost = wzrost;
    }

    public void setPlec(char plec) {
        this.plec = plec;
    }

    public void setRozmiar_buta(double rozmiar_buta) {
        this.rozmiar_buta = rozmiar_buta;
    }

    public void setCzy_lysy(boolean czy_lysy) {
        this.czy_lysy = czy_lysy;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }
public void setRodzice(Human matka, Human ojciec){
        rodzice = new Human[]{matka, ojciec};
}

}
