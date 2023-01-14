package br.com.ada.AdaCompany.controller;
import br.com.ada.AdaCompany.model.Funcionario;
import br.com.ada.AdaCompany.service.FuncionarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FuncionarioController {

    private final FuncionarioService funcionarioService;

    public FuncionarioController(FuncionarioService funcionarioService) {
        this.funcionarioService = funcionarioService;
    }

    @PostMapping("/funcionarios")
    public Funcionario salvar(@RequestBody Funcionario funcionario) {
        return funcionarioService.salvar(funcionario);
    }

    @GetMapping("/funcionarios/{id}")
    public Funcionario buscarPorId(@PathVariable Long id) {
        return funcionarioService.buscarPorId(id);
    }

    @GetMapping("/funcionarios")
    public List<Funcionario> listar() {
        return funcionarioService.listar();
    }

    @DeleteMapping("/funcionarios/deletar/{id}")
    public String deletarUsuario(@PathVariable Long id) {
        return funcionarioService.deletar(id);
    }
}
