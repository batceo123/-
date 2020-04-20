package day01;

public class test {
	public String Encryption(int key,String text,int select)
	{
		StringBuilder str=new StringBuilder();
		char ch[],chtemp = 0;
		ch=text.toCharArray();
        System.out.println(text);
        for(int i=0;i<ch.length;i++)
		{
            key=key%26;
           if(ch[i]>=97&&ch[i]<=122)
           {
        	   if(select==0)
        	   {
			     chtemp=(char)(((char)ch[i]-97+key)%26+65);
        	   }
        	   else
        	   {
        		   chtemp=(char)(((char)ch[i]-97-key)%26+65);
        	   }
           }
           else if(ch[i]>=65&&ch[i]<=90)
           {
        	   if(select==0)
        	   {
        	     chtemp=(char)(((char)ch[i]-65-key)%26+97);
        	   }
        	   else
        	   {
        		   chtemp=(char)(((char)ch[i]-65-key)%26+97);
        	   }
           }
           else
           {
        	   chtemp=ch[i];
           }
            System.out.println(ch[i]+"    "+chtemp);
			str.append(chtemp);
		}


		return str.toString();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test te=new test();
		System.out.println(te.Encryption(3, "EREWRE",0));
		System.out.println(te.Encryption(3,"bobtob",1));

	}

}
