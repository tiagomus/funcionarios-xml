package exercicio.services;

import exercicio.entities.Funcionario;

import java.io.FileWriter;
import java.io.PrintWriter;

public class FuncionarioService {

    public void salvarDados(Funcionario funcionario){

        try {

            var filewriter = new FileWriter("D:\\aula01\\funcionario_" + funcionario.getId() + ".xml");
            var printwriter = new PrintWriter(filewriter);
            printwriter.write("<?xml version='1.0' encoding='UTF-8'?>");
            printwriter.write("<funcionario>");
            printwriter.write("<id>" + funcionario.getId() + "</id>");
            printwriter.write("<nome>" + funcionario.getNome()+ "</nome>");
            printwriter.write("<salario>" + funcionario.getSalario() + "</salario>");
            printwriter.write("</funcionario>");
            printwriter.close();

            System.out.println("Dados do funcionario salvo em XML com sucesso!");


        }

        catch (Exception e){
            System.out.println("Erro ao salvar dados");
            System.out.println((e.getMessage()));
        }


    }

}
