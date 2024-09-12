

def resolucao():
    print('''Um mapa do tesouro tem duas partes, A e B. A primeira parte está escondida no X
número de passos para o norte, e a segunda no Y número de passos para o leste. Crie um
programa que receba os valores de X e Y e calcule a distância total que o pirata precisa
percorrer para chegar ao tesouro (soma de X e Y).''')
    x = int(input('Digite quantos passos são necessários para chegar na parte A do mapa: '))
    y = int(input('Digite quantos passos são necessários para chegar na parte B do mapa: '))
    total = x + y
    return (print(f'O total de passos é {total} ({x} na parte A + {y} na parte B).'))



if __name__ == '__main__':
    print("----------- Iniciando o programa ------------")

    resolucao()

    print("------------- Fim do programa ---------------")