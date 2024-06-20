package com.natanneves.eccommerce.domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.natanneves.eccommerce.domain.enums.TipoCliente;
import jakarta.persistence.*;

import java.util.*;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Integer id;
    private String name;
    private String email;

    private String cpf_ou_cnpj;
    private Integer tipo;

    @JsonManagedReference
    @OneToMany(mappedBy = "cliente")
    private List<Endereco> enderecos = new ArrayList<>();

    @JsonManagedReference
    @ElementCollection
    @CollectionTable(name = "TELEFONE")
    @OneToMany(mappedBy = "cliente")
    private Set<Telefone> telefones = new HashSet<>();

    public Cliente(){
    }

    public Cliente(Integer id, String name, String email, String cpfOuCnpj, TipoCliente tipo) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.cpf_ou_cnpj = cpfOuCnpj;
        this.tipo = tipo.getCod();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpfOuCnpj() {
        return cpf_ou_cnpj;
    }

    public void setCpfOuCnpj(String cpfOuCnpj) {
        this.cpf_ou_cnpj = cpfOuCnpj;
    }

    public TipoCliente getTipo() {
        return TipoCliente.toEnum(tipo);
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    public Set<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(Set<Telefone> telefones) {
        this.telefones = telefones;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(id, cliente.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
