# O-lympics: Code Complexity Game
![27f7a7d3-209e-4924-8b92-143826b4cb7c](https://github.com/user-attachments/assets/bb097bbb-73f0-4843-9b4b-f3163de8456a)

Este é um projeto Java que permite aos usuários testarem seu conhecimento em complexidade de algoritmos através de um jogo interativo. O objetivo é adivinhar a complexidade de diferentes códigos fornecidos, praticando e consolidando o entendimento de análise de complexidade.

## Funcionalidades

- **Teste de Conhecimento**: Escolha a complexidade Big-O dos códigos fornecidos aleatoriamente.
- **Feedback em Tempo Real**: O programa informa se a resposta está correta ou não, ajudando o jogador a melhorar seu entendimento.
- **Tabela de Pontuação**: Ao final do jogo, exibe uma tabela com o nome do jogador e sua pontuação, ordenada por pontuações mais altas.
- **Escolha de Continuação**: O jogador pode optar por continuar jogando após cada rodada, até que todos os códigos tenham sido respondidos.

## Estrutura do Projeto

O projeto é estruturado em pacotes para melhor organização do código:

- **application**: Contém a classe principal (`Main`), que gerencia a interação com o usuário e o fluxo do jogo.
- **codes**: Inclui as classes (`Code1` a `Code24`), cada uma representando um código com uma complexidade específica, usada para o teste de conhecimento.

## Mapeamento de Complexidades

Cada código possui uma complexidade de tempo associada. Aqui está o mapeamento completo:

- **Code1** a **Code3**: `O(1)`
- **Code4** a **Code6**: `O(log n)`
- **Code7** a **Code9**: `O(n)`
- **Code10** a **Code12**: `O(n log n)`
- **Code13** a **Code15**: `O(n²)`
- **Code16** a **Code18**: `O(n³)`
- **Code19** a **Code21**: `O(2^n)`
- **Code22** a **Code24**: `O(n!)`

## Tecnologias Utilizadas

- **Java**: A linguagem utilizada para implementar o jogo e as funcionalidades.
- **Manipulação de Arquivos**: Utilizada para salvar e organizar a tabela de pontuação.
- **Estrutura Modular**: O projeto é desenvolvido de forma modular, facilitando a manutenção e futura expansão.

## Como Executar o Projeto

1. Clone este repositório para sua máquina local.
2. Abra o projeto em sua IDE preferida (como IntelliJ IDEA ou Eclipse).
3. Compile e execute o projeto usando os comandos abaixo:

   ```bash
   javac -d bin src/application/Main.java
   java -cp bin application.Main
   
# Contribuição
- Contribuições são bem-vindas! Sinta-se à vontade para melhorar o projeto, corrigir bugs ou adicionar novas funcionalidades:

- Faça um fork deste repositório.
- Crie uma branch para sua funcionalidade (git checkout -b minha-nova-funcionalidade).
- Faça suas alterações e adicione os commits (git commit -m 'Adiciona nova funcionalidade').
- Envie para o repositório remoto (git push origin minha-nova-funcionalidade).
- Abra um pull request para revisão.
  
# Licença
Este projeto está sob a Licença MIT. Consulte o arquivo LICENSE para mais detalhes.
