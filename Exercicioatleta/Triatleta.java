public class Triatleta extends Pessoa implements Ciclista, Corredor, Nadador {

    public Triatleta(String nome) {
        super();
    }

    @Override
    public void correr() {
        System.out.println(getNome() + " está correndo.");
    }

    @Override
    public void pedalar() {
        System.out.println(getNome() + " está pedalando.");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando.");
    }

    @Override
    public void aquecer() {
        System.out.println(getNome() + " está se aquecendo.");
    }

    public static void main(String[] args) {
        Triatleta triatleta = new Triatleta("Kristian Blummenfelt");

        triatleta.aquecer();
        triatleta.correr();
        triatleta.pedalar();
        triatleta.nadar();
    }
}
