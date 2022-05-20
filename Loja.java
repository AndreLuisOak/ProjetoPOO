package modelo.loja;

public class Loja {
	private int address;
	private String bairro;
	private String city;
	private String estado;
	
	public Loja() {
		super();
		this.address = 0;
		this.bairro = " ";
		this.city = " ";
		this.estado = " ";
	}
	
	public Loja(int address, String bairro, String city, String estado) {
		super();
		this.address = address;
		this.bairro = bairro;
		this.city = city;
		this.estado = estado;
	}
	
	public int getAdress() {
		return address;
	}
	
	public void setAddress(int address) {
		this.address = address;
	}
	
	public String getBairro(String bairro) {
		return bairro;
	}
	
	public void setBairro( String bairro) {
		this.bairro = bairro;
	}
	
	public String city(String city) {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getEstado(String estado) {
		return estado;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public static void main(String[] args) {
		
	}
}
