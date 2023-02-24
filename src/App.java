import java.util.Locale;
import java.util.Scanner;

import entities.Champion;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os dados do primeiro campeão:");
        System.out.print("Nome: ");
        String name1 = sc.nextLine();
        System.out.print("Vida inicial: ");
        int life1 = sc.nextInt();
        System.out.print("Ataque: ");
        int attack1 = sc.nextInt();
        System.out.print("Armadura: ");
        int armor1 = sc.nextInt();
        Champion champ1 = new Champion(name1, life1, attack1, armor1);

        System.out.println();
        System.out.println("Digite os dados do segundo campeão:");
        System.out.print("Nome: ");
        sc.nextLine();
        String name2 = sc.nextLine();
        System.out.print("Vida inicial: ");
        int life2 = sc.nextInt();
        System.out.print("Ataque: ");
        int attack2 = sc.nextInt();
        System.out.print("Armadura: ");
        int armor2 = sc.nextInt();
        Champion champ2 = new Champion(name2, life2, attack2, armor2);

        System.out.println();
        System.out.print("Quantos turnos você deseja executar? ");
        int turns = sc.nextInt();
        System.out.println();

        for(int i = 0; i < turns; i++){
            if(champ1.getLife() > 0 && champ2.getLife() > 0){
                champ1.takeDamage(champ2);
                champ2.takeDamage(champ1);
                System.out.println("Resultado do turno " + (i+1) + ":");
                System.out.println(champ1.status());
                System.out.println(champ2.status());
                System.out.println();
            };
        }

        System.out.println("FIM DO COMBATE");

        sc.close();
    }
}