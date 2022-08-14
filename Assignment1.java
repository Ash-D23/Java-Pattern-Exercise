
public class Assignment1 {

	public static void main(String[] args) {
		
		System.out.println("Question: 1");
		
		int n=5;
		
		for(int i=0; i<n; i++) {
			
			for(int j=0; j<n; j++) {
				if(i==0 || i==n-1 || j==n/2) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			System.out.print(" ");
			
			for(int j=0; j<n; j++) {
				if(j==0 || j==n-1 || i==j) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			System.out.print(" ");
			
			for(int j=0; j<n; j++) {
				if(j==0 || i==n-1 || i==0 || i==n/2) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			System.out.print(" ");
			
			for(int j=0; j<n; j++) {
				if(j==0 || j==n-1 || i==n-1 ) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			System.out.print(" ");
			
			for(int j=0; j<n; j++) {
				if(j==0 || j==n-1 || i==n/2 || i==0 ) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			System.out.print(" ");
			
			for(int j=0; j<n; j++) {
				if(j==0 || j==n-1 || i==n-1 || i==0 ) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			System.out.print(" ");
			
			for(int j=0; j<n; j++) {
				if(j==0 || j==n-1 || i==j) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}
		
		System.out.println("\nQuestion: 2");
		n = 4;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(i+1);
			}
			System.out.println();
		}
		System.out.println("\nQuestion: 3");
		n=11;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				
				if(j<=((n/2)-i) || j>=((n/2)+i) || j==0 || j==n-1 || i==n-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("\nQuestion: 4");
		n = 11;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				
				if(i<n/2) {
					System.out.print(" ");
				}else if(j<= i -((n/2)) || j>=((n-1) - (i - (n/2)))) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("\nQuestion: 5");
		n = 11;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				
				if(i==0 || i==n-1 || j<=((n/2)-i) || (i> (n/2) && j<=i-(n/2) )) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}

}
