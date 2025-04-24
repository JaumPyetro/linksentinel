# DDD - Níveis

## Preliminar
- Domínio: Segurança digital, verificação de links e gerenciamento de usuários

## Estratégico
- Subdomínios: Cadastro e autenticação de usuário, Verificação de link, Histórico de verificações

## Tático
- Agregados: Usuario, LinkVerification
- Entidades: Usuario, Link
- Serviços: UsuarioService, LinkVerificationService
- Repositórios: UsuarioRepository, LinkRepository
- Enum: LinkStatus

## Operacional
- Casos de uso: Cadastrar usuário, Autenticar usuário, Verificar link, Consultar histórico
