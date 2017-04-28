import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

public class test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		TreeMap<Integer,String> a = new TreeMap<Integer,String>();
		a.put(1, "a");
		a.put(3, "b");
		a.put(2, "b");
		for (int x:a.keySet())
		{
			System.out.println(x);
		}
	}

}
