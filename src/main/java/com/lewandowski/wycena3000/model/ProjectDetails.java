package com.lewandowski.wycena3000.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "project_details")
@Getter
@Setter
@AllArgsConstructor
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

    private String comment;

    public ProjectDetails() {
    }
}