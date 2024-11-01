from random import randint
def main(): 
    matrizA = [
        [1, 2, 3, 4, 5, 6, 7, 8, 9, 4],
        [7, 8, 3, 4, 7, 0, 6, 1, 4, 4],
        [0, 8, 5, 3, 2, 1, 8, 9, 6, 5],
        [1, 4, 6, 3, 7, 8, 1, 3, 4, 9],
        [8, 9, 1, 4, 5, 8, 1, 2, 4, 3],
        [2, 3, 6, 9, 1, 7, 3, 1, 0, 8],
        [9, 1, 3, 5, 9, 1, 2, 3, 4, 5],
        [2, 1, 6, 2, 1, 3, 6, 1, 8, 7],
        [5, 2, 7, 3, 9, 7, 3, 8, 1, 9],
        [3, 1, 7, 5, 1, 7, 4, 7, 5, 4]
    ]
    soma = 0
    for coluna in range(len(matrizA[0])):
        for linha in range(len(matrizA)):
            soma += matrizA[linha][coluna]

    print('A soma é: ', soma)

    # for coluna in range(len(matrizA[0])):
    #     for linha in range(len(matrizA)):
    #         matrizA[linha][coluna] *= 3

    tamanho = 10
    matrizB = [[0 for _ in range(tamanho)]for _ in range(tamanho)]
    for coluna in range(len(matrizA[0])):
        for linha in range(len(matrizA)):
            matrizB[linha][coluna] += matrizA[linha][coluna] * 3
            

    print('Matriz B:')
    for linha in matrizB:
        print(linha)

   
    

if __name__ == '__main__':
    print("----------- Iniciando o programa ------------")

    main()

    print("------------- Fim do programa ---------------")