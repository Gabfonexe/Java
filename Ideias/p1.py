def cadastrar_pessoas(quantidade):
  pessoas = []
  for i in range(quantidade):
    nome = input("Digite o nome da pessoa: ")
    idade = int(input("Digite a idade da pessoa: "))
    altura = float(input("Digite a altura da pessoa: "))
    pessoa = {"nome": nome, "idade": idade, "altura": altura}
    pessoas.append(pessoa)
  return pessoas

def calcular_media_altura(pessoas):
 
  total_altura = 0
  for pessoa in pessoas:
    total_altura += pessoa["altura"]
  return total_altura / len(pessoas)

def encontrar_pessoa_mais_velha(pessoas):
 
  if not pessoas:
    return None
  pessoa_mais_velha = pessoas[0]
  for pessoa in pessoas:
    if pessoa["idade"] > pessoa_mais_velha["idade"]:
      pessoa_mais_velha = pessoa
  return pessoa_mais_velha

def encontrar_pessoa_mais_alta(pessoas):
 
  if not pessoas:
    return None
  pessoa_mais_alta = pessoas[0]
  for pessoa in pessoas:
    if pessoa["altura"] > pessoa_mais_alta["altura"]:
      pessoa_mais_alta = pessoa
  return pessoa_mais_alta

def main():
 
  quantidade_pessoas = int(input("Digite a quantidade de pessoas a serem cadastradas: "))
  pessoas = cadastrar_pessoas(quantidade_pessoas)

  media_altura = calcular_media_altura(pessoas)
  pessoa_mais_velha = encontrar_pessoa_mais_velha(pessoas)
  pessoa_mais_alta = encontrar_pessoa_mais_alta(pessoas)

  print(f"A média de altura das pessoas é de {media_altura:.2f} metros.")

  if pessoa_mais_velha == pessoa_mais_alta:
    print(f"{pessoa_mais_velha['nome']} é a pessoa mais velha e mais alta, com {pessoa_mais_velha['idade']} anos e {pessoa_mais_velha['altura']:.2f} metros.")
  else:
    print(f"{pessoa_mais_velha['nome']} é a pessoa mais velha, com {pessoa_mais_velha['idade']} anos.")
    print(f"{pessoa_mais_alta['nome']} é a pessoa mais alta, com {pessoa_mais_alta['altura']:.2f} metros.")

if __name__ == "__main__":
  main()
