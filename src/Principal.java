import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Control patronum = new Control();
		Scanner teclado = new Scanner(System.in);
		
		String usuario1 = "jose";
		String pass1 = "melapelas";
		boolean admi = false;
		String admi1 = "pluto";
		String pass3= "xdxd";
		boolean admi2= true;
		patronum.newAdmin(usuario1, pass1, admi);
		patronum.newAdmin(admi1, pass3, admi2);
		
		//
		//
		patronum.nuevoCaso("Me chimaron", "Violacion", "Ley 310CC", "Ninguno", 69, 1);
		patronum.nuevoCaso("Micromachismos", "Violacion a los Derechos Humanos"	, "Ley Contra Femicidio", "Insultos a la mujer", 420, 2);
		//
		
		boolean vadmin = false;
		boolean menu= false;
		while(menu==false) {
			
		System.out.println("Ingrese username");
		String us = teclado.nextLine();
		System.out.println("Ingrese password");
		String pass = teclado.nextLine();
		System.out.println("Si es administrador, presione 1. Si es visitante, presione 2.");
		int rt= teclado.nextInt();
		teclado.nextLine();
		if(rt==1) {
			vadmin = true;
		}
		try {
			menu = patronum.verificarAdmin(us, pass, vadmin);
		}
		catch(Exception e) {
			System.out.println("El username o password no es correcto");
		}
		
		}
		
		
			int rpta=9;
			
			
			
			while(rpta!=0) {
				if(vadmin==true) {
					System.out.println(patronum.menus());
					try{
						rpta= teclado.nextInt();
						teclado.nextLine();
					}
					catch(Exception e) {
						System.out.println("Debe ingresar un numero");
					}
				if(rpta==1) {
					String rr="n";
					do{
					
						try {
					System.out.println("1. Asalto\n2. Femicidio\n");
					int rpta1=teclado.nextInt();
					teclado.nextLine();
					System.out.println("Ingrese el codigo de su caso:\n"+patronum.mostrarNombres(rpta1));
					int jeje= teclado.nextInt();
					String basura=teclado.nextLine();
					System.out.println(patronum.showMeYourCaso(jeje));
					System.out.println("Desea ver otro caso? y/n");		
					
					rr=teclado.nextLine();
						}
						catch(Exception e) {
							System.out.println("El dato ingresado no es correcto");
							System.out.println("Desea ver otro caso? y/n");
							
							String basua= teclado.nextLine();
							rr=teclado.nextLine();
						}
					System.out.println("");
					
					
					}while(rr.equalsIgnoreCase("y"));
					
					
				}
				
				if(rpta==2) {
					String nuevoCaso="";
					do {
					
					try {
					System.out.println("Ingrese el nombre del caso.");
					String name=teclado.nextLine();
					System.out.println("Ingese el tipo del caso");
					String tipe =teclado.nextLine();
					System.out.println("Ingrese las leyes aplicables");
					String leyes =teclado.nextLine();
					System.out.println("Ingrese los antecedentes");
					String ante=teclado.nextLine();
					System.out.println("Ingrese el codigo");
					int id = teclado.nextInt();
					teclado.nextLine();
					System.out.println("Seleccione la categoria: 1. Asalto  2. Femicidio");
					int categoria = teclado.nextInt();
					teclado.nextLine();
					patronum.nuevoCaso(name, tipe, leyes, ante, id, categoria);
					System.out.println("Logrado.");
					}
					catch(Exception e) {
						System.out.println("El ultimo dato ingresado no es correcto");
						String seguir= teclado.nextLine();
					}
					
					
					System.out.println("Quiere ingresar otro caso? y/n");
					nuevoCaso=teclado.nextLine();
					}while(nuevoCaso.equalsIgnoreCase("y"));
					
					
				}
			}
			
		else {
			String rr="n";
			int rpta1=9;
			
			try {
			System.out.println("1. Asalto\n2. Femicidio\n");
			rpta1=teclado.nextInt();
			teclado.nextLine();
			System.out.println("Ingrese el codigo de su caso:\n"+patronum.mostrarNombres(rpta1));
			int jeje= teclado.nextInt();
			teclado.nextLine();
			System.out.println(patronum.showMeYourCaso(jeje));
			
			}
			catch(Exception e) {
				System.out.println("El ultimo dato ingresado no es correcto");
				

			}
			
			
			
			
			
			
			
		}
		
		
	}
			System.out.println("Gracias por participar");
}
}
