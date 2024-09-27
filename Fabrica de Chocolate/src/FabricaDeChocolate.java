public class FabricaDeChocolate {
    public static void main(String[] args) {
        CaldeiraChocolate caldeira = CaldeiraChocolate.getInstancia();

        // Testar o comportamento da caldeira
        caldeira.encher();  // Preencher a caldeira
        caldeira.ferver();  // Ferver a mistura
        caldeira.drenar();  // Drenar a caldeira

        // Tentar repetir as operações inválidas
        caldeira.drenar();  // Não pode drenar, já está vazia
        caldeira.ferver();  // Não pode ferver, está vazia
        caldeira.encher();  // Preencher novamente
        caldeira.encher();  // Não pode preencher, já está cheia
        caldeira.ferver();  // Ferver a mistura
        caldeira.drenar();  // Drenar a mistura fervida
    }
}