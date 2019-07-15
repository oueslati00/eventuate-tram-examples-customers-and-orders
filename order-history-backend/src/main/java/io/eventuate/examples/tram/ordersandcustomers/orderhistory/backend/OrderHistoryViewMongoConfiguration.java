package io.eventuate.examples.tram.ordersandcustomers.orderhistory.backend;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.retry.annotation.EnableRetry;

@Configuration
@EnableMongoRepositories
@EnableRetry
public class OrderHistoryViewMongoConfiguration {

  @Bean
  public OrderHistoryViewService orderHistoryViewService(CustomerViewRepository customerViewRepository, OrderViewRepository orderViewRepository, MongoTemplate mongoTemplate) {
    return new OrderHistoryViewService(customerViewRepository, orderViewRepository, mongoTemplate);
  }
}
