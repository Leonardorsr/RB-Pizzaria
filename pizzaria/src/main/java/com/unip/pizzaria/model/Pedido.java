package com.unip.pizzaria.model;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Pedido {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int numero;
  private Timestamp momento;
  private float valor;
  private String status;
  private String pagamento;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "codigo_cliente")
  private Cliente cliente;

  @OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL)
  private List<ItemPedido> itensPedido = new ArrayList<ItemPedido>();

  public void adicionarItem(ItemPedido itemPedido) {
    getItensPedido().add(itemPedido);
    itemPedido.setPedido(this);
  }
}
