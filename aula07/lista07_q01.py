import sys 
import os
sys.path.append(os.path.abspath(os.path.join(os.path.dirname(__file__), '..', 'aula05', 'util')))
import utils
def resolucao():
    n = 1
    array = []
    nota1 = utils.recebe_float('Digite a nota do aluno: ')
    array.append(nota1)
    nota2 = utils.recebe_float('Digite outra nota do aluno: ')
    array.append(nota2)
    while True:
        n = int(input('Quer saber a média? Digite o valor -1. Se deseja continuar digite qualquer outro valor! '))
        if n == -1:
            break
        else:
            nota = utils.recebe_float('Digite outra nota do aluno: ')
            array.append(nota)
            nota = 0
    soma = 0
    for numero in array:
        soma += numero
    print(f'A média final das {len(array)} notas que você me passou é: {soma/len(array)}!')

    





if __name__ == '__main__':
    print("----------- Iniciando o programa ------------")

    resolucao()

    print("------------- Fim do programa ---------------")