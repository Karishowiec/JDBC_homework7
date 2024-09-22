package org.Testing.practic.database.entity;

public class LongestProject {
    private int id;
    private int projectDuration;

    public LongestProject(int id, int projectDuration) {
        this.id = id;
        this.projectDuration = projectDuration;
    }

    @Override
    public String toString() {
        return "LongestProject{" +
                "id=" + id +
                ", projectDuration=" + projectDuration +
                '}';
    }


}
