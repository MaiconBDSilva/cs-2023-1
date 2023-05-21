### Tarefa 007: Revisão de Código - 10/05/2023

1. Solicita-se a leitura dos artigos disponíveis nos seguintes links:

  1.1 [link1](https://appmaster.io/pt/blog/revisoes-de-codigo)

  1.2 [link2](https://medium.com/codigorefinado/code-review-revis%C3%A3o-de-c%C3%B3digo-pode-ser-automatizada-ba5f25882774)

2. Após a leitura elaborar um resumo descritivo de cada um deles. Destacando:

  2.1 A importância da Revisão de código;

  2.1 Os objetivos desta técnica;

  2.2 O Processo de Revisão e

  2.3 Descrever algumas das ferramentas de suporte a esta atividade, com seus respectivos links no texto.   

INSTRUÇÕES:

1. No seu repositório pessoal, na sua branch pessoal, criar a pasta aula09.
2. Commitar este arquivo respondido nesta pasta.
3. A data limite para concluir esta tarefa é dia 10/05/2023, as 23h59min.

</DIV/>

<br>
<br>

## Revisões de Código

<br>


A revisão de código é um processo essencial para melhorar a qualidade do software e seu produto final. Além de ajudar a reduzir custos e detectar bugs precocemente, a revisão de código proporciona oportunidades de aprendizado, compartilhamento de conhecimento e aprimoramento das habilidades dos desenvolvedores. Essa prática envolve uma minuciosa verificação do código por parte de outros desenvolvedores, a fim de identificar erros, bugs e possíveis melhorias. É importante que a revisão seja realizada por alguém diferente do autor original do código para garantir uma visão imparcial e detectar problemas que possam passar despercebidos.

Para simplificar o processo de revisão de código, os desenvolvedores costumam utilizar listas de verificação, que abrangem os principais aspectos a serem verificados durante a revisão. Essas listas ajudam a garantir que nenhum aspecto seja negligenciado e facilitam o trabalho do revisor. Afinal, a importância da revisão de código reside no fato de que, embora as ferramentas de revisão automatizada possam auxiliar, os humanos têm a capacidade de identificar questões que as máquinas não conseguem perceber. Além disso, a revisão de código oferece a oportunidade de aprendizado, feedback construtivo e melhoria contínua.

O processo de revisão de código envolve a preparação prévia, obtenção de informações sobre o contexto do código e suas prioridades. Durante a revisão, são verificados aspectos como depuração, segurança, legibilidade do código, duplicação de código, nomeação adequada de variáveis e testes automatizados. A documentação também é revisada e atualizada, quando necessário. Durante o processo, o revisor pode sugerir melhorias e fornecer feedback ao autor do código, destacando as alterações feitas e suas razões.

Existem diversas ferramentas de suporte à atividade de revisão de código, que automatizam parte do processo e agilizam a revisão, tornando-a mais eficiente. Por exemplo, o [GitLab](https://about.gitlab.com/) é uma plataforma de desenvolvimento de software com recursos robustos para a revisão de código. O [Crucible](https://www.atlassian.com/br/software/crucible) é uma ferramenta de revisão de código que oferece recursos avançados para a colaboração e inspeção de código. Já o [SonarQube](https://www.sonarsource.com/products/sonarqube/) é uma plataforma de análise estática de código que também inclui recursos de revisão de código. Ele realiza uma análise detalhada do código-fonte em busca de problemas de qualidade, bugs, vulnerabilidades de segurança e violações de padrões de codificação.

Em suma, a revisão de código é uma prática fundamental para melhorar a qualidade do software. Seus objetivos incluem identificar erros, melhorar a segurança, aumentar a legibilidade do código, eliminar duplicações, aprimorar a nomenclatura e os testes, além de oferecer feedback construtivo ao autor. As ferramentas de suporte, como o GitLab, o Crucible e o SonarQube, tornam o processo mais eficiente e eficaz, auxiliando na detecção de erros, formatação adequada, análise de segurança e identificação de duplicação de código.

<br>
<br>

## Revisões Automatizadas de Código
<br>

O texto aborda a automação da revisão de código e a inclusão de várias ferramentas no pipeline de entrega contínua. Destaca-se que parte da revisão de código pode ser automatizada, mas muitos programadores desconhecem essa possibilidade. O autor menciona que falhas podem ser identificadas automaticamente e apresenta diversas ferramentas que podem ser utilizadas no GitHub.

As ferramentas mencionadas incluem Travis CI para integração contínua, ESLint, TSLint, Codelizer, Checkstyle e SonarQube para verificação de conformidade de código, Husky.js para execução de ações automáticas no git, ImgBot para otimização de imagens, Dependabot para manter dependências atualizadas, Snyk para identificação e correção de vulnerabilidades, Codecov e Coveralls para relatórios de cobertura de testes, entre outras.

O texto também destaca a importância de verificar o tamanho das imagens em um repositório e menciona o uso de ferramentas como Codefactor, Codacy, Codebeat e SecretScan para análise de código, e Turbot para varredura de contas AWS em busca de oportunidades de melhoria.

O autor enfatiza que a escolha das ferramentas deve se adequar ao contexto do projeto e que a inclusão dessas ferramentas pode aumentar a confiabilidade das entregas. Por fim, menciona que ter várias ferramentas com o mesmo propósito pode promover um melhor entendimento e tomada de decisão em relação aos Pull Requests.

Algumas das ferramentas citadas são:

1. [Travis CI](https://travis-ci.org/): Travis CI é uma das ferramentas mais populares para integração contínua, amplamente utilizada para construção, testes e implantação de aplicativos. É conhecido por sua integração fácil com plataformas de hospedagem de código, como o GitHub.
2. [ESLint](https://eslint.org/): O ESLint é uma ferramenta extremamente útil para verificar a qualidade do código JavaScript. Ele fornece um conjunto abrangente de regras configuráveis ​​para identificar problemas potenciais, padronizar o estilo de codificação e melhorar a legibilidade do código.
3. [Dependabot](https://dependabot.com/): Essa ferramenta é amplamente utilizada para automatizar a atualização de dependências em projetos. Ela verifica regularmente as dependências de um projeto e abre solicitações de pull (Pull Requests) com atualizações, ajudando a manter as dependências atualizadas e seguras.
4. [Snyk](https://snyk.io/): Snyk é uma ferramenta popular para identificar e corrigir vulnerabilidades em dependências de software. Ele integra-se com sistemas de controle de versão, como o GitHub, permitindo a detecção precoce de vulnerabilidades conhecidas e fornecendo soluções para resolvê-las.

