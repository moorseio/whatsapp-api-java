<div>
<h2 align="center">WhatsApp API Java ChatBot</h2>
<p align="center">
<strong><font size="+2" align="center">
  <a href="https://whatsapp.moorse.io/">Nosso Site</a>
  <span> · </span>
  <a href="https://moorse.readme.io/">Documentação</a>
</font></strong>
<br/>
<a href="https://moorse.io/">
  <img alt="Logo" title="#logo" width="300px" src="files/github.gif">
</a>
</p>
</div>

## O que é o WhatsApp Api Moorse Java?
Moorse é uma empresa focada no desenvolvimento de API's e tecnologias de diversos canais de comunicação, entre essas API's temos a solução Moorse WhatsApp API (API não-oficial) que permite desenvolvedores utilizarem de suas funcionalidades que podem ter semelhança com a API oficial. Viemos ao mercado com o objetivo de facilitar a comunicação entre o seu sistema e o mundo digital de forma robusta e escalável. Esta documentação tem como objetivo exemplificar o uso do **Whatsapp API** na linguagem Java 

* **E-Commerce** – Envie mensagens com o status do pedido em tempo real, mantenha seu cliente informado.
* **Chat Bot** – Automatize a interação com clientes por fluxos conversacionais e seja mais eficiente. Escolha respostas predefinidas ou crie chatbots com Inteligência Artificial para interagir no WhatsApp.
* **Alertas e Notificações** – Use as mensagens do WhatsApp para enviar com segurança mensagens sobre monitoramento, desde notificações de voo até confirmações de reserva e alertas de entrega.
* **Atendimento** – Crie seu sistema de atendimento utilizando nossas APIs, permita que as equipes de vendas e suporte respondam perguntas sobre produtos ou serviços de atendimento ao cliente usando o aplicativo de mensagens preferido de seus clientes.



<a id="tecnologias-utilizadas"></a>

### :mag: Veja também

Além do Javascript, nós temos exemplos nas mais variadas linguagens utilizadas no momento. Veja abaixo todas as opções que temos disponíveis:

- [Javascript]()
- [Python]()
- [PHP]()

<a id="structure"></a>


### :fire: Faça a Demo em nosso site
Você não tem muito conhecimento, ou quer testar nossa API sem precisar utilizar uma linguagem de programação ou o terminal? Disponibilizamos também uma interface web onde você consegue realizar o teste em apenas 3 passos. Acesse o [Moorse Demo](https://app.moorse.io/demo) e veja como é simples.


### :rocket: Configurando o projeto
Neste tópico iremos ver como realizar a configuração do projeto.

1. Acesse o sistema do [Moorse](https://app.moorse.io/register) e crie sua conta.
2. No [menu de integrações](https://app.moorse.io/integrations) identifique o número disponibilizado para realizar sua demo e adicione na propriedade "number" do arquivo **application.yml**.
3. Acesse o arquivo **application.yml** localizado em "whatsapp-api-java/src/main/resources/application.yml" e adicione seu login e senha.

Altere as propriedade abaixo para as configurações da sua conta moorse.

```
moorse:
  integration:
    number: 5511999999999
  api:
    url: http://api.moorse.io
  login: seuemail@email.com
  senha: 123456
  
```

### :arrow_forward: Executando seu projeto
No terminal Acesse a raiz do seu projeto e execute o comando abaixo:

```
mvn spring-boot:run
```

### :pencil: Alterando as opções e menus do bot
Acesse a class "ConfigInit" localizado em "whatsapp-api-java/src/main/java/io/moorse/demo/whatsapp/config/ConfigInit.java" e altere o método init.


![](![]([]()))
