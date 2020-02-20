package com.google.zashcode;

public class Utils {

  /*public static Integer getResults(String name, Slideshow slideshow) {
    List<Slide> slides = slideshow.getSlides();

    Integer size = slides.size() - 1;
    Slide first, second;

    Integer points = 0;

    for (int i = 0; i < size; i++) {
      first = slides.get(i);
      second = slides.get(i + 1);

      points = points + getResult(first, second);
    }

    System.out.println(name + " - Points: " + points);

    return points;
  }

  public static Integer getResult(Slide first, Slide second) {

    Integer intersection = intersection(first, second);

    Integer difference1 = difference(first, second);

    Integer difference2 = difference(second, first);

    return Math.min(Math.min(intersection, difference1), difference2);
  }

  public static Integer getResultOptimized(Slide first, Slide second) {

    Integer intersection = intersection(first, second);
    if (intersection < 1) {
      return intersection;
    }

    Integer difference1 = difference(first, second);
    if (difference1 < 1) {
      return difference1;
    }

    Integer difference2 = difference(second, first);

    return Math.min(Math.min(intersection, difference1), difference2);
  }

  private static Integer intersection(Slide first, Slide second) {
    Integer points = 0;

    for (String tag : first.getTags()) {
      points = second.getTags().contains(tag) ? points + 1 : points;
    }

    return points;
  }

  private static Integer difference(Slide first, Slide second) {
    Integer points = 0;

    for (String tag : first.getTags()) {
      points = second.getTags().contains(tag) ? points : points + 1;
    }

    return points;
  }
*/
}
