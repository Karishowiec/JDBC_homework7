package org.Testing.practic.database.entity;

public class MaxSalaryWorker {
    private long salary ;
    private String name;

    public MaxSalaryWorker(long salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    @Override
    public String toString() {
        return "MaxSalaryWorker{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }
}
