<div>
<h2 align="center">WhatsApp API Java ChatBot</h2>
<p align="center">
<strong><font size="+2" align="center">
  <a href="https://whatsapp.moorse.io/">Nosso Site</a>
  <span> · </span>
  <a href="https://moorse.readme.io/">Documentação</a>
</font></strong>
<br/>

[![Watch the video](https://img.youtube.com/vi/qVqOn6Ee9x4/maxresdefault.jpg)](https://youtu.be/qVqOn6Ee9x4)

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


### :fire: Faça a Demo em nosso site
Você não tem muito conhecimento, ou quer testar nossa API sem precisar utilizar uma linguagem de programação ou o terminal? Disponibilizamos também uma interface web onde você consegue realizar o teste em apenas 3 passos. Acesse o [Moorse Demo](https://app.moorse.io/demo) e veja como é simples.


### :rocket: Configurando o projeto
Neste tópico iremos ver como realizar a configuração do projeto.

1. Acesse o sistema do [Moorse](https://app.moorse.io/demo) e crie sua conta.
2. No [Dashboard](https://app.moorse.io) identifique o número disponibilizado para realizar sua demo e adicione na propriedade "number" do arquivo **application.yml**.
3. Acesse o arquivo **application.yml** localizado em "whatsapp-api-java/src/main/resources/application.yml" e adicione seu token.

Altere as propriedade abaixo para as configurações da sua conta moorse.

```
moorse:
  integration:
    number: 5511999999999
  api:
    url: http://api.moorse.io
  token: SEU_TOKEN_AQUI
  
```

### :arrow_forward: Executando seu projeto
No terminal Acesse a raiz do seu projeto e execute o comando abaixo:

```
mvn spring-boot:run
```

### :pencil: Alterando as opções e menus do bot
Acesse a class "ConfigInit" localizado em "whatsapp-api-java/src/main/java/io/moorse/demo/whatsapp/config/ConfigInit.java" e altere o método init.


![](![]([]()))
