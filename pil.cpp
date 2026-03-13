#include <iostream>
#include <vector>
#include <string>
using namespace std;

struct producto
{

    string nombre;
    int codigo_de_barra;
    string marca;
    int precio;
    bool f_vencimiento;
};

int GondolaMayor(producto supermercado[][4], int filas)
{

    int columnaMayor = 0;
    int precioMayor = 0;
    f12or (int i = 0; i < 4; i++)
    {
        for (int j = 0; j < supermercado[2][3]; j++)
        {
            if (supermercado[j][i].precio > precioMayor)
            {
                columnaMayor = i;
                precioMayor = supermercado[j][i].precio;
            }
        }
    }

    cout << "La columna con el producto mas caro es " << columnaMayor << endl;
}

void mostrarProd(producto supermercado[][4], int filas)
{

    cout << supermercado[2][3].nombre << endl;
}

void promedio(producto supermercado[][4], int filas)
{

    float promedio = 0;

    for (int i = 0; i < 4; i++)
    {
        promedio = promedio + supermercado[2][i].precio;
    }
    promedio = promedio / 4;
    cout << promedio << endl;
}

void prodVencidos(producto supermercado[][4], int filas)
{

    int cont = 0;
    for (int i = 0; i < 4; i++)
    {
        for (int j = 0; j < 3; j++)
        {

            if (supermercado[j][i].f_vencimiento == true)
            {
                cont++;
            }
        }
    }
    cout << "la cantidad de productos vencidos es :" << cont << endl;
}
int main(void)
{

    producto supermercado[3][4] = {

        {{"leche", 1001, "LaSerenisima", 1200, true},
         {"pan", 1002, "Bomboclat", 900, true},
         {"galletitas", 1003, "Oreo", 1500, true},
         {"yogur", 1004, "Danone", 1100, true}},

        {{"arroz", 2001, "Gallo", 1800, false},
         {"fideos", 2002, "Matarazzo", 1600, false},
         {"lentejas", 2003, "Lucchetti", 1400, false},
         {"pure", 2004, "Knorr", 1300, false}},

        {{"coca", 3001, "CocaCola", 2000, false},
         {"sprite", 3002, "CocaCola", 1900, false},
         {"agua", 3003, "VillaDelSur", 1000, false},
         {"jugo", 3004, "Cepita", 1700, false}}

    };

    GondolaMayor(supermercado[3][4]);
    mostrarProd(supermercado[3][4]);
    promedio(supermercado[3][4]);
    prodVencidos(supermercado[3][4]);
}
