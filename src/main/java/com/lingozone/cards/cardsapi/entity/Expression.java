package com.lingozone.cards.cardsapi.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity
public class Expression {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long expressionId;

    private String expression;

    private LocalDate creationDate;

    @OneToMany(mappedBy = "expression")
    private List<Definition> definitions;
}
