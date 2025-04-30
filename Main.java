package br.com.eventos;

import br.com.eventos.controller.EventoController;
import br.com.eventos.controller.PalestranteController;
import br.com.eventos.controller.ParticipanteController;
import br.com.eventos.model.Evento;
import br.com.eventos.model.Palestrante;
import br.com.eventos.model.Participante;


public class Main {
    public static void main(String[] args) {
        EventoController eventoController = new EventoController();
        PalestranteController palestranteController = new PalestranteController();
        ParticipanteController participanteController = new ParticipanteController();

        // Cadastro de palestrante
        Palestrante palestrante = new Palestrante("Ana Silva", "Doutora em IA pela USP", "Inteligência Artificial");
        palestranteController.cadastrarPalestrante(palestrante);

        // Cadastro de evento
        Evento evento = new Evento(
                "Tech Summit 2025",
                "Evento sobre tecnologias emergentes",
                "2025-03-20",
                "Centro de Convenções",
                300
        );
        eventoController.cadastrarEvento(evento);

        // Cadastro de participante
        Participante participante = new Participante("Carlos Souza", "carlos@email.com");
        participanteController.cadastrarParticipante(participante);
    }
}//
