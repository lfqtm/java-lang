package com.qlk.creational.singleton;

import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

class SingleObjectTest {

  @Test
  void getInstance() {
    SingleObject ins1 = SingleObject.getInstance();
    SingleObject ins2 = SingleObject.getInstance();

    assertEquals(ins1, ins2);


  }

  @Test
  //反序列化攻击
  void deSerializableAttack() {

    try {
      DCLSingleton singleton = DCLSingleton.getSingleton();
      try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("object"));
           ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("object"))) {

        //将对象持久化到磁盘中
        outputStream.writeObject(singleton);
        outputStream.flush();

        //从磁盘中反序列化成对象
        DCLSingleton singleton1 = (DCLSingleton) inputStream.readObject();

        if (singleton == singleton1) {
          System.out.println("是同一个对象");
        } else {
          System.out.println("是两个不同的对象");
        }

      } catch (IOException | ClassNotFoundException e) {
        e.printStackTrace();
      }
    } catch (RuntimeException e) {
      e.printStackTrace();
    }


  }
}