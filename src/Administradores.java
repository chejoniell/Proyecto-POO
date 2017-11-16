import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

@Entity("Admins")
public class Administradores {
	private String user;
	@Id private ObjectId id;
	private String password;
	private boolean admin;
	
	public Administradores() {
		user="";
		password="";
		setAdmin(false);
		
	}
	
	public Administradores(String user, String password, boolean admin) {
		this.user= user;
		this.password=password;
		this.setAdmin(admin);
	}
	
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
	
	
}
