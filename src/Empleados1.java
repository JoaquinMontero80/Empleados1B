public class Empleados1 {
	private int id;
	private String nombre;
	private String apellidos;
	private String dirección;
	private int teléfono;
	
	public Empleados1(int id, String nombre, String apellidos, String dirección, int teléfono) {
		this.id=id;
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.dirección=dirección;
		this.teléfono=teléfono;
		
		
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

	public String getDirección() {
		return dirección;
		
	}

	public void setDirección(String dirección) {
		this.dirección = dirección;
	}

	public int getTeléfono() {
		return teléfono;
	}

	public void setTeléfono(int teléfono) {
		this.teléfono = teléfono;
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