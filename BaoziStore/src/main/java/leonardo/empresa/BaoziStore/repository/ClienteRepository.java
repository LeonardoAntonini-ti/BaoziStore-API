package leonardo.empresa.BaoziStore.repository;

import leonardo.empresa.BaoziStore.modelo.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
