package br.com.eventos.dao;

import br.com.eventos.model.Evento;
import br.com.eventos.util.DBConnection;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

public class EventoDAO {
    private final Connection conn;

    public EventoDAO() {
        this.conn = DBConnection.getConnection();
    }

    public void salvar(Evento evento) throws Exception {
        String sql = "INSERT INTO evento (nome, descricao, data, local, capacidade) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, evento.getNome());
            stmt.setString(2, evento.getDescricao());
            stmt.setDate(3, Date.valueOf(evento.getData()));
            stmt.setString(4, evento.getLocal());
            stmt.setInt(5, evento.getCapacidade());
            stmt.executeUpdate();
        }
    }
}