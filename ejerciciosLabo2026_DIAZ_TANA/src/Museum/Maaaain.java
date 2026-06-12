package Museum;

import java.time.LocalDate;

public class Maaaain {

    public static void main(String[] args) {

        Cuadro cuadro = new Cuadro(
                "papucuadro",
                "ete sech",
                1889,
                6
        );

        Restaurador restaurador = new Restaurador(
                "Juan",
                "Perez",
                12345678,
                LocalDate.of(1985, 5, 10),
                12
        );

        String resultado = restaurador.restaurar(cuadro);

        System.out.println(resultado);
    }
}}
