def resolucao():
    vazio = 7
    entre = 3
    for c in range (0, 5):
        if c == 0:
            print(f"{(vazio+2) * ' '}*{(vazio+2) * ' '}")
        elif c < 4:
            print(f"{vazio * ' '}*{entre * ' '}*{vazio * ' '}")
            vazio -= 1
            entre += 2
            # print(vazio)
        else:
            vazio = 4
            print(f"{vazio * ' '}{'*' * 11}{vazio * ' '}")





if __name__ == '__main__':
    print("----------- Iniciando o programa ------------")

    resolucao()

    print("------------- Fim do programa ---------------")