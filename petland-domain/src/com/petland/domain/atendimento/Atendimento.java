package com.petland.domain.atendimento;

import com.petland.domain.cadastro.Animal;
import com.petland.domain.cadastro.Cadastro;
import com.petland.domain.cadastro.ProdutoServico;

import java.time.LocalDate;
import java.time.LocalTime;

public class Atendimento {
    private Integer id;
    private String descricao;
    private AtendimentoTipo atendimentoTipo;
    private AtendimentoStatus atendimentoStatus;
    private LocalDate data;
    private LocalTime hora;
    private Double valor;

    private Cadastro solicitante;
    private ProdutoServico servico;
    private Animal paciente;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public AtendimentoTipo getAtendimentoTipo() {
        return atendimentoTipo;
    }

    public void setAtendimentoTipo(AtendimentoTipo atendimentoTipo) {
        this.atendimentoTipo = atendimentoTipo;
    }

    public AtendimentoStatus getAtendimentoStatus() {
        return atendimentoStatus;
    }

    public void setAtendimentoStatus(AtendimentoStatus atendimentoStatus) {
        this.atendimentoStatus = atendimentoStatus;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public Cadastro getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(Cadastro solicitante) {
        this.solicitante = solicitante;
    }

    public ProdutoServico getServico() {
        return servico;
    }

    public void setServico(ProdutoServico servico) {
        this.servico = servico;
    }

    public Animal getPaciente() {
        return paciente;
    }

    public void setPaciente(Animal paciente) {
        this.paciente = paciente;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
