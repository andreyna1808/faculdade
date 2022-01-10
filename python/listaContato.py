#Exercício 4 Andreyna

lista = []
maiores = dict()
menores = dict()

while True:
    nome = str(input("Digite o nome:"))
    if nome in "":
        break
    idade = str(int(input("Digite a idade")))
    cel = str(input("Digite o número de telefone"))
    lista.append([nome, idade, cel])

ord = sorted(lista)
print('-' * 20)
print('Sua lista de contatos')
print('-' * 20)

for item in ord:
 print('Nome:{}' ' | ' 'Idade :{}' ' | ' 'Telefone:{}'.format(item[0], item[1], item[2]))
print("Você possui {} contato(s) na sua lista".format(len(lista)))