
import java.util.Scanner;

public class MenuBatalha {

    public Personagem criarPersonagem(Scanner scanner) {

        System.out.println("Bem vindo Jogador, vamos criar seu personagem.");
        System.out.println("Digite o nickname: ");
        String nickname = scanner.nextLine();


        System.out.println("Qual é a classe do " + nickname + "?");
        System.out.println("1 - Mago, 2- Guerreiro, 3 Bruxo");
        int escolha = scanner.nextInt();
        scanner.nextLine();

        Personagem personagem;

        System.out.println(nickname);

        switch (escolha) {
            case 1:
                personagem = new Mago(nickname);
                System.out.println("O personagem " + nickname + " foi criado com sucesso!");
                break;
            case 2:
                personagem = new Guerreiro(nickname);
                System.out.println("O personagem " + nickname + " foi criado com sucesso!");
                break;
            case 3:
                personagem = new Bruxo(nickname);
                System.out.println("O personagem " + nickname + " foi criado com sucesso!");
                break;
            default:
                System.out.println("Opcao invalida, tente novamente");
                return null;

        }

        return personagem;

    }


    public void menuAcoes(Scanner scanner, Personagem personagem, Personagem alvo) {
        int escolha = 0;
        do {
            System.out.println("O que gostaria de fazer?");
            System.out.println("1 - Atacar");
            System.out.println("2 - Usar Habilidade");
            System.out.println("3 - Se Buffar");
            System.out.print("Digite a opção: ");

            if (scanner.hasNextInt()) {
                escolha = scanner.nextInt();
                scanner.nextLine(); // consumir o Enter

                if (escolha < 1 || escolha > 3) {
                    System.out.println("Opção inválida! Tente novamente.\n");
                }
            } else {
                System.out.println("Entrada inválida! Por favor, digite um número.\n");
                scanner.nextLine(); // consumir a entrada inválida
            }
        } while (escolha < 1 || escolha > 3);

// Agora escolha é válida, pode usar no switch
        switch (escolha) {
            case 1:
                personagem.atacar(alvo);
                break;
            case 2:
                personagem.usarHabilidade(alvo);
                break;
            case 3:
                personagem.seBuffar();
                break;
        }

    }


}

