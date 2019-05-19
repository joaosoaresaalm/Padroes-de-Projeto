# Padroes-de-Projeto
Exercícios

# 1- Controle de Debate Político
Imagine que você foi contratado para propor uma arquitetura de software (diagrama de classes em UML) que será utilizada para desenvolver uma aplicação a ser utilizada por apresentadores de TV em transmissões de debates políticos a cargos majoritários (presidente, governador, prefeito). A principal funcionalidade desejada é que o apresentador através do software seja capaz de controlar a falar de cada candidato organizando os tempos de pergunta, resposta, réplica e tréplica de cada interação pergunta-respostas entre candidatos. Por  exemplo, finalizado o tempo disponível para pergunta o microfone do inquiridor deve ser desligado, e acionado o microfone do candidato que tem direito de resposta; finalizado o tempo da resposta, o microfone do respondente deve ser desligado, e acionado o microfone do candidato com direito a réplica; e assim sucessivamente.

Diagrame em UML como seria a arquitetura (organização das classes e objetos) do  padrão de projeto que implementaria o componente de software responsável por executar a principal funcionalidade desejada. Encaminhe seu arquivo resposta em formato PDF.

# 2- Notificação de Mensagens para Eleitores

Devido ao sucesso do seu software protótipo implementado sobre a estrutura de padrões que você arquitetou no projeto Debate de Candidatos, a TV lhe solicitou o incremento de uma nova funcionalidade. Agora, qualquer eleitor poderia se cadastrar para receber em tempo real a mensagem “SEU CANDIDATO ESTÁ FALANDO”. Tal mensagem deve ser enviada quando ao seu candidato fosse dado o direito de fala (pergunta, resposta, réplica ou tréplica) durante a transmissão do debate. Por exemplo, antes do microfone ser aberto para o candidato, o eleitor deve receber a mensagem de notificação. Lembre, que cada candidato tem seu grupo de eleitores, por menor que seja, que desejam ser notificados. Já cada eleitor tem um único candidato de sua preferência.

Diagrame em UML como seria a arquitetura (organização das classes e objetos) do padrão de projeto que implementaria o componente de software responsável pelas notificações de mensagens. Encaminhe seu arquivo resposta em formato PDF.

# 3- Processando Arquivos
Escreva uma aplicação em Java que receba um texto ou arquivo de texto da linha de comando. O texto deve ser lido e estatísticas devem ser impressas sobre: 

a) o número de espaços encontrados, 

b) o número de letras 'a' e,

c) o número de pontos.

• Use o padrão Chain of Responsibility e faça com que cada tipo de caractere seja tratado por um elo diferente da corrente.

Encaminhe seus arquivos em formato Java.

# 4- Um Simples Flyweight

Implemente uma aplicação que imprima aleatoriamente 10 números de 10 algarismos. Cada algarismo deve ser uma instancia do objeto. Algarismo que possui o número 1, 2, 3, etc. como membro imutável.

• Use Flyweight para que objetos que representam o mesmo algarismo sejam reutilizados.

Encaminhe seus arquivos em formato Java.

# 5- Conectando API Java e Aplicação

A classe java.util.Map da API de coleções de Java permite que sejam armazenados pares de objetos (chave e valor) em uma de suas implementações (as mais conhecidas são HashMap e TreeMap). Suponha que você desconhecia os construtores oficiais disponíveis para classe java.util.Map. Você acabou desenvolvendo uma aplicação Java que faz uso de um construtor que recebe como parâmetro uma matriz de duas linhas e que monta o mapa usando a primeira linha como chave e a segunda como valor. É fato que a classe java.util.Map da API Java oficialmente não tem um construtor como o utilizado pela sua aplicação. Implemente um padrão de projeto que possibilite a interface entre a classe java.util.Map e sua aplicação.

Submeta sua solução em arquivos no formato JAVA

