

def resolucao():
    x = int(input('Digite quantos passos são necessários para chegar na parte A do mapa: '))
    y = int(input('Digite quantos passos são necessários para chegar na parte B do mapa: '))
    total = x + y
    return (print(f'O total de passos é {total} ({x} + {y}).'))



if __name__ == '__main__':
    print("----------- Iniciando o programa ------------")

    resolucao()

    print("------------- Fim do programa ---------------")