public class Pet {

    int fome;

    public Pet(int fome) {
        this.fome = fome;
    }

    public void alimentar() {
        fome -= 10;
        if (fome < 0) {
            fome = 0;
        }
    }

    public static void main(String[] args) {

        Pet p = new Pet(5);

        p.alimentar();

        System.out.println("Fome atual: " + p.fome);
    }
}