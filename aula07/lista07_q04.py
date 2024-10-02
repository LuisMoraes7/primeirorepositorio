from random import randint
import sys 
import os
sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..', 'aula05', 'util')))
import utils
import time

def resolucao():
    print('Só um instante! Irei pensar em um número.')
    time.sleep(1)
    print('.')
    time.sleep(1)
    print('.')
    time.sleep(1)
    print('.')
    time.sleep(1)
    print('Já pensei! Tente adivinhar o número que escolhi.')
    n = randint(1,100)
    while True:
        while True:
            palpite = utils.recebe_numero('Escolha um número de 1 a 100: ')
            if palpite > 100:
                print('Erro! Escolha um número menor ou igual a 100.')
            elif palpite < 1:
                print('Erro! O número deve ser maior do que 1.')
            else:
                break
        if palpite > n:
            print('O número que você digitou é maior do que o número que escohi!')
        elif palpite < n:
            print('O número que você digitou é menor do que o número que escohi!')
        else:
            print(f'Você acertou! O número que escolhi era {n}')
            break

    




if __name__ == '__main__':
    print("----------- Iniciando o programa ------------")

    resolucao()

    print("------------- Fim do programa ---------------")