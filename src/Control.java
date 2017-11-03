import java.util.*;

public class Control {
	private ArrayList<Caso> misCasos;
	private ArrayList<Administradores> admins;
	
	public Control() {
		misCasos=new ArrayList<Caso>();
		admins=new ArrayList<Administradores>();
		
	}
	
	public void nuevoCaso(String nombre, String tipoCaso, String leyes, String antecedentes, int codigo, int categoria) {
		Caso nuevo = new Caso(tipoCaso,nombre,leyes,antecedentes, codigo,categoria);
		misCasos.add(nuevo);
	}
	
	public void newAdmin(String user, String password, boolean admin) {
		boolean usado= false;
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
		admins.add(usuario);
		}
	}
	

	public String showMeYourCaso( int codigo) {
		/// 1= nombre,2= tipoProblema , 3= leyesAplicables, 4=antecedentes
			String regresar = "Error";
		for(Caso i: misCasos) {
				if(i.getCodigo()==codigo) {
					regresar=i.getCodigo()+"\n"+i.getNombre()+"\n"+i.getTipoProblema()+"\n"+i.getAntecedentes()+"\n"+i.getLeyesAplicables()+"\n";
					
				}
		}
		return regresar;
	}
	
	public boolean verificarAdmin(String user, String pass, boolean admin){
		boolean uss=false;
		boolean pswd=false;
		boolean userAdmin =false;
		for(Administradores i: admins) {
			if (user.equals(i.getUser())){
				uss=true;
			}
			if(uss==true) {
				if(pass.equals(i.getPassword())) {
					pswd=true;
				}
			}
			if(i.isAdmin()==admin) {
				userAdmin=true;
			}
		}
		
		if(uss==true && pswd==true && userAdmin==true) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public String menus() {
		
			String ss= "Ingrese una opcion:\n1. Buscar caso.\n2. Ingresar un nuevo caso.\n0. Salir";
			return ss;
		
	}
	
	public String mostrarNombres(int cat) {
		String show="";
		int jeje= 1;
		for(Caso i:misCasos) {
			if(i.getCategoria()==cat) {
				show=show+jeje+". "+i.getCodigo()+"  "+i.getNombre()+"\n";
				jeje++;
			}
		}
		return show;
	}
	
}
