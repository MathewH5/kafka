package br.com.mathew.ecommerces;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

import java.util.Properties;
import java.util.concurrent.ExecutionException;

public class NewOrderMain {

//O Producer é o cara que envia mensagens para um tópico.

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // <tipo chave, tipo mensagem>
        var producer = new KafkaProducer<String, String>(properties());
        var value = "12, 22, 500";
        var record = new ProducerRecord<>("ECOMMERCE_NEW_ORDER", value, value);

        producer.send(record, (data,ex) -> {
            if (ex != null) {
                ex.printStackTrace();
                return;
            }
            System.out.println("sucesso enviando " + data.topic() + ":::parrtiton" + data.partition() + "/ offset" + data.offset() + "/ timestemp" + data.timestamp());
        }).get();
    }

    private static Properties properties(){
        var properties = new Properties();
        properties.setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");
        properties.setProperty(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        properties.setProperty(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        return properties;
    }

}
