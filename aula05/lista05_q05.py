from util.utils import recebe_numero

def resolucao():
    print('''Um explorador está cruzando um deserto. Ele precisa saber se a quantidade de
água que tem é suficiente para chegar ao próximo oásis. Ele calcula que precisa de 2 litros de
água para cada quilômetro. Informe a distância dele e do oásis, juntamente a quantidade de água que ele possui, e eu informarei se é possível ou não cruzar o deserto e chegar no oásis. Só valem valores inteiros.''')
    distancia = recebe_numero('Digite a distância em Quilômetros: ')
    amountwater = recebe_numero('Digite a quantidade de água em Litros: ')
    if amountwater >= distancia * 2:    
        return(print('Você consegue cruzar o oásis.'))
    else:
        return(print(f'Você não consegue cruzar o oásis. Ainda faltará {distancia * 2 - amountwater} litro(s) de água.'))

    




if __name__ == '__main__':
    print("----------- Iniciando o programa ------------")

    resolucao()

    print("------------- Fim do programa ---------------")