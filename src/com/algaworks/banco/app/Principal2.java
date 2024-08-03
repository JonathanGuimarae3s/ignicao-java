package com.algaworks.banco.app;

import com.algaworks.banco.modelo.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class Principal2 {
    public static void main(String[] args) {
        List<Pessoa>  pessoaList = new ArrayList<>();

        Pessoa pessoa = new Pessoa("jonathan guimaraes", "12345");
        Pessoa pessoa2 = new Pessoa("jonathan souza", "12345");
        Pessoa pessoa3 = new Pessoa("jonathan matheus", "12345");



        pessoaList.add(pessoa);
        pessoaList.add(pessoa2);
        pessoaList.add(pessoa3);



        Boolean existe = pessoaList.contains(pessoa);


        for(Pessoa p : pessoaList){
            System.out.println(p.toString());
        }

    }



}
