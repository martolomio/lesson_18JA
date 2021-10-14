package com.mart.domain;

import javax.persistence.*;
import java.util.Objects;
@Entity
@Table
public class Participant {
    @Id
    @GeneratedValue
    private  Integer id;
    @Column
    private String name;
    @Column
    private String email;
    @Column
    private Integer level;
    @Column
    private String primarySkill;

    public Participant(Integer id) {
        this.id = id;
    }

    public Participant() {
    }

    public String getPrimarySkill() {
        return primarySkill;
    }

    public void setPrimarySkill(String primarySkill) {
        this.primarySkill = primarySkill;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Participant that = (Participant) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(email, that.email) && Objects.equals(level, that.level) && Objects.equals(primarySkill, that.primarySkill);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email, level, primarySkill);
    }

    @Override
    public String toString() {
        return "Participant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", level=" + level +
                ", primarySkill='" + primarySkill + '\'' +
                '}';
    }
}
