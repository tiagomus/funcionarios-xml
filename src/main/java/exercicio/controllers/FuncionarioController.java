package exercicio.controllers;

import exercicio.entities.Funcionario;
import exercicio.services.FuncionarioService;

import java.util.Scanner;

public class FuncionarioController {

    public void cadastrarFuncionario(){

        var scanner = new Scanner(System.in);
        var funcionario = new Funcionario();

        System.out.println("Digite o nome do funcionario: ");
        funcionario.setNome(scanner.nextLine());

        System.out.println("Digite o salario do Funcionario: ");
        funcionario.setSalario(scanner.nextDouble());

        var funcionarioService = new FuncionarioService();
        funcionarioService.salvarDados(funcionario);

    }

}
