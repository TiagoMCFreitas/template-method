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
public class OrdenadoPorCursoNome extends MostrarAlunos{
    public OrdenadoPorCursoNome(String arquivo) {
        super(arquivo);
    }

    @Override
    public boolean Ordena(Aluno aluno1, Aluno aluno2) {
     int comparacaoCurso = aluno1.getCurso().compareToIgnoreCase(aluno2.getCurso());
        
        if (comparacaoCurso != 0) {
            return comparacaoCurso < 0;
        } else {
            return aluno1.getNome().compareToIgnoreCase(aluno2.getNome()) < 0;
        }
    }
}
