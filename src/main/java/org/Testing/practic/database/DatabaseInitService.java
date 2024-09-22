package org.Testing.practic.database;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseInitService {
    public static void main(String[] args) throws IOException {
        String sql = new String(Files.readAllBytes(Paths.get("sql/init_db.sql")));
        Connection connection = Database.getInstance().getConnection();
        try (Statement statement = connection.createStatement()){
            statement.execute(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
