public class ExercicioCondicionais {

    public static void main (String args[]) {
        calculoMedia();
        aprovacao();
    }

    private static Integer calculoMedia() {
        int nota1 = 6;

        int nota2 = 7;

        int nota3 = 4;

        int nota4 = 9;

        int calculoMedia = (nota1 + nota2 + nota3 + nota4)/4;

        return calculoMedia;
    }

    private static void aprovacao () {

        String resultado;

        if (calculoMedia() >= 7) {
            resultado = "O aluno está aprovado!";
        } else if (calculoMedia() >= 5){
            resultado = "O aluno está de recuperação.";
        } else {
            resultado = "O aluno está reprovado.";
        }
        System.out.println(resultado);
    }
}
