package ExtraCode;

public class DisplayDuplicateStringAndCount {
    public static void main(String[] args) {
        String str="java is a java";
        String [] temp=str.split(" ");
        for(int i=0;i< temp.length;i++)
        { int count=1;
            for(int j=i+1;j<temp.length;j++)
            {
                if(temp[i].equals(temp[j]))
                {
                    count++;
                }
            }
            if(count>1)
            {
                System.out.println("Repeated String is:\t"+temp[i]+"\n and Count is: "+count);

            }
        }
    }
}
