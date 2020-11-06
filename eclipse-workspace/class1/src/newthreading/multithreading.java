package newthreading;

class Table
{
 void showTable(int no)
{
	for(int i=1;i<=10;i++) {
		System.out.println(no*i);
	}
	}
}
class Test1 extends Thread
{Table t;
Test1(Table t)
{
this.t=t;	
}
public void run() {
	t.showTable(20);
}
	}

class Test2 extends Thread
{
	
	Table t;
	Test2(Table t)
	{
		this.t=t;
		
	}
	public void run()
	{
		t.showTable(10);
	}
	}

public class multithreading {
	Table ob=new Table();
	public static void main(String[] args) {
		
		Test1 T1=new Test1(ob);
		Test2 T2=new Test2(ob);
		T1.start();
		T2.start();

	}

}
