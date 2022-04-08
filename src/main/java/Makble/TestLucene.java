package Makble;

import org.apache.lucene.index.Term;

class TestLucene {

  public static void main(String[] args) {
    Term t = new Term("field", "Term text");
    System.out.println(t.field());
    System.out.println(t.text());
  }
}
