from util.utils import recebe_float

def resolucao():
    print('''Um botânico está classificando plantas mágicas em uma floresta. Ele quer saber se uma planta é pequena, média, ou grande.''')
    tamanho = recebe_float('Qual o tamanho da planta, em metros? ')
    if tamanho < 1:
        return print('Planta catalogada com sucesso como PEQUENA!')
    elif tamanho >= 1 and tamanho <= 3:
        return print('Planta catalogada com sucesso como MÉDIA!')
    else:
        return print('Planta catalogada com sucesso como GRANDE!')


if __name__ == '__main__':
    print("----------- Iniciando o programa ------------")

    resolucao()

    print("------------- Fim do programa ---------------")