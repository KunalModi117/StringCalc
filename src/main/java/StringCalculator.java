public class StringCalculator {
    public int add(String numbers) {
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
                result=result+Integer.parseInt(elem);
            }
            return result;
        }
        if(numbers.contains(","))
        {
            int result = 0;
            String nstring=numbers.replaceAll("\n",",");
            String[] arr=nstring.split(",");
            for(String elem:arr){
                result += Integer.parseInt(elem);
            }
            return result;
        }
        return Integer.parseInt(numbers);
    }
}
