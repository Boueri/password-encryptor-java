🔐 Password Encryptor

Projeto simples em Java para criptografia de senhas utilizando algoritmo de hash seguro.
O objetivo é demonstrar conceitos básicos de segurança da informação e manipulação de dados sensíveis.




🚀 Funcionalidades
Criptografar senhas usando SHA-256

Gerar hash seguro a partir de texto puro

Comparar senha informada com hash gerado

Estrutura simples e fácil de entender

Base para evolução para sistemas de autenticação



🛠️ Tecnologias utilizadas

☕ Java
🔐 MessageDigest (SHA-256)

📦 Java Standard Library



⚙️ Como funciona

O sistema recebe uma senha em texto simples e a transforma em um hash criptografado.
Esse hash não pode ser revertido, garantindo mais segurança no armazenamento de senhas.


📌 Exemplo de uso
String senha = "minhaSenha123";
String hash = PasswordEncryptor.gerarHash(senha);

System.out.println("Hash gerado: " + hash);
📁 Estrutura do projeto
password-encryptor/
src/main/java/com/boueri/passwordencryptor/PasswordEncryptor.java
src/main/resources/
src/test/java/
pom.xml
README.md

🔐 Algoritmo utilizado

SHA-256 (Secure Hash Algorithm 256 bits)


👨‍💻 Autor

Bou — Desenvolvedor em formação focado em Backend Java e APIs.
