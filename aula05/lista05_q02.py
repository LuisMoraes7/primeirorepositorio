

def resolucao():
    print('''Descrição: Um guerreiro precisa de uma armadura especial para a batalha. Para forjar a
armadura, ele precisa de uma liga metálica que combina ferro e ouro. O ferreiro diz que a liga
precisa ter no mínimo 70% de ferro. Crie um programa que receba a quantidade de ferro e
ouro em kg e verifique se a porcentagem de ferro na liga é suficiente.''')
    ferro = int(input('Digite a quantidade de ferro em kg: '))
    ouro = int(input('Digite a quantidade de ouro em kg: '))
    total = ferro + ouro
    if (ferro >= 0.7 * total):
        return(print('A porcentagem do ferro é maior ou igual a 70% do total.'))
    else:
        return(print('A porcentagem do ferro não corresponde nem a 70% do total.'))


if __name__ == '__main__':
    print("----------- Iniciando o programa ------------")

    resolucao()

    print("------------- Fim do programa ---------------")