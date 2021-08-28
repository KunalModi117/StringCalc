public class StringCalculator {
    static int calls=0;
    public int add(String numbers) {
        calls++;
        if(numbers.equals("")){
            return 0;
        }
        if(numbers.startsWith("//"))
        {   int result = 0;
            char delimeter=numbers.charAt(2);
            String newnum=numbers.substring(4);
            String[] arr=newnum.split(String.valueOf(delimeter));
            for(String elem:arr)
            {
                int no=Integer.parseInt(elem);
                try {
                    if(no<0) {
                        throw new NegativeNoException(arr);
                    }
                } catch (NegativeNoException e) {
                    return -99;
                }
                if(no<=1000) {
                    result += no;
                }
            }
            return result;
        }
        if(numbers.contains(",")) {
            int result = 0;
            String nstring = numbers.replaceAll("\n", ",");
            String[] arr = nstring.split(",");

            for(String elem:arr){
                int no=Integer.parseInt(elem);
                try {
                    if(no<0) {
                        throw new NegativeNoException(arr);
                    }
                } catch (NegativeNoException e) {
                    return -99;
                }
                if(no<=1000) {
                    result += no;
                }
            }
            return result;
        }
        return Integer.parseInt(numbers);
    }

    public int GetCalledCount() {
        return calls;
    }
}
class NegativeNoException extends Exception{
    public NegativeNoException(String[] no){
        for(String var:no)
        {
            if (Integer.parseInt(var)<0)
            {
                System.out.println("negatives not allowed"+var);
            }
        }
    }
}