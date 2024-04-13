

interface HasOpeningHours {
  public String getHours();
}

enum Seasons implements HasOpeningHours {
  WINTER {
    public String getHours() {
      return "10-3";
    }
  },
  SUMMER {
    public String getHours() {
      return "9-5";
    }
  },
  RAINY {
    public String getHours() {
      return "12-6";
    }
  },
  SPRING,
  FALL;
  public String getHours() {return "9-5";}
}

public class EnumsEnhanced {
  public static void main(String[] args) {
    System.out.println(Seasons.WINTER.ordinal());
  }
}
