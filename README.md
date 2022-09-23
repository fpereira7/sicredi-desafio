# sicredi-desafio
Projeto desenvolvido para o desafio Sicredi - Backend Java

## Configuração
Java 11
Springboot 2.7.3
OpenCSV

## Execução do Jar
1. Abrir o cmd na pasta raiz do projeto.
2. Na pasta raiz do projeto, tem um arquivo sicredi.csv. Este arquivo será utilizado na etapa 5.
3. Executar o comando -> mvn clean install
4. Acessar o diretorio /target que foi gerado no passo anterior, aqui será gerado o arquivo .jar.
5. Pegar o arquivo sicredi.csv e copiar para pasta target.
6. Executar o seguinte comando para processar o arquivo: 
    java -jar sicredi-desafio-0.0.1-SNAPSHOT.jar sicredi.csv
    
7. Será criado um log de retorno do serviço fake informando as etapas de processamento dos dados e um novo arquivo será gerado na mesma pasta onde o arquivo jar foi executado.   
    



