from util.utils import recebe_numero

def resolucao():
    print('Um rei deseja distribuir bônus aos seus cavaleiros com base em suas conquistas.')
    missoes = recebe_numero('O rei te pergunta: Quantas missões você fez? ')
    if missoes >= 5 and missoes <= 10:
        return print('O rei te recompensa com 50 moedas de ouro!')
    elif missoes > 10:
        return print('O rei te recompensa com 100 moedas de ouro!')
    else:
        return print('O rei te recompensa com 10 moedas de ouro!')


if __name__ == '__main__':
    print("----------- Iniciando o programa ------------")

    resolucao()

    print("------------- Fim do programa ---------------")