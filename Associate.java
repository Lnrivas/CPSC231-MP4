/**
 * @author Luis Rivas
 * 2365948
 * lrivas@chapman.edu
 * CPSC 231-03
 * Programming Mastery Project 4 - Associate
 * The purpose of this class is to make an Associate object, which is also a Faculty and Affiliates, and print it's info.
 * @version 1.0
 */
public class Associate extends Faculty {
  /** An int representing the years since they get tenure */
  private int m_yearsSinceTenure;

  /** Default constructor initializing m_name, m_age, m_address, m_phoneNum, and m_yearCameToChapman, m_facultyID, m_department, m_yearlySalary, m_numOfPapers,
   *  and m_yearsSinceTenure with random values I chose.
   */
  public Associate() {
    super();
    m_yearsSinceTenure = 0;
  }

  /**
    * Overloaded constuctor initializing m_name to name, m_age to age, m_address to address, m_phoneNum to phoneNum, m_yearCameToChapman to yearCameToChapman,
    * m_facultyID to facultyID, m_department to department, m_yearlySalary to yearlySalary, m_numOfPapers to numOfPapers, and m_yearsSinceTenure to yearsSinceTenure.
    * @param name the name of the affiliate
    * @param age the age of the affiliate
    * @param address the address of the affiliate
    * @param phoneNum the phone number of the affiliate
    * @param yearCameToChapman the year the affiliate came to Chapman
    * @param facultyID their faculty ID
    * @param department the department they work in
    * @param yearlySalary their yearly salary
    * @param numOfPapers the number of papers they have
    * @param yearsSinceTenure the years since they get tenure
    */
  public Associate(String name, int age, String address, long phoneNum, int yearCameToChapman, long facultyID, String department, int yearlySalary, int numOfPapers, int yearsSinceTenure) {
    super(name, age, address, phoneNum, yearCameToChapman, facultyID, department, yearlySalary, numOfPapers);
    m_yearsSinceTenure = yearsSinceTenure;
  }

  /**
    * Copy constuctor initializing all fields of this Associate to the fields of the passed in Associate
    * @param a the Associate to copy
    */
  public Associate(Associate a) {
    super(a);
    this.m_yearsSinceTenure = a.m_yearsSinceTenure;
  }

  /**
    * Mutator method to set m_yearsSinceTenure to yearsSinceTenure.
    * @param yearsSinceTenure the years since they get tenure
    */
  public void setYearsSinceTenure(int yearsSinceTenure) {
    m_yearsSinceTenure = yearsSinceTenure;
  }

  /**
    * Accessor method returning m_yearsSinceTenure.
    * @return an int value m_yearsSinceTenure, the years since they get tenure
    */
  public int getYearsSinceTenure() {
    return m_yearsSinceTenure;
  }

  /**
    * Method printing all the information of this Associate
    */
  public void print() {
    super.print();
    System.out.println("," + m_yearsSinceTenure);
  }
}
