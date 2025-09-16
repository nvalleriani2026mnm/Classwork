// helloName section
public String helloName(String name) {
  return "Hello " + name + "!";
}

// makeAbba section
String a = new String("Hi");
String b = new String("Bye");

public String makeAbba(String a, String b) {
  return a + b + b + a;
}

// makeTags section
public String makeTags(String tag, String word) {
  return "<" + tag + ">" + word + "</" + tag + ">";
}

// firstHalf section
public String firstHalf(String str) {
  return str.substring(0, str.length() / 2);
}
