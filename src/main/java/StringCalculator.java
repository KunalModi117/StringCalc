public class StringCalculator {
    static int calls=0;
    public int add(String numbers) {
        calls++;
        if(numbers.equals("")){
            return 0;
        }
        if(numbers.indexOf("[")!=numbers.lastIndexOf("["))
        {
            int result = 0;
            String firstdelimeter=numbers.substring(numbers.indexOf("[")+1,numbers.indexOf("]"));
            String secondDelimeter=numbers.substring(numbers.lastIndexOf("[")+1,numbers.lastIndexOf("]"));
            String newnum=numbers.substring(numbers.lastIndexOf(']')+2);
            newnum=newnum.replace(firstdelimeter,",");
            newnum=newnum.replace(secondDelimeter,",");
            String[] arr=newnum.split(",");
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
        if(numbers.startsWith("//["))
        {
            int result = 0;
            String delimeter=numbers.substring(3,numbers.indexOf(']'));
            String newnum=numbers.substring(numbers.indexOf(']')+2);
            newnum=newnum.replace(delimeter,",");
            String[] arr=newnum.split(",");
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
        if(numbers.startsWith("//"))
        {
            int result = 0;
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