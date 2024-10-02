import sys 
import os
sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..', 'aula05', 'util')))
import utils

def fibonacci(n):
    sequencia = [0, 1]
    while len(sequencia) < n:
        next_number = sequencia[-1] + sequencia[-2]
        sequencia.append(next_number)
    return sequencia
def resolucao():
    n = utils.recebe_numero('Você quer que a sequência de Fibonacci possua quantos números? ')
    sequencia = fibonacci(n)
    for numero in sequencia:
        if numero == sequencia[-1]:
            print(f'{numero}. ')
        else:
            print(f'{numero}... ', end='')
    print()




if __name__ == '__main__':
    print("----------- Iniciando o programa ------------")

    resolucao()

    print("------------- Fim do programa ---------------")