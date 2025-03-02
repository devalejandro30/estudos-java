package Condicionais;

public class EstruturasCondicionais {
    public static void main(String[] args) {
        int idade = 21;

        if (idade >= 18) {
            System.out.println("Autorizado");
        } else {
            System.out.println("Não autorizado");
        }

        // três condições

        if (idade < 15) {
            System.out.println("categoria infantil");
        } else if (idade >= 15 && idade < 18) {
            System.out.println("categoria juvenil");
        } else {
            System.out.println("categoria adulto");
        }

        // Doar se salário > 5000

        double salario = 3000;
        String mensagemDoar = "Eu vou doar 500 pra AnaJulia";
        String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter";
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado);

        double salarioAnual = 70000;
        double primeiraFaixa = 0.970;
        double segundaFaixa = 0.3735;
        double terceiraFaixa = 0.4950;
        double valorDoImposto;

        if (salarioAnual <= 34712) {
            valorDoImposto = salarioAnual * primeiraFaixa;
        } else if (salarioAnual >= 34713 && salarioAnual < 68507) {
            valorDoImposto = salarioAnual * segundaFaixa;
        } else {
            valorDoImposto = salarioAnual * terceiraFaixa;
        }
        System.out.println(valorDoImposto);

        // Switch
        // Imprima o dia da semana considerando 1 como domingo
        byte dia = 10;
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Opção inválida");
        }

        // c/ switch dados os valores de 1 a 7, imprima se é dia util ou fds
        // considerando 1 como domingo

        byte day = 4;
        switch (day){
            case 1:
            case 7:
                System.out.println("fds");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("dia útil");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}
