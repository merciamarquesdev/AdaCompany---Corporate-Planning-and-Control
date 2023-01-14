package br.com.ada.AdaCompany.repository;

import br.com.ada.AdaCompany.model.Despesa;
import org.springframework.data.repository.CrudRepository;

public interface DespesaRepository extends CrudRepository<Despesa, Long> {
}