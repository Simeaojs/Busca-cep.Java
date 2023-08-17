# Consulta de Endereço via CEP

Este projeto em Java permite realizar consultas de endereços a partir de um CEP usando a API do ViaCEP. Além disso, ele gera um arquivo JSON com as informações do endereço.

## Como Usar⚙️

Siga estas instruções para configurar e usar o projeto em sua máquina local.

### Pré-requisitos

Certifique-se de ter o seguinte instalado em sua máquina:

- Java Development Kit (JDK)
- Git (opcional, para clonar o repositório)

### Configuração

1. Clone este repositório para sua máquina local (ou baixe o código-fonte ZIP):

   ```
   git clone https://github.com/SEU_USUARIO/consulta-cep.git
   ```
   2.Abra o projeto em sua IDE Java favorita.
  
   3.Verifique se as bibliotecas Gson e HttpClient estão adicionadas ao projeto. Se não estiverem, você pode adicionar o JAR 
   do Gson e importar o HttpClient a partir do Java 11.

### Uso
1.Execute a classe `App.java` para iniciar o programa.

2.Digite o CEP para consultar o endereço correspondente.

3.Os detalhes do endereço serão exibidos no console e um arquivo JSON será gerado com o nome do CEP no formato   `CEP.json.`

## Melhorias Implementadas

+ Tratamento de erros mais específico e mensagens de erro aprimoradas.
+ Verificação de validade do CEP.
+ Utilização de blocos try-with-resources para gerenciamento de recursos.
+ Comentários explicativos para facilitar o entendimento do código.


## ⚠️Tratamento de Erros e Exceções 
### O projeto incorpora tratamentos de erros e exceções de várias maneiras:

### Validação do CEP

O CEP fornecido pelo usuário é validado para garantir que contenha exatamente 8 dígitos numéricos. Se o CEP for inválido, uma IllegalArgumentException será lançada com uma mensagem de erro adequada.
#
#### Tratamento de Erros na Consulta à API

O projeto verifica o código de status da resposta HTTP da API do ViaCEP. Se a resposta indicar um erro (código diferente de 200), uma RuntimeException é lançada com uma mensagem de erro que informa sobre o problema.
#
### Utilização de Exceções Verificadas

Em GeradorDeArquivo, o bloco try-with-resources é usado ao escrever no arquivo JSON, o que ajuda a garantir que o arquivo seja fechado corretamente, mesmo em caso de exceção.
#
### Tratamento Geral de Exceções

Na classe principal App, várias exceções são tratadas de maneira mais específica. IllegalArgumentException é capturada se o CEP for inválido, e IOException é capturada ao gerar o arquivo JSON. Em outras exceções, uma mensagem de erro geral é exibida.

  
## Contribuição
### Contribuições são bem-vindas! Se você quiser melhorar este projeto, siga estas etapas:

+ Fork este repositório.
+ Crie um branch para a sua feature  `(git checkout -b minha-nova-feature) `.
+ Faça as alterações desejadas e commit  `(git commit -m 'Adicionada minha nova feature') `.
+ Push para o branch  `(git push origin minha-nova-feature) `.
+ Abra um Pull Request.



### 🔑 Licença
 Este projeto é licenciado sob a Licença MIT - consulte o arquivo ***LICENSE*** para obter mais detalhes.
