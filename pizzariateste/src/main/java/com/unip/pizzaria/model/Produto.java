package com.unip.pizzaria.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
public class Produto {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int codigo;
  private String nome;
  private String descricao;
  private float valor;
  private String tipo;

  @OneToMany(mappedBy = "produto", cascade = CascadeType.ALL)
  private List<ItemPedido> itensPedido = new ArrayList<>();

}
