import java.util.*;

import org.bson.types.ObjectId;
import org.mongodb.morphia.*;
import org.mongodb.morphia.query.Query;

import com.mongodb.MongoClient;

public class Control {
	private ArrayList<Caso> misCasos;
	private ArrayList<Administradores> admins;
	private Datastore dsAdmins;
	private Datastore dsCasos;
	
	public Control() {
		misCasos=new ArrayList<Caso>();
		admins=new ArrayList<Administradores>();
		connection();
		
	}
	public void connection() {
        MongoClient mongo = new MongoClient();
        Morphia morphia = new Morphia();
        morphia.map(Caso.class); 
        dsCasos = morphia.createDatastore(mongo, "Casos");
        morphia.map(Administradores.class);// clases a guardar
        dsAdmins = morphia.createDatastore(mongo, "Admins"); // Base Datos
        if(dsAdmins.getCount(Administradores.class)==0) {
        	newAdmin("admin","01234",true);
        }
   }
	
	public void nuevoCaso(String nombre, String tipoCaso, String leyes, String antecedentes) {
		Caso nuevo = new Caso(tipoCaso,nombre,leyes,antecedentes);
		dsCasos.save(nuevo);
	}
	public void importAdmins() {
		admins = new ArrayList<Administradores>();
		Query<Administradores> query = dsAdmins.createQuery(Administradores.class);
		int tempo = 0;
		List<Administradores> qq = query.asList();
		for(Administradores k : qq) {
			admins.add(tempo, qq.get(tempo));
			tempo++;
			}
	}
	public void importCasos() {
		misCasos = new ArrayList<Caso>();
		Query<Caso> query = dsCasos.createQuery(Caso.class);
		int tempo= 0;
		List<Caso> qq = query.asList();
		for(Caso j: qq) {
			misCasos.add(tempo,qq.get(tempo));
			tempo++;
		}
	}
		
	public void newAdmin(String user, String password, boolean admin) {
		boolean usado= false;
		importAdmins();
		for(Administradores j:admins) {
			if(user.equals(j.getUser())) {
				usado = true;
			}
			else {
				usado=false;
			}
		}
		if(usado==false) {
		Administradores usuario = new  Administradores(user,password,admin);
		dsAdmins.save(usuario);
		}
	}
	
	public String[] buscaCaso(String tipo) {
		ArrayList<String> casos= new ArrayList<String>();
		importCasos();
		for(Caso cual: misCasos) {
			if(cual.getTipoProblema().equals(tipo)) {
				casos.add(cual.getNombre());
			}
		}
		
		String[] ret = new String[casos.size()];
		int cont=0;
		for(String ss: casos) {
			ret[cont] = ss;
			cont++;
		}
		
		return ret;
	}
	public String showMeYourCaso( String name) {
		/// 1= nombre,2= tipoProblema , 3= leyesAplicables, 4=antecedentes
			String regresar = "Error";
			importCasos();
		for(Caso i: misCasos) {
				if(i.getNombre().equals(name)) {
					regresar=i.getId()+"\n"+i.getNombre()+"\n"+i.getTipoProblema()+"\n"+i.getAntecedentes()+"\n"+i.getLeyesAplicables()+"\n";
					
				}
		}
		return regresar;
	}
	
	public boolean verificarAdmin(String user, String pass, boolean admin){
		boolean uss=false;
		importAdmins();
		for(Administradores i: admins) {
			if (user.equals(i.getUser()) && pass.equals(i.getPassword())){
				uss=true;
				if(i.isAdmin()==admin) {
					uss=true;
				}
				else {
					uss=false;
				}
			}
		}
		return uss;
	}
	
	public String menus() {
		
			String ss= "Ingrese una opcion:\n1. Buscar caso.\n2. Ingresar un nuevo caso.\n0. Salir";
			return ss;
		
	}
	
	public String mostrarNombres(String cat) {
		String show="";
		int jeje= 1;
		importCasos();
		for(Caso i:misCasos) {
			if(i.getTipoProblema()==cat) {
				show=show+jeje+". "+i.getId()+"  "+i.getNombre()+"\n";
				jeje++;
			}
		}
		return show;
	}
	
}
