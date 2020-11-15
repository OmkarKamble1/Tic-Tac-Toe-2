import java.util.ArrayList;
import java.util.Scanner;

public class TicTacToe2 {
	public static void main(String args[]) {
		ArrayList arr1 = new ArrayList(9);
		System.out.println("Welcome  gamer !");
		System.out.println("--------------------------------");
		int play1=1,play2=0,ch,i,k,j;
		Scanner sc = new Scanner(System.in);
		for(i=0;i<=9;i++) {
			arr1.add(i,i+1);
		}
		System.out.println("This is the preview of indexes");
		getarr(arr1);
		for(i=0;i<=9;i++) {
			arr1.add(i,"_");
		}
		System.out.println("Lets PLAYY !! ");
		for(k=0;k<5;k++) {
			if(play1==1) {
				System.out.println();
				System.out.println("Its Player 1 turn ");
				System.out.print("Enter position index you want to play ");
				ch = sc.nextInt();
				play1(ch,arr1);
				play1 = 0;
				play2 = 1;
				getarr(arr1);
				//wincheck(arr1);
				if(arr1.get(0) =="O" && arr1.get(1) =="O" && arr1.get(2) =="O") {
					System.out.println("PLAYER 1 WON !! yay");	break;	
				}
				if(arr1.get(0) =="O" && arr1.get(1) =="O" && arr1.get(2) =="O") {
					System.out.println("PLAYER 1 WON !! yay");	break;		
				}
				if(arr1.get(3) =="O" && arr1.get(4) =="O" && arr1.get(5) =="O") {
					System.out.println("PLAYER 1 WON !! yay");	break;		
				}
				if(arr1.get(2) =="O" && arr1.get(4) =="O" && arr1.get(6) =="O") {
					System.out.println("PLAYER 1 WON !! yay");	break;		
				}
				if(arr1.get(0) =="O" && arr1.get(4) =="O" && arr1.get(8) =="O") {
					System.out.println("PLAYER 1 WON !! yay");	break;		
				}
				if(arr1.get(1) =="O" && arr1.get(4) =="O" && arr1.get(7) =="O") {
					System.out.println("PLAYER 1 WON !! yay");	break;		
				}
				if(arr1.get(6) =="O" && arr1.get(7) =="O" && arr1.get(8) =="O") {
					System.out.println("PLAYER 1 WON !! yay");	break;		
				}
				if(arr1.get(0) =="O" && arr1.get(3) =="O" && arr1.get(6) =="O") {
					System.out.println("PLAYER 1 WON !! yay");	break;		
				}
				if(arr1.get(2) =="O" && arr1.get(5) =="O" && arr1.get(8) =="O") {
					System.out.println("PLAYER 1 WON !! yay");	break;		
				}
			}
			if(play2==1) {
				if(k==4) {
					System.out.println();
					System.out.println("ITS TIE...");
					System.out.println("Play again.....");
					break;
					
				}
				System.out.println();
				System.out.println("Its Player 2 turn ");
				System.out.print("Enter position index you want to play ");
				ch = sc.nextInt();
				play2(ch,arr1);
				play1 = 1;
				play2 = 0;
				getarr(arr1);
				
				//wincheck
				if(arr1.get(0) =="X" && arr1.get(1) =="X" && arr1.get(2) =="X") {
					System.out.println("PLAYER 2 WON !! yay");	break;		
				}
				
				if(arr1.get(3) =="X" && arr1.get(4) =="X" && arr1.get(5) =="X") {
					System.out.println("PLAYER 2 WON !! yay");	break;	
				}
				
				if(arr1.get(6) =="X" && arr1.get(7) =="X" && arr1.get(8) =="X") {
					System.out.println("PLAYER 2 WON !! yay");	break;		
				}
				
				if(arr1.get(0) =="X" && arr1.get(3) =="X" && arr1.get(6) =="X") {
					System.out.println("PLAYER 2 WON !! yay");	break;		
				}
				
				if(arr1.get(1) =="X" && arr1.get(4) =="X" && arr1.get(7) =="X") {
					System.out.println("PLAYER 2 WON !! yay");	break;		
				}
				
				if(arr1.get(2) =="X" && arr1.get(5) =="X" && arr1.get(8) =="X") {
					System.out.println("PLAYER 2 WON !! yay");	break;		
				}
				
				if(arr1.get(0) =="X" && arr1.get(4) =="X" && arr1.get(8) =="X") {
					System.out.println("PLAYER 2 WON !! yay");	break;		
				}
				
				if(arr1.get(2) =="X" && arr1.get(4) =="X" && arr1.get(6) =="X") {
					System.out.println("PLAYER 2 WON !! yay");	break;		
				}
			}
			
		}	
			
		
	}	
		
	public static void play1(int choice, ArrayList arr2) {
		int ch = choice;
		arr2.add(ch-1,"O");
		arr2.remove(ch);
		
	}
	public static void play2(int choice, ArrayList arr3) {
		int ch = choice;
		arr3.add(ch-1,"X");
		arr3.remove(ch);
				
	}
	public static void getarr(ArrayList arr1) {
		int jj;
		for(jj=0;jj<=2;jj++) {
			System.out.print(arr1.get(jj)+"  ");
		}
		System.out.println();
		for(jj=3;jj<=5;jj++) {
			System.out.print(arr1.get(jj)+"  ");
		}
		System.out.println();
		for(jj=6;jj<=8;jj++) {
			System.out.print(arr1.get(jj)+"  ");
		}
		System.out.println();
	}
	
}
