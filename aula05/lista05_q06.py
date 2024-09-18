from util.utils import recebe_float


def resolucao():
    DISTANCIA = 1000
    print('''Em um campeonato de corrida de dragões, cada dragão corre uma determinada
distância em um certo tempo. Digite a distância e tempo que alcançam determinados dragões verde e azul.''')
    tempo1 = recebe_float('Tempo do dragão verde (em segundos): ')
    velocidade1 = DISTANCIA/tempo1
    tempo2 = recebe_float('Tempo do dragão azul (em segundos): ')
    velocidade2 = DISTANCIA/tempo2
    if velocidade1 > velocidade2:
        return print(f'O dragão verde, que possui velocidade de {velocidade1:.2f} m/s é mais rápido que o dragão azul, que possui velocidade de {velocidade2:.2f} m/s.')
    elif velocidade1 == velocidade2:
        return print(f'Ambos possuem velocidade de {velocidade1:.2f} m/s.')
    else:
        return print(f'O dragão azul, que possui velocidade de {velocidade2:.2f} m/s é mais rápido que o dragão verde, que possui velocidade de {velocidade1:.2f} m/s.')





if __name__ == '__main__':
    print("----------- Iniciando o programa ------------")

    resolucao()

    print("------------- Fim do programa ---------------")