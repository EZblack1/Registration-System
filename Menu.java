ackage br.com.eventos.ui;

import br.com.eventos.model.Evento;
import br.com.eventos.model.Palestrante;
import br.com.eventos.model.Participante;
import java.util.*;

public class Menu {

    private List<Evento> eventos = new ArrayList<>();
    private List<Palestrante> palestrantes = new ArrayList<>();
    private List<Participante> participantes = new ArrayList<>();

    private Scanner scanner = new Scanner(System.in);

    public void exibirMenu() {
        int opcao;
        do {
            System.out.println("\n--- MENU PRINCIPAL ---");
            System.out.println("1. Cadastrar Evento");
            System.out.println("2. Cadastrar Palestrante");
            System.out.println("3. Cadastrar Participante");
            System.out.println("4. Listar Eventos");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            switch (opcao) {
                case 1 -> cadastrarEvento();
                case 2 -> cadastrarPalestrante();
                case 3 -> cadastrarParticipante();
                case 4 -> listarEventos();
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }

    private void cadastrarEvento() {
        System.out.print("Nome do Evento: ");
        String nome = scanner.nextLine();

        System.out.print("Descrição: ");
        String descricao = scanner.nextLine();

        System.out.print("Data (dd/MM/yyyy): ");
        String data = scanner.nextLine();

        System.out.print("Local: ");
        String local = scanner.nextLine();

        System.out.print("Capacidade: ");
        int capacidade = scanner.nextInt();
        scanner.nextLine(); // limpar buffer

        Evento evento = new Evento(nome, descricao, data , local, capacidade);
        eventos.add(evento);

        System.out.println("Evento cadastrado com sucesso!");
    }

    private void cadastrarPalestrante() {
        System.out.print("Nome do Palestrante: ");
        String nome = scanner.nextLine();

        System.out.print("Currículo: ");
        String curriculo = scanner.nextLine();

        System.out.print("Área de Atuação: ");
        String area = scanner.nextLine();

        Palestrante palestrante = new Palestrante(nome, curriculo, area);
        palestrantes.add(palestrante);

        System.out.println("Palestrante cadastrado com sucesso!");
    }

    private void cadastrarParticipante() {
        System.out.print("Nome do Participante: ");
        String nome = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        Participante participante = new Participante(nome, email);
        participantes.add(participante);

        System.out.println("Participante cadastrado com sucesso!");
    }

    private void listarEventos() {
        if (eventos.isEmpty()) {
            System.out.println("Nenhum evento cadastrado.");
        } else {
            System.out.println("\n--- LISTA DE EVENTOS ---");
            for (Evento evento : eventos) {
                System.out.println(evento);
            }
        }
    }
}
