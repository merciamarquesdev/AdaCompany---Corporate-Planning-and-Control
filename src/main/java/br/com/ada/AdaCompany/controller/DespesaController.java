package br.com.ada.AdaCompany.controller;
import br.com.ada.AdaCompany.model.Despesa;
import br.com.ada.AdaCompany.service.DespesaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class DespesaController {

    private final DespesaService despesaService;

    public DespesaController(DespesaService despesaService) {
        this.despesaService = despesaService;
    }

    @PostMapping("/despesas")
    public Despesa salvar(@RequestBody Despesa despesa) {
        return despesaService.salvar(despesa);
    }

    @GetMapping("/despesas/{id}")
    public Despesa buscarPorId(@PathVariable Long id) {
        return despesaService.buscarPorId(id);
    }

    @GetMapping("/despesas")
    public List<Despesa> listar() {
        return despesaService.listar();
    }



    @DeleteMapping("/despesas/deletar/{id}")
    public String deletarVeiculo(@PathVariable Long id) {
        return despesaService.deletar(id);
    }
}