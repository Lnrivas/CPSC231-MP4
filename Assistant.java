/**
 * @author Luis Rivas
 * 2365948
 * lrivas@chapman.edu
 * CPSC 231-03
 * Programming Mastery Project 4 - Assistant
 * The purpose of this class is to make an Assistant object, which is also a Faculty and Affiliates.
 * @version 1.0
 */
public class Assistant extends Faculty {
  /** An int representing the years left until they get tenure */
  private int m_yearsUntilTenure;

  /** Default constructor initializing m_name, m_age, m_address, m_phoneNum, and m_yearCameToChapman, m_facultyID, m_department, m_yearlySalary, m_numOfPapers,
   *  and m_yearsUntilTenure with random values I chose.
   */
  public Assistant() {
    super();
    m_yearsUntilTenure = 1;
  }

  /**
    * Overloaded constuctor initializing m_name to name, m_age to age, m_address to address, m_phoneNum to phoneNum, m_yearCameToChapman to yearCameToChapman,
    * m_facultyID to facultyID, m_department to department, m_yearlySalary to yearlySalary, m_numOfPapers to numOfPapers, and m_yearsUntilTenure to yearsUntilTenure.
    * @param name the name of the affiliate
    * @param age the age of the affiliate
    * @param address the address of the affiliate
    * @param phoneNum the phone number of the affiliate
    * @param yearCameToChapman the year the affiliate came to Chapman
    * @param facultyID their faculty ID
    * @param department the department they work in
    * @param yearlySalary their yearly salary
    * @param numOfPapers the number of papers they have
    * @param yearsUntilTenure the years left until they get tenure
    */
  public Assistant(String name, int age, String address, long phoneNum, int yearCameToChapman, long facultyID, String department, int yearlySalary, int numOfPapers, int yearsUntilTenure) {
    super(name, age, address, phoneNum, yearCameToChapman, facultyID, department, yearlySalary, numOfPapers);
    m_yearsUntilTenure = yearsUntilTenure;
  }

  /**
    * Copy constuctor initializing all fields of this Assistant to the fields of the passed in Assistant
    * @param a the Assistant to copy
    */
  public Assistant(Assistant a) {
    super(a);
    this.m_yearsUntilTenure = a.m_yearsUntilTenure;
  }

  /**
    * Mutator method to set m_yearsUntilTenure to yearsUntilTenure.
    * @param yearsUntilTenure the years until they get tenure
    */
  public void setYearsUntilTenure(int yearsUntilTenure) {
    m_yearsUntilTenure = yearsUntilTenure;
  }

  /**
    * Accessor method returning m_yearsUntilTenure.
    * @return an int value m_yearsUntilTenure, the years left until they get tenure
    */
  public int getYearsUntilTenure() {
    return m_yearsUntilTenure;
  }

  /**
    * Method printing all the information of this Assistant
    */
  public void print() {
    super.print();
    System.out.println("," + m_yearsUntilTenure);
  }
}
