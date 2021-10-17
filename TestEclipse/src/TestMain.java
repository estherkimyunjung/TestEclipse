
public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char arr[]=new char[6];
		arr[0]='A';
		arr[1]='B';
		arr[2]='C';
		arr[3]='D';
		arr[4]='E';
		arr[5]='F';
		
		//Make changes and try to insert elements at different positions
		ArrayTest.insert(arr, 3, 'J');
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}

}
