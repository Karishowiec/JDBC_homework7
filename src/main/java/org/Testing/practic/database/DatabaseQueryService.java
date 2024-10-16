package org.Testing.practic.database;

import org.Testing.practic.database.entity.LongestProject;
import org.Testing.practic.database.entity.MaxProjectClient;
import org.Testing.practic.database.entity.MaxSalaryWorker;
import org.Testing.practic.database.entity.Worker;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DatabaseQueryService {
    public List<MaxSalaryWorker> findMaxSalaryWorker() throws IOException {
        List<MaxSalaryWorker> result = new ArrayList<>();
        String sql = new String(Files.readAllBytes(Paths.get("sql/find_max_salary_worker.sql")));
        Connection connection = Database.getInstance().getConnection();
        try (PreparedStatement statement = connection.prepareStatement(sql)){
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                result.add(new MaxSalaryWorker(resultSet.getInt("salary"), resultSet.getString("name")));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return result;
    }
    public List<LongestProject> findLongestProject() throws IOException {
        List<LongestProject> result = new ArrayList<>();
        String sql = new String(Files.readAllBytes(Paths.get("sql/find_longest_project.sql")));
        Connection connection = Database.getInstance().getConnection();
        try (PreparedStatement statement = connection.prepareStatement(sql))){
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                result.add(new LongestProject(resultSet.getInt("id"), resultSet.getInt("duration_months")));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return result;
    }
    public List<MaxProjectClient> findMaxProjectClients() throws IOException {
        List<MaxProjectClient> result = new ArrayList<>();
        String sql = new String(Files.readAllBytes(Paths.get("sql/find_max_projects_client.sql")));
        Connection connection = Database.getInstance().getConnection();
        try (PreparedStatement statement = connection.prepareStatement(sql)){
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                result.add(new MaxProjectClient(resultSet.getString("name"), resultSet.getInt("project_count")));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return result;
    }

    public List<Worker> findWorker() throws IOException {
        List<Worker> result = new ArrayList<>();
        String sql = new String(Files.readAllBytes(Paths.get("sql/find_youngest_eldest_workers.sql")));
        Connection connection = Database.getInstance().getConnection();
        try (PreparedStatement statement = connection.prepareStatement(sql)){
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                result.add(new Worker(resultSet.getString("type"), resultSet.getString("name"), resultSet.getObject("BIRTHDAY", LocalDate.class)));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return result;
    }

    public static void main(String[] args) throws IOException {
        DatabasePopulateService.main(new String[0]);
        DatabaseQueryService databaseQueryService = new DatabaseQueryService();
        System.out.println(databaseQueryService.findMaxSalaryWorker());
        System.out.println(databaseQueryService.findLongestProject());
        System.out.println(databaseQueryService.findMaxProjectClients());
        System.out.println(databaseQueryService.findWorker());

    }

}
