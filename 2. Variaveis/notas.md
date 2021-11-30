# Variaveis

Espaço na memória do computador onde se pode guardar valores

- Instância: objeto
- Classe: classe
- Local: dentro de métodos
- Parâmetro: na assinatura do método

# Tipos de dados

Valores e operções que as variaveis podem assumir e sofrer.
Tipificação:

- Estática (forte) vs Dinamica (fraco)
- Primitivo vs Composto
Tipos:
- Textual
- Numeral
- Lógico
- Objeto

# Operadores aritmeticos

- pós-fixado: exp++ ou exp--
- pré-fixado: ++exp ou --exp
- aritmetico: +, -, / e %(resto)
- atribuição: =, +=, -=, *=, /= e %=

## Precedencias(mais de um operador, qual a ordem a seguir)

pós-fixado, pré-fixado, multiplicativo (*, /, %), aditivo (+, -)

## Casting (conversão)

Transformação de uma determinada variável de tipo menos específico para um tipo mais específico ou vice-versa.

### Tipos
Upcasting - promoção de um tipo de dados para um com maior capacidade de representação.  Não precisa dizer qual tipo vai (implícito)
Downcast - rebaixamento, deve dizer para qual tipo vai. Pode ter perda de dado(explícito)

byte < short < char < int < long < float < double

Downcasting: 
    byte b1;
    short s1 = 1000;
    b1 = (byte) s1; (explícito)
Upcasting
    log l1;
    int i1 = 10;
    l1 = i1 (implícito)
