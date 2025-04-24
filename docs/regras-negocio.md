# Regras de Negócio para Verificação de Links Suspeitos

O LinkSentinel utiliza um conjunto de regras de negócio para classificar se um link é **seguro** ou **suspeito**. Essas regras são aplicadas sempre que um usuário submete um link para análise.

## Critérios Utilizados

1. **Presença de Palavras-Chave Suspeitas**
   - O sistema verifica se a URL contém termos comuns em golpes, como: `login`, `senha`, `premio`, `grátis`, `promoção`, `banco`, `atualização`, etc.
   - Se encontrar, o link é classificado como **suspeito**.

2. **Domínios Pouco Confiáveis**
   - Links com domínios pouco conhecidos, recém-criados ou com terminações incomuns (ex: `.xyz`, `.top`, `.ru`) são considerados **suspeitos**.

3. **Uso de Encurtadores de URL**
   - URLs encurtadas (ex: `bit.ly`, `tinyurl.com`) são marcadas como **suspeitas**, pois são frequentemente usadas para mascarar o destino real.

4. **Presença em Listas de Blacklist**
   - O sistema pode consultar bases públicas de links maliciosos (blacklists). Se o link estiver listado, é classificado como **suspeito**.

5. **Links HTTPS**
   - Links que não utilizam HTTPS (ou seja, começam com `http://` em vez de `https://`) recebem um alerta, pois podem ser menos seguros.

6. **Quantidade de Subdomínios ou Caracteres Estranhos**
   - Links com muitos subdomínios, caracteres aleatórios ou repetição de letras (ex: `login-banco-seguro-123.xyz`) são considerados **suspeitos**.

## Exemplo de Classificação

- `https://www.google.com` → **Seguro**
- `http://phishing-premio.xyz` → **Suspeito**
- `https://bit.ly/abc123` → **Suspeito**
- `https://banco-atualizacao.ru` → **Suspeito**

## Observação

Essas regras podem ser expandidas ou ajustadas conforme o sistema evoluir, incluindo integração com APIs de segurança e machine learning para detecção de ameaças mais avançadas.
