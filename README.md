# Sprint3-Java
Repositório com código JAVA - Sprint3 - CHALLENGE

Neste projeto Java, instanciamos todos as Classes necessárias, visando simular uma ocorrencia de um Acionamento de Guincho;

O Projeto conta com uso de Herança, Polimorfismos, Metodos de Modelo de Negócio, e conexão com Banco de Dados SQL Oracle, usando método INSERT INTO;

Falando em Estrutura do projeto, nosso código está dividido em 5 packages:

1 - Beans → Nesse pacote instanciamos as 9 classes que compõem os objetos do sistema. As classes são: Acionamento, Veiculo, Segurado, SeguradoPf, SeguradoPj, Prestadora, Carga, Modificacoes e Guincho.

2 - Main → Nesse pacote, temos 4 classes. ExecucaoAcionamentoPF, ExecucaoAcionamentoPJ, TestaConexao e TesteCadastrar. As duas últimas classes sãoreferentes a conexão e cadastro de registros no Banco de Dados.

3 - DAO → Aqui, temos a classe que preparamos o método condizente com o Cadastro de um SeguradoPf em nosso banco de dados. 

4 - Exceptions → Dentro desse pacote, temos uma classe Excecao, para sinalizar o Erro de Input de um usuário de nosso sistema, no caso do Input de uma Letra no lugar de um número.

5 - Conexoes → Este pacote é responsavel pela introdução de credenciais e conexão com nosso Banco de Dados Oracle, atraves da Classe ConexaoFactory.

OBS: Tivemos dificuldades com metodos da Classe AcionamentoDAO que envolveriam Classes com Atributos de Referência.
