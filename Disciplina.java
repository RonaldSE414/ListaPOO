public class Disciplina {

    double notaFinal;
    double presenca;

    public Disciplina(double notaFinal, double presenca) {
        this.notaFinal = notaFinal;
        this.presenca = presenca;
    }

    public boolean verificarAprovacao() {
        if (notaFinal >= 7.0 && presenca >= 75) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        Disciplina d = new Disciplina(9.0, 70);

        if (d.verificarAprovacao()) {
            System.out.println("Aluno Aprovado");
        } else {
            System.out.println("Aluno Reprovado");
        }
    }
}