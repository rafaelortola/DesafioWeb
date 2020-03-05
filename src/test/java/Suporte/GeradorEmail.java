package Suporte;

import java.util.Random;

public class GeradorEmail {
    public static void main (String[]args){

        String email = "@gmail.com";
        String vogal[] = {"a", "e", "i", "o", "u",}, vc = "", nome = "", consoante[] = {"b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "w", "x", "y", "z"};


            Random random = new Random();
            int i;
            for (i = 0; i <= 10; i++) {
                int nrAleatorioVogal = 0 + random.nextInt(4);//escolhe uma pos de 0 a 4
                int nrAleatorioConsoante = 0 + random.nextInt(19);//escolhe pos de 0 a 19

                vc = vogal[nrAleatorioVogal] + consoante[nrAleatorioConsoante] + consoante[nrAleatorioConsoante] + vogal[nrAleatorioVogal];

                nome = vc + email;

                System.out.print(nome);
            }
        }
    }

