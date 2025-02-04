public class Papier extends Obiekt {
    public Papier(double x, double y) {
        super(x, y);
    }

    @Override
    public void ruch(Plansza plansza) {
        plansza.ruchObiektu(this);
    }

    @Override
    public void kolizja(Obiekt inny, Plansza plansza) {
        if (inny instanceof Kamien) {
            plansza.zamienObiekt(inny, new Papier(inny.getX(), inny.getY()));
        }
    }

    @Override
    public boolean czyGoni(Obiekt inny) {
        return inny instanceof Kamien;
    }

    @Override
    public boolean czyUciekaPrzed(Obiekt inny) {
        return inny instanceof Nozyczki;
    }
}