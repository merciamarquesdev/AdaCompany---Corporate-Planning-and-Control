package br.com.ada.AdaCompany.service;

import br.com.ada.AdaCompany.model.Veiculo;
import br.com.ada.AdaCompany.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VeiculoService {

    @Autowired
    private VeiculoRepository veiculoRepository;

    public Veiculo salvar(Veiculo veiculo) {
        return veiculoRepository.save(veiculo);
    }

    public List<Veiculo> listar() {
        return (List<Veiculo>) veiculoRepository.findAll();
    }

    public Veiculo buscarPorId(Long id) {
        return veiculoRepository.findById(id).orElseThrow(IllegalArgumentException::new);
    }
    public List<Veiculo> buscarPorAno(String ano) {
        Iterable<Veiculo> veiculoList = veiculoRepository.findAll();
        List<Veiculo> veiculos = new ArrayList<>();
        veiculoList.forEach(veiculo -> {
            if (veiculo.getAnoFabricacao().equals(ano)
                    || veiculo.getAnoModelo().equals(ano)) {
                veiculos.add(veiculo);
            }
        });
        return veiculos;
    }

    public String deletar(Long id) {
        Veiculo veiculo = veiculoRepository.findById(id).orElseThrow(IllegalArgumentException::new);

        if(veiculo != null) {
            veiculoRepository.delete(veiculo);
        }

        return "O veículo " + veiculo.getMarca() + " de placa " + veiculo.getPlaca() + " foi deletado com sucesso!";
    }
}