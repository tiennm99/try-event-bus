package com.miti99.test.listener;

import com.miti99.test.event.GenericEvent;
import com.miti99.test.type.B;
import org.greenrobot.eventbus.Subscribe;


public class BListener {

  @Subscribe
  public void onEvent(GenericEvent<B> event) {
    System.out.println("BListener.onEvent: " + event.data().getClass());
  }
}
