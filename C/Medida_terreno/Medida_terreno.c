
//MEDIDA DE TERRENO

#include "stdio.h"

int main() {
	float frente, laterais, area;
	printf("Informe a medida da frente do terreno em metros: ");
	scanf("%f", &frente);
	printf("Informe o a medida das laterais do terreno em metros: ");
	scanf("%f", &laterais);
	area = frente*laterais;
	printf("A medida da area do terreno, em metros, e de: %f", area);
	return 0;
	
}
