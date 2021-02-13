/**
 * @author Luis Rivas
 * 2365948
 * lrivas@chapman.edu
 * CPSC 231-03
 * Programming Mastery Project 4 - Students
 * The purpose of this abstract class is to contain variables that all Students have and print all it's info.
 * Note: It's an abstract class because you should never create a Students. Just prevents from having to repeat this code in every other class.
 * @version 1.0
 */
public abstract class Students extends Affiliates {
  /** A long representing their studentID */
  private long m_studentID;
  /** A String representing their major */
  private String m_major;
  /** A String representing their minor */
  private String m_minor;
  /** A String representing their class standing */
  private String m_classStanding;

  /** Default constructor initializing m_name, m_age, m_address, m_phoneNum, and m_yearCameToChapman, m_studentID, m_major, m_minor, and m_classStanding with random values I chose. */
  public Students() {
    super();
    m_studentID = 0;
    m_major = "Biology";
    m_minor = "Chemistry";
    m_classStanding = "Freshman";
  }

  /**
    * Overloaded constuctor initializing m_name to name, m_age to age, m_address to address, m_phoneNum to phoneNum, m_yearCameToChapman to yearCameToChapman,
    * m_studentID to studentID, m_major to major, m_minor to minor, and m_classStanding to classStanding.
    * @param name the name of the affiliate
    * @param age the age of the affiliate
    * @param address the address of the affiliate
    * @param phoneNum the phone number of the affiliate
    * @param yearCameToChapman the year the affiliate came to Chapman
    * @param studentID their student ID
    * @param major their major
    * @param minor their minor
    * @param classStanding their class standing
    */
  public Students(String name, int age, String address, long phoneNum, int yearCameToChapman, long studentID, String major, String minor, String classStanding) {
    super(name, age, address, phoneNum, yearCameToChapman);
    m_studentID = studentID;
    m_major = major;
    m_minor = minor;
    m_classStanding = classStanding;
  }

  /**
    * Copy constuctor initializing all fields of this Students to the fields of the passed in Students
    * @param s the Students to copy
    */
  public Students(Students s) {
    super(s);
    this.m_studentID = s.m_studentID;
    this.m_major = s.m_major;
    this.m_minor = s.m_minor;
    this.m_classStanding = s.m_classStanding;
  }

  /**
    * Mutator method to set m_studentID to studentID.
    * @param studentID their student ID
    */
  public void setStudentID(long studentID) {
    m_studentID = studentID;
  }

  /**
    * Accessor method returning m_studentID.
    * @return a long value m_studentID, their student ID
    */
  public long getStudentID() {
    return m_studentID;
  }

  /**
    * Mutator method to set m_major to major.
    * @param major their major
    */
  public void setMajor(String major) {
    m_major = major;
  }

  /**
    * Accessor method returning m_major.
    * @return a String value m_major, their major
    */
  public String getMajor() {
    return m_major;
  }

  /**
    * Mutator method to set m_minor to minor.
    * @param minor their minor
    */
  public void setMinor(String minor) {
    m_minor = minor;
  }

  /**
    * Accessor method returning m_minor.
    * @return a String value m_minor, their minor
    */
  public String getMinor() {
    return m_minor;
  }

  /**
    * Mutator method to set m_classStanding to classStanding.
    * @param classStanding their class standing
    */
  public void setClassStanding(String classStanding) {
    m_classStanding = classStanding;
  }

  /**
    * Accessor method returning m_classStanding.
    * @return a String value m_classStanding, their class standing
    */
  public String getClassStanding() {
    return m_classStanding;
  }

  /**
    * Method printing all the information of this Students
    */
  public void print() {
    super.print();
    System.out.print("," + m_studentID + "," + m_major + "," + m_minor + "," + m_classStanding);
  }
}
