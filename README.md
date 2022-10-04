# alura-design-patterns

Esse repositório tem o objetivo de colocar em prática tudo que eu aprendi no curso da alura de [Design Patterns (parte 1)](https://www.alura.com.br/curso-online-introducao-design-patterns-java)

### Aula 01 - Strategy
O objetivo desse padrão de projeto é tratar diferentes estratégias (diferentes códigos) usando do polimorfismo e substituindo a centralização de responsabilidade com vários `ifs` em uma única classe.

[Strategy da Refactoring Guru](https://refactoring.guru/design-patterns/strategy)

### Aula 02 - Chain of Responsability
Diferente da aplicação anterior (strategy) onde já sabemos qual regra será aplicada logo de cara, em um caso onde é aplicado o Chain of Responsability nós não sabemos qual regra será aplicada então são necessários vários ifs. Para continuar com esses vários ifs sem deixar toda a responsabilidade em uma única classe nós dividimos cada if em uma classe, usamos herança para atráves do polimorfismo podemos receber vários do tipo de objeto que estamos encadeando e assim criamos a corrente de responsabilidades.

[Chain of Responsability](https://refactoring.guru/design-patterns/chain-of-responsibility)