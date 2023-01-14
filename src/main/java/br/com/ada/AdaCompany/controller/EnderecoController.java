package br.com.ada.AdaCompany.controller;
import br.com.ada.AdaCompany.model.Endereco;
import br.com.ada.AdaCompany.service.EnderecoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class EnderecoController {

    private final EnderecoService enderecoService;

    public EnderecoController(EnderecoService enderecoService) {
        this.enderecoService = enderecoService;
    }

    @PostMapping("/enderecos")
    public Endereco salvar(@RequestBody Endereco endereco) {
        return enderecoService.salvar(endereco);
    }

    @GetMapping("/enderecos/{id}")
    public Endereco buscarPorId(@PathVariable Long id) {
        return enderecoService.buscarPorId(id);
    }

    @GetMapping("/enderecos")
    public List<Endereco> listar() {
        return enderecoService.listar();
    }

    @DeleteMapping("/enderecos/deletar/{id}")
    public String deletarVeiculo(@PathVariable Long id) {
        return enderecoService.deletar(id);
    }

}
