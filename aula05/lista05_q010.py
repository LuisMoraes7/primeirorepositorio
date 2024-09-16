def resolucao():
    print("Um aventureiro encontrou uma caverna cheia de portas, cada uma com um número de 1 a 5. Atrás de cada porta há um desafio.")
    while True:
        try:
            escolha = int((input('Escolha a porta: ')))
            match escolha:
                    case 1:
                        print('O aventureiro entra em um labirinto feito inteiramente de espelhos. Ele precisa encontrar a saída, mas os reflexos distorcidos dificultam distinguir o caminho correto. Ao longo do caminho, existem pistas escondidas que indicam a direção certa.')
                        break
                    case 2: 
                        print('O aventureiro encontra cinco estátuas dispostas em círculo, cada uma segurando um objeto diferente. Ele deve resolver um enigma envolvendo a ordem e o significado dos objetos para abrir a porta seguinte. Caso erre, as estátuas se movem e trocam de lugar.')
                        break
                    case 3:
                        print('Após entrar, o aventureiro ativa um mecanismo que dispara flechas a cada passo. Ele deve observar padrões no chão e nos arredores para evitar as armadilhas e chegar ao outro lado da sala')
                        break
                    case 4:
                        print('Ao atravessar essa porta, o aventureiro é confrontado por um dragão que guarda um tesouro. O desafio é negociar com o dragão ou resolver um desafio de força ou destreza para conquistar a saída sem desencadear uma batalha.')
                        break
                    case 5:
                        print('Nesta sala, o tempo passa mais rápido ou mais devagar dependendo da área. O aventureiro deve navegar pela sala resolvendo puzzles de lógica que envolvem o tempo (como mover objetos apenas quando o tempo estiver lento) para escapar.')
                        break
                    case _:
                        print('Entrada inválida, somente os inteiros 1, 2, 3, 4 ou 5. Tente novamente!')
        except ValueError:
            print('Entrada inválida, somente os inteiros 1, 2, 3, 4 ou 5. Tente novamente!')

if __name__ == '__main__':
    print("----------- Iniciando o programa ------------")

    resolucao()

    print("------------- Fim do programa ---------------")