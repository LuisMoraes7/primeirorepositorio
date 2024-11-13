# No mundo moderno, a organização é fundamental, e uma lista de compras inteligente pode facilitar muito a vida. O objetivo deste projeto é criar um programa em Python que utilize um vetor para armazenar uma lista de compras. Mas não para por aí! O programa deve permitir ao usuário adicionar itens à lista, remover itens, exibir a lista atualizada.

# Inicializar um vetor vazio para armazenar os itens da lista de compras.
# Criar um menu de opções para o usuário, com as seguintes funcionalidades:
# Adicionar item: Ler o nome do item e a categoria e adicionar ao vetor.
# Remover item: Ler o nome do item a ser removido e removê-lo do vetor.
# Exibir lista: Exibir a lista de compras atualizada na tela.
# Sair: Encerrar o programa.

# Criar um loop que exiba o menu repetidamente até que o usuário escolha a opção "Sair".
        
from time import sleep

def main():
    my_list = []
    while True:
        print('---------------------------')
        print('Selecione uma opção:')
        print('1 - Adicionar item à lista.')
        print('2 - Remover um item da lista.')
        print('3 - Exibir lista.')
        print('0 - Encerrar o programa.')
        print('---------------------------')
        option = int(input('Selecione sua opção: '))
        if option == 1:
            print('---------------------------')
            item = str(input('Nome do item: '))
            print('Adicionando item à lista...')
            sleep(1.5)
            my_list.append(item)
            print('Item adicionado.')
            print('---------------------------')
        elif option == 2:
            for index, item in enumerate(my_list):
                sleep(0.5)
                print(f'Item {index + 1}: {item}')
            getindex = int(input('Selecione o número do item que deseja remover: '))
            getindex -= 1
            for index, item in enumerate(my_list):
                if getindex == index:
                    my_list.pop(getindex)
                    break
            for index, item in enumerate(my_list):
                sleep(0.5)
                print(f'Item {index + 1}: {item}')
            
            
        elif option == 3:
            for index, item in enumerate(my_list):
                sleep(0.5)
                print(f'Item {index + 1}: {item}')
            if len(my_list) == 0:
                print('Sua lista está vazia.')
            
        elif option == 0:
            print('Encerrando programa...')
            break

if __name__ == '__main__':
    print("----------- Iniciando o programa ------------")

    main()

    print("------------- Fim do programa ---------------")
    