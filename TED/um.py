# 1. Faça um algoritmo para ler 10 números e armazenar em um vetor VET, verificar e escrever se existem
# números repetidos no vetor VET e em que posições se encontram.

def main():
    VET = [2, 3, 4, 1, 4]
def main():    
    VET = [] 
    for i in range(10):        
        num = int(input(f"Digite o número: "))        
        VET = VET + [num]
    repetidos = []  
    posicoes = {}
    for i in range(len(VET)):        
        if VET[i] not in repetidos:          
            posicoes[VET[i]] = [i]
            for j in range(i + 1, len(VET)):                
                print(posicoes)
                if VET[i] == VET[j]:  
                    posicoes[VET[i]] += [(j)]
                    print(posicoes)
                    if len(posicoes[VET[i]]) > 1:
                        repetidos += [VET[i]]
    if repetidos:        
        print("Números repetidos encontrados:")        
        for numero in repetidos:            
            print(f"Número {numero} encontrado nas posições: {', '.join(map(str, (posicoes[numero])))}")    
        else:        
            print("Não existem números repetidos no vetor.")
        
if __name__ == '__main__':
    print("----------- Iniciando o programa ------------")

    main()

    print("------------- Fim do programa ---------------")
    