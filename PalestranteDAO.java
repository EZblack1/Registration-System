package br.com.eventos.dao;

import br.com.eventos.model.Palestrante;
import br.com.eventos.util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class PalestranteDAO {
    private final Connection conn;

    public PalestranteDAO() {
        this.conn = DBConnection.getConnection();
    }

    public void salvar(Palestrante palestrante) throws Exception {
        String sql = "INSERT INTO palestrante (nome, curriculo, area_atuacao) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, palestrante.getNome());
            stmt.setString(2, palestrante.getCurriculo());
            stmt.setString(3, palestrante.getAreaAtuacao());
            stmt.executeUpdate();
        }
    }
}
