public class Empleados1 {
	private int id;
	private String nombre;
	private String apellidos;
	private String direcci�n;
	private int tel�fono;
	
	public Empleados1(int id, String nombre, String apellidos, String direcci�n, int tel�fono) {
		this.id=id;
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.direcci�n=direcci�n;
		this.tel�fono=tel�fono;
		
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDirecci�n() {
		return direcci�n;
		
	}

	public void setDirecci�n(String direcci�n) {
		this.direcci�n = direcci�n;
	}

	public int getTel�fono() {
		return tel�fono;
	}

	public void setTel�fono(int tel�fono) {
		this.tel�fono = tel�fono;
	}
	
	// longitud de nombre
	public int longitud () {
		return nombre.length();
	}
	// apellido en mayuscula
	public String mayuscula () { 
		return nombre.toUpperCase();
	}
	// id * 5
	public int multiplicar () {
		return id * 5;
	}

	
}