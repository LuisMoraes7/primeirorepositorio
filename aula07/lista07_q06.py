import sys 
import os
sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..', 'aula05', 'util')))
from utils import recebe_numero

def verificador_primo(n):
    array_notprimo = []
    if n > 1:
        for c in range(1,(n+1),1):
            divisao = n/c
            if c > 1 and c != n:
                if divisao == int(divisao):
                    array_notprimo.append(divisao)
        if len(array_notprimo) > 0:
            return False
        else:
            return True
    else:
        return False

def resolucao():
    n = recebe_numero('Digite um número: ')
    isprimo = verificador_primo(n)
    if isprimo:
        print('É primo')
    else:
        print('Não é primo')




if __name__ == '__main__':
    print("----------- Iniciando o programa ------------")

    resolucao()

    print("------------- Fim do programa ---------------")