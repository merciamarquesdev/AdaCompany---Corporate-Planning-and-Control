package br.com.ada.AdaCompany.service;

import br.com.ada.AdaCompany.model.Endereco;
import br.com.ada.AdaCompany.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnderecoService {

    @Autowired
    private EnderecoRepository enderecoRepository;

    public Endereco salvar(Endereco endereco) {
        return enderecoRepository.save(endereco);
    }

    public List<Endereco> listar() {
        return (List<Endereco>) enderecoRepository.findAll();
    }

    public Endereco buscarPorId(Long id) {
        return enderecoRepository.findById(id).orElseThrow(IllegalArgumentException::new);
    }

    public String deletar(Long id) {
        Endereco endereco = enderecoRepository.findById(id).orElseThrow(IllegalArgumentException::new);

        if(endereco != null) {
            enderecoRepository.delete(endereco);
        }

        return "Endereço: " + endereco.getLogradouro() + ", " + endereco.getEstado() +  ", CEP: "  + endereco.getCep() +
                " deletado com sucesso!";
    }
}