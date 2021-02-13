/**
 * @author Luis Rivas
 * 2365948
 * lrivas@chapman.edu
 * CPSC 231-03
 * Programming Mastery Project 4 - Staff
 * The purpose of this class is to create a Staff object, which is also an Affiliates and Staff, and print all it's info.
 * @version 1.0
 */
public class PartTime extends Staff {
  /** A double representing their hourly salary */
  private double m_hourlySalary;

  /** Default constructor initializing m_name, m_age, m_address, m_phoneNum, and m_yearCameToChapman, m_staffID, m_title, m_building, and hourlySalary with random values I chose. */
  public PartTime() {
    super();
    m_hourlySalary = 20.0;
  }

  /**
    * Overloaded constuctor initializing m_name to name, m_age to age, m_address to address, m_phoneNum to phoneNum, m_yearCameToChapman to yearCameToChapman,
    * m_staffID to staffID, m_title to title, m_building to building, and m_hourlySalary to hourlySalary.
    * @param name the name of the affiliate
    * @param age the age of the affiliate
    * @param address the address of the affiliate
    * @param phoneNum the phone number of the affiliate
    * @param yearCameToChapman the year the affiliate came to Chapman
    * @param staffID their staff ID
    * @param title their title
    * @param building their building
    * @param hourlySalary their hourly salary
    */
  public PartTime(String name, int age, String address, long phoneNum, int yearCameToChapman, long staffID, String title, String building, double hourlySalary) {
    super(name, age, address, phoneNum, yearCameToChapman, staffID, title, building);
    m_hourlySalary = hourlySalary;
  }

  /**
    * Copy constuctor initializing all fields of this PartTime to the fields of the passed in PartTime
    * @param pt the PartTime to copy
    */
  public PartTime(PartTime pt) {
    super(pt);
    this.m_hourlySalary = pt.m_hourlySalary;
  }

  /**
    * Mutator method to set m_hourlySalary to hourlySalary.
    * @param hourlySalary their hourly salary
    */
  public void setHourlySalary(double hourlySalary) {
    m_hourlySalary = hourlySalary;
  }

  /**
    * Accessor method returning m_hourlySalary.
    * @return a double value m_hourlySalary, their hourly salary
    */
  public double getHourlySalary() {
    return m_hourlySalary;
  }

  /**
    * Method printing all the information of this PartTime
    */
  public void print() {
    super.print();
    System.out.println("," + m_hourlySalary);
  }
}
