from util.utils import recebe_numero

def resolucao():
            cinquentacent = 0.5 * recebe_numero("Quantidade de moedas de 50 centavos: ")
            vintecincocent = 0.25 * recebe_numero("Quantidade de moedas de 25 centavos: ")
            umreal = recebe_numero("Quantidade de moedas de 1 real: ")
            total = cinquentacent + vintecincocent + umreal
            if total.is_integer():
                return(print(f'Total: {total} reais'))
            else:
                return(print(f'Total: {int(total)} reais e {-(int(total) - total)} centavos'))
        




if __name__ == '__main__':
    print("----------- Iniciando o programa ------------")

    resolucao()

    print("------------- Fim do programa ---------------")