package br.com.cravoecanela.controller;

import br.com.cravoecanela.model.Pacote;
import br.com.cravoecanela.service.impl.PacoteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class PageController {

    @Autowired
    private PacoteServiceImpl service;

    @GetMapping("/")
    private String home (Model model){
        List<Pacote> pacotes = service.recuperarTodos();
        model.addAttribute("pacotes", pacotes);
        return "home";
    }
}
