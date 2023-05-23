public class Linguagem {
    protected String nome;
    protected int numFalantes;
    protected String regioesFaladas;
    protected String ordemDasPalavras;

    public Linguagem(String nome, int numFalantes, String regioesFaladas, String ordemDasPalavras) {
        this.nome = nome;
        this.numFalantes = numFalantes;
        this.regioesFaladas = regioesFaladas;
        this.ordemDasPalavras = ordemDasPalavras;
    }

    public String getInfo() {
        return String.format("%s é falado por %d principalmente em %s.\nA linguagem segue a ordem palavras %s.", nome,
                numFalantes, regioesFaladas, ordemDasPalavras);
    }

    public static void main(String[] args) {
        Linguagem portugues = new Linguagem("Português", 270000000,
                "Angola, Brasil, Cabo Ve rde, Guiné-Bissau, Guiné Equatorial, Portugal, Moçambique, São Tomé e Príncipe e Timor-Leste",
                "sujeito-verbo-objeto");
        System.out.println(portugues.getInfo());

        Linguagem kiche = new Mayan("K'iche'", 1000000);
        System.out.println(kiche.getInfo());

        Linguagem cantones = new SinoTibetan("Chinês; Cantonês", 85500000);
        System.out.println(cantones.getInfo());
        Linguagem birmanes = new SinoTibetan("Birmanês", 43000000);
        System.out.println(birmanes.getInfo());
    }
}