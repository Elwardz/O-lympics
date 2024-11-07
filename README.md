# O-lympics: Code Complexity Game

Este é um projeto Java que permite aos usuários testarem seu conhecimento em complexidade de algoritmos através de um jogo interativo. O objetivo é adivinhar a complexidade de diferentes códigos fornecidos, praticando e consolidando o entendimento de análise de complexidade.

## Funcionalidades

- **Teste de conhecimento**: Escolha a complexidade Big-O dos códigos fornecidos aleatoriamente.
- **Feedback em tempo real**: O programa informa se a resposta está correta ou não.
- **Escolha de continuação**: O usuário pode optar por continuar jogando após cada rodada.

## Estrutura do Projeto

O projeto é estruturado em pacotes para melhor organização do código. As principais classes incluem:

- `application`: Contém a classe principal (`Main`) que gerencia a interação com o usuário e o fluxo do jogo.
- `codes`: Contém as classes (`Code1` a `Code24`) com os códigos e suas respectivas complexidades, usadas para o teste de conhecimento.

## Mapeamento de Complexidades

Cada código possui uma complexidade de tempo associada, que está listada na classe `Main`. Aqui está o mapeamento completo:

- **Code1**: O(1)
- **Code2**: O(1)
- **Code3**: O(1)
- **Code4**: O(log n)
- **Code5**: O(log n)
- **Code6**: O(log n)
- **Code7**: O(n)
- **Code8**: O(n)
- **Code9**: O(n)
- **Code10**: O(n log n)
- **Code11**: O(n log n)
- **Code12**: O(n log n)
- **Code13**: O(n^2)
- **Code14**: O(n^2)
- **Code15**: O(n^2)
- **Code16**: O(n^3)
- **Code17**: O(n^3)
- **Code18**: O(n^3)
- **Code19**: O(2^n)
- **Code20**: O(2^n)
- **Code21**: O(2^n)
- **Code22**: O(n!)
- **Code23**: O(n!)
- **Code24**: O(n!)

## Tecnologias Utilizadas

- **Java**: A linguagem utilizada para implementar o jogo e as funcionalidades.
- **Padrão de Projeto**: O projeto segue o padrão de desenvolvimento modular para melhor organização do código.

## Como Executar o Projeto

1. Clone este repositório para sua máquina local.
2. Abra o projeto em sua IDE preferida (como IntelliJ IDEA ou Eclipse).
3. Compile o projeto com o seguinte comando:

   ```bash
   javac -d bin src/application/Main.java

java -cp bin application.Main

## Contribuição

Sinta-se à vontade para contribuir com melhorias, correções de bugs ou novas funcionalidades. Para isso, siga as etapas abaixo:

- Faça um fork deste repositório.
- Crie uma branch para sua nova funcionalidade (git checkout -b nova-funcionalidade).
- Faça suas alterações e adicione suas mudanças (git commit -m 'Adicionando nova funcionalidade').
- Envie para o repositório remoto (git push origin nova-funcionalidade).
- Abra um pull request.

## Licença
- Este projeto está sob a Licença MIT. Veja o arquivo LICENSE para mais detalhes.



### O que está incluído neste arquivo:

1. **Descrição do projeto**: Uma explicação simples sobre o objetivo do jogo e como ele funciona.
2. **Funcionalidades**: Detalha as funcionalidades principais do jogo.
3. **Estrutura do Projeto**: Explicação sobre os pacotes e classes principais.
4. **Mapeamento de Complexidades**: Relacionamento entre códigos e suas complexidades de tempo.
5. **Tecnologias Utilizadas**: Linguagem e padrões utilizados no desenvolvimento.
6. **Como Executar o Projeto**: Instruções claras sobre como executar o jogo.
7. **Contribuição**: Como outros desenvolvedores podem contribuir para o projeto.
8. **Licença**: Informações sobre a licença do projeto.
