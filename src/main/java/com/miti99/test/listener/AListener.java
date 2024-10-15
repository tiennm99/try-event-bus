package com.miti99.test.listener;

import com.miti99.test.event.GenericEvent;
import com.miti99.test.type.A;
import org.greenrobot.eventbus.Subscribe;

public class AListener {

  @Subscribe
  public void onEvent(GenericEvent<A> event) {
    System.out.println("AListener.onEvent: " + event.data().getClass());
  }
}
