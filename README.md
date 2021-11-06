<div>
<h2 align="center">WhatsApp API Java ChatBot</h2>
<p align="center">
<strong><font size="+2" align="center">
  <a href="https://whatsapp.moorse.io/">Nosso Site</a>
  <span> · </span>
  <a href="https://moorse.readme.io/">Documentação</a>
</font></strong>


[![Watch the video](https://moorse.io/assets/api/chat-bot-whatsapp-java.png)](https://youtu.be/YJrnQ87Rw2A)

<br/>
<a href="https://moorse.io/">
  <img alt="Logo" title="#logo" width="300px" src="files/github.gif">
</a>
</p>
</div>


<a id="tecnologias-utilizadas"></a>

### :mag: Veja também

Além do Javascript, nós temos exemplos nas mais variadas linguagens utilizadas no momento. Veja abaixo todas as opções que temos disponíveis:

- [Javascript]()
- [Python]()
- [PHP]()

<a id="structure"></a>


### :rocket: Configurando o projeto
Neste tópico iremos ver como realizar a configuração do projeto.

1. Acesse o sistema do [Moorse](https://app.moorse.io) e crie sua conta.
2. No [Dashboard](https://app.moorse.io/channels/whatsapp) identifique o id da integração disponibilizada para realizar sua demo e adicione na propriedade "integration" do arquivo **application.yml**.
3. Acesse o arquivo **application.yml** localizado em "whatsapp-api-java/src/main/resources/application.yml" e adicione seu token.

Altere as propriedade abaixo para as configurações da sua conta moorse.

```
moorse:
  integration: ID_DA_SUA_INTEGRACAO_AQUI
  api:
    url: http://api.moorse.io
  token: SEU_TOKEN_AQUI
  
```

Configurando seu webhook 

1. Acesse a opção do menu [Webhooks](https://app.moorse.io/webhooks) e adicione o seu webhook Ex: https://https://9c740e0cd1.ngrok.io/webhooks
2. Toda mensagem recebida na sua integração será enviada para o seu webhook.

### :arrow_forward: Executando seu projeto
No terminal Acesse a raiz do seu projeto e execute o comando abaixo:

```
mvn spring-boot:run
```

### :pencil: Alterando as opções e menus do bot
Acesse a class "ConfigInit" localizado em "whatsapp-api-java/src/main/java/io/moorse/demo/whatsapp/config/ConfigInit.java" e altere o método init.


![](![]([]()))
