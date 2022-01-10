# exercicio 3 Andreyna Marques Carvalho
qtd = int(input("Digite aqui quantos alunos fizeram a prova:"))

while (qtd <= 0):
 print("Digite um número válido!")
 qtd = int(input("Digite aqui quantos alunos fizeram a prova:"))

alunos = {}
notas = {}

for cal in range(1, qtd+1):
 nomes = input("Digite o nome do(a) aluno(a) {}:" .format(cal))
 grades = []

for col in range(1, 5):
 grade = float(input("Nota {} do aluno {}:".format(cal, col)))
 grades.append(grade)

alunos[nomes] = grades

for nomes, grades in alunos.items():
 ipc = sum(grades) / len(grades)
 resp = "aprovado(a)" if ipc >= 7.0 else "reprovado(a)"
 print("O aluno(a) {} foi {} com média {}" .format(nomes, resp,
ipc))