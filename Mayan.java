public class Mayan extends Linguagem {
    public Mayan(String nome, int numFalantes) {
        super(nome, numFalantes, "América Central", "verbo-objeto-sujeito");
    }

    @Override
    public String getInfo() {
        return nome + " é falado por " + numFalantes + " pessoas principalmente em " + regioesFaladas
                + " A linguagem segue a ordem das palavras: " + ordemDasPalavras + "\nFato interessante: " + nome
                + " é uma língua ergativa.";
    }
}