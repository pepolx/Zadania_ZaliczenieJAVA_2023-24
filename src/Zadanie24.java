
enum TypPojazdu {
        SAMOCHOD, MOTOCYKL, ROWER
}

interface PojazdInterface {
        void start();
        void stop();
}

abstract class Pojazd implements PojazdInterface {
    protected TypPojazdu typPojazdu;

    Pojazd(TypPojazdu typPojazdu) {
        this.typPojazdu = typPojazdu;
        }
        public abstract void start();
    public abstract void stop();
}

class Samochod extends Pojazd {
    Samochod() {
        super(TypPojazdu.SAMOCHOD);
    }

    @Override
    public void start() {
        System.out.println("Samochód rusza");
    }

    @Override
    public void stop() {
        System.out.println("Samochód zatrzymuje się");
    }
}

