public class StringCalculator {
    public int add(String numbers) {
        if(numbers.equals("")){
            return 0;
        }
        if(numbers.contains(","))
        {
            String[] arr=numbers.split(",");
            return Integer.parseInt(arr[0])+Integer.parseInt(arr[1]);
        }
        return Integer.parseInt(numbers);
    }
}
