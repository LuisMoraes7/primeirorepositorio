

def recebe_numero(mensagem):
    while True:
        try:
            return int(input(mensagem))
        except ValueError:
            print("Por favor, insira um número inteiro válido.")

def recebe_float(mensagem):
    while True:
        try:
            valor = input(mensagem).replace(',', '.')
            return float(valor)

        except ValueError:
            print("Por favor, insira um número inteiro válido.")