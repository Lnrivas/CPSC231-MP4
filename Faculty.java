/**
 * @author Luis Rivas
 * 2365948
 * lrivas@chapman.edu
 * CPSC 231-03
 * Programming Mastery Project 4 - Faculty
 * The purpose of this abstract class is to contain variables that all Faculty have and print all it's info.
 * Note: It's an abstract class because you should never create a Faculty. Just prevents from having to repeat this code in every other class.
 * @version 1.0
 */
public abstract class Faculty extends Affiliates {
  /** A long representing their facultyID */
  private long m_facultyID;
  /** A String representing the department they work in */
  private String m_department;
  /** An int representing their yearly salary */
  private int m_yearlySalary;
  /** An int representing the number of papers they have */
  private int m_numOfPapers;

  /** Default constructor initializing m_name, m_age, m_address, m_phoneNum, and m_yearCameToChapman, m_facultyID, m_department, m_yearlySalary, and m_numOfPapers with random values I chose. */
  public Faculty() {
    super();
    m_facultyID = 0;
    m_department = "Math";
    m_yearlySalary = 100000;
    m_numOfPapers = 0;
  }

  /**
    * Overloaded constuctor initializing m_name to name, m_age to age, m_address to address, m_phoneNum to phoneNum, m_yearCameToChapman to yearCameToChapman,
    * m_facultyID to facultyID, m_department to department, m_yearlySalary to yearlySalary, and m_numOfPapers to numOfPapers.
    * @param name the name of the affiliate
    * @param age the age of the affiliate
    * @param address the address of the affiliate
    * @param phoneNum the phone number of the affiliate
    * @param yearCameToChapman the year the affiliate came to Chapman
    * @param facultyID their faculty ID
    * @param department the department they work in
    * @param yearlySalary their yearly salary
    * @param numOfPapers the number of papers they have
    */
  public Faculty(String name, int age, String address, long phoneNum, int yearCameToChapman, long facultyID, String department, int yearlySalary, int numOfPapers) {
    super(name, age, address, phoneNum, yearCameToChapman);
    m_facultyID = facultyID;
    m_department = department;
    m_yearlySalary = yearlySalary;
    m_numOfPapers = numOfPapers;
  }

  /**
    * Copy constuctor initializing all fields of this Faculty to the fields of the passed in Faculty
    * @param f the Faculty to copy
    */
  public Faculty(Faculty f) {
    super(f);
    this.m_facultyID = f.m_facultyID;
    this.m_department = f.m_department;
    this.m_yearlySalary = f.m_yearlySalary;
    this.m_numOfPapers = f.m_numOfPapers;
  }

  /**
    * Mutator method to set m_facultyID to facultyID.
    * @param facultyID their faculty ID
    */
  public void setFacultyID(long facultyID) {
    m_facultyID = facultyID;
  }

  /**
    * Accessor method returning m_facultyID.
    * @return a long value m_facultyID, their faculty ID
    */
  public long getFacultyID() {
    return m_facultyID;
  }

  /**
    * Mutator method to set m_department to department.
    * @param department the department they work in
    */
  public void setDepartment(String department) {
    m_department = department;
  }

  /**
    * Accessor method returning m_department.
    * @return a String value m_department, the department they work in
    */
  public String getDepartment() {
    return m_department;
  }

  /**
    * Mutator method to set m_yearlySalary to yearlySalary.
    * @param yearlySalary their yearly salary
    */
  public void setYearlySalary(int yearlySalary) {
    m_yearlySalary = yearlySalary;
  }

  /**
    * Accessor method returning m_yearlySalary.
    * @return an int value m_yearlySalary, their yearly salary
    */
  public int getYearlySalary() {
    return m_yearlySalary;
  }

  /**
    * Mutator method to set m_numOfPapers to numOfPapers.
    * @param numOfPapers the number of papers they have
    */
  public void setNumOfPapers(int numOfPapers) {
    m_numOfPapers = numOfPapers;
  }

  /**
    * Accessor method returning m_numOfPapers.
    * @return an int value m_numOfPapers, the number of papers they have
    */
  public int getNumOfPapers() {
    return m_numOfPapers;
  }

  /**
    * Method printing all the information of this Faculty
    */
  public void print() {
    super.print();
    System.out.print("," + m_facultyID + "," + m_department + "," + m_yearlySalary + "," + m_numOfPapers);
  }
}
