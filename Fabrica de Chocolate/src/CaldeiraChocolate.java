public class CaldeiraChocolate {
    private boolean vazia;
    private boolean fervida;
    private static CaldeiraChocolate instancia;


    private CaldeiraChocolate() {
        vazia = true;
        fervida = false;
    }
    public static CaldeiraChocolate getInstancia() {
        if (instancia == null) {
            instancia = new CaldeiraChocolate();
        }
        return instancia;
    }

    public void encher() {
        if (vazia) {
            vazia = false;
            fervida = false;
            System.out.println("Caldeira foi preenchida com chocolate e leite.");
        } else {
            System.out.println("A caldeira já está cheia e não pode ser preenchida novamente.");
        }
    }

    public void ferver() {
        if (!vazia && !fervida) {
            fervida = true;
            System.out.println("A mistura de chocolate e leite está fervendo.");
        } else if (vazia) {
            System.out.println("A caldeira está vazia. Não é possível ferver.");
        } else if (fervida) {
            System.out.println("A mistura já foi fervida. Não é possível ferver novamente.");
        }
    }

    public void drenar() {
        if (!vazia && fervida) {
            vazia = true;
            System.out.println("A mistura fervida foi drenada da caldeira.");
        } else if (vazia) {
            System.out.println("A caldeira está vazia. Não há nada para drenar.");
        } else if (!fervida) {
            System.out.println("A mistura ainda não foi fervida. Não é possível drenar.");
        }
    }

    public boolean isVazia() {
        return vazia;
    }

    public boolean isFervida() {
        return fervida;
    }
}

