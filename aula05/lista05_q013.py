from util.utils import recebe_numero

def resolucao():
    print('''O sistema de defesa de um castelo mágico precisa estar sempre ativo quando o
exército do rei está fora. Insira a posição do exército (dentro ou fora
do castelo) para ativar ou desativar o sistema de defesa automaticamente.''')
    while True:
            try:  
                posicao = int(input('Digite 0 (para fora do castelo) ou 1 (para dentro do castelo) ou 3 (para encerrar o programa): '))
                if posicao == 3:
                    print('Encerrando...')
                    break
                if posicao not in [0, 1]:
                    raise ValueError("Entrada inválida, digite 0 para fora do castelo ou 1 para dentro.")
            except ValueError as e:
                print("Entrada inválida, digite 0 para fora do castelo ou 1 para dentro.")
            else:
                if posicao == 0:
                    print('Você está fora do castelo! Sistema de defesa está ativado.')
                    
                elif posicao == 1:
                    print('Você está dentro do castelo! Sistema de defesa está desativado.')

                
    

if __name__ == '__main__':
    print("----------- Iniciando o programa ------------")

    resolucao()

    print("------------- Fim do programa ---------------")