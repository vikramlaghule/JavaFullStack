package multithreading;

public class AlternatePrime {
    
    public static void main(String[] args) {
	Ab a=new Ab();
	Ab b=new Ab();
	System.out.println(a.equals(b));
	System.out.println(a.hashCode());
	System.out.println(b.hashCode());
    }
}
class Ab{
    int name;
    @Override
    public int hashCode() {
	return 100;
    }
    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	Ab other = (Ab) obj;
	return name == other.name;
    }
    
}