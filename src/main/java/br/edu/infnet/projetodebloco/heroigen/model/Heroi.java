package br.edu.infnet.projetodebloco.heroigen.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.google.gson.GsonBuilder;

import br.edu.infnet.projetodebloco.heroigen.enums.HeroisEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Heroi {

	@Id @GeneratedValue
	private Integer id;
	
	private HeroisEnum heroi;
	
	private Integer pontosDeVida;
	private Integer forca;
	private Integer defesa;
	private Integer agilidade;
	private Integer qtdDadosDano;
	private Integer tamanhoDadosDano;
	
	@Override
	public String toString() {
		return new GsonBuilder().setPrettyPrinting().create().toJson(this);
	}
}
