import org.springframework.data.jpa.repository.JpaRepository;
import org.example.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    // Métodos específicos, se necessário
}
