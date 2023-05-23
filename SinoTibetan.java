public class SinoTibetan extends Linguagem {
    public SinoTibetan(String nome, int numFalantes) {
        super(nome, numFalantes, "Ásia", "sujeito-objeto-verbo");
        if (this.nome.contains("Chinês")) {
            this.ordemDasPalavras = "sujeito-verbo-objeto";
        }
    }

}
