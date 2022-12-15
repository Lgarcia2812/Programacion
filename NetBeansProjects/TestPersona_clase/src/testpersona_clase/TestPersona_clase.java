package testpersona_clase;

/**
 *
 * @author Diurno
 */
public class TestPersona_clase {

    
    enum Nacionalidad {ESPAÑOLA, INGLESA, ALEMANA, CUBANA,AJPONESA, INDIO, APÁTRIDA}
    enum Sexo {HOMBRE, MUJER, FLUIDO}
    
    // Atributos 
    String nombre;
    Float altura;
    Float peso;
    Nacionalidad nacionalidad;
    boolean europea;
    String dni;
    byte edad;
    
    public TestPersona_clase (String nombre, float altura, float miPeso, String nacionalidad,
                     String miDni, byte edad){
        String unNombre = null;
        nombre = unNombre;
        
        }
    
    public void Persona(){
        
        nombre = "";
//        altura = 0;
//        peso = 0;
//        nacionalidad = ;
        
    }
        
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float getAltura() {
        return altura;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public Nacionalidad getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacion) {
        nacion = nacion.toUpperCase();
        try{
            nacionalidad = nacionalidad.valueOf(nacion);
        }catch (IllegalArgumentException error){
            nacionalidad = Nacionalidad.APÁTRIDA; 
            
        }
        // AHora relleno el campo europea
        setEuropeo();
                
    }
    
    public void setEuropeo(){
        
    }

    public boolean isEuropea() {
        return europea;
    }

    public void setEuropea(boolean europea) {
        this.europea = europea;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
//    public void setEdad(byte edad){
//        if (edad)
//    } 
            

    public byte getEdad() {
        return edad;
        
        
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "TestPersona_clase{" + "nombre=" + nombre + ", altura=" + altura + ", peso=" + peso + ", nacionalidad=" + nacionalidad + ", europea=" + europea + ", dni=" + dni + ", edad=" + edad + '}';
    }

   
   
}
