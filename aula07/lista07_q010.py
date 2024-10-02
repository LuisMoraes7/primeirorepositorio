from random import randint
import sys 
import os
sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..', 'aula05', 'util')))
from utils import recebe_numero
def resolucao():
    escolhidos = []
    n = recebe_numero('Você quer lançar o dado de 6 lados quantas vezes? ')
    for c in range (0, n):
        escolhidos.append(randint(1, 6))

    print('Foram sorteados os números: ')
    for numero in escolhidos:
        print(numero, end=' ')
    print()







if __name__ == '__main__':
    print("----------- Iniciando o programa ------------")

    resolucao()

    print("------------- Fim do programa ---------------")