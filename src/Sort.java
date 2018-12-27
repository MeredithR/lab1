import java.util.Comparator;

class Sort implements Comparator<Token>
{
    public int compare(Token a, Token b)
    {
        return b.getRepeat()-a.getRepeat();
    }
}
class Sort1 implements Comparator<Bigramm>
{
    public int compare(Bigramm a, Bigramm b)
    {
        return b.getRepeat()-a.getRepeat();
    }
}