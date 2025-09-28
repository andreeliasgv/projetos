import java.util.Scanner;
import java.util.Random;
public class Main {
	public static void main(String[] args) {
	    Scanner scanner = new Scanner (System.in);
	    Random random = new Random();
	    //Inicialização do jogo da velha com "-" como nulo
		char[][] jogo = {
		    {'-','-','-'},
		    {'-','-','-'},
		    {'-','-','-'},
		};
		int l, c, cont_velha=0;
		char jogador, pc;
		
		System.out.println("=====JOGO DA VELHA=====");
		System.out.println();
		
		//Jogada do Jogador
		while(true) {
		    System.out.println("Você quer jogar como X ou O? ");
		    jogador = Character.toUpperCase(scanner.next().charAt(0));
		    
		    if (jogador=='x'||jogador=='X'||jogador=='o'||jogador=='O') {
		        break;
		    }
		    
		    System.out.println("Escolha uma opção correta!");
		}
		
		System.out.println("Opção escolhida: "+jogador);
		
		if (jogador=='X') {
		    pc='O';
		} else {
		    pc='X';
		}
		
		System.out.println("Seu adversário (PC): "+pc);
		System.out.println();
		
		//Looping principal (das rodadas)
		while(true) {
		    while (true) {
		        
		        for (int i=0; i<3; i++) {
		            for (int j=0; j<3; j++) {
		                System.out.print(jogo[i][j]+" ");
		            }
		            System.out.println();
	    	    }
	    	    
	    	    System.out.println();
	    	    
		        System.out.println("Informe a linha que deseja jogar: (0 a 2) ");
		        l = scanner.nextInt();
		        System.out.println("Informe a coluna que deseja jogar: (0 a 2) ");
		        c = scanner.nextInt();
            
                if (jogo[l][c]=='-') {
	    	    jogo[l][c] = jogador;
	    	    break;
                } else {
                    System.out.println("Essa opção já foi escolhida. Escolha outra!");
                    System.out.println();
                }
		    }
		    
		    System.out.println();
		    
	    	for (int i=0; i<3; i++) {
		       for (int j=0; j<3; j++) {
		          System.out.print(jogo[i][j]+" ");
		       }
		        System.out.println();
	    	}
	    	
	    	//GANHADOR - Verificação Jogador
	    	//Linha 1
            if (jogo[0][0]==jogo[0][1]&&jogo[0][0]==jogo[0][2]&&jogo[0][0]!='-') {
                if (jogo[0][0]==jogador) {
                    System.out.println("Parabéns, você ganhou!");
                    break;
                }
            }
            //Linha 2
            if (jogo[1][0]==jogo[1][1]&&jogo[1][0]==jogo[1][2]&&jogo[1][0]!='-') {
                if (jogo[1][0]==jogador) {
                    System.out.println("Parabéns, você ganhou!");
                    break;
                }
            }
            //Linha 3
            if (jogo[2][0]==jogo[2][1]&&jogo[2][0]==jogo[2][2]&&jogo[2][0]!='-') {
                if (jogo[2][0]==jogador) {
                    System.out.println("Parabéns, você ganhou!");
                    break;
                }
            }
            //Coluna 1
            if (jogo[0][0]==jogo[1][0]&&jogo[0][0]==jogo[2][0]&&jogo[0][0]!='-') {
                if (jogo[0][0]==jogador) {
                    System.out.println("Parabéns, você ganhou!");
                    break;
                }
            }
            //Coluna 2
            if (jogo[0][1]==jogo[1][1]&&jogo[0][1]==jogo[2][1]&&jogo[0][1]!='-') {
                if (jogo[0][1]==jogador) {
                    System.out.println("Parabéns, você ganhou!");
                    break;
                }
            }
            //Coluna 3
            if (jogo[0][2]==jogo[1][2]&&jogo[0][2]==jogo[2][2]&&jogo[0][2]!='-') {
                if (jogo[0][2]==jogador) {
                    System.out.println("Parabéns, você ganhou!");
                    break;
                }
            }
            //Diagonal Principal
            if (jogo[0][0]==jogo[1][1]&&jogo[0][0]==jogo[2][2]&&jogo[0][0]!='-') {
                if (jogo[0][0]==jogador) {
                    System.out.println("Parabéns, você ganhou!");
                    break;
                }
            }
            //Diagonal Secundária
            if (jogo[0][2]==jogo[1][1]&&jogo[0][2]==jogo[2][0]&&jogo[0][2]!='-') {
                if (jogo[0][2]==jogador) {
                    System.out.println("Parabéns, você ganhou!");
                    break;
                }
            }
            
            //VELHA - Verificação 1
            cont_velha=0;
            for (int i=0; i<3; i++) {
		       for (int j=0; j<3; j++) {
		          if (jogo[i][j]=='-') {
		              cont_velha++;
		          }
		       }
	    	}
	    	if (cont_velha==0) {
	    	    System.out.println();
	    	    System.out.println("Deu velha. Tente novamente!");
	    	    break;
	    	}
	    	
	    	cont_velha=0;
		
		    //Jogada do PC
	    	while (true) {
	    	    l = random.nextInt(3);
	    	    c = random.nextInt(3);
	    	    
	    	    if (jogo[l][c]=='-') {
	    	        jogo[l][c]=pc;
	    	        System.out.println("O PC jogou na linha " + l + " e coluna " + c);
	    	        break;
	    	    }
	    	}
		
	    	System.out.println();
	    	
	    	//GANHADOR - Verificação PC
	    	//Linha 1
            if (jogo[0][0]==jogo[0][1]&&jogo[0][0]==jogo[0][2]&&jogo[0][0]!='-') {
                if (jogo[0][0]==pc) {
                    System.out.println("Você perdeu. Tente novamente!");
                    break;
                }
            }
            //Linha 2
            if (jogo[1][0]==jogo[1][1]&&jogo[1][0]==jogo[1][2]&&jogo[1][0]!='-') {
                if (jogo[1][0]==pc) {
                    System.out.println("Você perdeu. Tente novamente!");
                    break;
                }
            }
            //Linha 3
            if (jogo[2][0]==jogo[2][1]&&jogo[2][0]==jogo[2][2]&&jogo[2][0]!='-') {
                if (jogo[2][0]==pc) {
                    System.out.println("Você perdeu. Tente novamente!");
                    break;
                }
            }
            //Coluna 1
            if (jogo[0][0]==jogo[1][0]&&jogo[0][0]==jogo[2][0]&&jogo[0][0]!='-') {
                if (jogo[0][0]==pc) {
                    System.out.println("Você perdeu. Tente novamente!");
                    break;
                }
            }
            //Coluna 2
            if (jogo[0][1]==jogo[1][1]&&jogo[0][1]==jogo[2][1]&&jogo[0][1]!='-') {
                if (jogo[0][1]==pc) {
                    System.out.println("Você perdeu. Tente novamente!");
                    break;
                }
            }
            //Coluna 3
            if (jogo[0][2]==jogo[1][2]&&jogo[0][2]==jogo[2][2]&&jogo[0][2]!='-') {
                if (jogo[0][2]==pc) {
                    System.out.println("Você perdeu. Tente novamente!");
                    break;
                }
            }
            //Diagonal Principal
            if (jogo[0][0]==jogo[1][1]&&jogo[0][0]==jogo[2][2]&&jogo[0][0]!='-') {
                if (jogo[0][0]==pc) {
                    System.out.println("Você perdeu. Tente novamente!");
                    break;
                }
            }
            //Diagonal Secundária
            if (jogo[0][2]==jogo[1][1]&&jogo[0][2]==jogo[2][0]&&jogo[0][2]!='-') {
                if (jogo[0][2]==pc) {
                    System.out.println("Você perdeu. Tente novamente!");
                    break;
                }
            }
            
            //VELHA - Verificação 2
            cont_velha=0;
            for (int i=0; i<3; i++) {
		       for (int j=0; j<3; j++) {
		          if (jogo[i][j]=='-') {
		              cont_velha++;
		          }
		       }
	    	}
	    	if (cont_velha==0) {
	    	    System.out.println();
	    	    System.out.println("Deu velha. Tente novamente!");
	    	    break;
	    	}
	    	
	    	cont_velha=0;
		}
		System.out.println();
		System.out.println("Resultado Final:");
		for (int i=0; i<3; i++) {
		    for (int j=0; j<3; j++) {
		        System.out.print(jogo[i][j]+" ");
		    }
		    System.out.println();
	    }
		scanner.close();
	}
}