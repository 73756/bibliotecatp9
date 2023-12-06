package org.example;
import org.springframework.stereotype.Service;
import org.example.UsuarioRepository;
@Service
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    // Métodos do serviço que utilizam usuarioRepository
}
