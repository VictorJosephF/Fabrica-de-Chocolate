# Sistema Fabrica de Chocolate 

### Atividade prática da aula de METODOS, METODOS E TECNICAS DE ENGENHARIA DE SOFTWARE
### Professor: Rafaela Moreira
### Campus Una Contagem.

Este projeto implementa o controle de uma caldeira de chocolate para a fábrica XYZ, utilizando o **padrão Singleton** para garantir que apenas uma caldeira esteja em operação durante todo o processo. A caldeira segue regras específicas para preenchimento, fervura e drenagem da mistura de chocolate e leite.

## Funcionalidades

O sistema gerencia três estados da caldeira:

1. **Vazia**: A caldeira está pronta para ser preenchida com chocolate e leite.
2. **Cheia**: A caldeira foi preenchida, mas a mistura ainda não foi fervida.
3. **Em ebulição**: A mistura de chocolate e leite está fervendo.

### Regras de Operação

- **Preenchimento**: A caldeira só pode ser preenchida quando estiver vazia.
- **Fervura**: A mistura só pode ser fervida se a caldeira estiver cheia e ainda não fervida.
- **Drenagem**: A caldeira só pode ser drenada se a mistura tiver sido fervida. Não é possível drenar se a caldeira estiver vazia ou se a mistura não tiver fervido.

## Estrutura do Projeto

O projeto é composto pelas seguintes classes:

### `CaldeiraChocolate`

Essa classe implementa o controle da caldeira, utilizando o **padrão Singleton** para garantir que apenas uma instância da caldeira seja criada. Possui os seguintes atributos e métodos:

#### Atributos:

- `vazia`: Indica se a caldeira está vazia (inicialmente `true`).
- `fervida`: Indica se a mistura foi fervida (inicialmente `false`).
- `instancia`: Mantém a única instância da caldeira (Singleton).

#### Métodos:

- `getInstancia()`: Retorna a única instância da caldeira.
- `encher()`: Preenche a caldeira com chocolate e leite. Só pode ser executado se a caldeira estiver vazia.
- `ferver()`: Coloca a mistura em ebulição. Só pode ser executado se a caldeira estiver cheia e a mistura não tiver fervido ainda.
- `drenar()`: Drena a mistura fervida. Só pode ser executado se a mistura tiver sido fervida.
- `isVazia()`: Verifica se a caldeira está vazia.
- `isFervida()`: Verifica se a mistura foi fervida.

### `FabricaDeChocolate`

Esta classe é utilizada para testar os métodos da `CaldeiraChocolate`, simulando o funcionamento do sistema de controle de caldeiras. Ela demonstra as operações de preenchimento, fervura e drenagem da mistura de chocolate e leite.

## Como Executar

1. Clone o repositório:
    ```bash
    git clone git@github.com:seu-usuario/repo.git
    ```

2. Compile e execute o programa:

    - Navegue até o diretório do projeto.
    - Compile as classes:
      ```bash
      javac CaldeiraChocolate.java FabricaDeChocolate.java
      ```
    - Execute o programa:
      ```bash
      java FabricaDeChocolate
      ```

3. O sistema irá realizar as operações de controle da caldeira e exibir os resultados no console.

## Exemplo de Execução

```bash
Caldeira foi preenchida com chocolate e leite.
A mistura de chocolate e leite está fervendo.
A mistura fervida foi drenada da caldeira.
A caldeira está vazia. Não há nada para drenar.
A caldeira está vazia. Não é possível ferver.
Caldeira foi preenchida com chocolate e leite.
A caldeira já está cheia e não pode ser preenchida novamente.
A mistura de chocolate e leite está fervendo.
A mistura fervida foi drenada da caldeira.

