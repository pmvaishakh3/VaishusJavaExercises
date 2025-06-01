public class Main MyClass{
    int n1;
    MyClass() {
        int n1 = 100;
    }

}

//class ConsDemo{
void main(String[] args)
{
	MyClass t1 = new MyClass();
	MyClass t2 = new MyClass();
	System.out.println(t1.n1+ "" +t2.n1);
}
