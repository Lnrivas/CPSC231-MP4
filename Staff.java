/**
 * @author Luis Rivas
 * 2365948
 * lrivas@chapman.edu
 * CPSC 231-03
 * Programming Mastery Project 4 - Staff
 * The purpose of this abstract class is to contain variables that all Staff have and print all it's info.
 * Note: It's an abstract class because you should never create a Staff. Just prevents from having to repeat this code in every other class.
 * @version 1.0
 */
public abstract class Staff extends Affiliates {
  /** A long representing their staff ID */
  private long m_staffID;
  /** A String representing their title */
  private String m_title;
  /** A String representing their building */
  private String m_building;

  /** Default constructor initializing m_name, m_age, m_address, m_phoneNum, and m_yearCameToChapman, m_staffID, m_title, and m_building with random values I chose. */
  public Staff() {
    super();
    m_staffID = 0;
    m_title = "Dean";
    m_building = "Fowler";
  }

  /**
    * Overloaded constuctor initializing m_name to name, m_age to age, m_address to address, m_phoneNum to phoneNum, m_yearCameToChapman to yearCameToChapman,
    * m_staffID to staffID, m_title to title, and m_building to building.
    * @param name the name of the affiliate
    * @param age the age of the affiliate
    * @param address the address of the affiliate
    * @param phoneNum the phone number of the affiliate
    * @param yearCameToChapman the year the affiliate came to Chapman
    * @param staffID their staff ID
    * @param title their title
    * @param building their building
    */
  public Staff(String name, int age, String address, long phoneNum, int yearCameToChapman, long staffID, String title, String building) {
    super(name, age, address, phoneNum, yearCameToChapman);
    m_staffID = staffID;
    m_title = title;
    m_building = building;
  }

  /**
    * Copy constuctor initializing all fields of this Staff to the fields of the passed in Staff
    * @param s the Staff to copy
    */
  public Staff(Staff s) {
    super(s);
    this.m_staffID = s.m_staffID;
    this.m_title = s.m_title;
    this.m_building = s.m_building;
  }

  /**
    * Mutator method to set m_staffID to staffID.
    * @param staffID their staff ID
    */
  public void setStaffID(long staffID) {
    m_staffID = staffID;
  }

  /**
    * Accessor method returning m_staffID.
    * @return a long value m_staffID, their staff ID
    */
  public long getStaffID() {
    return m_staffID;
  }

  /**
    * Mutator method to set m_title to title.
    * @param title their title
    */
  public void setTitle(String title) {
    m_title = title;
  }

  /**
    * Accessor method returning m_title.
    * @return a String value m_title, their title
    */
  public String getTitle() {
    return m_title;
  }

  /**
    * Mutator method to set m_building to building.
    * @param building their building
    */
  public void setBuilding(String building) {
    m_building = building;
  }

  /**
    * Accessor method returning m_building.
    * @return a String value m_building, their building
    */
  public String getBuilding() {
    return m_building;
  }

  /**
    * Method printing all the information of this Staff
    */
  public void print() {
    super.print();
    System.out.print("," + m_staffID + "," + m_title + "," + m_building);
  }
}
