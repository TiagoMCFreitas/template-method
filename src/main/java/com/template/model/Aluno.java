/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.template.model;

import java.util.Objects;

/**
 *
 * @author tiago
 */
public class Aluno {
    private String Nome;
    private String Curso;
    private String Situacao;
    private String Enfase;

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getCurso() {
        return Curso;
    }

    public void setCurso(String Curso) {
        this.Curso = Curso;
    }

    public String getSituacao() {
        return Situacao;
    }

    public void setSituacao(String Situação) {
        this.Situacao = Situação;
    }

    public String getEnfase() {
        return Enfase;
    }

    public void setEnfase(String Ênfase) {
        this.Enfase = Ênfase;
    }

    public Aluno(String Nome, String Curso, String Situação, String Ênfase) {
        this.Nome = Nome;
        this.Curso = Curso;
        this.Situacao = Situação;
        this.Enfase = Ênfase;
    }

    public Aluno() {
    }
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.Nome);
        hash = 29 * hash + Objects.hashCode(this.Curso);
        hash = 29 * hash + Objects.hashCode(this.Situacao);
        hash = 29 * hash + Objects.hashCode(this.Enfase);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Aluno other = (Aluno) obj;
        if (!Objects.equals(this.Nome, other.Nome)) {
            return false;
        }
        if (!Objects.equals(this.Curso, other.Curso)) {
            return false;
        }
        if (!Objects.equals(this.Situacao, other.Situacao)) {
            return false;
        }
        return Objects.equals(this.Enfase, other.Enfase);
    }

  
    
    

}
