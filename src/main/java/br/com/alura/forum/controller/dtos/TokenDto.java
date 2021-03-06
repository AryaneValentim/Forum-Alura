package br.com.alura.forum.controller.dtos;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TokenDto {

	private String token;
	private String tipo;
	
	public TokenDto(String token, String tipo) {
		this.token = token;
		this.tipo = tipo;
	}
	
	public String getToken() {
		return token;
	}

}
