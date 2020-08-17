package br.com.msresgate.controller;

import br.com.msresgate.domain.entities.Pessoa;
import br.com.msresgate.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/pessoa")
public class PessoaController {

    @Autowired
    private PessoaService service;

    @ResponseBody @RequestMapping("/cadastro")
    public ModelAndView getForm() {
        return new ModelAndView("/form-pessoa");
    }

    @ResponseBody @GetMapping("/list")
    public ModelAndView getList(){
        List<Pessoa> pessoas = service.findAll();
        ModelAndView modelAndView = new ModelAndView("/list-pessoas");
        modelAndView.addObject("pessoas", pessoas);

        return modelAndView;
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public ModelAndView save(Pessoa pessoa) {
        service.save(pessoa);
        return getList();
    }

}
