
public class EjercicioClassTema9 {
    public void main(String[] args) {
        Cliente david = new Cliente();
        david.setEdad(31);
        david.setNombre("David");
        david.setTelefono(0303456);
        david.setCredito(123);

        System.out.println(david.getEdad());
        System.out.println(david.getNombre());
        System.out.println(david.getTelefono());
        System.out.println(david.getCredito());
    }
    class Persona {
        int edad;
        String nombre;
        int telefono;
    }
    class Cliente extends Persona{
        int credito;
        public void setEdad(int edad) {
            this.edad = edad;
        }
        public int getEdad() {
            return this.edad;
        }
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        public String getNombre() {
            return this.nombre;
        }
        public void setTelefono(int telefono) {
            this.telefono = telefono;
        }
        public int getTelefono() {
            return this.telefono;
        }
        public void setCredito(int credito) {
            this.credito = credito;
        }
        public int getCredito() {
            return this.credito;
        }
    }
    class Trabajador extends Persona {
        float salario;

        public void setSalario(float salario) {
            this.salario = salario;
        }
        public float getSalario() {
            return this.salario;
        }
    }
    }
