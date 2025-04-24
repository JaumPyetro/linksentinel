Funcionalidade: Cadastro de usuário

  Cenário: Novo usuário realiza cadastro com sucesso
    Dado que o usuário está na página de cadastro
    Quando ele preenche nome, email e senha válidos e clica em "Cadastrar"
    Então o sistema deve exibir "Cadastro realizado com sucesso"

  Cenário: Cadastro com email já existente
    Dado que já existe um usuário cadastrado com o email "joao@email.com"
    Quando um novo usuário tenta se cadastrar com o mesmo email
    Então o sistema deve exibir "Email já cadastrado"

Funcionalidade: Login

  Cenário: Usuário faz login com sucesso
    Dado que o usuário está na página de login
    Quando ele preenche email e senha corretos e clica em "Entrar"
    Então o sistema deve exibir "Login realizado com sucesso"

  Cenário: Usuário faz login com senha incorreta
    Dado que o usuário está na página de login
    Quando ele preenche email correto e senha incorreta e clica em "Entrar"
    Então o sistema deve exibir "Senha incorreta"

Funcionalidade: Verificar se um link é suspeito

  Cenário: Usuário submete um link suspeito
    Dado que o usuário está autenticado
    Quando ele insere o link "http://phishing.com" e clica em "Verificar"
    Então o sistema deve exibir "Link suspeito"

  Cenário: Usuário submete um link seguro
    Dado que o usuário está autenticado
    Quando ele insere o link "https://www.google.com" e clica em "Verificar"
    Então o sistema deve exibir "Link seguro"

Funcionalidade: Consultar histórico de verificações

  Cenário: Usuário consulta o histórico
    Dado que o usuário já verificou os links "http://phishing.com" e "https://www.google.com"
    Quando ele acessa a página de histórico
    Então o sistema deve exibir ambos os links com seus respectivos status
