import java.util.Scanner;

class palindrome
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		//char arr[];
		System.out.print("Enter the word: ");
		String word = sc.nextLine();
		//next - until space
		//nextLine - everything even after space
		char arr[] = new char[word.length()];
		for(int i=0; i<word.length(); i++)
		{
			arr[i] = word.charAt(i);
		}
		
		int mid = word.length()/2;
		int len = word.length();
		int count = 0;
		//System.out.print(mid);
		boolean isPaligdrome = false;
		
		for(int i=0; i<mid; i++)
		{
			char a = arr[i];
			char b = arr[len-1-i];
			if(Character.toUpperCase(a) == Character.toUpperCase(b) || a == b)
			{
				count++;
			}

		}
		
		if(count == mid)
		{
			isPaligdrome = true;
		}
		
		if(isPaligdrome == true)
		{
			System.out.print("Word is palindrome");
		}
		else
		{
			System.out.print("Word is not a palindrome");
		}
		
	}
}