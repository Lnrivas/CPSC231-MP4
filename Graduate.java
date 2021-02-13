/**
 * @author Luis Rivas
 * 2365948
 * lrivas@chapman.edu
 * CPSC 231-03
 * Programming Mastery Project 4 - Graduate
 * The purpose of this class is to create a Graduate object, which is also a Affiliates and a Students, and print it's info.
 * @version 1.0
 */
public class Graduate extends Students {
  /** An int representing the number of published papers they have */
  private int m_numOfPapersPublished;
  /** A String representing their thesis advisor */
  private String m_thesisAdvisor;

  /** Default constructor initializing m_name, m_age, m_address, m_phoneNum, and m_yearCameToChapman, m_studentID, m_major, m_minor, m_classStanding, m_numOfPapersPublished, and m_thesisAdvisor with random values I chose. */
  public Graduate() {
    super();
    m_numOfPapersPublished = 0;
    m_thesisAdvisor = "Linstead";
  }

  /**
    * Overloaded constuctor initializing m_name to name, m_age to age, m_address to address, m_phoneNum to phoneNum, m_yearCameToChapman to yearCameToChapman,
    * m_studentID to studentID, m_major to major, m_minor to minor, m_classStanding to classStanding, m_numOfPapersPublished to numOfPapersPublished, and m_thesisAdvisor to thesisAdvisor.
    * @param name the name of the affiliate
    * @param age the age of the affiliate
    * @param address the address of the affiliate
    * @param phoneNum the phone number of the affiliate
    * @param yearCameToChapman the year the affiliate came to Chapman
    * @param studentID their student ID
    * @param major their major
    * @param minor their minor
    * @param classStanding their class standing
    * @param numOfPapersPublished their number of published papers
    * @param thesisAdvisor their thesis advisor
    */
  public Graduate(String name, int age, String address, long phoneNum, int yearCameToChapman, long studentID, String major, String minor, String classStanding, int numOfPapersPublished, String thesisAdvisor) {
    super(name, age, address, phoneNum, yearCameToChapman, studentID, major, minor, classStanding);
    m_numOfPapersPublished = numOfPapersPublished;
    m_thesisAdvisor = thesisAdvisor;
  }

  /**
    * Copy constuctor initializing all fields of this Graduate to the fields of the passed in Graduate
    * @param g the Graduate to copy
    */
  public Graduate(Graduate g) {
    super(g);
    this.m_numOfPapersPublished = g.m_numOfPapersPublished;
    this.m_thesisAdvisor = g.m_thesisAdvisor;
  }

  /**
    * Mutator method to set m_numOfPapersPublished to numOfPapersPublished.
    * @param numOfPapersPublished their number of published papers
    */
  public void setNumOfPapersPublished(int numOfPapersPublished) {
    m_numOfPapersPublished = numOfPapersPublished;
  }

  /**
    * Accessor method returning m_numOfPapersPublished.
    * @return an int value m_numOfPapersPublished, their number of papers published
    */
  public int getNumOfPapersPublished() {
    return m_numOfPapersPublished;
  }

  /**
    * Mutator method to set m_thesisAdvisor to thesisAdvisor.
    * @param thesisAdvisor their thesis advisor
    */
  public void setThesisAdvisor(String thesisAdvisor) {
    m_thesisAdvisor = thesisAdvisor;
  }

  /**
    * Accessor method returning m_thesisAdvisor.
    * @return a String value m_thesisAdvisor, their thesisAdvisor
    */
  public String getThesisAdvisor() {
    return m_thesisAdvisor;
  }

  /**
    * Method printing all the information of this Graduate
    */
  public void print() {
    super.print();
    System.out.println("," + m_numOfPapersPublished + "," + m_thesisAdvisor);
  }
}
