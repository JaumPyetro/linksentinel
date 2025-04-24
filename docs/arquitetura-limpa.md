# Arquitetura Limpa

- **Apresentação:** Interface web (Vaadin ou Angular) para cadastro, login, verificação de links e histórico.
- **Aplicação:** Serviços de aplicação para orquestrar casos de uso (cadastro, login, verificação, histórico).
- **Domínio:** Entidades (Usuario, Link), agregados (Usuario, LinkVerification), regras de negócio, enums (LinkStatus), repositórios e serviços.
- **Infraestrutura:** Persistência (JPA), integração com bases externas de links maliciosos.
