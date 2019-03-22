package com.lingozone.cards.cardsapi.rest;

import com.lingozone.cards.cardsapi.entity.Expression;
import com.lingozone.cards.cardsapi.service.ExpressionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/expression")
public class ExpressionController {

    @Autowired
    private ExpressionService expressionService;

    @GetMapping("/getAll")
    public List<Expression> findAll() {
        return expressionService.findAll();
    }
}
