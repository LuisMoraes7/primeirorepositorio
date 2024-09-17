from util.utils import recebe_numero
from lista05_q011 import media


def checagem(aTK, dRB):
    if aTK > 50 and dRB > 70:
        return True
    else:
        return False

def maiorQueZero(valor):
    if valor > 0:
        return True
    else:
        return False


def maior2(valor1, valor2):
    if valor1 > valor2:
        return valor1
    elif valor2 > valor1:
        return valor2
    else:
        print('Ocorreu um empate!')
        return False

def maior(valor1, valor2, valor3):
    if valor1 > valor2 and valor1 > valor3:
        return valor1
    elif valor2 > valor1 and valor2 > valor3:
        return valor2
    elif valor3 > valor1 and valor3 > valor2:
        return valor3
    else:
        print('Ocorreu um empate!')
        if valor3 == valor1 and valor1 == valor2: 
            print(f'Todos os valores são iguais.')
            return valor1
        elif valor2 == valor3:
            print(f'O valor 2 e valor 3 são iguais.')
            return valor2
        elif valor1 == valor3:
            print(f'Os valores 1 e 3 são iguais.')
            return valor1
        elif valor1 == valor2:
            print(f'Os valores 1 e 2 são iguais..')
            return valor1

def resolucao():
    print('''Um herói precisa decidir qual arma usar na batalha final. Ele tem três armas: uma
espada, um arco e uma lança. Cada arma tem um poder de ataque e uma durabilidade. A
escolha deve considerar que o poder de ataque seja maior que 50 e a durabilidade maior que
70. Informe os valores de ataque e durabilidade das três armas e
eu determinarei qual é a mais adequada.''')
    empate = 0
    espadaATK = recebe_numero('Digite o valor do dano da espada: ')
    espadaDRB = recebe_numero('Digite o valor da durabilidade da espada: ')
    espadaIsOk = checagem(espadaATK, espadaDRB)
    if espadaIsOk == True:
        espadamedia = media(espadaATK, espadaDRB)
        empate += 1
    else:
        espadamedia = None
    print('-----------------------------------')
    arcoATK = recebe_numero('Digite o valor do dano do arco: ')
    arcoDRB = recebe_numero('Digite o valor da durabilidade do arco: ')
    arcoIsOk = checagem(arcoATK, arcoDRB)
    if arcoIsOk == True:
        arcomedia = media(arcoATK, arcoDRB)
        empate += 1
    else:
        arcomedia = None
    print('-----------------------------------')

    lancaATK = recebe_numero('Digite o valor do dano da lança: ')
    lancaDRB = recebe_numero('Digite o valor da durabilidade da lança: ')
    lancaIsOk = checagem(lancaATK, lancaDRB)
    if lancaIsOk == True:
        lancamedia = media(lancaATK, lancaDRB)
        empate += 1
    else:
        lancamedia = None
    print('-----------------------------------')
    print(f'Quantidade de armas adequadas: {empate}')
    print(espadaIsOk, arcoIsOk, lancaIsOk)
    match empate:
        case 0:
            print('Nenhuma arma é adequada. Procure outra!')
        case 1:
            if espadamedia and maiorQueZero(espadamedia):
                print('A espada é a melhor escolha!')
            elif arcomedia and maiorQueZero(arcomedia):
                print('O arco é a melhor escolha!')
            elif lancamedia and maiorQueZero(lancamedia):
                print('A lança é a melhor escolha!')
        case 2:
            if espadamedia and maiorQueZero(espadamedia) == True:
                if arcomedia and arcomedia > 0:
                    resultado = maior2(arcomedia, espadamedia)
                    if resultado == False:
                        print('O arco e a espada são igualmente adequados.')
                    elif resultado == espadamedia:
                        print('A espada é a melhor escolha!')
                    else:
                        print('O arco é a melhor escolha!')
                elif lancamedia and lancamedia > 0:
                    resultado = maior2(espadamedia, lancamedia)
                    if resultado == False:
                        print('A lança e a espada são igualmente adequadas.')
                    elif resultado == lancamedia:
                        print('A lança é a melhor escolha!')
                    else:
                        print('A espada é a melhor escolha!')

            elif arcomedia and maiorQueZero(arcomedia) == True:
                if espadamedia and espadamedia > 0:
                    resultado = maior2(arcomedia, espadamedia)
                    if resultado == False:
                        print('A lança e a espada são igualmente adequadas.')
                    elif resultado == espadamedia:
                        print('A espada é a melhor escolha!')
                    else:
                        print('O arco é a melhor escolha!')
                elif lancamedia and lancamedia > 0:
                    resultado = maior2(arcomedia, lancamedia)
                    if resultado == False:
                        print('O arco e a lança são igualmente adequados.')
                    elif resultado == lancamedia:
                        print('A lança é a melhor escolha!')
                    else:
                        print('O arco é a melhor escolha!')

            elif lancamedia and maiorQueZero(lancamedia) == True:
                if espadamedia and espadamedia > 0:
                    resultado = maior2(lancamedia, espadamedia)
                    if resultado == False:
                        print('O arco e a lança são igualmente adequados.')
                    elif resultado == lancamedia:
                        print('A lança é a melhor escolha!')
                    else:
                        print('A espada é a melhor escolha!')
                elif arcomedia and arcomedia > 0:
                    resultado = maior2(arcomedia, lancamedia)
                    if resultado == False:
                        print('O arco e a lança são igualmente adequados.')
                    elif resultado == lancamedia:
                        print('A lança é a melhor escolha!')
                    else:
                        print('O arco é a melhor escolha!')
        case 3:
            resultado = maior(lancamedia, espadamedia, arcomedia)
            if resultado == lancamedia:
                print('A lança é a melhor escolha!')
            elif resultado == espadamedia:
                print('A espada é a melhor escolha!')
            else:
                print('O arco é a melhor escolha!')


if __name__ == '__main__':
    print("----------- Iniciando o programa ------------")

    resolucao()

    print("------------- Fim do programa ---------------")