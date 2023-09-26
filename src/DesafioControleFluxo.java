import java.util.Scanner;

public class DesafioControleFluxo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o parametro um: ");
        int parametroUm = sc.nextInt();
        System.out.println("Digite o parametro dois: ");
        int ParametroDois = sc.nextInt();
        
        sc.close();

        try {
            contar(parametroUm, ParametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parametro deve ser maior que o primiero " + e);
        }
        
}

static void contar(int parametroUm, int ParametroDois) throws ParametrosInvalidosException {

    int parametroNumero = ParametroDois - parametroUm;

    if(parametroUm > ParametroDois) {
        throw new ParametrosInvalidosException();
    } else {
        for(int i=0; i < parametroNumero; i++) {
            System.out.println("Imprimindo o numero "+ (i + 1));
        }
    }

    }
}

