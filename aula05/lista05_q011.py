from util.utils import recebe_float

def media(nota1, nota2):
    return((nota1+nota2)/2)

def resolucao():
    print('''O conselho real precisa tomar uma decisão crítica: selecionar o próximo
governante entre três candidatos, baseado na sua pontuação em uma série de provas.''')
    nota1_1 = recebe_float('Digite a primeira nota do aluno A: ')
    nota1_2 = recebe_float('Digite a segunda nota do aluno A: ')
    print('-----------------------------------')
    nota2_1 = recebe_float('Digite a primeira nota do aluno B: ')
    nota2_2 = recebe_float('Digite a segunda nota do aluno B: ')
    print('------------------------------------')
    nota3_1 = recebe_float('Digite a primeira nota do aluno C: ')
    nota3_2 = recebe_float('Digite a segunda nota do aluno C: ')
    media1 = media(nota1_1, nota1_2)
    media2= media(nota2_1, nota2_2)
    media3 = media(nota3_1, nota3_2)
    print(media1, media2, media3)
    if media1 > media2 and media1 > media3:
        print('O aluno A foi escolhido!')
    elif media2 > media1 and media2 > media3:
        print('O aluno B foi escolhido!')
    elif media3 > media1 and media3 > media2:
        print('O aluno C foi escolhido!')
    else:
        print('Ocorreu um empate!')
        if media3 == media1 and media1 == media2: 
            print(f'Todas as médias são iguais a {media1}')
        elif media2 == media3:
            print(f'Os alunos B e C tem média igual a {media2}')
        elif media1 == media3:
            print(f'Os alunos A e C tem média igual a {media1}')
        elif media1 == media2:
            print(f'Os alunos A e B tem média igual a {media1}.')
    


if __name__ == '__main__':
    print("----------- Iniciando o programa ------------")

    resolucao()

    print("------------- Fim do programa ---------------")