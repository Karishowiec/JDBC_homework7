package org.Testing.practic.database.entity;

import java.time.LocalDate;

public class Worker {
    private String type;
    private String name;
    private LocalDate date;

    public Worker(String type, String name, LocalDate date) {
        this.type = type;
        this.name = name;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
