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
public class OrdenadoPorEnfaseCursoNome extends MostrarAlunos{
     public OrdenadoPorEnfaseCursoNome(String arquivo) {
        super(arquivo);
    }
     
     @Override
    public boolean Ordena(Aluno aluno1, Aluno aluno2) {
       int comparacaoEnfase = aluno1.getEnfase().compareToIgnoreCase(aluno2.getEnfase());
        
        // Se as enfases forem diferentes, retorna true se o primeiro aluno vier antes do segundo na ordenação
        if (comparacaoEnfase != 0) {
            return comparacaoEnfase < 0;
        } else {
            // Compara pelo curso
            int comparacaoCurso = aluno1.getCurso().compareToIgnoreCase(aluno2.getCurso());
            
            // Se os cursos forem diferentes, retorna true se o primeiro aluno vier antes do segundo na ordenação
            if (comparacaoCurso != 0) {
                return comparacaoCurso < 0;
            } else {
                // Compara pelos nomes
                return aluno1.getNome().compareToIgnoreCase(aluno2.getNome()) < 0;
            }
        }
    }
}
