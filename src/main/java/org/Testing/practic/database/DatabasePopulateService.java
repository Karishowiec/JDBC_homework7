package org.Testing.practic.database;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabasePopulateService {
    public static void main(String[] args) throws IOException {
        DatabaseInitService.main(new String[0]);
        String sql = new String(Files.readAllBytes(Paths.get("sql/populate_db.sql")));
        Connection connection = Database.getInstance().getConnection();
        try (Statement statement = connection.createStatement()){
            statement.execute(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
