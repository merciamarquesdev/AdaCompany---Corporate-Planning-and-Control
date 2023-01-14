package br.com.ada.AdaCompany.repository;

import br.com.ada.AdaCompany.model.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

}