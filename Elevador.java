public class Elevador {

    int andarAtual;
    int totalAndares;

    public Elevador(int totalAndares) {
        this.totalAndares = totalAndares;
        this.andarAtual = 0;
    }

    public void subir() {
        if (andarAtual < totalAndares) {
            andarAtual++;
        } else {
            System.out.println("Não pode subir além do último andar");
        }
    }

    public void descer() {
        if (andarAtual > 0) {
            andarAtual--;
        } else {
            System.out.println("Não pode descer abaixo do térreo");
        }
    }

    public static void main(String[] args) {

        Elevador e = new Elevador(5);

        for (int i = 0; i < 7; i++) {
            e.subir();
        }

        for (int i = 0; i < 7; i++) {
            e.descer();
        }
    }
}