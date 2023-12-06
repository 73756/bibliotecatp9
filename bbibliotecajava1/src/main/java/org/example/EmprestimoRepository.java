import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.example.Emprestimo;
@Repository
public interface EmprestimoRepository extends JpaRepository<Emprestimo, Long> {
    // Métodos específicos, se necessário
}
