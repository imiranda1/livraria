package model;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class Comprador {
    private String nome;
    private String rg;
    private String CPF;
    private Date dataNascimento;

    public Comprador(String nome, String rg, String CPF, Date dataNascimento) {
        this.nome = nome;
        this.rg = rg;
        this.CPF = CPF;
        this.dataNascimento = dataNascimento;
    }

    public Comprador() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }


    public Integer getIdade() {
        Integer idade = 0;
        LocalDate hoje = LocalDate.now() ;
        if (this.dataNascimento != null) {
            LocalDate dn = ZonedDateTime.ofInstant(dataNascimento.toInstant(), ZoneId.of("America/Sao_Paulo")).toLocalDate();
            Period dif = dn.until(hoje);
            idade = dif.getYears();
        }
        return idade;

    }
}
