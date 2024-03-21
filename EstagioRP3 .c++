#include <iostream>
#include <string>
#include <cstring>
#include <locale.h>

using namespace std;
using std::string;

string inverteString(string entrada);
int main()
{
    setlocale(LC_ALL, "Portuguese");
    string entrada, saida;

    cout << "\n String ORIGINAL:\n\n";
    entrada = "\n << !redneperra es oãv oãN .satnaD egroJ etartnoC! >> \n\n";
    cout << entrada;
    saida = inverteString(entrada);

    cout << "\n\nSEGUE STRING INVERTIDA\n\n";
    cout <<"******************************************";
    cout << saida;
    cout <<"\n ******************************************\n\n\n\n";

    return 0;
}

//desenvolvendo lógica do método próprio que inverte a string
string inverteString(string entrada) {
    //criando um inteiro para guardar o tamanho do texto que está na variável entrada..
    int tam = entrada.length();

    char char_palavra[tam + 1];
    char char_invertido[tam + 1];

        //Este comando recebe 2 arrays de char, precisei usar o método nativo c_str para entregar o necessário..
    strcpy(char_palavra, entrada.c_str());

    for (int i = 0; i < tam; i++) {
        char_invertido[i] = char_palavra[tam - i - 1];
    }
    char_invertido[tam] = '\0';

    string retorno(char_invertido);
    return retorno;
}
