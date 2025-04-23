package br.com.eventos.dao;

import br.com.eventos.model.Participante;
import br.com.eventos.util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ParticipanteDAO {
    private final Connection conn;

    public ParticipanteDAO() {
        this.conn = DBConnection.getConnection();
    }

    public void salvar(Participante participante) throws Exception {
        String sql = "INSERT INTO participante (nome, email) VALUES (?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, participante.getNome());
            stmt.setString(2, participante.getEmail());
            stmt.executeUpdate();
        }
    }
}
//
