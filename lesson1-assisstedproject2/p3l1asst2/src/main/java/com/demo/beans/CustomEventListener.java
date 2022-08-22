package com.demo.beans;

import org.springframework.context.ApplicationListener;

import com.demo.beans.CustomEvent;

public class CustomEventListener implements ApplicationListener<CustomEvent> {
        
   public void onApplicationEvent(CustomEvent event) {
      System.out.println(event.toString());
   }
}
