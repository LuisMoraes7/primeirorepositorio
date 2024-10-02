import sys 
import os
sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..', 'aula05', 'util')))
from utils import recebe_numero

def fatorial(n):
    fatorial = 1
    for c in range (n, 1, -1):
        fatorial *= c
    return fatorial


def resolucao():
    # ? Contexto: Implemente um programa que calcule o fatorial de um número fornecido pelo usuário. Utilize um loop para realizar as multiplicações necessárias.
    n = recebe_numero('Digite um número: ')
    print(f'O fatorial desse número é: {fatorial(n)}!')




if __name__ == '__main__':
    print("----------- Iniciando o programa ------------")

    resolucao()

    print("------------- Fim do programa ---------------")