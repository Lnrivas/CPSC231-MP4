/**
 * @author Luis Rivas
 * 2365948
 * lrivas@chapman.edu
 * CPSC 231-03
 * Programming Mastery Project 4 - Undergrad
 * The purpose of this class is to create an Undergrad object, which is also a Affiliates and a Students, and print it's info.
 * @version 1.0
 */
public class Undergrad extends Students {
  /** An int representing the number of courses they have taken */
  private int m_numOfCoursesTaken;
  /** A adouble representing their scholarship amount */
  private double m_scholarshipAmount;

  /** Default constructor initializing m_name, m_age, m_address, m_phoneNum, and m_yearCameToChapman, m_studentID, m_major, m_minor, m_classStanding, m_numOfCoursesTaken, and m_scholarshipAmount with random values I chose. */
  public Undergrad() {
    super();
    m_numOfCoursesTaken = 0;
    m_scholarshipAmount = 0.0;
  }

  /**
    * Overloaded constuctor initializing m_name to name, m_age to age, m_address to address, m_phoneNum to phoneNum, m_yearCameToChapman to yearCameToChapman,
    * m_studentID to studentID, m_major to major, m_minor to minor, m_classStanding to classStanding, m_numOfCoursesTaken to numOfCoursesTaken, and m_scholarshipAmount to scholarshipAmount.
    * @param name the name of the affiliate
    * @param age the age of the affiliate
    * @param address the address of the affiliate
    * @param phoneNum the phone number of the affiliate
    * @param yearCameToChapman the year the affiliate came to Chapman
    * @param studentID their student ID
    * @param major their major
    * @param minor their minor
    * @param classStanding their class standing
    * @param numOfCoursesTaken the number of courses they have taken
    * @param scholarshipAmount their scholarship amount
    */
  public Undergrad(String name, int age, String address, long phoneNum, int yearCameToChapman, long studentID, String major, String minor, String classStanding, int numOfCoursesTaken, double scholarshipAmount) {
    super(name, age, address, phoneNum, yearCameToChapman, studentID, major, minor, classStanding);
    m_numOfCoursesTaken = numOfCoursesTaken;
    m_scholarshipAmount = scholarshipAmount;
  }

  /**
    * Copy constuctor initializing all fields of this Undergrad to the fields of the passed in Undergrad
    * @param u the Undergrad to copy
    */
  public Undergrad(Undergrad u) {
    super(u);
    this.m_numOfCoursesTaken = u.m_numOfCoursesTaken;
    this.m_scholarshipAmount = u.m_scholarshipAmount;
  }

  /**
    * Mutator method to set m_numOfCoursesTaken to numOfCoursesTaken.
    * @param numOfCoursesTaken their number of courses taken
    */
  public void setNumOfCoursesTaken(int numOfCoursesTaken) {
    m_numOfCoursesTaken = numOfCoursesTaken;
  }

  /**
    * Accessor method returning m_numOfCoursesTaken.
    * @return an int value m_numOfCoursesTaken, their number of courses taken
    */
  public int getNumOfCoursesTaken() {
    return m_numOfCoursesTaken;
  }

  /**
    * Mutator method to set m_scholarshipAmount to scholarshipAmount.
    * @param scholarshipAmount their scholarship amount
    */
  public void setScholarshipAmount(double scholarshipAmount) {
    m_scholarshipAmount = scholarshipAmount;
  }

  /**
    * Accessor method returning m_scholarshipAmount.
    * @return a double value m_scholarshipAmount, their scholarship amount
    */
  public double getScholarshipAmount() {
    return m_scholarshipAmount;
  }

  /**
    * Method printing all the information of this Undergrad
    */
  public void print() {
    super.print();
    System.out.println("," + m_numOfCoursesTaken + "," + m_scholarshipAmount);
  }
}
