package br.com.eventos.controller;

import br.com.eventos.dao.EventoDAO;
import br.com.eventos.model.Evento;

public class EventoController {
    private final EventoDAO eventoDAO = new EventoDAO();

    public void cadastrarEvento(Evento evento) {
        try {
            eventoDAO.salvar(evento);
            System.out.println("Evento cadastrado com sucesso!");
        } catch (Exception e) {
            System.err.println("Erro ao cadastrar evento: " + e.getMessage());
        }
    }
}//
