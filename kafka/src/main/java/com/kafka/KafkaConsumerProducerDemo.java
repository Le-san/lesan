package com.kafka;

import org.junit.Test;

/** 
 * @author leicui bourne_cui@163.com 
 */  
public class KafkaConsumerProducerDemo  
{  
    public static void main(String[] args)  
    {  
        KafkaProducer producerThread = new KafkaProducer(KafkaProperties.topic);  
        producerThread.start();  
  
        
    }  
    
    @Test
    public void cc(){
    	KafkaProducer producerThread = new KafkaProducer(KafkaProperties.topic);  
        producerThread.aa();
    }
    
    @Test
    public void dd(){
    	 KafkaConsumer consumerThread = new KafkaConsumer(KafkaProperties.topic);  
         consumerThread.aa();  
    }
    
    
}