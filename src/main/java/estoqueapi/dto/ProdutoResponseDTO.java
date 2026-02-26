package estoqueapi.dto;

import java.math.BigDecimal;

public class ProdutoResponseDTO {

    private Long id;
    private String nome;
    private BigDecimal preco;
    private Integer quantidade;

    public ProdutoResponseDTO() {
    }

    public ProdutoResponseDTO(Long id, String nome, BigDecimal preco, Integer quantidade) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }
}