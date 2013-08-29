import java.util.*;
public class TD {

	static int posicao,fimjogo;
	static int mapa[]=new int[]{6,0,0,0,0,0,0,0,0,0,0};
	static int TAMQUE=6;
	static String opcao;
	
	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		
		
		
		while(fimjogo!=1){
			System.out.println("posicao atual "+posicao+" tamque "+TAMQUE+" GALOES NA POSICAO "+mapa[posicao]);
			System.out.println("digite o comando");
			opcao= c.next();
		if(opcao.equals("AVANCAR")){
			
			avancar();
			}
		if(opcao.equals("RECUAR")){
			
			recuar();
			}
		if(opcao.equals("DESCARREGAR")){
			
			descarregar();
			}
		if(opcao.equals("CARREGAR")){
			
			carregar();
			}
		
		}
		if (posicao==9){System.out.println("voce ganhou o jogo"); }
		else{System.out.println("game over");}
		

	}
	public static int avancar(){
		if (TAMQUE>0){
			TAMQUE-=1;
			posicao+=1;
			System.out.println("AVANCOU");}
		if(posicao==9){fimjogo=1;}	
		
		return posicao;}
	public static int recuar(){
		if ((TAMQUE>0)&&(posicao>0)){
			TAMQUE-=1;
			posicao-=1;
			System.out.println("RECUOU");
		}
	return posicao;}
	
	public static int descarregar(){
		if(TAMQUE>0){
			TAMQUE-=1;
			mapa[posicao]+=1;
			System.out.println("DESCARREGOU");
		}
	return mapa[posicao];}
	
	public static int carregar(){
		if(mapa[posicao]>0){
			TAMQUE+=1;
			mapa[posicao]-=1;
			System.out.println("CARREGOU");
		}
		if(posicao==0){
			TAMQUE=6;
			System.out.println("CARREGOU TOTAL");
		}
		if ((mapa[posicao]==0)&&(TAMQUE==0)){
			fimjogo=1;
		}
	return mapa[posicao];}
	
}
