package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.Alumni;
import views.html.Contactus;
import views.html.Faculty;
import views.html.Index;
import views.html.Student;

/**
 * Provides controllers for this application.
 */
public class Application extends Controller {

  /**
   * Returns the home page.
   * @return The resulting home page.
   */
  public static Result index() {

    return ok(Index.render("Welcome to the home page."));
  }
  /**
   * Returns the Student page.
   * @return The resulting Student page.
   */
  public static Result Student() {

    return ok(Student.render("Welcome to the home page."));
  }
  /**
   * Returns the Faculty page.
   * @return The resulting Faculty page.
   */
  public static Result Faculty() {

    return ok(Faculty.render("Welcome to the home page."));
  }
  /**
   * Returns the Alumni page.
   * @return The resulting Alumni page.
   */
  public static Result Alumni() {

    return ok(Alumni.render("Welcome to the home page."));
  }
  /**
   * Returns the Contactus page.
   * @return The Contactus home page.
   */
  public static Result Contactus() {

    return ok(Contactus.render("Welcome to the home page."));
  }

}
