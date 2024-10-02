import sys 
import os
sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..', 'aula05', 'util')))
from utils import recebe_numero
def resolucao():
    n = recebe_numero('Digite um número: ')
    original = n
    resto = []   
    resto.append(n % 2)
    print()
    while True:
        if n == 1:
            print(f'O número {original} em binário é ', end='')
            for b in range(-1, -(len(resto)+1), -1):
                print(resto[b], end='')
            print()
            break
        else:
            n = n // 2
            resto.append(n % 2)






if __name__ == '__main__':
    print("----------- Iniciando o programa ------------")

    resolucao()

    print("------------- Fim do programa ---------------")