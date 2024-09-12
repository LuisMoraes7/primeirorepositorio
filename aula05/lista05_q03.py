
def resolucao():
    while True:
            try:
                especie = str(input('Seu animal favorito é um mamífero ou um réptil? (digite M para mamífero e R para réptil): ')).upper()
                if especie not in ['M', 'R']:
                    raise ValueError("Entrada inválida, digite 'M' para mamífero ou 'R' para réptil.")
            except ValueError as e:
                print(f"Erro: {e}")
            else:
                if especie == 'M':
                    print('Seu animal favorito é um cachorro.')
                elif especie == 'R':
                    print('Seu animal favorito é uma tartaruga.')
                break
            





if __name__ == '__main__':
    print("----------- Iniciando o programa ------------")

    resolucao()

    print("------------- Fim do programa ---------------")