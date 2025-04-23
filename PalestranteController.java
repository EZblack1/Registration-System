package br.com.eventos.controller;

import br.com.eventos.dao.PalestranteDAO;
import br.com.eventos.model.Palestrante;

public class PalestranteController {
    private final PalestranteDAO palestranteDAO = new PalestranteDAO();

    public void cadastrarPalestrante(Palestrante palestrante) {
        try {
            palestranteDAO.salvar(palestrante);
            System.out.println("Palestrante cadastrado com sucesso!");
        } catch (Exception e) {
            System.err.println("Erro ao cadastrar palestrante: " + e.getMessage());
        }
    }
}
//
