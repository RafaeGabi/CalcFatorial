public class calcfatorial {

    public static void main(String[] args) {

        int numero, valor, fatorial;

        System.out.print("Informe um Numero Inteiro: ");

        numero = Integer.parseInt(System.console().readLine());

        valor = 2;

        fatorial = 1;

        while(valor <= numero) {

            fatorial = fatorial * valor;

            valor = valor + 1;


        }

        System.out.printf("O Fatorial De %d É: %d.\n", numero, fatorial);


    }
}
