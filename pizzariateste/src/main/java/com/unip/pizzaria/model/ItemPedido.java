package com.unip.pizzaria.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ItemPedido {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  int codigo;
  int quantidade;
  String tamanho;

  @ManyToOne
  @JoinColumn(name = "numero_pedido", nullable = false)
  private Pedido pedido;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "codigo_produto")
  private Produto produto;
}
