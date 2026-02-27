package estoqueapi.repository; // Define o pacote (pasta) aonde a classe está.

import estoqueapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {  // Herda tudo que a JPA oferece
    // Produto: Entidade que vc quer gerenciar / Long: Tipo do ID (chave primaria)
}

