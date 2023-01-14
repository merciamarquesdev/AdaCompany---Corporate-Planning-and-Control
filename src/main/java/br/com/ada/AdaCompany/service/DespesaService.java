package br.com.ada.AdaCompany.service;

import br.com.ada.AdaCompany.model.Despesa;
import br.com.ada.AdaCompany.repository.DespesaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DespesaService {

    @Autowired
    private  DespesaRepository despesaRepository;

    public Despesa salvar(Despesa despesa) {
        return despesaRepository.save(despesa);
    }

    public List<Despesa> listar() {
        return (List<Despesa>) despesaRepository.findAll();
    }

    public Despesa buscarPorId(Long id) {
        return despesaRepository.findById(id).orElseThrow(IllegalArgumentException::new);
    }

    public String deletar(Long id) {
        Despesa despesa = despesaRepository.findById(id).orElseThrow(IllegalArgumentException::new);

        if(despesa != null) {
            despesaRepository.delete(despesa);
        }

        return "Despesa " + despesa.getCategoria() + " de código " + despesa.getNumeroNF() + " foi deletada com sucesso!";
    }

}
