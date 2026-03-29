package ap2.carolinaortiz.repository;

import ap2.carolinaortiz.model.Customer;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    // ⚙️🔍 Definir método Listar por Estado
    List<Customer> findByState(String state);
    
}
