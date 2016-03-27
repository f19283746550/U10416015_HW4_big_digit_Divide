import java.util.*;
public class Divide {
	private static char newN1[];
	private static char newN2[];
	private static char newN3[];
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please input a number.");
		String n1=input.next();
		int x=n1.length();
		while(x!=0) {
			newN1 = new char[n1.length()];
			for(int i=0;i<n1.length();i++)newN1[i] = n1.charAt(i);
			x=n1.length();
			for(int i=0;i<n1.length();i++) {
				if(Character.isDigit(newN1[i])) {
					x--;
				}
			}
			if(x!=0) {
				System.out.println("Please change another one,there must be something not belong to numbers.");
				n1=input.next();
			}
		}
		System.out.println("Please input another number.");
		String n2=input.next();
		x=n2.length();
		while(x!=0) {
			newN2 = new char[n2.length()];
			for(int i=0;i<n2.length();i++)newN2[i] = n2.charAt(i);
			x=n2.length();
			for(int i=0;i<n2.length();i++) {
				if(Character.isDigit(newN2[i])) {
					x--;
				}
			}
			if(x!=0) {
				System.out.println("Please change another one,there must be something not belong to numbers.");
				n2=input.next();
			}
		}
		newN1 = new char[n1.length()];
		for(int i=0;i<n1.length();i++)newN1[i] = n1.charAt(i);
		newN2 = new char[n2.length()];
		for(int i=0;i<n2.length();i++)newN2[i] = n2.charAt(i);
		x=newN1.length;
		int y=newN2.length;
		newN3=new char[x];
		for(int i=0;i<newN3.length;i++) {
			newN3[i]="0".charAt(0);
		}
		for(int i=0;i<x;) {
			if(x-i<y) {
				break;
			}
			while(true) {
				while(Integer.parseInt(String.valueOf(newN1[i]))<Integer.parseInt(String.valueOf(newN2[0]))) {
					if(i>0) {
						if(Integer.parseInt(String.valueOf(newN1[i-1]))!=0) {
							break;
						}
					}
					if(Integer.parseInt(String.valueOf(newN1[i]))==0) {
						i++;
						if(i==x) {
							for(i=0;i<x;i++) {
								if(newN3[i]=="0".charAt(0)) {
									newN3[i]=" ".charAt(0);
								}
								else {
									break;
								}
							}
							System.out.println(String.valueOf(newN3));
							System.exit(0);
						}
					}
					else {
						i++;
						break;
					}
				}
				for(int b=i;b<n2.length();b++) {
					if(Integer.parseInt(String.valueOf(newN1[b]))>Integer.parseInt(String.valueOf(newN2[b]))||b==n2.length()-1) {
						break;
					}
					if(Integer.parseInt(String.valueOf(newN1[b]))<Integer.parseInt(String.valueOf(newN2[b]))) {
						i++;
						if(i==x) {
							for(i=0;i<x;i++) {
								if(newN3[i]=="0".charAt(0)) {
									newN3[i]=" ".charAt(0);
								}
								else {
									break;
								}
							}
							System.out.println(String.valueOf(newN3));
							System.exit(0);
						}
						break;
					}
				}
				break;
			}
			for(int a=0;a<y;a++) {
				int b=i;
				if(Integer.parseInt(String.valueOf(newN1[b]))-Integer.parseInt(String.valueOf(newN2[a]))<0) {
					for(int c=b;c>=0;c--) {
						if(Integer.parseInt(String.valueOf(newN1[c-1]))>0) {
							newN1[c-1]=Integer.toString(Integer.parseInt(String.valueOf(newN1[c-1]))-1).charAt(0);
							break;
						}
					}
					newN1[b]=Integer.toString(Integer.parseInt(String.valueOf(newN1[b]))-Integer.parseInt(String.valueOf(newN2[a]))+10).charAt(0);
				}
				else {
					newN1[b]=Integer.toString(Integer.parseInt(String.valueOf(newN1[b]))-Integer.parseInt(String.valueOf(newN2[a]))).charAt(0);
				}
				b++;
			}
			newN3[i]=Integer.toString((Integer.parseInt(String.valueOf(newN3[i]))+1)%10).charAt(0);
		}
		for(int i=0;i<x;i++) {
			if(newN3[i]=="0".charAt(0)) {
				newN3[i]=" ".charAt(0);
			}
			else {
				break;
			}
		}
		System.out.println(String.valueOf(newN3));
	}
}