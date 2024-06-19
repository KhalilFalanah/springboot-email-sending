# Email Sending Project - Spring Boot

Este é um projeto Spring Boot para o envio automático de mensagens de email. Além de enviar emails, o projeto permite que o usuário baixe um arquivo selecionado através de um link definido no código.

## Funcionalidades

1. **Envio Automático de Emails**
    - Envia uma mensagem de email para um destinatário especificado.
    - Suporta configuração personalizada de servidor de email.

2. **Download de Arquivos**
    - Permite que o usuário baixe um arquivo selecionado através de um link especificado no código.

## Configuração

Para configurar o projeto, edite o arquivo `application.properties` com suas credenciais de email e detalhes do servidor SMTP.

### Exemplo de Configuração (`application.properties`)

```properties
# Configurações de email
spring.mail.host=smtp.gmail.com
spring.mail.port=587
spring.mail.username=yourmail@gmail.com
spring.mail.password=your app password

# Propriedades adicionais
spring.mail.properties.mail.smtp.auth=true
spring.mail.properties.mail.smtp.starttls.enable=true
