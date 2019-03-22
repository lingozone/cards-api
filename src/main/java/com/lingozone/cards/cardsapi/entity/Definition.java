package com.lingozone.cards.cardsapi.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Data
@Entity
public class Definition {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long definitionId;

    private String definition;

    private LocalDate creationDate;

    @ManyToOne(fetch = FetchType.LAZY)
    private Expression expression;
}
