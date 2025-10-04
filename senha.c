#include <stdio.h>
#include <string.h>

int main() {
    char senha_correta[] = "1234";
    char senha_digitada[20];

    do {
        printf("Digite a senha: ");
        scanf("%s", senha_digitada);

        if (strcmp(senha_digitada, senha_correta) != 0) {
            printf("senha incorreta!\n");
        }
    } while (strcmp(senha_digitada, senha_correta) != 0);

    printf("senha correta!\n");
    return 0;
}
