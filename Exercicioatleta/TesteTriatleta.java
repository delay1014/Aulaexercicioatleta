
public class TesteTriatleta {
    public static void main(String[] args) {
        // Fornecendo o nome no construtor
        Triatleta triatleta = new Triatleta("Kristian Blummenfelt");

        triatleta.aquecer();
        triatleta.nadar();
        triatleta.pedalar();
        triatleta.correr();
    }
}
