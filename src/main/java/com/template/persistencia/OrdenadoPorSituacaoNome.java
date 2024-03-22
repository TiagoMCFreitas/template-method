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
public class OrdenadoPorSituacaoNome extends MostrarAlunos{
    public OrdenadoPorSituacaoNome(String arquivo) {
        super(arquivo);
    }

    @Override
    public boolean Ordena(Aluno aluno1, Aluno aluno2) {
        // Compara pela situação (Sim ou N)
       int comparacaoSituacao = aluno1.getSituacao().compareToIgnoreCase(aluno2.getSituacao());
        
        // Se as situações forem diferentes, retorna true se o primeiro aluno vier antes do segundo na ordenação
        if (comparacaoSituacao != 0) {
            return comparacaoSituacao < 0;
        } else {
            // Se as situações forem iguais, compara os nomes
            int comparacaoNome = aluno1.getNome().compareToIgnoreCase(aluno2.getNome());
            return comparacaoNome < 0;
        }
    }
}
