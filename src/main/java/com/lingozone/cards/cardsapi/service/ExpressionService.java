package com.lingozone.cards.cardsapi.service;

import com.lingozone.cards.cardsapi.entity.Expression;
import com.lingozone.cards.cardsapi.repository.ExpressionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpressionService {

    @Autowired
    private ExpressionRepository expressionRepository;

    public List<Expression> findAll() {
        return expressionRepository.findAll();
    }
}
