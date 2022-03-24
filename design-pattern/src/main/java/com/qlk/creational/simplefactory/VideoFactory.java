package com.qlk.creational.simplefactory;

public class VideoFactory {

    public static Video getVideo(Class<? extends Video> type) {
      Video video = null;
      try {
        video = (Video) Class.forName(type.getName()).newInstance();
      } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
        e.printStackTrace();
      }

      return video;
    }

//  public Video getVideo(String type) {
//    if ("java".equalsIgnoreCase(type))
//      return new JavaVideo();
//    if ("python".equalsIgnoreCase(type))
//      return new PythonVideo();
//
//    return null;
//  }

}
