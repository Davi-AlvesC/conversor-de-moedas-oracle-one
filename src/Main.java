import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("Seja bem-vindo/a ao Conversor de Moeda =]");
        while(true) {
            Scanner leitura = new Scanner(System.in);
            ConsultaAPI consultaAPI = new ConsultaAPI();
            System.out.println("");
            System.out.println("********************************************************");
            System.out.println("1) Dólar =>> Peso argentino");
            System.out.println("2) Peso argentino =>> Dólar ");
            System.out.println("3) Dólar  =>> Real brasileiro");
            System.out.println("4) Real brasileiro =>> Dólar  ");
            System.out.println("5) Dólar =>> Peso colombiano");
            System.out.println("6) Peso colombiano =>> Dólar");
            System.out.println("7) Sair");
            System.out.println("********************************************************");
            System.out.println("");
            var entrada = leitura.nextLine();

            if (Integer.parseInt(entrada) == 1) {
                System.out.println("Digite o valor do Dólar que deseja converter: ");
                var valor = leitura.nextLine();
                Conversao novaConversao = consultaAPI.buscaConversao("USD");
                System.out.print("Valor ");
                System.out.print(Double.parseDouble(valor));
                System.out.print(" [USD] correponde ao valor final de =>>> ");
                System.out.print(Double.parseDouble(valor) * novaConversao.conversion_rates().get("ARS"));
                System.out.println(" [ARS] ");
            } else if (Integer.parseInt(entrada) == 2) {
                System.out.println("Digite o valor do Peso argentino que deseja converter: ");
                var valor = leitura.nextLine();
                Conversao novaConversao = consultaAPI.buscaConversao("ARS");
                System.out.print("Valor ");
                System.out.print(Double.parseDouble(valor));
                System.out.print(" [ARS] correponde ao valor final de =>>> ");
                System.out.print(Double.parseDouble(valor) * novaConversao.conversion_rates().get("USD"));
                System.out.println(" [USD] ");
            } else if (Integer.parseInt(entrada) == 3) {
                System.out.println("Digite o valor do Dólar que deseja converter: ");
                var valor = leitura.nextLine();
                Conversao novaConversao = consultaAPI.buscaConversao("USD");
                System.out.print("Valor ");
                System.out.print(Double.parseDouble(valor));
                System.out.print(" [USD] correponde ao valor final de =>>> ");
                System.out.print(Double.parseDouble(valor) * novaConversao.conversion_rates().get("BRL"));
                System.out.println(" [BRL] ");
            } else if (Integer.parseInt(entrada) == 4) {
                System.out.println("Digite o valor do Real que deseja converter: ");
                var valor = leitura.nextLine();
                Conversao novaConversao = consultaAPI.buscaConversao("BRL");
                System.out.print("Valor ");
                System.out.print(Double.parseDouble(valor));
                System.out.print(" [BRL] correponde ao valor final de =>>> ");
                System.out.print(Double.parseDouble(valor) * novaConversao.conversion_rates().get("USD"));
                System.out.println(" [USD] ");
            } else if (Integer.parseInt(entrada) == 5) {
                System.out.println("Digite o valor do Dólar que deseja converter: ");
                var valor = leitura.nextLine();
                Conversao novaConversao = consultaAPI.buscaConversao("USD");
                System.out.print("Valor ");
                System.out.print(Double.parseDouble(valor));
                System.out.print(" [USD] correponde ao valor final de =>>> ");
                System.out.print(Double.parseDouble(valor) * novaConversao.conversion_rates().get("COP"));
                System.out.println(" [COP] ");
            } else if (Integer.parseInt(entrada) == 6) {
                System.out.println("Digite o valor do Peso colombiano que deseja converter: ");
                var valor = leitura.nextLine();
                Conversao novaConversao = consultaAPI.buscaConversao("COP");
                System.out.print("Valor ");
                System.out.print(Double.parseDouble(valor));
                System.out.print(" [COP] correponde ao valor final de =>>> ");
                System.out.print(Double.parseDouble(valor) * novaConversao.conversion_rates().get("USD"));
                System.out.println(" [USD] ");
            } else if (Integer.parseInt(entrada) == 7) {
                System.out.println("Programa Finalizado...");
                break;
            } else {
                System.out.println("Escolha uma opção valida...");
                System.out.println("");
            }
            //Conversao novaConversao = consultaAPI.buscaConversao(moeda);
            //System.out.println(novaConversao);
            //System.out.println(novaConversao.conversion_rates().get("BRL"));
        }
    }
}