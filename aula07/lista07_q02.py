import sys 
import os
sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..', 'aula05', 'util')))
import utils

def resolucao():
    numero = utils.recebe_numero('Digite um número inteiro e eu irei descobrir a tabuada dele! ')
    for n in range(1,11,1):
        print(f'{numero} x {n} = {numero * n}')
        




if __name__ == '__main__':
    print("----------- Iniciando o programa ------------")

    resolucao()

    print("------------- Fim do programa ---------------")