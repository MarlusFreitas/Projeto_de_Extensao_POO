import java.util.Scanner;
import java.util.ArrayList;

// Classe principal do programa
public class ConsumoVeiculos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Veiculo> listaVeiculos = new ArrayList<>();
        boolean continuar = true;

        while (continuar) {
            
            System.out.println("Digite a marca do veículo (ou 'sair' para finalizar): ");
            String marca = scanner.nextLine();
            if (marca.equalsIgnoreCase("sair")) {
                continuar = false;
                break;
            }

            System.out.println("Digite o modelo do veículo: ");
            String modelo = scanner.nextLine();

            System.out.println("Digite a capacidade do tanque do veículo: ");
            double capacidadeTanque = Double.parseDouble(scanner.nextLine());

            System.out.println("Digite o consumo médio do veículo: ");
            double consumoMedio = Double.parseDouble(scanner.nextLine());


            if (marca.equalsIgnoreCase("carro")) {
                listaVeiculos.add(new Carro(marca, modelo, capacidadeTanque, consumoMedio));
            } else if (marca.equalsIgnoreCase("moto")) {
                listaVeiculos.add(new Moto(marca, modelo, capacidadeTanque, consumoMedio));
            } else if (marca.equalsIgnoreCase("carro eletrico")) {
                listaVeiculos.add(new CarroEletrico(marca, modelo, consumoMedio));
            }
        }

        while (!continuar) {
            System.out.println("Digite a opção desejada:");
            System.out.println("1 - Imprimir a lista completa de veículos");
            System.out.println("2 - Imprimir um veículo específico");
            System.out.println("3 - Finalizar o programa");

            int opcao = Integer.parseInt(scanner.nextLine());

            if (opcao == 1) {
                for (Veiculo veiculo : listaVeiculos) {
                    System.out.println(veiculo.getMarca() + (" ") + (" - ") + (" ") + veiculo.getModelo() + (" ") + (" - Autonomia: ") + (" ") + veiculo.calcularAutonomia() + " ");
                }
            } else if (opcao == 2) {
                System.out.println("Digite o índice do veículo a ser impresso: ");
                int indice = Integer.parseInt(scanner.nextLine());
                Veiculo veiculoEspecifico = listaVeiculos.get(indice);
                System.out.println(veiculoEspecifico.getMarca() + (" ") + (" - ") + (" ") + veiculoEspecifico.getModelo() + " - Autonomia: " + veiculoEspecifico.calcularAutonomia());

            } else if (opcao == 3) {
                System.out.println("O programa será encerrado, FIM!");
                break;
            } else {
                System.out.println("Opção inválida!");
            }
            System.out.print("\n ");
        }
    }
}
