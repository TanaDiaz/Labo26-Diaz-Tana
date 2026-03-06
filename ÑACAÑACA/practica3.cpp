# include <iostream>
# include <string>

using namespace std;

int main(void){

string palabra;

cin>>palabra;

while(palabra != "/salir"){

int valor = veoPalabra(palabra);

    if(valor = 0){
        cout<<"singular y sin género";
        }
    if(valor = 1){
        cout<<"plural y sin género";
    }
    if(valor = 2){
        cout<<"singular y femenino";
    }
    if(valor = 3){
        cout<<"plural y femenino";
    }
    if(valor = 4){
        cout<<"singular y masculino";
    }
    if(valor = 5){
        cout<<"plural y masculino";
    }
    if(valor = 6){
        cout<<"indefinido";
    }
    }   
}