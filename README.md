# LinkSentinel

Sistema web para verificação de links suspeitos, desenvolvido para a disciplina de Engenharia de Software.

---

## 📋 Descrição

O **LinkSentinel** permite que usuários:
- Cadastrem-se e façam login
- Verifiquem se um link é seguro ou suspeito
- Consultem o histórico de links já verificados

O objetivo é ajudar pessoas a se protegerem de golpes, phishing e links maliciosos, promovendo a segurança digital.

---

## 🗂️ Estrutura do Repositório

/docs
descricao-dominio.md
mapa-historias.md
prototipos.md
modelo.cml
cenarios-bdd.feature
ddd-niveis.md
arquitetura-limpa.md
diagrama-uml-context-mapper.png
/src
test
java
br/com/linksentinel/steps/LinkSteps.java
resources
features/cenarios-bdd.feature


---

## 🖼️ Diagrama UML

O diagrama UML do modelo especificado no Context Mapper está disponível em:

- [`/docs/diagrama-uml-context-mapper.png`](docs/diagrama-uml-context-mapper.png)

---

## 🚀 Como rodar os testes BDD

1. **Clone o repositório:**
   ```bash
   git clone https://github.com/JaumPyetro/linksentinel.git
   cd linksentinel
2. Instale as dependências do projeto (Maven ou Gradle).

3. Execute os testes:

   Com Maven:

    mvn test

  Com Gradle:

   gradle test

4. Os testes BDD estão em:
   
  src/test/resources/features/cenarios-bdd.feature


📄 Documentação
  Todos os artefatos da primeira entrega estão na pasta /docs:

Descrição do domínio
  Mapa de histórias do usuário
  Protótipos de baixa fidelidade
  Modelo CML dos subdomínios
  Cenários BDD
  Níveis do DDD
  Arquitetura limpa
  Diagrama UML

👥 Integrantes
  João Pedro
  Tiago


📎 Observações
  O projeto está em desenvolvimento e será expandido nas próximas entregas.
  
