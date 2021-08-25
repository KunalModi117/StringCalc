public class StringCalculator {
    public int add(String numbers) {
        if(numbers.equals("")){
            return 0;
        }
        if(numbers.contains(","))
        {
            int result = 0;
            String[] arr=numbers.split(",");
            for(String elem:arr){
                result += Integer.parseInt(elem);
            }
            return result;
        }
        return Integer.parseInt(numbers);
    }
}
