package Week6Generics;

public class Pair<A,B> {
	public A first;
	public B second;
   public Pair(A a, B b){
	first = a;
	second = b;
 }
   public A getFirst(){return first;}
   public B getSecond(){return second;} 
}
