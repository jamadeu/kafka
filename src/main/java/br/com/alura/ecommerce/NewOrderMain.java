package br.com.alura.ecommerce;

import java.util.UUID;
import java.util.concurrent.ExecutionException;

public class NewOrderMain {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        try (KafkaDispatcher dispatcher = new KafkaDispatcher()) {
            String key = UUID.randomUUID().toString();
            String value = "123,321,0980";
            dispatcher.send("ECOMMERCE_NEW_ORDER", key, value);

            String email = "Email";
            dispatcher.send("ECOMMERCE_NEW_ORDER", key, email);
        }
    }
}
