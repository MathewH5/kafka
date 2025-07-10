package br.com.mathew.comandos;

// ----------------------------------------
// Gerenciamento de Tópicos Kafka
// ----------------------------------------

/*
 * Comandos para:
 * - Criar tópicos
 * - Listar tópicos existentes
 * - Ver detalhes de um tópico
 * - Deletar tópicos (se permitido)
 */

// ----------------------------------------
// Criar um novo tópico
// ----------------------------------------
// .\bin\windows\kafka-topics.bat --create --topic LOJA_NOVOPEDIDO --bootstrap-server localhost:9092 --partitions 1 --replication-factor 1

// Explicação:
// --create                  => cria o tópico
// --topic LOJA_NOVOPEDIDO   => nome do tópico
// --bootstrap-server        => endereço do broker (localhost:9092)
// --partitions 1            => quantidade de partições (controle de paralelismo)
// --replication-factor 1    => fator de replicação (só 1 broker local, então tem que ser 1)

// ----------------------------------------
// Listar todos os tópicos existentes
// ----------------------------------------
// .\bin\windows\kafka-topics.bat --list --bootstrap-server localhost:9092

// ----------------------------------------
// Ver detalhes de um tópico específico
// ----------------------------------------
// .\bin\windows\kafka-topics.bat --describe --topic LOJA_NOVOPEDIDO --bootstrap-server localhost:9092

// ----------------------------------------
// Deletar um tópico (se permitido no server.properties)
// ----------------------------------------
// .\bin\windows\kafka-topics.bat --delete --topic LOJA_NOVOPEDIDO --bootstrap-server localhost:9092

// OBS: só funciona se delete.topic.enable=true no config/server.properties
