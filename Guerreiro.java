public class Guerreiro {

    int vida;
    int escudo;

    public Guerreiro(int vida, int escudo) {
        this.vida = vida;
        this.escudo = escudo;
    }

    public void receberDano(int pontos) {

        if (escudo >= pontos) {
            escudo -= pontos;
        } else {
            int restante = pontos - escudo;
            escudo = 0;
            vida -= restante;
            if (vida < 0) {
                vida = 0;
            }
        }
    }

    public static void main(String[] args) {

        Guerreiro g = new Guerreiro(100, 50);

        g.receberDano(80);

        System.out.println("Vida restante: " + g.vida);
        System.out.println("Escudo restante: " + g.escudo);
    }
}