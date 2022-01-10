#Exercício 1 (Tabela do torneio de luta) - Andreyna M. Carvalho -
nome = input("Digite seu pseudônimo como lutar:")
kg = float(input("Qual o seu peso?"))

if 0 < kg < 65:
 print("Você está na categoria de peso Pena!")
 print('Olá, lutador(a)', nome, ' pesando ', kg, ' kg e se enquadra na categoria Pena. Boa luta!')

if 65 <= kg < 72:
 print("Você está na categoria de peso Leve!")
 print('Olá, lutador(a)', nome, ' pesando ', kg, ' kg e se enquadra na categoria Leve. Boa luta!')

if 72 <= kg < 79:
 print("Você está na categoria de peso Ligeiro!")
 print('Olá, lutador(a)', nome, ' pesando ', kg, ' kg e se enquadra na categoria Ligeiro. Boa luta!')

if 79 <= kg < 86:
 print("Você está na categoria de peso Meio-médio!")
 print('Olá, lutador(a)', nome, ' pesando ', kg, ' kg e se enquadra na categoria Meio-médio. Boa luta!')

if 86 <= kg < 93:
 print("Você está na categoria de peso Médio!")
 print('Olá, lutador(a)', nome, ' pesando ', kg, ' kg e se enquadra na categoria Médio. Boa luta!')

if 93 <= kg < 100:
 print("Você está na categoria de peso Meio-pesado!")
 print('Olá, lutador(a)', nome, ' pesando ', kg, ' kg e se enquadra na categoria Meio-Pesado. Boa luta!')

if kg > 100:
 print("Você está na categoria de peso Pesado!")
 print('Olá, lutador(a)', nome, ' pesando ', kg, ' kg e se enquadra na categoria Pesado. Boa luta!')

elif kg <= 0:
 print("Esse peso não existe, você é um fantasma?!")

kg = float(input("Qual o seu peso?"))