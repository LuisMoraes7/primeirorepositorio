def funcao_principal():
    lista = []
    for i in range (1000, 2001, 1):
        if i % 11 == 5:
            lista.append(i)
    print(lista)

if __name__ == '__main__':
    funcao_principal()