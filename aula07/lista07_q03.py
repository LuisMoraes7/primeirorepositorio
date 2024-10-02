from re import findall, IGNORECASE

def vogais(padrao, palavra):
    ocorrencias = findall(padrao, palavra, IGNORECASE)
    return len(ocorrencias)

def consoantes(padrao, palavra):
    ocorrencias = findall(padrao, palavra, IGNORECASE)
    return len(ocorrencias)

def resolucao():
#     Contador de Vogais e Consoantes:
# Contexto: Crie um programa que peça ao usuário uma frase e conte o número de vogais e consoantes presentes nela. Utilize um loop para percorrer cada caractere da frase e realizar a contagem.
    padrao_vogais = r'[aeiou]'
    padrao_consoantes = r'[^aeiou]'
    palavra = input('Digite a palavra: ')
    quantidade_vogais = vogais(padrao_vogais, palavra)
    quantidade_consoantes = consoantes(padrao_consoantes, palavra)
    print(f'Quantidade de vogais: {quantidade_vogais}')
    print(f'Quantidade de consoantes: {quantidade_consoantes}')




if __name__ == '__main__':
    print("----------- Iniciando o programa ------------")

    resolucao()

    print("------------- Fim do programa ---------------")