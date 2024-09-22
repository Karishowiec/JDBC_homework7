package org.Testing.practic.database.entity;

public class MaxProjectClient {
    private String name;
    private int projectClients;
    public MaxProjectClient(String name, int projectClients) {
        this.name = name;
        this.projectClients = projectClients;
    }

    @Override
    public String toString() {
        return "MaxProjectClient{" +
                "name='" + name + '\'' +
                ", projectClients=" + projectClients +
                '}';
    }
}
