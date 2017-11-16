import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

@Entity("Casos")
public class Caso {
	private String tipoProblema;
	@Id private ObjectId id;
	private String nombre;
	private String leyesAplicables;
	private String antecedentes;
	
	
	public Caso(){
		tipoProblema="";
		nombre="";
		leyesAplicables="";
		antecedentes="";
	}
	
	public Caso(String tipoProblema,String nombre,String leyesAplicables,String antecedentes){
		this.tipoProblema=tipoProblema;
		this.nombre=nombre;
		this.leyesAplicables=leyesAplicables;
		this.antecedentes=antecedentes;
		
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

	/**
	 * @return the id
	 */
	public ObjectId getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(ObjectId id) {
		this.id = id;
	}

	
	

	
	
}
