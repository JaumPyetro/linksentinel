Funcionalidade: Verificar se um link é suspeito

  Cenário: Usuário submete um link suspeito
    Dado que o usuário está na página de verificação de links
    Quando ele insere o link "http://phishing.com" e clica em "Verificar"
    Então o sistema deve exibir "Link suspeito"

  Cenário: Usuário submete um link seguro
    Dado que o usuário está na página de verificação de links
    Quando ele insere o link "https://www.google.com" e clica em "Verificar"
    Então o sistema deve exibir "Link seguro"

Funcionalidade: Consultar histórico de verificações

  Cenário: Usuário consulta o histórico
    Dado que o usuário já verificou os links "http://phishing.com" e "https://www.google.com"
    Quando ele acessa a página de histórico
    Então o sistema deve exibir ambos os links com seus respectivos status
