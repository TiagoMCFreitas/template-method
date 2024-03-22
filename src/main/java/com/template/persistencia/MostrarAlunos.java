/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.template.persistencia;

import com.template.model.Aluno;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author tiago
 */
public abstract class MostrarAlunos {
     private String nomeDoArquivo;
    //Metodos
    public MostrarAlunos(String arquivo){
        nomeDoArquivo = arquivo;
    }
    
    public abstract boolean Ordena(Aluno aluno1, Aluno aluno2);

    public ArrayList<Aluno> listagemDeAlunosNome()throws Exception{
        try{
            ArrayList<Aluno> array = new ArrayList<Aluno>();
            FileReader fr = new FileReader(nomeDoArquivo);
            BufferedReader br  = new BufferedReader(fr);
            String linha = "";
            int pos = 0;
            while((linha=br.readLine())!=null){
                System.out.println(linha);
                Aluno aux = new Aluno();
                String[] vetor = linha.split(";");
                
                aux.setNome(vetor[0]);
                aux.setCurso(vetor[1]);
                aux.setSituacao(vetor[2]);
                aux.setEnfase(vetor[3]);
                array.add(aux);
                pos++;
                
            }
            br.close();
            //algoritmo de Ordenação
            for (int i = 0; i < array.size(); i++) {
                for (int j = i; j < array.size(); j++) {
                    
                    if (!Ordena(array.get(i),array.get(j))) {    
                        Aluno temp = array.get(j);
                        array.set(j, array.get(i));
                        array.set(i, temp);
                    }
                }
            }
            return array;
        }catch(Exception erro){
            throw erro;
        } 
    }
}
