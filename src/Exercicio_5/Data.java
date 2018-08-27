package Exercicio_5;

import lombok.Getter;
import lombok.Setter;

import java.util.Calendar;
import java.util.TimeZone;

@Getter
@Setter

public class Data {
	private int dia;
	private int mes;
	private int ano;
	
	public Data (int dia, int mes, int ano) {
		if ((ano > 0) && isMesValido(mes) && isDiaValido(dia,mes,ano)) {
			this.dia = dia;
			this.mes = mes;
			this.ano = ano;
		} else {
			throw new IllegalArgumentException("Data invalida!");
		}
	}
	
	public Data () {
		Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
		
		this.dia = calendar.get(Calendar.DATE);
		this.mes = calendar.get(Calendar.MONTH) + 1;
		this.ano = calendar.get(Calendar.YEAR);
	}
	
	public static boolean isAnoBissexto(int ano) {
		if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isMesValido(int mes) { 
		if (mes > 0 && mes < 13) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean isDiaValido(int dia,int mes,int ano) {
		if (isAnoBissexto(ano) && mes == 2) {
			if (dia > 0 && dia < 30) {
				return true;
			} else {
				return false;
			}
		} else {
			if ((mes == 4) || (mes == 6) || (mes == 9) || (mes == 11)) {
				if (dia > 0 && dia < 31) {
					return true;
				} else {
					return false;
				}
			} else {
				if(dia > 0 && dia < 32) {
					return true;
				} else {
					return false;
				}
			}
		}
	}
	
	public void avancaDia() {
		if(isAnoBissexto(ano) && mes == 2) {
			if (dia == 29) {
				mes = 3;
				dia = 1;
				return;
			} else {
				dia++;
				return;
			}
		} else {
			dia++;
			if(isDiaValido(dia,mes,ano) && isMesValido(mes)) {
				return;
			}else {
				dia = 1;
				mes++;
				if(isDiaValido(dia,mes,ano) && isMesValido(mes)) {
					return;
				}else {
					dia = 1;
					mes = 1;
					ano++;
					return;
				}
			}
		}
	}

	
	
	@Override
	public String toString() {
		return dia + "/" + mes + "/" + ano;
	}

	
}
