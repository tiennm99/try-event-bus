package com.miti99;

import com.miti99.test.event.GenericEvent;
import com.miti99.test.event.SimpleEvent;
import com.miti99.test.listener.AListener;
import com.miti99.test.listener.BListener;
import com.miti99.test.listener.SimpleListener;
import com.miti99.test.type.A;
import com.miti99.test.type.B;
import org.greenrobot.eventbus.EventBus;

public class Main {

  public static void main(String[] args) {
    EventBus.getDefault().register(new AListener());
    EventBus.getDefault().register(new BListener());
    EventBus.getDefault().register(new SimpleListener());


    GenericEvent<A> aEvent = new GenericEvent<>(new A());
    EventBus.getDefault().post(aEvent);
    System.out.println("fired aEvent");

    GenericEvent<B> bEvent = new GenericEvent<>(new B());
    EventBus.getDefault().post(bEvent);
    System.out.println("fired bEvent");

    SimpleEvent simpleEvent = new SimpleEvent();
    EventBus.getDefault().post(simpleEvent);
    System.out.println("fired simpleEvent");
  }
}
