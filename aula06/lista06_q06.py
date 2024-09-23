
def funcao_principal():
    listaconvidados = [{'nome': 'Neymar Jr', 'convidado': True}, {'nome': 'Tom Cruise', 'convidado': True}, {'nome': 'Travis Scott', 'convidado': True}, {'nome': 'Ryan Reynolds', 'convidado': True}, {'nome': 'Cristiano Ronaldo', 'convidado': True}, {'nome': 'Lionel Messi', 'convidado': True}]
    i = 0
    for convidado in listaconvidados:
        print('---------------------------------')
        print(f'Olá, {listaconvidados[i]['nome']}! Você está convidado para um jantar hoje!')
        print('---------------------------------')
        i += 1
    listaconvidados[0]['convidado'] = False
    listaconvidados[1]['convidado'] = False
    p = 0
    for convidado in listaconvidados:
        if listaconvidados[p]['convidado'] == False:
            print(f'O convidado {listaconvidados[p]['nome']} não pôde comparecer!')
        else:
            print('--------------------------------')
            print(f'Olá, {listaconvidados[p]['nome']}! Você está convidado para um jantar hoje!')
            print('---------------------------------')
        p += 1




if __name__ == '__main__':
    funcao_principal()