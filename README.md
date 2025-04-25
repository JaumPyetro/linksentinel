#LinkSentinel
LinkSentinel é um sistema web desenvolvido para a disciplina de Engenharia de Software, com o objetivo de verificar links suspeitos e auxiliar na prevenção contra golpes, phishing e outras ameaças digitais.

---

🔍 Funcionalidades
Cadastro e autenticação de usuários

Verificação de links para determinar se são seguros ou suspeitos

Consulta ao histórico de links verificados

O objetivo é ajudar pessoas a se protegerem de golpes, phishing e links maliciosos, promovendo a segurança digital.

---

## 🗂️ Estrutura do Repositório
linksentinel/
├── docs/
│   ├── arquitetura-limpa.md
│   ├── cenarios-bdd.feature
│   ├── descricao-dominio.md
│   ├── ddd-niveis.md
│   ├── diagrama-uml-context-mapper.png
│   ├── mapa-historias.md
│   ├── modelo.cml
│   └── prototipos.md
├── src/
│   └── test/
│       └── java/
│           └── br/
│               └── com/
│                   └── linksentinel/
│                       └── steps/
│                           └── LinkSteps.java
│       └── resources/
│           └── features/
│               └── cenarios-bdd.feature
└── README.md


---
🧪 Executando os Testes BDD
Clone o repositório:
git clone https://github.com/JaumPyetro/linksentinel.git
cd linksentinel
Instale as dependências do projeto utilizando Maven ou Gradle.​

Execute os testes:
# Com Maven
mvn test

# Com Gradle
./gradlew test

🧭 Diagrama UML
O diagrama UML do modelo especificado no Context Mapper está disponível em:
docs/diagrama-uml-context-mapper.png

📄 Documentação
A documentação completa do projeto está localizada na pasta docs/, incluindo:​
Descrição do domínio
Mapeamento de histórias de usuário
Protótipos de interface
Modelo CML
Cenários BDD
Arquitetura limpa
Níveis de DDD​

👥 Integrantes
  João Pedro Nóbrega
  Tiago Emilio


📎 Observações
  O projeto está em desenvolvimento e será expandido nas próximas entregas.
