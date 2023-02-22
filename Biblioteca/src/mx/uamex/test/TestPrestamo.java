
package mx.uamex.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import mx.uamex.dto.Alumno;
import mx.uamex.dto.Libro;
import mx.uamex.dto.Prestamo;

/**
 *
 * @author Angela Rios
 */
public class TestPrestamo {

    public static void main(String[] args) {

        Libro libro1 = new Libro();
        libro1.setId(1);
        libro1.setNombre("Fundamentos de programacion");
        libro1.setCategoria("Programación");
        libro1.setEditorial("Alfaomega");
        libro1.setIsbn(2324);
        libro1.setStock(5);

        Libro libro2 = new Libro();
        libro2.setId(1);
        libro2.setNombre("Calculo");
        libro2.setCategoria("Matematicas");
        libro2.setEditorial("Alfaomega");
        libro2.setIsbn(344);
        libro2.setStock(2);

        List<Libro> listaLibros = new ArrayList<>();
        listaLibros.add(libro2);
        listaLibros.add(libro1);

        Alumno alumno1 = new Alumno();
        alumno1.setId(1);
        alumno1.setNombre("Fernando");
        alumno1.setApellidoPaterno("Roldan");
        alumno1.setApellidoMaterno("Juarez");
        alumno1.setNumeroCuenta(2221821);
        
        Alumno alumno2 = new Alumno();
        alumno1.setId(2);
        alumno1.setNombre("German");
        alumno1.setApellidoPaterno("Valdez");
        alumno1.setApellidoMaterno("Perez");
        alumno1.setNumeroCuenta(2129111);

        Prestamo prestamo1 = new Prestamo();
        Date fechaIni = new Date();
        prestamo1.setId(1);
        prestamo1.setFolio(234);
        prestamo1.setFechainicio(fechaIni);
        prestamo1.setLibros(listaLibros);
        prestamo1.setPersona(alumno1);
        
        Prestamo prestamo2 = new Prestamo();
        prestamo1.setId(1);
        prestamo1.setFolio(234);
        prestamo1.setFechainicio(fechaIni);
        prestamo1.setLibros(listaLibros);
        prestamo1.setPersona(alumno1);

        System.out.println(prestamo1 + "\n" + prestamo2);

    }
}
