public class Video {

    String titulo;
    int duracao;
    boolean estaDandoPlay;

    public Video(String titulo, int duracao) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.estaDandoPlay = false;
    }

    public void alternarPlay() {
        estaDandoPlay = !estaDandoPlay;
    }

    public static void main(String[] args) {

        Video v1 = new Video("Aula de Java", 20);
        Video v2 = new Video("Filme", 120);

        v1.alternarPlay();

        System.out.println("Video 1: " + v1.titulo + " - Play: " + v1.estaDandoPlay);
        System.out.println("Video 2: " + v2.titulo + " - Play: " + v2.estaDandoPlay);
    }
}