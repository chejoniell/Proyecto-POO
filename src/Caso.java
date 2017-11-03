
public class Caso {
	private String tipoProblema;
	private String nombre;
	private String leyesAplicables;
	private String antecedentes;
	private int codigo;
	private int categoria;
	
	public Caso(){
		tipoProblema="";
		nombre="";
		leyesAplicables="";
		antecedentes="";
		codigo=0;
		setCategoria(0);
		
	}
	
	public Caso(String tipoProblema,String nombre,String leyesAplicables,String antecedentes, int codigo, int categoria){
		this.tipoProblema=tipoProblema;
		this.nombre=nombre;
		this.leyesAplicables=leyesAplicables;
		this.antecedentes=antecedentes;
		this.codigo = codigo;
		this.categoria=categoria;
	}
	
	public String getTipoProblema() {
		return tipoProblema;
	}
	public void setTipoProblema(String tipoProblema) {
		this.tipoProblema = tipoProblema;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getLeyesAplicables() {
		return leyesAplicables;
	}
	public void setLeyesAplicables(String leyesAplicables) {
		this.leyesAplicables = leyesAplicables;
	}
	public String getAntecedentes() {
		return antecedentes;
	}
	public void setAntecedentes(String antecedentes) {
		this.antecedentes = antecedentes;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}
	

	
	
}
