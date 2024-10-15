package com.miti99.test.listener;

import com.miti99.test.event.SimpleEvent;
import org.greenrobot.eventbus.Subscribe;


public class SimpleListener {

  @Subscribe
  public void onEvent(SimpleEvent event) {
    System.out.println("SimpleListener.onEvent");
  }
}
