#include <iostream>
#include <vector>
#include <string>
using namespace std;

struct Empleado
{

    int salario;
    string nombre;
    string apellido;
    int FDN;
    string sexo;
};

Empleado empleadoConMayorSueldo(vector<Empleado> empleado, vector<Empleado> &pocosueldo)
{

    Empleado salarioAlto;

    for (int i = 0; i < empleado.size(); i++)
    {

        if (empleado[i].salario <= 400000)
        {

            pocosueldo.push_back(empleado[i]);
        }

        else if(empleado[i].salario > salarioAlto.salario)
        {
            salarioAlto = empleado[i];
        }
    }

    cout << "Los empleados esclavizados son: " << endl;

    for (int i = 0; i < pocosueldo.size(); i++)
    {
        cout << "Empleado" << i << ": \n Nombre: " << pocosueldo[i].nombre << endl;
        cout << "Apellido: " << pocosueldo[i].apellido << endl;
    }
    return salarioAlto;
}

int main(void)
{

    vector<Empleado> vacio = {};

    vector<Empleado> empleados = {
        {350000, "Juan", "Perez", 1985, "M"},
        {420000, "Maria", "Gomez", 1990, "F"},
        {390000, "Carlos", "Lopez", 1988, "M"},
        {410000, "Ana", "Martinez", 1992, "F"},
        {280000, "Luis", "Rodriguez", 1987, "M"},
        {450000, "Laura", "Fernandez", 1991, "F"},
        {370000, "Pedro", "Garcia", 1984, "M"},
        {480000, "Sofia", "Sanchez", 1993, "F"},
        {260000, "Diego", "Ramirez", 1986, "M"},
        {500000, "Lucia", "Torres", 1994, "F"},
        {320000, "Miguel", "Flores", 1983, "M"},
        {470000, "Paula", "Rivera", 1995, "F"},
        {390500, "Jorge", "Acosta", 1982, "M"},
        {410500, "Elena", "Rojas", 1991, "F"},
        {275000, "Ricardo", "Diaz", 1980, "M"},
        {430000, "Valeria", "Castro", 1992, "F"},
        {340000, "Hector", "Morales", 1981, "M"},
        {460000, "Daniela", "Vega", 1993, "F"},
        {300000, "Fernando", "Ortega", 1979, "M"},
        {490000, "Camila", "Silva", 1994, "F"},
        {380000, "Alberto", "Mendez", 1978, "M"},
        {420500, "Natalia", "Cruz", 1990, "F"},
        {310000, "Roberto", "Herrera", 1977, "M"},
        {440000, "Julieta", "Paz", 1995, "F"},
        {360000, "Oscar", "Aguilar", 1976, "M"},
        {470500, "Carla", "Farias", 1992, "F"},
        {290000, "Sergio", "Ponce", 1975, "M"},
        {455000, "Florencia", "Suarez", 1993, "F"},
        {330000, "Pablo", "Navarro", 1974, "M"},
        {480500, "Marina", "Campos", 1991, "F"},
        {270000, "Andres", "Sosa", 1973, "M"},
        {465000, "Gabriela", "Benitez", 1994, "F"},
        {350500, "Ramon", "Ibarra", 1972, "M"},
        {495000, "Patricia", "Luna", 1990, "F"},
        {300500, "Eduardo", "Salas", 1971, "M"},
        {410200, "Lorena", "Molina", 1993, "F"},
        {285000, "Raul", "Rios", 1970, "M"},
        {435000, "Silvia", "Bravo", 1992, "F"},
        {345000, "Victor", "Paredes", 1989, "M"},
        {460200, "Alicia", "Cabrera", 1994, "F"},
        {315000, "Mario", "Villalba", 1986, "M"},
        {470200, "Cecilia", "Peña", 1991, "F"},
        {395000, "Julio", "Leiva", 1985, "M"},
        {420200, "Marta", "Quiroga", 1990, "F"},
        {365000, "Esteban", "Cano", 1984, "M"},
        {440200, "Rosa", "Valdez", 1993, "F"},
        {255000, "Hugo", "Godoy", 1983, "M"},
        {480200, "Irene", "Bustos", 1992, "F"},
        {335000, "Tomas", "Escobar", 1987, "M"},
        {450200, "Adriana", "Peralta", 1991, "F"},
        {375000, "Martin", "Arce", 1982, "M"},
        {430200, "Noelia", "Montoya", 1994, "F"},
        {295000, "Gustavo", "Reyes", 1981, "M"},
        {455200, "Sandra", "Franco", 1990, "F"},
        {325000, "Cristian", "Campos", 1988, "M"},
        {470300, "Paola", "Soto", 1993, "F"},
        {305000, "Leandro", "Nuñez", 1987, "M"},
        {490200, "Karina", "Tapia", 1995, "F"},
        {355000, "Fabian", "Correa", 1984, "M"},
        {420300, "Ruth", "Carrizo", 1992, "F"},
        {280500, "Sebastian", "Figueroa", 1986, "M"},
        {460300, "Claudia", "Ayala", 1991, "F"},
        {365500, "Dario", "Caceres", 1985, "M"},
        {435200, "Veronica", "Pinto", 1993, "F"},
        {295500, "Adrian", "Moyano", 1982, "M"},
        {470400, "Marcela", "Galarza", 1990, "F"},
        {340500, "Walter", "Ledesma", 1981, "M"},
        {455400, "Liliana", "Coronel", 1994, "F"},
        {315500, "Nicolas", "Ojeda", 1988, "M"},
        {480400, "Yesica", "Ferreyra", 1992, "F"},
        {385000, "Guillermo", "Toledo", 1983, "M"},
        {430400, "Monica", "Zarate", 1991, "F"},
        {265000, "Rodrigo", "Alvarez", 1987, "M"},
        {495400, "Daniel", "Cejas", 1980, "M"},
        {350800, "Julian", "Roldan", 1989, "M"},
        {440500, "Tamara", "Dominguez", 1993, "F"},
        {375500, "Bruno", "Serrano", 1990, "M"},
        {460500, "Agustina", "Carrera", 1995, "F"}};

    Empleado millo = empleadoConMayorSueldo(empleados, vacio);

        cout << "El empleado mas acaudalado es: " << endl;
        cout << "Empleado" << i << ": \n Nombre: " << millo.nombre << endl;
        cout << "Apellido: " << millo.apellido << endl;
}