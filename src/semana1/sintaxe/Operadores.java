package semana1.sintaxe;

public class Operadores {
    public static void main(String[] args) {
        String concatenado = "1";
        concatenado = "1" + 1;    // "11" a string 11;
        // System.out.println(concatenado);
        concatenado = 1 + 1 + 1 + "1"; // "31"
        // System.out.println(concatenado);
        concatenado = 1+1+1+"1"+(1+1+1); // "313"
        // System.out.println(concatenado);
        //não é possivel fazer cast de string pra inteiro
        // int concatenadoNumero = (int) concatenado;

        // //convertendo operando em positivo com o perador unário "-"
        // int operando = -5;
        // System.out.println(operando);
        // operando = -operando;
        // System.out.println(operando);

        //incrementar numero: incremento após a instrução
        int incremeto = 5; 
        // System.out.println(incremeto ++);
        // System.out.println(incremeto ++);
        // incrementa imediatamente
        int incremento2 = 6;
        // System.out.println(++ incremento2);
        String resultado = "";

        resultado = incremeto > incremento2 ? "verdadeiro": "falso";
        // System.out.println(resultado);

        //comparando objetos e textos
        String nome1 = "Robert";
        String nome2 = "Robert";

        // System.out.println(nome1==nome2);
        String nome3 = new String("Robert");

        // System.out.println(nome1==nome3);
        // System.out.println(nome1.equals(nome3));

        

    }
}
