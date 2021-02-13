/**
 * @author Luis Rivas
 * 2365948
 * lrivas@chapman.edu
 * CPSC 231-03
 * Programming Mastery Project 4 - Affiliates
 * The purpose of this abstract class is to contain variables that all affiliates have, compare two Affiliates to see who came to Chapman first, and print all it's info.
 * Note: It's an abstract class because you should never create an affiliate. Just prevents from having to repeat this code in every other class.
 * @version 1.0
 */
public abstract class Affiliates implements Comparable<Affiliates>, Printable {
  /** A String representing the name of the affiliate */
  private String m_name;
  /** An int representing the age of the affiliate */
  private int m_age;
  /** A String representing the address of the affiliate */
  private String m_address;
  /** A long representing the phone number of the affiliate */
  private long m_phoneNum;
  /** An int representing the year that the affiliate came to Chapman */
  private int m_yearCameToChapman;

  /** Default constructor initializing m_name, m_age, m_address, m_phoneNum, and m_yearCameToChapman with random values I chose. */
  public Affiliates() {
    m_name = "Affiliate";
    m_age = 18;
    m_address = "123 Chapman Road";
    m_phoneNum = 1234567890;
    m_yearCameToChapman = 2000;
  }

  /**
    * Overloaded constuctor initializing m_name to name, m_age to age, m_address to address, m_phoneNum to phoneNum, and m_yearCameToChapman to yearCameToChapman
    * @param name the name of the affiliate
    * @param age the age of the affiliate
    * @param address the address of the affiliate
    * @param phoneNum the phone number of the affiliate
    * @param yearCameToChapman the year the affiliate came to Chapman
    */
  public Affiliates(String name, int age, String address, long phoneNum, int yearCameToChapman) {
    m_name = name;
    m_age = age;
    m_address = address;
    m_phoneNum = phoneNum;
    m_yearCameToChapman = yearCameToChapman;
  }

  /**
    * Copy constuctor initializing all fields of this Affiliates to the fields of the passed in Affiliates
    * @param a the Affiliates to copy
    */
  public Affiliates(Affiliates a) {
    this.m_name = a.m_name;
    this.m_age = a.m_age;
    this.m_address = a.m_address;
    this.m_phoneNum = a.m_phoneNum;
    this.m_yearCameToChapman = a.m_yearCameToChapman;
  }

  /**
    * Mutator method to set m_name to name.
    * @param name the name of the affiliate
    */
  public void setName(String name) {
    m_name = name;
  }

  /**
    * Accessor method returning pizzaSize.
    * @return a String value m_name, the name of the affiliate
    */
  public String getName() {
    return m_name;
  }

  /**
    * Mutator method to set m_age to age.
    * @param age the age of the affiliate
    */
  public void setAge(int age) {
    m_age = age;
  }

  /**
    * Accessor method returning m_age.
    * @return an int value m_age, the age of the affiliate
    */
  public int getAge() {
    return m_age;
  }

  /**
    * Mutator method to set m_address to address.
    * @param address the address of the affiliate
    */
  public void setAddress(String address) {
    m_address = address;
  }

  /**
    * Accessor method returning m_address.
    * @return an int value m_address, the address of the affiliate
    */
  public String getAddress() {
    return m_address;
  }

  /**
    * Mutator method to set m_phoneNum to phoneNum.
    * @param phoneNum the phone number of the affiliate
    */
  public void setPhoneNum(long phoneNum) {
    m_phoneNum = phoneNum;
  }

  /**
    * Accessor method returning m_phoneNum.
    * @return a long value m_phoneNum, the phone number of the affiliate
    */
  public long getPhoneNum() {
    return m_phoneNum;
  }

  /**
    * Mutator method to set m_yearCameToChapman to yearCameToChapman.
    * @param yearCameToChapman the year the affiliate came to Chapman
    */
  public void setYearCameToChapman(int yearCameToChapman) {
    m_yearCameToChapman = yearCameToChapman;
  }

  /**
    * Accessor method returning m_yearCameToChapman.
    * @return an int value m_yearCameToChapman, the year the affiliate came to Chapman
    */
  public int getYearCameToChapman() {
    return m_yearCameToChapman;
  }

  /**
    * Compares the m_yearCameToChapman of two Affiliates.
    * @return an int value, 0 if both affiliates came to chapman the same year, 1 if the passed Affiliates came before this one, -1 otherwise.
    */
  public int compareTo(Affiliates a) {
    if(this.m_yearCameToChapman == a.m_yearCameToChapman){
      return 0;
    } else if (this.m_yearCameToChapman > a.m_yearCameToChapman) {
      return 1;
    } else {
      return -1;
    }
  }

  /**
    * Method printing all the information of this Affiliates
    */
  public void print() {
    System.out.print(m_name + "," + m_age + "," + m_address + "," + m_phoneNum + "," + m_yearCameToChapman);
  }
}
