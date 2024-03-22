/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.template.persistencia;

import com.template.model.Aluno;

/**
 *
 * @author tiago
 */
public class OrdenadoPorNome extends MostrarAlunos{
     public OrdenadoPorNome(String arquivo) {
        super(arquivo);
    }

    @Override
    public boolean Ordena(Aluno aluno1, Aluno aluno2) {
        if(aluno1.getNome().compareToIgnoreCase(aluno2.getNome()) <= 0) return true;
        else return false;
    }
    
}
