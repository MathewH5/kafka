package br.com.mathew.comandos;

// ----------------------------------------
// Consumo de mensagens no Kafka (Consumer)
// ----------------------------------------

/*
 * Este arquivo contém os comandos para:
 * - Consumir mensagens de um tópico
 * - Ler desde o início ou apenas novas mensagens
 * - Usar grupos de consumidores
 */

// ----------------------------------------
// Consumir mensagens desde o início do tópico
// ----------------------------------------
// .\bin\windows\kafka-console-consumer.bat --topic LOJA_NOVOPEDIDO --bootstrap-server localhost:9092 --from-beginning

// Explicação:
// --topic LOJA_NOVOPEDIDO     => nome do tópico a ser lido
// --bootstrap-server          => endereço do broker Kafka
// --from-beginning            => (opcional) consome todas as mensagens desde o início da partição

// ----------------------------------------
// Consumir apenas novas mensagens (sem --from-beginning)
// ----------------------------------------
// .\bin\windows\kafka-console-consumer.bat --topic LOJA_NOVOPEDIDO --bootstrap-server localhost:9092

// Explicação:
// - Este comando só lerá as mensagens que forem publicadas a partir do momento que o consumer foi iniciado.

// ----------------------------------------
// Consumir mensagens com um grupo de consumidores
// ----------------------------------------
// .\bin\windows\kafka-console-consumer.bat --topic LOJA_NOVOPEDIDO --bootstrap-server localhost:9092 --group grupo1

// Explicação:
// --group grupo1               => cria (ou utiliza) um grupo de consumidores com esse nome
// - Grupos permitem distribuir o consumo de mensagens entre múltiplos consumidores

// ----------------------------------------
// Verificar o progresso de um grupo de consumidores
// ----------------------------------------
// .\bin\windows\kafka-consumer-groups.bat --bootstrap-server localhost:9092 --describe --group grupo1

// Explicação:
// - Mostra quais partições o grupo está consumindo, qual o offset atual e quanto falta ler
