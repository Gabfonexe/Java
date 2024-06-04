# Documentação 📖


```
Uma das maiores características da linguagem Java é que, desde suas primeiras versões, tínhamos em nossas mãos, uma documentação rica e detalhada dos recursos da linguagem.
Conforme site oficial, podemos compreender e explorar, todos os recursos organizados por pacotes e classes bem específicas, sem nem mesmo escrever uma linha de código.
Hoje, costuma-se afirmar que, para se tornar um desenvolvedor nível avançado, é um requisito imprescindível adquirir a habilidade de compreender, 
a documentação oficial da linguagem e dos frameworks que são incorporados nos projetos atuais.
Aqui, temos o link da documentação de uma das principais classes da linguagem Java: 
```

### https://docs.oracle.com/javase/7/docs/api/java/lang/String.html

```

```
## Tags 📌

```
Mas e quais as informações, que obtemos através de classes documentadas, na linguagem ? Java Documentation é composto por tags que, representam dados relevantes para
a compreensão da proposta de uma classe e os conjuntos de seus métodos e atributos conforme tabela abaixo:
```

|TAG | Descrição|
|----|----------|
@autor | Autor / Criador
@version |Versão do recurso disponibilizado
@since| Versão / Data de início da disponibilização do recurso
@param|Descrição dos parâmetros dos métodos criados
@return|Definição do tipo de retorno de um método
@throws|Se o método lança alguma exceção


### Abaixo, iremos ilustrar a classe Calculadora com um exemplo de documentação, destacando as tags mais utilizadas:

```
/**
* <h1>Calculadora</h1>
* A Calculadora realiza operações matemáticas entre números inteiros
* <p>
* <b>Note:</b> Leia atentamente a documentação desta classes
* para desfrutar dos recursos oferecidos pelo autor
*
* @author  Gabriel
* @version 4.0
* @since   21/04/2024
*/
public class Calculadora {
    /**
   * Este método é utilizado para somar dois números inteiros
   * @param numeroUm este é o primeiro parâmetro do método
   * @param numeroDois este é o segundo parâmetro do método
   * @return int o resultado deste método é a soma dos dois números.
   */
    public int somar(int numeroUm, int numeroDois) {
        return  numeroUm + numeroDois;
    }
}
```

## Tipos de comentários 🖊


#### usando //

```
// Olá, eu sou um comentário em uma única linha
```
#### usando /* */


```
/*
 * Este método foi elaborado as pressas
 * por isso eu abrevei o nome das variáveis
 * mas olha, ele tem a finalidade de somar ou  multiplicar
 * dois números
 * /

public int somaMultiplica (int n, int x, String m){
    int r = 0; // r é igual ao resultado
    if (m == "M"){ // M= multiplicação
        r= n * x;
    }else{
        // se não soma mesmo
        r = n + x
    }
    return r;
}
```

## Javadoc  📄

```
Javadoc é um gerador de documentação criado pela Sun Microsystems , para documentar a API dos programas em Java, a partir do código-fonte. 
O resultado é expresso em HTML. É constituído, basicamente, por algumas marcações muitos simples, inseridas nos comentários do programa.
Este sistema, é o padrão de documentação de classes em Java, onde muitas das IDEs desta linguagem irão automaticamente gerar um Javadoc em HTML.

```

### https://pt.wikipedia.org/wiki/Javadoc

```
// No terminal execute o comando abaixo
javadoc -encoding UTF-8 -docencoding ISO-8859-1  -d ../docs  src/*.java
```

```



-------------------------------------------------------------------------------------------------------------------------------------------



```
# Palavras reservadas

```
Palavras reservadas, são identificadores de uma linguagem que já possuem uma finalidade específica, portanto, não podem ser utilizados para nomear variáveis, classes, métodos ou atributos.

A linguagem Java possui 52 palavras reservadas. Todas essas palavras são classificadas em grupos e escritas com letra minúscula, sendo identificadas com uma cor especial pela maioria das IDE's. Abaixo temos a lista de palavras agrupadas por suas finalidades.


```

## Palavras Reservadas em Java

| | | | | |
|-|-|-|-|-|
abstract |   continue  |  goto     |   package      |   synchronized  
assert    |  default   |  if       |   private      |   this  
boolean   |  do         | implements | protected      | throw  
break     |  double    |  import     | public       |   throws  
byte      |  else     |   instanceof | return        |  transient  
case       | extends   |  int        |short         |  try  
catch      | final     |  interface  | static        |  void  
char       | finally    | long       | strictfp      |  volatile  
class      | float     |  native    |  super         |  while  
const    |   for       |  new       | switch


```



```


#### Controle de pacotes
| | |
|-|-|
import | importa pacotes ou classes para dentro do código;
package | especifica a que pacote, todas as classes de um arquivo pertencem.

#### Modificadores de acesso
| | |
|-|-|
public| acesso de qualquer classe;
private|acesso apenas dentro da classe;
protected|acesso por classes no mesmo pacote e subclasses.

#### Primitivos
| | |
|-|-|
boolean| um valor indicando verdadeiro ou falso;
byte| um inteiro de 8 bits (signed);
char| um character unicode (16-bit unsigned);
double| um número de ponto flutuante de 64 bits (signed);
float| um número de ponto flutuante de 32 bits (signed);
int| um inteiro de 32 bits (signed);
long| um inteiro de 64 bits (signed);
short| um inteiro de 32 bits (signed);
void|indica que o método não tem retorno de valor.

#### Modificadores de classes, variáveis ou métodos
| | |
|-|-|
abstract| classe que não pode ser instanciada ou método que precisa ser implementado, por uma subclasse não abstrata;
class| especifica uma classe;
extends| indica a superclasse que a subclasse está estendendo;
final| impossibilita que uma classe seja estendida, que um método seja sobrescrito ou que uma variável seja reinicializada;
implements| indica as interfaces que uma classe irá implementar;
interface| especifica uma interface;
native| indica que um método está escrito em uma linguagem dependente de plataforma, como o C;
new| instancia um novo objeto, chamando seu construtor;
static| faz um método ou variável pertencer à classe ao invés de às instâncias;
strictfp| usado em frente a um método ou classe para indicar que os números de ponto flutuante seguirão as regras de ponto flutuante, em todas as expressões;
synchronized| indica que um método só pode ser acessado por uma thread de cada vez
transient| impede a serialização de campos;
volatile| indica que uma variável pode ser alterada durante o uso de threads.

#### Controle de fluxo dentro de um bloco de código
| | |
|-|-|
break| sai do bloco de código em que ele está;
case| executa um bloco de código dependendo do teste do switch;
continue| pula a execução do código que viria, após essa linha e vai para a próxima passagem do loop;
default| executa esse bloco de código caso nenhum dos teste de switch-case seja verdadeiro;
do| executa um bloco de código uma vez, e então realiza um teste em conjunto com o while para determinar se o bloco deverá ser executado novamente;
else| executa um bloco de código alternativo caso o teste "if" seja falso;
for| usado para realizar um loop condicional de um bloco de código;
if| usado para realizar um teste lógico de verdadeiro ou falso;
instanceof| determina se um objeto é uma instância de determinada classe, superclasse ou interface;
return| retorna um método sem executar qualquer código, que venha depois desta linha (também pode retornar uma variável);
switch| indica a variável a ser comparada nas expressões case;
while| executa um bloco de código repetidamente enquanto a condição for verdadeira.

#### Tratamento de erros
| | |
|-|-|
assert| testa uma expressão condicional, para verificar uma suposição do programador;
catch| declara o bloco de código usado para tratar uma exceção;
finally| bloco de código, após um try-catch, que é executado independentemente do fluxo de programa seguido ao lidar com uma exceção;
throw| usado para passar uma exceção para o método que o chamou;
throws| indica que um método pode passar uma exceção para o método que o chamou;
try| bloco de código que tentará ser executado, mas que pode causar uma exceção.

#### Palavras reservadas não utilizadas
| | |
|-|-|
const| Não utilize para declarar constantes; use public static final;
goto| não implementada na linguagem Java, por ser considerada prejudicial.

#### Variáveis de referência
| | |
|-|-|
super| refere-se a superclasse imediata;
this| refere-se a instância atual do objeto.

#### Literais reservados

```
De acordo com a Java Language Specification, null, true e false são tecnicamente
chamados de valores literais, e não keywords. Se você tentar criar algum identificador 
com estes valores, você também terá um erro de compilação.
```
```

```

#### Escopo de uso
Uso	|Palavras	|Observação
|-|-|-|
Arquivo|package, import, static.|****
Classe|public ou protected ou private + final ou abstract + extends ou implements.|private (em caso de classe interna), final ou abstract
Método|public ou protected ou private + static ou final ou abstract + void e return.|void em caso de não ter retorno ou return se houver
Atributo|public ou protected ou private + static ou final + tipo primitivo.|****

```
```

#### Palavras "opostas"
```
Assim como nas classificações gramaticais da língua portuguesa, existem algumas palavras
que são completamente opostas (antônimas) na linguagem Java conforme tabela abaixo:
```

Palavra|Palavra|Explicação
|-|-|-|
package|import|Enquanto package determina o diretório real da classe, o import informa de onde será importada a classe. Isso porque, podemos ter classes de mesmo nome.
extends|implements|enquanto extends determina que uma classe estende outra classe, implements determina que uma classe implementa uma interface, porém nunca o contrário.
final|abstract|enquanto final determina fim de alteração de valor ou lógica comportamental, abstract em métodos, exige que sub-classes precisarão definir comportamento e um método abstrato. NOTA: Se uma classe contém um único método abstrato, toda classe precisa ser.
throws|throw|Esta é uma das situações mais complicadas, de compreensão destas duas palavras. Enquanto a throws determina que um método pode lançar uma exceção, throw é a implementação que dispara a exceção**. Vamos conhecer mais sobre este conceito no assunto Exceções.**



