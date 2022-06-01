package br.com.alura.forum.config.validacao;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@NoArgsConstructor

public class ErroDeFormularioDto {
	
	private String campo;
	private String erro;
	
	public ErroDeFormularioDto(String campo, String erro) {
		this.campo = campo;
		this.erro = erro; 
	}
}
