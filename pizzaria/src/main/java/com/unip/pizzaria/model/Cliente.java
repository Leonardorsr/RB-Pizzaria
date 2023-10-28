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
public class Cliente {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  int codigo;
  long cpf;
  String email;
  String nome;
  String enderecoEntrega;
  long telefone;

  @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
  private List<Pedido> pedidos = new ArrayList<>();
}
