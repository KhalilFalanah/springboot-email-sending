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
```

### Passos para Configuração

1. **Defina o Servidor SMTP:**
    - `spring.mail.host`: Endereço do servidor SMTP (ex: `smtp.gmail.com`).

2. **Defina a Porta do Servidor SMTP:**
    - `spring.mail.port`: Porta do servidor SMTP (ex: `587`).

3. **Credenciais de Email:**
    - `spring.mail.username`: Seu email (ex: `yourmail@gmail.com`).
    - `spring.mail.password`: Sua senha de aplicativo gerada.

4. **Propriedades SMTP:**
    - `spring.mail.properties.mail.smtp.auth`: Habilita autenticação SMTP (defina como `true`).
    - `spring.mail.properties.mail.smtp.starttls.enable`: Habilita STARTTLS (defina como `true`).

## Instruções de Uso

1. **Clone o Repositório:**
    ```sh
    git clone <URL do seu repositório>
    ```

2. **Navegue até o Diretório do Projeto:**
    ```sh
    cd email-sending-spring-boot
    ```

3. **Edite o arquivo `application.properties`:**
    - Abra o arquivo `src/main/resources/application.properties`.
    - Substitua os valores de exemplo com suas próprias configurações de email.

4. **Compile e Execute o Projeto:**
    ```sh
    mvn spring-boot:run
    ```

5. **Enviar Email e Baixar Arquivo:**
    - Utilize as funcionalidades expostas pelas APIs ou pela interface do usuário (se implementada) para enviar emails e baixar arquivos.

## Requisitos

- Java 17 ou superior
- Maven 3.6 ou superior

## Dependências

- Spring Boot Starter Mail
- Outras dependências necessárias (verifique o arquivo `pom.xml`)

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues e enviar pull requests.

## Licença

Este projeto é licenciado sob os termos da [MIT License](LICENSE).

