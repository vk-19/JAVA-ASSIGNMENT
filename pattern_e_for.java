//Assignment : Print pattern 'e' using *'s.

/*
Pattern:

Total Rows: 9	(0-8)
Total Columns: 8	(0-7)

	0	1	2	3	4	5	6	7
0			*	*	*	*						4 consecutive zeros
1		*					*					upper curve
2	*							*				uppper curve
3	*							*				row 3
4	*	*	*	*	*	*	*	*				straight line
5	*											single star
6	*							*				lower curve
7		*					*					lower curve
8			*	*	*	*						4 consecutive zeroes

*/

public class pattern_e_for {
	public static void main(String[] args) {
		for (int i = 0; i < 9; i++) {
			System.out.println();

			for (int j = 0; j < 8; j++) {
				if (i == 4) // for the straight line.
					System.out.print("*");

				else if (i + j == 2 || j - i == 5) // for the upper curve above the straight line.
					System.out.print("*");

				else if (i == 3 && (j == 0 || j == 7)) // for row 3.
					System.out.print("*");

				else if (i == 5 && j == 0) // for the single * at row 5 and column 0.
					System.out.print("*");

				else if ((i == 0 || i == 8) && j >= 2 && j <= 5) // for the consecutive 4 *'s at row 0 and row 8.
					System.out.print("*");

				else if (i - j == 6 || i + j == 13) // for the lower curve below the straight line.
					System.out.print("*");

				else // printing space, otherwise.
					System.out.print(" ");
			}
		}
	}
}
