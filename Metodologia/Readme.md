


<h2>Sobre mim</h2>
<p align="center"><img src="./assets/ImagemPerfil.png" width="20%" style="border-radius: 50%; width: 150px; height: 150px; display: block; margin: 0 auto;"></p>

Comecei minha carreira trabalhando com gestão de tráfego de dados, onde percebi o quanto a automação pode facilitar a organização e análise de informações. Isso despertou meu interesse pela programação, especialmente Python, que me mostrou as diversas oportunidades que esse campo oferece.

Em 2022, dei um grande passo ao iniciar o curso de Banco de Dados na FATEC. Desde então, venho melhorando minhas habilidades em desenvolvimento de backend e administração de bancos de dados.

Tenho experiência na construção de projetos web usando Java (SpringBoot) e JavaScript (Node.js, React.js, Typescript), sempre priorizando a experiência do usuário e buscando melhorar a performance e a qualidade do código.

Atualmente, estou na APTIV, uma empresa do segmento automotivo, onde trabalho em um laboratório de engenharia. Minha função envolve o uso de Python para automatizar máquinas, realizar testes de equipamentos e registrar informações.

Além disso, também trabalho em outra empresa, onde utilizo desde ferramentas de low code até a codificação direta no desenvolvimento de demandas de produtos personalizados para empresas que entram em contato conosco.

## Contatos
* [Git](https://github.com/laroyprado)
* [LinkedIn](https://www.linkedin.com/in/laroyprado)

## Meus Principais Conhecimentos

**Aplicações e dados**

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Spring](https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white)
![JavaScript](https://img.shields.io/badge/JavaScript-F7DF1E?style=for-the-badge&logo=javascript&logoColor=black)
![NodeJs](https://camo.githubusercontent.com/b0432ab0567d45add9bf155718ab7de57c330cd3acd719374fae0384e95688c2/68747470733a2f2f696d672e736869656c64732e696f2f62616467652f4e6f64652e6a732d3433383533443f7374796c653d666f722d7468652d6261646765266c6f676f3d6e6f64652e6a73266c6f676f436f6c6f723d7768697465)
![HTML5](https://img.shields.io/badge/HTML5-E34F26?style=for-the-badge&logo=html5&logoColor=white)
![CSS](https://img.shields.io/badge/CSS3-1572B6?style=for-the-badge&logo=css3&logoColor=white)
![React](https://img.shields.io/badge/React-20232A?style=for-the-badge&logo=react&logoColor=61DAFB)
![Python](https://img.shields.io/badge/Python-14354C?style=for-the-badge&logo=python&logoColor=white)
![Styled Components](https://img.shields.io/badge/styled--components-DB7093?style=for-the-badge&logo=styled-components&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-00000F?style=for-the-badge&logo=mysql&logoColor=white)
![Postgre](https://img.shields.io/badge/PostgreSQL-316192?style=for-the-badge&logo=postgresql&logoColor=white)






## Meus Projetos

### Em 2023-2 
![banner-api-3](./assets/banner-gerenciador-hora-extra.png)

## Projeto de Desenvolvimento de Sistema de Gestão de Horas Extras e Sobreavisos

### Empresa Parceira: [2RP](https://2rpnet.com.br/)

### Problema:
A empresa enfrentava dificuldades na gestão eficiente das horas extras e sobreavisos dos colaboradores. O processo manual de registro e aprovação dessas horas era moroso e propenso a erros, resultando em atrasos no pagamento e insatisfação dos funcionários. Além disso, não havia um sistema centralizado para acompanhar e analisar essas informações, dificultando a tomada de decisões estratégicas por parte da gestão.

### Solução Entregue pela Equipe:
Nossa equipe desenvolveu um sistema de gestão de horas extras e sobreavisos sob medida para as necessidades da empresa. O sistema permite que os colaboradores e gestores registrem e acompanhem suas horas extras e sobreavisos de forma intuitiva e eficiente. Os administradores têm acesso a ferramentas avançadas de parametrização, que permitem padronizar o sistema com valores a serem pagos pelas horas extras.

O sistema também automatiza o processo de aprovação, encaminhando as horas registradas para os gestores e administradores responsáveis, agilizando assim o pagamento e garantindo a conformidade com as políticas internas da empresa. Com uma interface amigável e recursos de relatórios integrados, o sistema oferece uma visão abrangente e em tempo real das horas trabalhadas, facilitando a análise e a tomada de decisões pelos gestores.

[Repositório do Projeto ](https://github.com/codecatss/API-BD3)

#### Tecnologias Utilizadas
> 
> 
> - **Java**: Essencial para o desenvolvimento do backend do sistema de gestão de horas extras e sobreavisos.
> - **Spring Boot**: Facilita a configuração e o desenvolvimento de aplicativos Java, permitindo uma rápida implementação de serviços web e RESTful.
> - **JavaScript**: Utilizado para desenvolver a lógica do lado do cliente, interatividade e dinamismo na interface do usuário.
> - **Hibernate**: Fornece uma camada de mapeamento objeto-relacional para o banco de dados, simplificando a interação com o banco de dados relacional.
> - **Docker**: Utilizado para empacotar, distribuir e executar aplicativos em contêineres, garantindo consistência e portabilidade do ambiente de desenvolvimento para produção.
> - **Git e Github**: Ferramentas essenciais para controle de versão e colaboração entre os membros da equipe, permitindo o gerenciamento eficiente do código-fonte.
> - **HTML**: Responsável pela estruturação do conteúdo da página web.
> - **CSS**: Utilizado para estilizar e formatar o layout da página web, garantindo uma experiência visual agradável para o usuário.


#### Contribuições Pessoais


<details>
  <summary>Configuração do método GET no "/cr"</summary>
  <img src="/assets/restController.png" alt="Descrição da imagem">
  <br>
DDesenvolvi o CenterResultController para gerenciar os resultados dos centros em nossa aplicação. Este controlador REST opera sobre o protocolo HTTP, que é a base da comunicação na web, permitindo que clientes e servidores se comuniquem. No contexto REST (Representational State Transfer), que é um estilo arquitetural para sistemas distribuídos, o CenterResultController lida com requisições HTTP para salvar e recuperar informações dos centros de resultados.

Ao utilizar anotações como @RestController e @RequestMapping, defini a classe como um controlador e mapeei as requisições para o caminho "cr", tornando mais claro o acesso aos recursos relacionados aos centros de resultados.

O método saveCenterResult foi projetado para garantir que todas as informações necessárias sejam fornecidas antes de salvar um centro de resultado, o que ajuda a prevenir duplicatas e erros de dados. Enquanto isso, o método getAll é responsável por recuperar uma lista de todos os centros de resultados, facilitando a visualização e o gerenciamento desses dados.

A anotação @CrossOrigin é uma medida de segurança que permite que a API seja acessada de diferentes origens, o que é fundamental para a integração com outras partes do sistema ou aplicações de terceiros. Isso ajuda a evitar problemas de segurança, ao mesmo tempo em que possibilita uma maior flexibilidade na interação com a API.
</details>

<details>
  <summary>Configuração Do Swagger </summary>
  <img src="/assets/codigoSwagger.png" alt="Descrição da imagem">
  <br>
 Desenvolvi a configuração do Swagger como parte do processo de criação. Essa experiência me proporcionou uma compreensão mais profunda do funcionamento das APIs RESTful e da importância da documentação precisa. O Swagger é uma ferramenta essencial para criar e visualizar a documentação de APIs de forma clara e acessível. Ele permite que desenvolvedores e usuários finais entendam facilmente os endpoints disponíveis, os parâmetros necessários e os formatos de resposta esperados. Além disso, o Swagger oferece uma interface interativa que possibilita testar as funcionalidades da API diretamente na documentação, simplificando o processo de desenvolvimento e garantindo uma melhor experiência para os usuários.
</details>

<details>
  <summary>Configuração Do Token Service</summary>
  <img src="/assets/TokenService.png" alt="Descrição da imagem">
  <br>
Desenvolvi o arquivo TokenService.java, uma peça fundamental na estrutura da nossa aplicação API3SEM. Este serviço desempenha um papel central na geração e validação de tokens JWT, fortalecendo a segurança do processo de autenticação dos usuários. Por meio dele, somente usuários autenticados têm permissão para acessar funcionalidades específicas da nossa API, garantindo, assim, a proteção de dados sensíveis e a privacidade dos nossos clientes.
</details>



<details>
  <summary>Configuração do filtro de horas</summary>
  <img src="/assets/filtroControllerHora.png" alt="Descrição da imagem">
  <br>
O método filtredHours que desenvolvi permite filtrar registros de horas em nossa API. Ele aceita parâmetros para identificar o tipo de filtro e a variável de busca. Dependendo do filtro, seja por gestor, matrícula, código de CR ou cliente, o método busca e retorna os registros relevantes. Se não encontrar registros ou ocorrer um erro, ele lança uma exceção com uma mensagem explicativa. Esse recurso facilita a busca de informações específicas pelos usuários.
</details>

#### Hard Skills

- **Java** : Sei fazer com autonomia
- **Springboot** : Sei fazer com autonomia
- **Javascript**: Sei Fazer com autonomia
- **Html** : Sei Fazer com autonomia
- **Css** : Sei Fazer com autonomia
- **PostgreSQL** : Sei fazer com ajuda

#### Soft Skills

**Comunicação**: Exercitei minhas habilidades de comunicação ao interagir frequentemente com a equipe, transmitindo a visão do cliente e alinhando expectativas. Mantive um diálogo aberto e constante com o cliente para entender suas necessidades e garantir que as funcionalidades desenvolvidas atendessem às suas expectativas.

**Autodidatismo** : Demonstrei proatividade ao buscar e adquirir conhecimentos sobre tecnologias novas, como Spring Boot, que não tinha familiaridade anteriormente. 

**Trabalho sob pressão**: Em momentos de baixa de recursos no time, assumi mais responsabilidades do que o habitual para garantir que o projeto fosse entregue dentro do prazo estabelecido. 

Trabalho 



### Em 2022-1
Mesmo formato

### Em 2022-2
Mesmo formato

### Em 2023-1
Mesmo formato

### Em 2023-2
Mesmo formato






