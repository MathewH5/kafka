package br.com.mathew.comandos;

// ----------------------------------------
// Produção de mensagens no Kafka (Producer)
// ----------------------------------------

/*
 * Este arquivo contém os comandos para:
 * - Produzir (enviar) mensagens para um tópico Kafka
 * - Testar o funcionamento do cluster Kafka
 */

// ----------------------------------------
// Produzir mensagens para um tópico
// ----------------------------------------
// .\bin\windows\kafka-console-producer.bat --topic LOJA_NOVOPEDIDO --bootstrap-server localhost:9092

// Explicação:
// --topic LOJA_NOVOPEDIDO     => nome do tópico para onde as mensagens serão enviadas
// --bootstrap-server          => endereço do broker

// Após rodar esse comando:
// ✅ Digite mensagens diretamente no terminal e pressione Enter para enviá-las.
// ✅ Cada mensagem será entregue ao Kafka e poderá ser consumida por um consumer.

// Exemplo de mensagens para testar:
// {"id":1,"produto":"camisa","valor":49.90}
// {"id":2,"produto":"notebook","valor":3490.00}

// ----------------------------------------
// Enviar mensagens com chave (opcional)
// ----------------------------------------
// .\bin\windows\kafka-console-producer.bat --topic LOJA_NOVOPEDIDO --bootstrap-server localhost:9092 --property "parse.key=true" --property "key.separator=:"

// Exemplo de uso no terminal após iniciar:
// chave1:{"mensagem":"valor1"}
// cliente123:{"pedido":56}
