from util.utils import recebe_numero

def reparte(valor):
    digitos = [int(digito) for digito in str(valor)]
    return digitos

def analisa_mes(mes, dia):
    if mes == 2 and dia >= 30:
        print('O mês de fevereiro não tem mais de 29 dias (no ano bissexto que você digitou!)!')
        return False
    elif mes == 4 or mes == 6 or mes == 9 or mes == 11 and dia > 30:
        print('O mês que você digitou não possui mais de 30 dias!')
        return False
    else: 
        return True
    

def analisa_mes_dia(mes, dia, bissexto):
    if bissexto == False:
        if mes == 2 and dia > 28:
            print('Em um ano não bissexto, o mês de fevereiro (2) não tem mais de 28 dias!')
            return False
        else:
            return True
    else:
        return analisa_mes(mes, dia)



def isBissexto(ano):
    if ano % 4 == 0 and ano % 100 != 0 or ano % 400 == 0:
        return True
    else:
        return False

def resolucao():
    print('''Um cientista está criando um portal de viagem no tempo que só pode ser ativado se
todos os parâmetros estiverem corretos: energia acima de 80%, coordenadas de destino
precisas, e o tempo ajustado corretamente. Crie um programa que receba esses valores e use
operadores lógicos para verificar se o portal pode ser ativado. Se qualquer parâmetro estiver
incorreto, o programa deve indicar qual é o problema.''')
    while True:
        energia = recebe_numero('Digite o valor da energia: ')
        if energia > 80:
            while True:
                ano = recebe_numero('Digite o ano para qual quer viajar: ')
                resultado = reparte(ano)
                if len(resultado) == 4:
                    bissexto = isBissexto(ano)
                    while True:
                        mes = recebe_numero('Digite o mês para qual quer viajar: ')
                        if mes > 12 or mes <= 0:
                            print('O mês não pode ser maior que 12 ou menor que 1!')
                        else:
                            print()
                            print(f'Calculando... Mês: {mes}')
                            print(f'Calculando... Ano: {ano}')
                            print()
                            while True:
                                dia = recebe_numero('Digite o dia para qual quer viajar: ')
                                if dia > 31 or dia <= 0:
                                    print('O dia não pode ser maior que 31 ou menor que 1!')
                                else:
                                    resultadofinal = analisa_mes_dia(mes=mes, dia=dia, bissexto=bissexto)
                                    if resultadofinal == True:
                                        if mes <= 9:
                                            print('Viajando para: {}/0{}/{}!'.format(dia, mes, ano))
                                        else:
                                            print('Viajando para: {}/{}/{}!'.format(dia, mes, ano))
                                        break
                                    else:
                                        print('Erro!')
                            break
                    break
                elif len(resultado) < 4 or len(resultado) > 4:
                    print('Não podemos viajar para este ano!')
            break
        else:
            print('Energia não é suficiente!')

        


if __name__ == '__main__':
    print("----------- Iniciando o programa ------------")

    resolucao()

    print("------------- Fim do programa ---------------")