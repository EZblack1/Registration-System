package br.com.eventos.controller;

import br.com.eventos.dao.ParticipanteDAO;
import br.com.eventos.model.Participante;

public class ParticipanteController {
    private final ParticipanteDAO participanteDAO = new ParticipanteDAO();

    public void cadastrarParticipante(Participante participante) {
        try {
            participanteDAO.salvar(participante);
            System.out.println("Participante cadastrado com sucesso!");
        } catch (Exception e) {
            System.err.println("Erro ao cadastrar participante: " + e.getMessage());
        }
    }
}
