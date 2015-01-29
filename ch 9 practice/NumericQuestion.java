
public class NumericQuestion extends Question
{
    private double answer;
    
    public NumericQuestion()
    {
        
    }

    public boolean checkAnswer(String response)
    {
        double respond = Double.parseDouble(response);
        
        return Math.abs(respond - answer) < .01;
        
    }
}
