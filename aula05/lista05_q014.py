from util.utils import recebe_numero
from lista05_q012 import maior2

def soma (valor1, valor2):
    return valor1 + valor2

def resolucao():
    print('''Um sábio está julgando um duelo entre dois guerreiros. Ele quer saber qual
guerreiro deve ser considerado vencedor, com base em suas habilidades de ataque e defesa.
Crie um programa que receba os valores de ataque e defesa dos dois guerreiros e determine o
vencedor (aquele com maior soma de ataque e defesa). Se houver empate, o programa deve
considerar a defesa como critério de desempate.''')
    atk1 = recebe_numero('Digite o valor do ataque do guerreiro 1: ')
    df1 = recebe_numero('Digite o valor da defesa do guerreiro 1: ')
    soma1 = soma(atk1, df1)
    print('-----------------------------------------')
    atk2 = recebe_numero('Digite o valor do ataque do guerreiro 2: ')
    df2 = recebe_numero('Digite o valor da defesa do guerreiro 2: ')
    soma2 = soma(atk2, df2)
    resultado = maior2(soma1, soma2)
    if resultado == soma1:
        print('O guerreiro 1 é o vencedor!')
    elif resultado == soma2:
        print('O guerreiro 2 é o vencedor!')
    else:
        if df1 > df2:
            print('Ocorreu um empate, porém o primeiro guerreiro possui uma defesa maior, portanto é o vencedor!')
        elif df1 < df2:
            print('Ocorreu um empate, porém o segundo guerreiro possui uma defesa maior, portanto é o vencedor!')
        else:
            print('Empate!')


if __name__ == '__main__':
    print("----------- Iniciando o programa ------------")

    resolucao()

    print("------------- Fim do programa ---------------")