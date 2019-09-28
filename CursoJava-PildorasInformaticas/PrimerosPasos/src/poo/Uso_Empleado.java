package poo;

import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author freyder ejemplo donde solo se utilizara el archivo Uso_empleado.java,
 *         donde estara las nominas de una serie de empleados en una empresa, en
 *         este se programara todas las clases y metodos, situaci�n que no tiene
 *         modularidad. El objeto empleado va tener una serie de
 *         caracteristicas(propiedades): nombre, sueldo, fecha alta y un metodo:
 *         subir sueldo
 * 
 */

public class Uso_Empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * codigo de ejecuci�n funcional: 1 este codigo comentado esta bien pero
		 * se puede mejorar Ejemplar de creaci�n de varios objetos a partir de
		 * la clase Empleado llevando los parametros correspondientes
		 * 
		 * 
		 * Empleado empleado1= new Empleado("Freyder", 45000, 2017, 10, 15);
		 * llevando parametros del constructor Empleado empleado2= new
		 * Empleado("Violetta", 65000, 2025, 12, 4);// llevando parametros del
		 * constructor Empleado empleado3= new Empleado("Sara", 75000, 2035, 8,
		 * 8);// llevando parametros del constructor
		 * 
		 * empleado1.setSubeSueldo(5); //llamando el metodo para subir el sueldo
		 * a los empleados empleado2.setSubeSueldo(5); //llamando el metodo para
		 * subir el sueldo a los empleados empleado3.setSubeSueldo(5);
		 * //llamando el metodo para subir el sueldo a los empleados
		 * 
		 * System.out.println("Nombre:" + empleado1.getNombre() + ";" +
		 * " Sueldo: " + empleado1.getSueldo() + ";" + "  Fecha de Alta: " +
		 * empleado1.getFechaContrato());
		 * 
		 * System.out.println("Nombre:" + empleado2.getNombre() + ";" +
		 * " Sueldo: " + empleado2.getSueldo() + ";" + "  Fecha de Alta: " +
		 * empleado2.getFechaContrato());
		 * 
		 * System.out.println("Nombre:" + empleado3.getNombre() + ";" +
		 * " Sueldo: " + empleado3.getSueldo() + ";" + "  Fecha de Alta: " +
		 * empleado3.getFechaContrato());
		 */

		/***********************************************************************************************/
		/*
		 * Codigo de Ejecucion 2 funcional utilizando un JoptionPane(para que el
		 * usuario ingrese la informaci�n por pantalla) luego se mostrara por
		 * consola se crea un array del tipo de objeto Empleado para que se
		 * almacenen los empleados y los atributos que se deben enviar luego se
		 * crea dos bucles for tradicionales para subir el sueldo y otro para
		 * imprimir la informacion por consola
		 * 
		 * 
		 * Empleado[] misEmpleados = new Empleado[3]; // creando objeto Empleado
		 * de tipo array
		 * 
		 * 
		 * 
		 * for (int i = 0; i < 3; i++) { misEmpleados[i] = new
		 * Empleado(JOptionPane.showInputDialog("nombre"),
		 * Double.parseDouble(JOptionPane.showInputDialog("sueldo")),
		 * Integer.parseInt(JOptionPane.showInputDialog("a�o")),
		 * Integer.parseInt(JOptionPane.showInputDialog("mes")),
		 * Integer.parseInt(JOptionPane.showInputDialog("dia"))); }
		 */

		/**/
		Jefatura jefe_RRHH = new Jefatura("Freyder", 5000000, 2017, 11, 20);// instanciando
																			// objeto
																			// de
																			// la
																			// subclase
																			// "Jefatura"

		jefe_RRHH.setIncentivo(500);

		Empleado[] misEmpleados = new Empleado[5];

		misEmpleados[0] = new Empleado("Violetta", 65000, 2025, 12, 4);
		misEmpleados[1] = new Empleado("Sara", 75000, 2035, 8, 8);
		misEmpleados[2] = new Empleado("ana"); // creaci�n o instancia de
												// objeto Empleado e
												// inicializaci�n del
												// constructor2 q solo tiene un
												// parametro
		/*
		 * En el evento que no sepa el sueldo y la fecha de algun empleado y se
		 * necesiten generar muchos objetos de muchos empleados, puedo darle un
		 * valor estandar a los parametros de sueldo y fecha a esos empleados de
		 * los que no se los datos, para eso se utiliza el operador "this", esto
		 * se observa sobre el constructor2* por lo cual la instruccion:
		 * misEmpleados[2] = new Empleado("Sara"); llama al constructor2 pero
		 * implicitamente llama al constructor1 para darle los valores con el
		 * this /
		 * 
		 */

		misEmpleados[3] = jefe_RRHH; /*
										 * Polimorfismo en acci�n.Principio de
										 * sustituci�n lo que el programa espera
										 * es que almacenemos dentro del array
										 * un objeto de tipo Empleado, es decir
										 * podemos utilizar un objeto de la
										 * subclase cuando el programa espere un
										 * objeto de la superclase. Tambien
										 * cumple la regla de herencia "Es un"
										 * porque un Jefe es un Empleado, por
										 * eso podemos almacenar un objeto de
										 * tipo Jefatura dentro de una variable
										 * que espera un objeto de tipo
										 * "Empleado, por lo cual es la misma
										 * instrucci�n que esta:
										 * misEmpleados[3]=new Jefatura("Freyder", 5000000,2017,11,20); 
										 */
		misEmpleados[4] = new Jefatura("sara", 95000, 1999, 5, 26);/*
					 * como este objeto ya esta instanciado en el array en la
					 * posici�n 4 quiero establecerle el incentivo ya que es te
					 * tipo Jefatura osea llamar el metodo (setIncentivo), debo
					 * analizar que el array es de tipo "Empleado" y por ende no
					 * puedo utilizar los metodos de la clase "Jefatura" cuando
					 * instancie objetos. para solucionar el problema se hace lo
					 * siguiente realizar una refundici�n o casting, para
					 * convertir lo que hay almacenado en esa posici�n del array
					 * que es de tipo "empleado" en un objeto de tipo "Jefatura"
					 * y asi aplicarle el metodo (setIncentivo) :
					 */

		Jefatura jefa_finanzas = (Jefatura) misEmpleados[4]; // esto es un
																// casteo para
																// convertir un
																// objeto de un
																// tipo en otro

		jefa_finanzas.setIncentivo(10000);

		/* Jefatura jefe_compras=(Jefatura) misEmpleados[1]; *//*
																 * esta
																 * instrucci�n
																 * es erronea
																 * porque estoy
																 * haciendo un
																 * casteo a una
																 * posici�n que
																 * en primer
																 * lugar es de
																 * tipo empleado
																 * donde tengo
																 * almacenado un
																 * Empleado no
																 * un jefe es
																 * decir un
																 * empleado no
																 * siempre es un
																 * jefe
																 */


		/**codigo para entender como se define por principio de sustitucion las interfaces y como se utiliza 
		 * la propiedad instanceof para clases y para interfaces*/
		
		/*Empleado director_comercial=new Jefatura("Freyder", 5000000,2017,11,11);*//*creando una instancia Director
		// comercial de tipo Empleado que es un jefe osea llamando el constructor de Jefatura*/
		
		/*Comparable ejemplo=new Empleado("Elizabeth", 95000, 2011, 06, 07);*/ /*utlizando principio de sustitucion,
		ojo:No se puede instanciar directamente una interfaz. 
		la solucion es que la clase Empleado implementa la interfaz (comparable) podemos crearnos una instancia 
		(ejemplo) perteneciente a la interfaz (comparable) pero luego a la hora de 
		instanciarla  decirle que es de tipo Empleado*/
		/*
		 if(director_comercial instanceof Empleado){//estamos preguntando si la instancia director_comercial pertenece
			 //a la clase empleado?
			 System.out.println("Es de tipo Jefatura");
		 }
		 
		/*
		 if(ejemplo instanceof Comparable){//si la instancia que se le dio a la interfaz Comparable implementa
			 System.out.println("Implementa la interfaz comparable");
		 }
		*/
		/***************************************************************************************************************/
		 
		/*
		 * for(int i=0; i<3; i++){ //bucle for traducional para subir el sueldo
		 * a todos los empleados
		 * 
		 * misEmpleados[i].setSubeSueldo(5); }
		 * 
		 * 
		 */
		
		/*imprimiendo por consola el metodo que fue definido en la interfaz jefes y se implemento en la clase :)*/
		System.out.println(jefa_finanzas.tomar_decisiones("Dar mas d�as de vacaciones a los empleados"));
		
		/*imprimiendo por consola y probando los metodos definidos en las interface de  jefes*/
		System.out.println("El jefe " + jefa_finanzas.getNombre() + " tiene una bonificacion de: " +
		jefa_finanzas.establece_bonus(500));
		
		/*imprimiendo por consola y probando los metodos definidos en las interface de  trabajadores*/
		System.out.println(misEmpleados[3].getNombre() + " tiene un nombre de: " + misEmpleados[3].establece_bonus(200));
		
		for (Empleado e : misEmpleados) { // bucle for each mejorado para subir el sueldo a los trabajadores: creando
											// una variable "e" del tipo q
											// tenemos almacenado dentro del
											// array misEmpleados

			e.setSubeSueldo(5);
		}
		/*
		 * for(int i=0; i<3; i++){ //bucle for para decir que nos imprima en
		 * pantalla la informaci�n de los empleados
		 * 
		 * System.out.println("Nombre: " + misEmpleados[i].getNombre() +
		 * " Sueldo; " + misEmpleados[i].getSueldo() + " Fecha de Alta" +
		 * misEmpleados[i].getFechaContrato()); }
		 */

		/*ejemplo: si queremos ordenar el array*/
		Arrays.sort(misEmpleados);/*este metodo "sort" static de la clase Arrays en la API DE java nos indica 
									que debemos implementar la interfaz	  *"comparable.compareTo()"*/
		
		
		for (Empleado e : misEmpleados) {// bucle for each mejorado

			/*
			 * es de destacar que para esta impresion en consola se llama al
			 * metodo "getSueldo()" donde java trabaja sobre los objetos
			 * instanciados pertenecientes a la clase "Empleado":
			 * misEmpleados[0] = new Empleado("Violetta", 65000, 2025, 12, 4);
			 * misEmpleados[1] = new Empleado("Sara", 75000, 2035, 8, 8);
			 * misEmpleados[2] = new Empleado("Sara"); y tambien* sabe que el
			 * metodo "getSueldo" esta declarado en la clase "Jefatura" pero ac�
			 * hay un incremento (incentivo) para los jefes, aplica para el
			 * objeto: misEmpleados[3]=jefe_RRHH;
			 */
			System.out.println(e.getdatos() + " ; " + " Sueldo: " + e.getSueldo() + "  " + "  Fecha de Alta: "
					+ e.getFechaContrato());
		}

		/***********************************************************************************************/
	}

}

/*
 * Cuando se utiliza un unico elemento para programar, solamente una de las
 * clases va tener el modificador de acceso: Public que es la que tiene el
 * metodo main
 */

class Empleado implements Comparable, Trabajadores { /*se implemento la interfaz Comparable para utilizar un 
metodo abstracto compareTo y tambien se implemento la interface Trabajadores ya que todos los trabajadores tienen
derecho al bonus de Navidad por lo cual obliga a que se implemente el metodo definido en esta */

	/*
	 * variables de clase (capos de clase), que deben ser solo modificadas utilizando los metodos
	 * correspondientes, este caso el metodo constructor
	 */
	private String nombre;
	private double sueldo;
	private Date altaContrato; // variable de clase Date donde se hace necesario
								// importar el paquete java.util
	private int id;
	private static int idsiguiente = 1; // con esta variable los trabajadores
										// tendran un id para todos los objetos,
										// no un id de copia;

	/**************************************** Metodos ******************************************************************/

	public Empleado(String nom, double sue, int agno, int mes,
			int dia) { /*
						 * metodo constructor1 recibiendo parametros o
						 * argumentos
						 */
		nombre = nom;
		sueldo = sue;

		GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia); // creando
																					// objeto
																					// calendario

		altaContrato = calendario.getTime(); // llamando el metodo para que me
												// devuelva la fecha de
												// calendario que se asigno
		++idsiguiente;
		id = idsiguiente++; // variable estatica, incrementa en el valor, cada
							// vez que crea un objeto

	}

	public Empleado(String nom) { // constructor2 enviando solo 1 parametro sin
									// conocer todos los otros parametros del
									// constructor1

		this(nom, 30000, 2000, 01, 01); // el this lo que hace es llamar al
										// constructor1, si se tuviran mas
										// constructores el this llamar�a al que
										// se asemeje en numero de parametros.
	}

	// getter y setters

	public String getNombre() { // GETTER

		return nombre;
	}

	public double getSueldo() { // getter

		return sueldo;
	}

	public Date getFechaContrato() { // getter

		return altaContrato;
	}

	public void setSubeSueldo(double porcentaje) {

		double aumento = sueldo * porcentaje / 100;

		sueldo += aumento;

	}

	public String getdatos() { // getter para darnos los datos de cada uno de
								// los trabajadores

		return "el nombre del trabajador es: " + nombre + " y el Id= " + id;
	}

	public static String getIdSiguiente() { // metodo static

		return "El IdSiguiente es: " + idsiguiente;
	}
	
	public int compareTo(Object miObjeto) {/*sobreescribiendo el metodo "compareTo" que viene en la interfaz "Compare",
	tiene que recibir un parametro de tipo objeto, como nos tiene que devolver un int tenemos que incluir
	un return. Segun lo que dice la descripcion en la API que devuelve un numero negativo si el objeto que estoy
	comparando es menor, o si devuelve un positivo si es mayor y devuelve 0 si son iguales.
	 se debe realizar un casting ya que el parametro que recibe el metodo es (miObjeto) y se tiene
	 que transformar ese parametro en un objeto de tipo (Empleado) para poder comparar el sueldo de los empleados
	 o lo que se quiera id
	 */
		
		 Empleado otroEmpleado=(Empleado) miObjeto; /*se hace un casting, con esto ya tengo una variable objeto
		 denominada "otroEmpleado"que es de tipo empleado, esto permitira comparar el sueldo de un Empleado con otroEmpleado*/
		 
		 if(this.id<otroEmpleado.id){/*el this hace referencia a un parametro implicito de Empleado*/
			 return -1;
		 }
		 if (this.id>otroEmpleado.id){
			 return 1;
		 }
		 return 0;
		
		
	}
	
	public double establece_bonus(double gratificacion){/*metodo set abstracto definido en la interface Trabajadores*/
		
		return Trabajadores.bonus_base+gratificacion; 
	}
	
}

class Jefatura extends Empleado implements Jefes {/*como esta implementando la interface Jefes esta obligado a desarrollar
los metodos de la interface Jefes y la de trabajadores porque Jefes hereda de Trabajadores*/

	private double incentivo; // variable de clase

	/* metodos */
	public Jefatura(String nom, double sue, int agno, int mes, int dia) { // constructor
																			// para
																			// la
																			// clase
																			// Jefatura

		super(nom, sue, agno, mes, dia); // llamando constructor de la clase
											// padre "Empleado" con parametros,
											// es decir constructor1

	}

	public void setIncentivo(double b) {

		incentivo = b;
	}

	public double getSueldo() { // metodo que remplaza al metodo de la clase
								// Empleado por eso el triangulo verde

		double sueldoJefe = super.getSueldo();// metodo getSueldo() de la clase
												// Empleado debe almacenarse en
												// la variable sueldoJefe

		return sueldoJefe + incentivo;
	}
	
	public String tomar_decisiones(String decision){//metodo llamado de la interfaz jefes
		
		
		return "Un miembro de la direcci�n ha tomado la decisi�n de: " + decision;
	}
	
	public double establece_bonus(double gratificacion){/*metodo set abstracto definido en la interface Trabajadores*/
		
		double prima=2000;
		
		return Trabajadores.bonus_base+gratificacion+prima;
		
	}


}
