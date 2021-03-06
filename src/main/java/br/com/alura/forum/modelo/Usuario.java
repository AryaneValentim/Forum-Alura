package br.com.alura.forum.modelo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Usuario implements UserDetails{
	
	private static final long serialVersionUID = 7097915780149942227L;
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String senha;
    
    @ManyToMany(fetch = FetchType.EAGER)
    private List<Perfil> perfis = new ArrayList<>();
    
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		
		return this.perfis;
	}
	@Override
	public String getPassword() {
		
		return this.senha;
	}
	@Override
	public String getUsername() {
		
		return this.nome;
	}
	@Override
	public boolean isAccountNonExpired() {
		
		return true;
	}
	@Override
	public boolean isAccountNonLocked() {
		
		return true;
	}
	@Override
	public boolean isCredentialsNonExpired() {
		
		return true;
	}
	@Override
	public boolean isEnabled() {
		
		return true;
	}
    }