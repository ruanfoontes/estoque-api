package estoqueapi.service;
import estoqueapi.model.Produto;
import estoqueapi.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import estoqueapi.dto.ProdutoRequestDTO;
import estoqueapi.dto.ProdutoResponseDTO;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository produtoRepository;

    //Método para criar um novo Produto
    public Produto criarProduto(Produto produto) {
        return produtoRepository.save(produto);
    }

    //Método para buscar um produto por ID
    public Optional<Produto> buscarPorID(Long id) {
        return produtoRepository.findById(id);
    }

    //Método para listar todos os produtos
    public List<Produto> listarTodos() {
        return produtoRepository.findAll();
    }

    //Método para atualizar um produto
    public Produto atualizarProduto(Long id, Produto produtoAtualizado) {
        Optional<Produto> produtoExistente = produtoRepository.findById(id);
        if (produtoExistente.isPresent()) {
            Produto produto = produtoExistente.get();
            produto.setNome(produtoAtualizado.getNome());
            produto.setPreco(produtoAtualizado.getPreco());
            produto.setQuantidade(produtoAtualizado.getQuantidade());
            return produtoRepository.save(produto);
        }
        return null;

    }
    //Método para deletar um produto
    public void DeletarProduto(Long id) {
        produtoRepository.deleteById(id);
    }

    // Método para converter Produto em ProdutoResponseDTO
    public ProdutoResponseDTO converterParaResponseDTO(Produto produto) {
        return new ProdutoResponseDTO(
                produto.getId(),
                produto.getNome(),
                produto.getPreco(),
                produto.getQuantidade()
        );
    }

    // Método para converter ProdutoRequestDTO em Produto
    public Produto converterDTOemProduto(ProdutoRequestDTO dto) {
        return new Produto(
                dto.getNome(),
                dto.getPreco(),
                dto.getQuantidade()
        );
    }
}