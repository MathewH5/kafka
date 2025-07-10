package br.com.mathew.comandos;

/*
 * COMANDOS PARA INICIALIZAR O KAFKA LOCALMENTE (WINDOWS)
 *
 * Pré-requisitos:
 * - Kafka baixado e descompactado (ex: em C:\compactados\Kafka_2.13-3.5.0)
 * - Java instalado e configurado na máquina
 */


/*
 * 1. Navegar até a pasta do Kafka
 * (ajuste o caminho conforme sua instalação)
 */
// cd C:\compactados\kafka_2.13-3.5.0

/*
 * 2. Iniciar o Zookeeper (em um terminal separado)
 */
// .\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

/*
 * 3. Iniciar o Kafka Broker (em outro terminal separado)
 */
// .\bin\windows\kafka-server-start.bat .\config\server.properties

/*
 * 4. Encerrar forçadamente os processos Java (se necessário)
 * (Útil quando algum processo trava ou não encerra corretamente)
 */
// taskkill /f /im java.exe
