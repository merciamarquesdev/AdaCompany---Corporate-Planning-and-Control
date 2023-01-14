package br.com.ada.AdaCompany.service;

import br.com.ada.AdaCompany.model.Usuario;
import br.com.ada.AdaCompany.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario salvar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public List<Usuario> listar() {
        return (List<Usuario>) usuarioRepository.findAll();
    }

    public Usuario buscarPorId(Long id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    public String deletar(Long id) {
        Usuario usuario = usuarioRepository.findById(id).orElse(null);

        if (usuario != null) {
            usuarioRepository.delete(usuario);
            return "Usuário " + usuario.getNome() + ", que possui o CPF " + usuario.getCpf() + ", foi deletado com sucesso!";
        } else {
            return "Não encontramos o usuário.";
        }
    }
    public Usuario update(Usuario usuario, Long id){
        Usuario usuarioFound = usuarioRepository.findById(id).orElse(null);

        usuarioFound.setNome(usuario.getNome());
        usuarioFound.setCpf(usuario.getCpf());
        usuarioFound.setEmail(usuario.getEmail());
        usuarioFound.setTelefone(usuario.getTelefone());


        usuarioRepository.save(usuarioFound);

        return usuarioFound;
    }

}