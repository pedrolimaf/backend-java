package microservice.mircoservice.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import microservice.mircoservice.model.Produtos;

@Repository
public interface ProdutosRepository extends JpaRepository<Produtos, Long>{

}
