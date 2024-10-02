def recebe_numero(mensagem):
    while True:
        try:
            return int(input(mensagem))
        except ValueError:
            print("Por favor, insira um número inteiro válido.")


class NomeInvalidoError(Exception):
    pass
import re
def recebe_nome(mensagem):
        try:
            if not mensagem:
                raise NomeInvalidoError('O nome não pode estar vazio.')
            if not mensagem.isalpha():
                raise NomeInvalidoError('O nome deve conter apenas letras.')
        except NomeInvalidoError as e:
            print(f'Erro: {e}')
            return False

class EmailInvalidoError(Exception):
    pass

def validar_email(email):
    padrao_email = r'^[a-zA-Z0-9_.+=]+@[a-zA-Z0-9-]+\.[a-zA-Z0-9-.]+$'
    try:
        if not email:
            raise EmailInvalidoError("O email não pode estar vazio.")
        if not re.match(padrao_email, email):
            raise EmailInvalidoError("O email está em um formato inválido!")
    except EmailInvalidoError as e:
        print(f'Erro: {e}')
        return False




def funcao_principal():
    while True:
        nome = str(input('Digite o nome: '))
        validado = recebe_nome(nome)
        if validado != False:
            while True:    
                idade = recebe_numero('Digite a idade: ')
                if idade > 0 and idade < 150:
                    while True:
                        email = str(input('Digite o email: '))
                        validaemail = validar_email(email)
                        if validaemail != False:
                            print(f'Nome: {nome}')
                            print(f'Idade: {idade}')
                            print(f'Email: {email}')
                            print('Cadastrado com sucesso!')
                            print('Deseja continuar? [1 para sim, 2 para não]')
                            # ct
                            break
                        
                    break
                else:
                    print('Encontramos um erro na idade fornecida!')
            break

if __name__ == '__main__':
    funcao_principal()