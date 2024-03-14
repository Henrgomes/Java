package Cadastro;
import Usuario.java;
import java.util.Scanner;

public class CadastroProprietarioPosto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" __________________________________ ");
        System.out.println("\n|Cadastro do Proprietário do Posto:|");
        
        
        System.out.print("\nDigite o seu nome: ");
        String nomeDono = scanner.nextLine();
        
        System.out.println("\nDigite seu CPF");
        long numerocpfDonoDoposto = scanner.nextLong();

        
         
        System.out.print("Digite o seu e-mail: ");
        String emailDono = scanner.nextLine();

        System.out.print(" ");
        
        
        System.out.print("Digite a sua senha: ");
        String senhaDono = scanner.nextLine();

        System.out.print("\nDigite o preço da gasolina comum: ");
        double precoGasolinaComum = scanner.nextDouble();
        
        System.out.print("\nDigite o preço da gasolina aditivada: ");
        double precoGasolinaAditivada = scanner.nextDouble();
        
        System.out.print("\nDigite o preço do diesel: ");
        double precoDiesel = scanner.nextDouble();
    
        System.out.print("\nDigite o preço do diesel-S10: ");
        double precoDieselS10 = scanner.nextDouble();

        System.out.print("\nDigite o preço do etanol: ");
        double precoEtanol = scanner.nextDouble();


        
        
        String confirmacaoSenhaDono;
        do {
            System.out.print("Digite a senha: ");
            senhaDono = scanner.nextLine();

            System.out.print("Confirme a senha: ");
            confirmacaoSenhaDono = scanner.nextLine();

            if (!senhaDono.equals(confirmacaoSenhaDono)) {
                System.out.println("As senhas não coincidem. Tente novamente.");
            }
        } while (!senhaDono.equals(confirmacaoSenhaDono));

        String codigoDono = gerarCodigoNumerico();

      
        System.out.println("Anexar foto (simulação) - Insira o caminho do arquivo:");
        String caminhoFoto = scanner.nextLine();

        
        DonoPosto donoPosto = new DonoPosto(nomeDono, emailDono, senhaDono, codigoDono, caminhoFoto);


        System.out.println("\nDono do posto cadastrado com sucesso!");
        System.out.println("Nome: " + donoPosto.getNomeDonoPosto);
        System.out.println("E-mail: " + donoPosto.getemailDonoPosto());
        System.out.println("Código: " + donoPosto.getCodigoDonoPosto());
        System.out.println("Caminho da Foto: " + donoPosto.getCaminhoFoto());
        System.out.println("Gasolina: " + donoPosto.getprecoGasolinaComum());
        System.out.println("Diesel: " + donoPosto.getprecoDiesel());
        System.out.println("Gasolina Aditivada: " + donoPosto.getprecoGasolinaAditivada());
        System.out.println("Etanol: " + donoPosto.getprecoGasolinaComum());
        System.out.println("Etanol S-10: " + donoPosto.getprecoDieselS10d());
    }

   
    private static String gerarCodigoNumerico() {
        
        return "1234"; 
    }
}

class DonoPosto extends Usuario {
    private String caminhoFoto;

    public DonoPosto(String nome, String email, String senha, String codigo, String caminhoFoto) {
        super(nome, email, senha, codigo);
        this.caminhoFoto = caminhoFoto;
    }

    public String getCaminhoFoto() {
        return caminhoFoto;
    }
}

