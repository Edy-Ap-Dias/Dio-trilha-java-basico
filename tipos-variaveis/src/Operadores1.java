import javax.lang.model.util.ElementScanner6;

public class Operadores1 {
    public static void main(String[] args) {
        
        int a, b;

        a = 6;

        b = 6;

        String resultado = a>=b? "1": "0";

        System.out.println(resultado);

        System.out.println("operadores 6");

        int numero = 2;

        int numero1 = 2;

        boolean simNao = numero == numero1;

        if(numero == numero1){

            System.out.println("A nossa condição é verdadeira");

            System.out.println("Numero é igual a numero1 ?" + simNao);

            String nomeUm = "Edivaldo";
            
            String nomeDois = new String("Edivaldo");

            System.out.println( nomeUm.equals(nomeDois));

            boolean condicao1 = true;

            boolean condicao2 = true;

            if(condicao1 && 7 > 4){

                System.out.println("As duas são verdadeiras");
            }

           if(condicao1 || condicao2){

            System.out.println( "Uma das condições é verdadeira");

            System.out.println( "Métodos 1");


           }

        }


    }
}
