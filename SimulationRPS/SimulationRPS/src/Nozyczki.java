public class Nozyczki extends Obiekt {
    public Nozyczki(double x, double y) {
        super(x, y);
    }

    @Override
    public void ruch(Plansza plansza) {
        plansza.ruchObiektu(this);
    }

    @Override
    public void kolizja(Obiekt inny, Plansza plansza) {
        if (inny instanceof Papier) {
            plansza.zamienObiekt(inny, new Nozyczki(inny.getX(), inny.getY()));
        }
    }

    @Override
    public boolean czyGoni(Obiekt inny) {
        return inny instanceof Papier;
    }

    @Override
    public boolean czyUciekaPrzed(Obiekt inny) {
        return inny instanceof Kamien;
    }
}