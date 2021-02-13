/**
 * @author Luis Rivas
 * 2365948
 * lrivas@chapman.edu
 * CPSC 231-03
 * Programming Mastery Project 4 - FullTime
 * The purpose of this class is to create a FullTime object, which is also an Affiliates and Staff, and print all it's info.
 * @version 1.0
 */
public class FullTime extends Staff {
  /** A double representing their yearly salary */
  private double m_yearlySalary;

  /** Default constructor initializing m_name, m_age, m_address, m_phoneNum, and m_yearCameToChapman, m_staffID, m_title, m_building, and yearlySalary with random values I chose. */
  public FullTime() {
    super();
    m_yearlySalary = 100000;
  }

  /**
    * Overloaded constuctor initializing m_name to name, m_age to age, m_address to address, m_phoneNum to phoneNum, m_yearCameToChapman to yearCameToChapman,
    * m_staffID to staffID, m_title to title, m_building to building, and m_yearlySalary to yearlySalary.
    * @param name the name of the affiliate
    * @param age the age of the affiliate
    * @param address the address of the affiliate
    * @param phoneNum the phone number of the affiliate
    * @param yearCameToChapman the year the affiliate came to Chapman
    * @param staffID their staff ID
    * @param title their title
    * @param building their building
    * @param yearlySalary their yearly salary
    */
  public FullTime(String name, int age, String address, long phoneNum, int yearCameToChapman, long staffID, String title, String building, double yearlySalary) {
    super(name, age, address, phoneNum, yearCameToChapman, staffID, title, building);
    m_yearlySalary = yearlySalary;
  }

  /**
    * Copy constuctor initializing all fields of this FullTime to the fields of the passed in FullTime
    * @param ft the FullTime to copy
    */
  public FullTime(FullTime ft) {
    super(ft);
    this.m_yearlySalary = ft.m_yearlySalary;
  }

  /**
    * Mutator method to set m_yearlySalary to yearlySalary.
    * @param yearlySalary their yearly salary
    */
  public void setYearlySalary(double yearlySalary) {
    m_yearlySalary = yearlySalary;
  }

  /**
    * Accessor method returning m_yearlySalary.
    * @return a double value m_yearlySalary, their yearly salary
    */
  public double getYearlySalary() {
    return m_yearlySalary;
  }

  /**
    * Method printing all the information of this FullTime
    */
  public void print() {
    super.print();
    System.out.println("," + m_yearlySalary);
  }
}
