package org.xmdl.core.templates.context.impl;

public class CommonResourcesPropImpl
{
  protected static String nl;
  public static synchronized CommonResourcesPropImpl create(String lineSeparator)
  {
    nl = lineSeparator;
    CommonResourcesPropImpl result = new CommonResourcesPropImpl();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = NL + "# -- messages used in decorators/default.jsp --" + NL + "user.status=Logged in as:" + NL + "user.logout=Logout" + NL + "" + NL + "# -- validator errors --" + NL + "errors.invalid='{0}' is invalid." + NL + "errors.maxlength='{0}' can not be greater than {1} characters." + NL + "errors.minlength='{0}' can not be less than {1} characters." + NL + "errors.range='{0}' is not in the range {1} through {2}." + NL + "errors.required='{0}' is a required field." + NL + "errors.byte='{0}' must be an byte." + NL + "errors.date='{0}' is not a date." + NL + "errors.double='{0}' must be an double." + NL + "errors.float='{0}' must be an float." + NL + "errors.integer='{0}' must be a number." + NL + "errors.long='{0}' must be an long." + NL + "errors.short='{0}' must be an short." + NL + "errors.creditcard='{0}' is not a valid credit card number." + NL + "errors.email='{0}' is an invalid e-mail address." + NL + "errors.phone='{0}' is an invalid phone number." + NL + "errors.zip='{0}' is an invalid zip code." + NL + "# -- for field level messages --" + NL + "errors.header=<span class=\"fieldError\">" + NL + "errors.footer=</span>" + NL + "" + NL + "# -- other errors --" + NL + "errors.cancel=Operation cancelled." + NL + "errors.detail={0}" + NL + "errors.general=<strong>The process did not complete. Details should follow.</strong>" + NL + "errors.token=Request could not be completed. Operation is not in sequence." + NL + "errors.none=No error message was found, check your server logs." + NL + "errors.password.mismatch=Invalid username and/or password, please try again." + NL + "errors.conversion=An error occurred while converting web values to data values." + NL + "errors.twofields=The '{0}' field has to have the same value as the '{1}' field." + NL + "errors.existing.user=This username (<strong>{0}</strong>) or e-mail address (<strong>{1}</strong>) already exists.  Please try a different username." + NL + "" + NL + "" + NL + "# -- error page messages --" + NL + "errorPage.title=An error has occurred" + NL + "errorPage.heading=Yikes!" + NL + "404.title=Page Not Found" + NL + "404.message=The page your requested was not found.  You might try returning to the <a href=\"{0}\">Main Menu</a>. While you&#39;re here, how about a pretty picture to cheer you up?" + NL + "403.title=Access Denied" + NL + "403.message=Your current role does not allow you to view this page.  Please contact your system administrator if you believe you should have access.  In the meantime, how about a pretty picture to cheer you up?" + NL + "" + NL + "# -- login --" + NL + "login.title=Login" + NL + "login.heading=Login" + NL + "login.rememberMe=Remember Me" + NL + "login.signup=Not a member? <a href=\"{0}\">Signup</a> for an account." + NL + "login.passwordHint=Forgot your password?  Have your <a href=\"?\" onmouseover=\"window.status='Have your password hint sent to you.'; return true\" onmouseout=\"window.status=''; return true\" title=\"Have your password hint sent to you.\" onclick=\"passwordHint(); return false\">password hint e-mailed to you</a>." + NL + "login.passwordHint.sent=The password hint for <strong>{0}</strong> has been sent to <strong>{1}</strong>." + NL + "login.passwordHint.error=The username <strong>{0}</strong> was not found in our database." + NL + "" + NL + "# -- welcome --" + NL + "welcome.message=This application is designed to demonstrate the use of web application security, as well as how to use Hibernate with Struts and Struts Advanced features.  Most of the persistence layer for this application is generated using XDoclet.  You can find more information on how to build your own application from this one by reading the README file below.  <span class=\"attention\">To login as a regular user (with the <strong>user</strong> role), the username/password combination is <strong>tomcat/tomcat</strong>.  To login as an <strong>admin</strong> user, use <strong>mraible/tomcat</strong>.</span>" + NL + "" + NL + "" + NL + "# -- button labels --" + NL + "button.add=Add" + NL + "button.cancel=Cancel" + NL + "button.copy=Copy" + NL + "button.delete=Delete" + NL + "button.edit=Edit" + NL + "button.register=Signup" + NL + "button.save=Save" + NL + "button.search=Search" + NL + "button.upload=Upload" + NL + "button.view=View" + NL + "button.reset=Reset" + NL + "button.login=Login" + NL + "" + NL + "# -- general values --" + NL + "icon.information=Information" + NL + "icon.information.img=/images/iconInformation.gif" + NL + "icon.email=E-Mail" + NL + "icon.email.img=/images/iconEmail.gif" + NL + "icon.warning=Warning" + NL + "icon.warning.img=/images/iconWarning.gif" + NL + "date.format=MM/dd/yyyy" + NL + "time.format=dd.MM.yyyy HH:mm" + NL + "" + NL + "# -- upload page messages --" + NL + "maxLengthExceeded=The file you are trying to upload is too big.  The maximum allowed size is 2 MB." + NL + "upload.title=File Upload" + NL + "upload.heading=Upload A File" + NL + "upload.message=Note that the maximum allowed size of an uploaded file for this application is 2 MB. See the metadata/web/struts-controller.xml file (or the generated struts-config.xml) to change this value." + NL + "uploadForm.name=Friendly Name" + NL + "uploadForm.file=File to Upload" + NL + "" + NL + "# -- display page messages --" + NL + "display.title=File Uploaded Successfully!" + NL + "display.heading=File Information" + NL + "" + NL + "# -- flushCache page --" + NL + "flushCache.title=Flush Cache" + NL + "flushCache.heading=Flush Successful!" + NL + "flushCache.message=All caches successfully flushed, returning you to your previous page in 2 seconds." + NL + "" + NL + "# -- clickstreams page --" + NL + "clickstreams.title=All Clickstreams" + NL + "clickstreams.heading=All Clickstreams" + NL + "" + NL + "# -- viewstream page --" + NL + "viewstream.title=Stream Details" + NL + "viewstream.heading=Stream Information" + NL + "" + NL + "# -- active users page --" + NL + "activeUsers.title=Active Users" + NL + "activeUsers.heading=Current Users" + NL + "activeUsers.message=The following is a list of users that have logged in and their sessions have not expired." + NL + "activeUsers.fullName=Full Name" + NL;
  protected final String TEXT_2 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    stringBuffer.append(TEXT_2);
    return stringBuffer.toString();
  }
}