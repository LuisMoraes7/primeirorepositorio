def recebe_numero(mensagem):
    while True:
        try:
            return int(input(mensagem))
        except ValueError:
            print("Por favor, insira um número inteiro válido.")