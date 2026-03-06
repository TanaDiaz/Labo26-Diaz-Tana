#include <iostream>
#include <string>
#include <vector>

using namespace std;

struct jugador
{
    int salud;
    string nombre;
    bool estado;
    int municion;
};

struct zombie
{
    string tipo;
    int salud;
    int velocidad;
};

int Recibir_mordida(int salud)
{

    int danio = 25;

    salud = salud - danio;

    return salud;
}

int main(void)
{
    jugador player;
    player.salud = 100;
    player.nombre = "Jugador";
    player.estado = false;
    player.municion = 30;

    zombie niggi;
    niggi.tipo = "tipo";
    niggi.salud = 100;
    niggi.velocidad = 20;

    if (player.estado == false)
    {

        cout << "Su nombre es " << player.nombre << ", su salud " << player.salud << ", su estado es sano, y tiene de municion " << player.municion << endl;
    }
    else
    {
        cout << "Su nombre es " << player.nombre << ", su salud " << player.salud << ", su estado es infectado, y tiene de municion " << player.municion << endl;
    }

    if (player.municion > 0)
    {

        player.municion--;
        cout << "disparo efectuado!" << endl;
    }
    else
    {
        cout << "Click! Sin munición... ¡A correr!" << endl;
    }
    cout << player.municion << endl;

    while (player.salud > 0)
    {
        cout << "sigues vivo..." << endl;
        player.salud--;
    }
    cout << "Has muerto! Enhorabuena!" << endl;

    for (int i = 0; i < 5; i++)
    {
        cout << "Revisando caja " << i << "..." << endl;
    }

    player.salud = Recibir_mordida(salud);
    cout << player.salud;

    vector<string> mochila;

    mochila.push_back("medkit");
    mochila.push_back("glock 17");
    mochila.push_back("ammoBox");
}