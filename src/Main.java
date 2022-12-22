import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static Utilizador adicionarUtilizador() {
        Scanner ler = new Scanner(System.in);

        String nome, apelido, username, password, cidade, tipoUser;
        int nif, telemovel;

        System.out.println("Nome: ");
        nome = ler.nextLine();

        System.out.println("Apelido: ");
        apelido = ler.nextLine();

        System.out.println("Username: ");
        username = ler.nextLine();

        System.out.println("Password: ");
        password = ler.nextLine();

        System.out.println("Cidade: ");
        cidade = ler.nextLine();

        System.out.println("Tipo de User(cliente/admin): ");
        tipoUser = ler.nextLine();

        System.out.println("Telemóvel: ");
        telemovel = ler.nextInt();

        System.out.println("NIF: ");
        nif = ler.nextInt();

        Utilizador utilizador = new Utilizador(nome, apelido, username, password, nif, telemovel, cidade, tipoUser);

        return (utilizador);
    }

    public static Utilizador login(ArrayList<Utilizador> utilizadores){

        Scanner ler = new Scanner(System.in);
        Utilizador utilizador = null;

        String username, password;

        System.out.println("Username: ");
        username = ler.nextLine();

        System.out.println("Password: ");
        password = ler.nextLine();

        for (Utilizador user : utilizadores){
            if (user.getUsername().equals(username) && user.getPassword().equals(password))
                utilizador = user;
        }
        return utilizador;
    }


    public static void main(String[] args) {

        int menu1, menu2, menu3;
        ArrayList<Utilizador> utilizadores = new ArrayList<Utilizador>();

        Utilizador utilizador, utilizadorNovo = null;
        int indiceUtilizador, nif, telemovel;
        String nome, apelido, username, password, cidade, tipoUser;
        boolean existe = false;

        Scanner ler = new Scanner(System.in);

        do {

            System.out.println("\n\n***** Stand Automóvel  *****");
            System.out.println("\n*******************************");
            System.out.println("**** 1 - Registar Utilizador ****");
            System.out.println("**** 2 - Login               ****");
            System.out.println("**** 0 - Sair                ****");
            System.out.println("\n*******************************");

            System.out.print("\nInsira a Opcao que deseja: ");
            menu1 = ler.nextInt();

            switch (menu1){
                case 1:
                    utilizador = adicionarUtilizador();
                    if(utilizador != null)
                        existe = false;

                        for (Utilizador user: utilizadores){
                            if (utilizador.getNif() == user.getNif()){
                                existe = true;
                            }
                        }
                        if (existe == true){
                            System.out.println("NIF já existente!\n");
                        }else {
                            System.out.println("Utilizador Registado com Sucesso!\n");
                            utilizadores.add(utilizador);
                        }
                        break;
                case 2:
                    indiceUtilizador = -1;
                    utilizador = login(utilizadores);
                    if(utilizador == null)
                        System.out.println("Login Inválido!");
                    else{
                        for (Utilizador user: utilizadores){
                            if (user.getNif() == utilizador.getNif())
                                indiceUtilizador = utilizadores.indexOf(user);
                        }
                        if (utilizador.getTipoUser().equals("cliente")){
                            do{
                                System.out.println("\n\n*****       Menu cliente          *****");
                                System.out.println("\n*****************************************");
                                System.out.println("**** 1 - Visualizar Perfil             ****");
                                System.out.println("**** 2 - Editar Perfil                 ****");
                                System.out.println("**** 3 - Listar Veiculos               ****");
                                System.out.println("**** 4 - Informacao do veiculo         ****");
                                System.out.println("**** 5 - Reservar veiculo              ****");
                                System.out.println("**** 6 - Historico reservas            ****");
                                System.out.println("**** 0 - Logout                        ****");
                                System.out.println("\n*****************************************");

                                System.out.print("Insira a Opção que deseja: ");
                                menu2 = ler.nextInt();

                                switch (menu2){
                                    case 1:
                                        System.out.println(utilizador.toString());
                                        break;
                                    case 2:
                                        System.out.println(utilizador.toString());
                                        do {
                                            System.out.println("\n\n*****       Editar Perfil          *****");
                                            System.out.println("\n*****************************************");
                                            System.out.println("**** 1 - Nome                          *****");
                                            System.out.println("**** 2 - Apelido                       *****");
                                            System.out.println("**** 3 - Username                      *****");
                                            System.out.println("**** 4 - Password                      *****");
                                            System.out.println("**** 5 - Cidade                        *****");
                                            System.out.println("**** 6 - Telemóvel                     *****");
                                            System.out.println("**** 0 - Sair                          *****");
                                            System.out.println("\n*****************************************");

                                            System.out.print("Insira a Informação que deseja Editar: ");
                                            menu3 = ler.nextInt();

                                            switch (menu3){
                                                case 1:
                                                    utilizadorNovo = utilizador;
                                                    System.out.println("Altere o Nome: ");
                                                    nome = ler.next();
                                                    utilizadorNovo.setNome(nome);
                                                    break;
                                                case 2:
                                                    utilizadorNovo = utilizador;
                                                    System.out.println("Altere o Apelido: ");
                                                    apelido = ler.next();
                                                    utilizadorNovo.setApelido(apelido);
                                                    break;
                                                case 3:
                                                    utilizadorNovo = utilizador;
                                                    System.out.println("Altere o Username: ");
                                                    username = ler.next();
                                                    utilizadorNovo.setUsername(username);
                                                    break;
                                                case 4:
                                                    utilizadorNovo = utilizador;
                                                    System.out.println("Altere a Password: ");
                                                    password = ler.next();
                                                    utilizadorNovo.setPassword(password);
                                                    break;
                                                case 5:
                                                    utilizadorNovo = utilizador;
                                                    System.out.println("Altere a Cidade: ");
                                                    cidade = ler.next();
                                                    utilizadorNovo.setCidade(cidade);
                                                    break;
                                                case 6:
                                                    utilizadorNovo = utilizador;
                                                    System.out.println("Altere o Telemóvel: ");
                                                    telemovel = Integer.parseInt(ler.next());
                                                    utilizadorNovo.setTelemovel(telemovel);
                                                    break;
                                                case 0:
                                                    break;
                                                default:
                                                    System.out.println("Opcao Inválida!\n\n");
                                                    break;
                                            }
                                            utilizadores.set(indiceUtilizador,utilizadorNovo);
                                            utilizador = utilizadorNovo;
                                        }while (menu3 != 0);
                                    case 3:

                                }
                            }while (menu2 != 0);
                        } else if (utilizador.getTipoUser().equals("admin")) {
                            System.out.println("Olá Admin!");
                        }
                    }
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opcao Inválida!\n\n");
                    break;
            }
        }while (menu1 != 0);
    }
}