package br.com.ada.AdaCompany.repository;

import br.com.ada.AdaCompany.model.Funcionario;
import org.springframework.data.repository.CrudRepository;

public interface FuncionarioRepository extends CrudRepository<Funcionario, Long> {

}