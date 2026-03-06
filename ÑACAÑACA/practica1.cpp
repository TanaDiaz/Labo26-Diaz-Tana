# include <iostream>

using namespace std;

int main (void){
int num = 1;

int mayor;
int menor;

cout<<"ingrese numeros bla bla bla"<<endl;
cin>>num;

menor = num;
mayor = num;

cin>>num;

while(num != 0){


if(num<menor)
{
    menor = num;
}

else if(num>mayor)
{
    mayor = num; 
}

cin>>num;
}

cout<<"el menor fue "<<menor<<" y el mayor "<<mayor;
}