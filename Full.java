/**
 * @author Luis Rivas
 * 2365948
 * lrivas@chapman.edu
 * CPSC 231-03
 * Programming Mastery Project 4 - Full
 * The purpose of this class is to make an Full object, which is also a Faculty and Affiliates, and print it's info.
 * @version 1.0
 */
public class Full extends Faculty {
  /** An int representing the years left until they retire */
  private int m_yearsUntilRetirement;

  /** Default constructor initializing m_name, m_age, m_address, m_phoneNum, and m_yearCameToChapman, m_facultyID, m_department, m_yearlySalary, m_numOfPapers,
   *  and m_yearsUntilRetirement with random values I chose.
   */
  public Full() {
    super();
    m_yearsUntilRetirement = 1;
  }

  /**
    * Overloaded constuctor initializing m_name to name, m_age to age, m_address to address, m_phoneNum to phoneNum, m_yearCameToChapman to yearCameToChapman,
    * m_facultyID to facultyID, m_department to department, m_yearlySalary to yearlySalary, m_numOfPapers to numOfPapers, and m_yearsUntilRetirement to yearsUntilRetirement.
    * @param name the name of the affiliate
    * @param age the age of the affiliate
    * @param address the address of the affiliate
    * @param phoneNum the phone number of the affiliate
    * @param yearCameToChapman the year the affiliate came to Chapman
    * @param facultyID their faculty ID
    * @param department the department they work in
    * @param yearlySalary their yearly salary
    * @param numOfPapers the number of papers they have
    * @param yearsUntilRetirement the years until they retire
    */
  public Full(String name, int age, String address, long phoneNum, int yearCameToChapman, long facultyID, String department, int yearlySalary, int numOfPapers, int yearsUntilRetirement) {
    super(name, age, address, phoneNum, yearCameToChapman, facultyID, department, yearlySalary, numOfPapers);
    m_yearsUntilRetirement = yearsUntilRetirement;
  }

  /**
    * Copy constuctor initializing all fields of this Full to the fields of the passed in Full
    * @param f the Full to copy
    */
  public Full(Full f) {
    super(f);
    this.m_yearsUntilRetirement = f.m_yearsUntilRetirement;
  }

  /**
    * Mutator method to set m_yearsUntilRetirement to yearsUntilRetirement.
    * @param yearsUntilRetirement the years until they retire
    */
  public void setYearsUntilRetirement(int yearsUntilRetirement) {
    m_yearsUntilRetirement = yearsUntilRetirement;
  }

  /**
    * Accessor method returning m_yearsUntilRetirement.
    * @return an int value m_yearsUntilRetirement, the years until they retire
    */
  public int getYearsUntilRetirement() {
    return m_yearsUntilRetirement;
  }

  /**
    * Method printing all the information of this Full
    */
  public void print() {
    super.print();
    System.out.println("," + m_yearsUntilRetirement);
  }
}
