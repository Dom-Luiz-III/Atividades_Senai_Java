package Util;

import Entidades.Quarto;

public class QuartoUtil {
	public static final Double valor_locacao = 150.0;
	public static final Double valor_pessoa = 50.0;
	
	public static int verificarQuartoVazio(Quarto[] quartos){
		//Retorna o indice do próximo quarto vazio. Retorna -1 caso nenhuma quarto esteja vago.
		for(int i = 0 ; i<10 ; i++) {
			if (quartos[i] == null) {
				return i;
			}
		}
		return -1;
	}
}
