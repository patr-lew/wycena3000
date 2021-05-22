package com.lewandowski.wycena3000.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "project_details")
@Getter
@Setter
@NoArgsConstructor
public class ProjectDetails {

    @Id
    @Column(name = "project_id")
    private long id;

    @OneToOne
    @MapsId
    @JoinColumn(name = "project_id")
    private Project project;

    @Column(name = "worker_cost", scale = 2, precision = 11)
    private BigDecimal workerCost;

    @Column(name = "other_costs", scale = 2, precision = 11)
    private BigDecimal otherCosts;

    @Column(name = "montage_cost", scale = 2, precision = 11)
    private BigDecimal montageCost;

    @Override
    public String toString() {
        return "ProjectDetails{" +
                "id=" + id +
                ", workerCost=" + workerCost +
                ", otherCosts=" + otherCosts +
                ", montageCost=" + montageCost +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProjectDetails that = (ProjectDetails) o;
        return id == that.id && Objects.equals(workerCost, that.workerCost) && Objects.equals(otherCosts, that.otherCosts) && Objects.equals(montageCost, that.montageCost);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, workerCost, otherCosts, montageCost);
    }
}