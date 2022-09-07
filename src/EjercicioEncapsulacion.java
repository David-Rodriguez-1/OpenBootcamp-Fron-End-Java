
public class EjercicioEncapsulacion {
    public static void main(String[] args) {
        Persona david = new Persona();
        david.setEdad(31);
        david.setNombre("David");
        david.setTelefono(0303456);

        System.out.println(david.getEdad());
        System.out.println(david.getNombre());
        System.out.println(david.getTelefono());
        }
    }
    class Persona {
        private int edad;
        private String nombre;
        private int telefono;

        public void setEdad(int edad){
            this.edad = edad;
        }
        public void setNombre(String nombre){
            this.nombre = nombre;
        }
        public void setTelefono(int telefono){
            this.telefono = telefono;
        }

        public int getEdad(){
            return this.edad;
        }
        public String getNombre(){
            return this.nombre;
        }
        public int getTelefono(){
            return this.telefono;
        }
    }
