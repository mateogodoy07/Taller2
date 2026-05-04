package Package;

public class Pokemon {
	private String Pokemon;
	private String Habitat;
	private double PorcentajeAparicion;
	private int Vida;
	private int Ataque;
	private int Defensa;
	private int AtaqueEspecial;
	private int DefensaEspecial;
	private int Velocidad;
	private String Tipo;
	
	public Pokemon(String Pokemon,String Habitat,double PorcentajeAparicion,int Vida,int Ataque,int Defensa,int AtaqueEspecial,int DefensaEspecial,int Velocidad,String Tipo) {
		this.Pokemon = Pokemon;
		this.Habitat = Habitat;
		this.PorcentajeAparicion = PorcentajeAparicion;
		this.Vida = Vida;
		this.Ataque = Ataque;
		this.Defensa = Defensa;
		this.AtaqueEspecial = AtaqueEspecial;
		this.DefensaEspecial = DefensaEspecial;
		this.Velocidad = Velocidad;
		this.Tipo = Tipo;
		
	}

	public String getPokemon() {
		return Pokemon;
	}

	

	public String getHabitat() {
		return Habitat;
	}

	

	public double getPorcentajeAparicion() {
		return PorcentajeAparicion;
	}

	

	public int getVida() {
		return Vida;
	}

	

	public int getAtaque() {
		return Ataque;
	}

	

	public int getDefensa() {
		return Defensa;
	}

	

	public int getAtaqueEspecial() {
		return AtaqueEspecial;
	}

	

	public int getDefensaEspecial() {
		return DefensaEspecial;
	}

	

	public int getVelocidad() {
		return Velocidad;
	}

	
	public String getTipo() {
		return Tipo;
	}


	@Override
	public String toString() {
		return "Pokemon [Pokemon=" + Pokemon + ", Habitat=" + Habitat + ", PorcentajeAparicion=" + PorcentajeAparicion
				+ ", Vida=" + Vida + ", Ataque=" + Ataque + ", Defensa=" + Defensa + ", AtaqueEspecial="
				+ AtaqueEspecial + ", DefensaEspecial=" + DefensaEspecial + ", Velocidad=" + Velocidad + ", Tipo="
				+ Tipo + "]";
	}

}
