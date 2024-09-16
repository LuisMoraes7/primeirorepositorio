def resolucao():
    print('''Um mago tem três feitiços: fogo, água e terra. Você deve escolher o valor 1, 2 ou 3 para ditar qual será o feitiço do mago.''')
    while True:
        try:
            escolha = int((input('Escolha 1, 2 ou 3: ')))
            match escolha:
                    case 1:
                        print('Você escolheu o feitiço de Fogo.')
                        break
                    case 2: 
                        print('Você escolheu o feitiço de Água.')
                        break
                    case 3:
                        print('Você escolheu o feitiço de Terra.')
                        break
                    case _:
                        print('Entrada inválida, somente os inteiros 1, 2 ou 3. Tente novamente!')
        except ValueError:
            print('Entrada inválida, somente os inteiros 1, 2 ou 3. Tente novamente!')



if __name__ == '__main__':
    print("----------- Iniciando o programa ------------")

    resolucao()

    print("------------- Fim do programa ---------------")