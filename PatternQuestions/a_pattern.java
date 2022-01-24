package PatternQuestions;

public class a_pattern {
	public static void main(String[] args) {

				// TODO Auto-generated method stub

				// Rules to follow while coding a pattern

				// 1. Identify the number of rows inside your pattern w.r.t "n"
				// 2. Find the work in each row "*/#/$..."
				// 3. Find the work w.r.t row -> "table"

				int n = 5;

				// Write the code of rule 1
				int row = 1;
				int nst = n; // Number of stars in each row
				while (row <= n) {
					int cst = 1; // Current star in a particular row
					while (cst <= nst) {
						System.out.print("* ");
						cst++;
					}

					row++;
					System.out.println();
				}

			}

	}
