package Hunter;
import java.util.Arrays;
public class StockPrice {

	public static void main(String[] args) {
     int Prices[]={23,34,12,45,22,44,13,35,33,15};
     Arrays.sort(Prices);
     int MaxBenefit=Prices[Prices.length-1]-Prices[0];
     System.out.println("MaxBenefit is:"+MaxBenefit+" thousands");
	}

}
