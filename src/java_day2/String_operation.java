package java_day2;

public class String_operation {
	public static void main(String[]args)
	{
		String name1 = new String("Ram");
		System.out.println(name1);
		
		//string length
		
		String str = "Java programming";
		System.out.println(str.length());
		
		//string start index
		
		String str1 ="Java Programming";
		System.out.println(str1.substring(3));
		System.out.println(str1.substring(0,4));
		
		//indexOf
		
		String s ="Java Programming";
		System.out.println(s.indexOf("Prog"));
		System.out.println(s.indexOf("x"));
		
		//toUpperCase and toLowerCase
		
		String s1 ="Java Programming";
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		//replace
		
		String s11 ="Java Programming";
		System.out.println(s11.replace('a','A'));
		
		//equals
		
		String a="JAVA";
		String a1 ="java";
		System.out.println(a==a1);
		System.out.println(a.equals(a1));
		
		//charAt
		
		String b="JAVA";
		System.out.println(b.charAt(2));
		
		//split
		
		String c="java,python,springBoot";
		String []language = c.split(",");
		
		for(String b1 :language) {
			System.out.println(b1);
		}
		
		//concat
		
		String d = "Java";
		String d1 = " Programming";
		System.out.println("Concat String:"+d.concat(d1));
		
		//trim
		
		String e ="  Java  ";
		System.out.println(str.length());
		String e1 = e.trim();
		System.out.println(e1);
		System.out.println(e1.length());
		
		
		//compareTo
		
		String f = "Java";
		String f1 = "Programing";
		System.out.println(f.compareTo(f1));
		
		//Contains
		
		String g = "Java Programming";
		System.out.println(g.contains("Java"));
		System.out.println(g.contains("Python"));
		
		//string intern
		
		String h = new String ("JavaDeveloper");
		String h1 = "JavaDeveloper";
		String h2 = h.intern();
		System.out.println(h==h1);
		System.out.println(h1==h2);
		
		//string builder
		
		StringBuilder sb = new StringBuilder("Hello");
		sb.append(" World");
		System.out.println("After append: " +sb);	
		sb.insert(5,",");
		System.out.println("After insert: "+sb);
		sb.replace(6,11,"Java");
		System.out.println("After replace: "+sb);
		sb.reverse();
		System.out.println("After reverse: "+sb);
		
		
		//String buffer
		
		StringBuffer st = new StringBuffer("Java");
		st.append("Programming");
		System.out.println("StringBuffer: "+ st);
		
		
		}
	}


