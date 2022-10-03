package com.ayi.trabajo_final.app.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name= "facturas")
public class TicketEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "description")
    private String description;
    @Column (name = "total")
    private Integer total;

    public TicketEntity(String description, Integer total) {
        this.description = description;
        this.total = total;
    }

    @ManyToOne
    @JoinColumn (name="id_customer")
    private CustomerEntity customer;
}