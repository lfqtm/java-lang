package com.qlk.creational.simplefactory;

public class Test {
  public static void main(String[] args) {
    Video video = VideoFactory.getVideo(PythonVideo.class);
    video.produce();


//    VideoFactory fac = new VideoFactory();
//    Video vid = fac.getVideo("java");
//    vid.produce();

  }
}
