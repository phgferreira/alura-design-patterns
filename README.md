# alura-design-patterns

Esse repositório tem o objetivo de colocar em prática tudo que eu aprendi no curso da alura de [Design Patterns (parte 1)](https://www.alura.com.br/curso-online-introducao-design-patterns-java)

### Aula 01 - Strategy
O objetivo desse padrão de projeto é tratar diferentes estratégias (diferentes códigos) usando do polimorfismo e substituindo a centralização de responsabilidade com vários `ifs` em uma única classe.

[Strategy da Refactoring Guru](https://refactoring.guru/design-patterns/strategy)

### Aula 02 - Chain of Responsability
Diferente da aplicação anterior (strategy) onde já sabemos qual regra será aplicada logo de cara, em um caso onde é aplicado o Chain of Responsability nós não sabemos qual regra será aplicada então são necessários vários ifs. Para continuar com esses vários ifs sem deixar toda a responsabilidade em uma única classe nós dividimos cada if em uma classe, usamos herança para atráves do polimorfismo podemos receber vários do tipo de objeto que estamos encadeando e assim criamos a corrente de responsabilidades.

[Chain of Responsability](https://refactoring.guru/design-patterns/chain-of-responsibility)

### Aula 03 - Template Method
No projeto ele é Template Method é aplicado como um complemento do Chain of Responsability a parte de código que é padrão em cada método calcular(Orcamento orcamento) é centralizado na classe mãe, em um método que não é abstrato. O método que não é abstrato chama os métodos os métodos abstratos que serão implementados pelas classes filhas.

[Template Method](https://refactoring.guru/design-patterns/template-method)

### Aula 04 - State
Esse padrão é um pouco parecido com o strategy por ter comportamentos difernetes da mesma coisa porém depende do estado de um objeto. Basicamente é criado uma classe default com todo o comportamento padrão default dos estados e as classes que herdam a classe default renomeiam apenas os métodos necessários, cada classe filha representa um estado da classe mãe.

[State](https://refactoring.guru/design-patterns/state)

### Aula 05 - Command
Esse padrão tem como objetivo agrupar um conjunto de instruções que serão executadas da mesma forma em várias partes do código. Indo mais a fundo ainda, o padrão command utiliza de uma interface para abstrair várias classes que implementam um mesmo método, dessa forma, usando do poliformísmo, podemos ter um único objeto que pode ter vários métodos (todos com o mesmo nome) executandos tarefas diferentes.

#### Command Handler
É uma variação do padrão **Command** Onde existe também uma classe executora do método command. Essa classe é responsável por receber as dependências para a execução do método e o método que iria executar a ação, na verdade só repassa os valores que seriam da regra de negócio.
Esse padrão tem um lado bem negativo que é o acumulo de responsabilidades no "*comando*" mas vale a pena conhecer porque cada caso é um caso.

[Command](https://refactoring.guru/design-patterns/command)

Também é recomendado a leitura de dois padrões de arquitura que complementando que são interessantes falando do **Command**, são eles:
* Domain Driven Design;
* Clean Arquitecture.

### Aula 06 - Observer
O padrão de projeto **Observer** consiste em ter uma classe central que simplesmente notifica um conjuntos de classes (classes ouvintes) sobre uma determinada ação (evento). Quando são notificadas elas iniciam a ação e decidem o que fazer com isso.

Esse padrão é muito comum com as bibliotecas que tratam eventos que são acionados como flexo de alguma ação do usuário.

[Observer](https://refactoring.guru/design-patterns/observer)
