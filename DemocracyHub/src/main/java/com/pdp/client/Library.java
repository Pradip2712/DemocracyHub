package com.pdp.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;

import com.pdp.controller.Controll;
import com.pdp.entity.Person;

public class Library {

	static Scanner sc = new Scanner(System.in);
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) {
		int choice = 0;

		Controll con;
		do {
			System.out.println("+===================================+");
			System.out.println("|               MENU                |");
			System.out.println("|===================================|");
			System.out.println("| 1. INSERT                         |");
			System.out.println("|-----------------------------------|");
			System.out.println("| 2. View  / Display                |");
			System.out.println("|-----------------------------------|");
			System.out.println("| 3. Update                         |");
			System.out.println("|-----------------------------------|");
			System.out.println("| 4. Delete                         |");
			System.out.println("|-----------------------------------|");
			System.out.println("| 5. Exit...                        |");
			System.out.println("-------------------------------------");

			System.out.println("Enter Your Choice : ");
			try {
				choice = sc.nextInt();
			} catch (Exception e) {
				System.out.println("Enter only numeric numbers...");
//				e.printStackTrace();
				break;
			}

			switch (choice) {
			case 1: {
				int adhar = 0, houseNo = 0, pin = 0;
				String name = null, vid = null, cons = null, city = null;
				con = new Controll();
				try {
					System.out.println("enter adhar number : ");
					adhar = sc.nextInt();
					System.out.println("Enter Name : ");
					name = br.readLine();
					System.out.println("Enter Voater id : ");
					vid = br.readLine();
					System.out.println("Enter constituency : ");
					cons = br.readLine();
					System.out.println("Enter Houser number : ");
					houseNo = sc.nextInt();
					System.out.println("Enter City : ");
					city = br.readLine();
					System.out.println("Enter Pin code : ");
					pin = sc.nextInt();
				} catch (Exception e) {
					System.out.println("Please enter valid input...");
					e.printStackTrace();
				}

				String res = con.insert(adhar, name, vid, cons, houseNo, city, pin);
				System.out.println(res);
				break;
			}
			case 2: {
				con = new Controll();
				int ch = 0;

				do {
					System.out.println("+===================================+");
					System.out.println("|              View Menu            |");
					System.out.println("|===================================|");
					System.out.println("|  1. View All Person and it's info |");
					System.out.println("|---------------------------------  |");
					System.out.println("|  2. View By using pin Code        |");
					System.out.println("|---------------------------------  |");
					System.out.println("|  3. View By using constituency    |");
					System.out.println("|-----------------------------------|");
					System.out.println("|  4. View By City Wise             |");
					System.out.println("|-----------------------------------|");
					System.out.println("|  5. Exit...                       |");
					System.out.println("-------------------------------------");

					System.out.println("Enter Your Choice : ");

					try {
						ch = sc.nextInt();
					} catch (Exception e) {
						System.out.println("Enter only numeric numbers...");
						e.printStackTrace();
						break;
					}

					switch (ch) {
					case 1: {

						List<Person> lop = con.viewAllPerson();
						for (Person person : lop) {
							System.out.println(person);
						}

						break;
					}
					case 2: {
						System.out.println("Enter the pin Code : ");
						int pin = 0;
						try {
							pin = sc.nextInt();
						} catch (Exception e) {
							System.out.println("Enter valid pin code");
							e.printStackTrace();
						}
						List<Person> lop = con.viewByPin(pin);
						for (Person person : lop) {
							System.out.println(person);
						}

						break;
					}
					case 3: {

						System.out.println("Enter constituency : ");
						String cons = null;
						try {
							cons = br.readLine();
						} catch (Exception e) {
							System.out.println("Enter Valid constituency name ");
							e.printStackTrace();
						}
						List<Person> lop = con.viewByCon(cons);
						for (Person person : lop) {
							System.out.println(person);
						}

						break;
					}
					case 4: {

						System.out.println("Enter City Name : ");
						String city = null;
						try {
							city = br.readLine();
						} catch (IOException e) {
							System.out.println("enter valid city name ");
							e.printStackTrace();
						}
						List<Person> lop = con.viewByCity(city);
						for (Person person : lop) {
							System.out.println(person);
						}

						break;
					}
					case 5: {

						break;
					}
					default: {
						System.out.println("Invalid input....");
						break;
					}
					}

				} while (ch != 5);

				break;
			}
			case 3: {
				con = new Controll();
				int adhar = 0;
				System.out.println("Enter Existing person Adhar Id ");
				try {
					adhar = sc.nextInt();
				} catch (Exception e) {
					System.out.println("Please enter valid adhar number only numeric number's are allowed...");
					e.printStackTrace();
				}
				boolean res = con.checkexsit(adhar);
				String fres = null;

				if (res == true) {
					int pin = 0;
					String name = null, cons = null, city = null;
					try {

						System.out.println("Enter Updated Name : ");
						name = br.readLine();
						System.out.println("Enter Updated constituency : ");
						cons = br.readLine();
						System.out.println("Enter Updated City : ");
						city = br.readLine();
						System.out.println("Enter Updated Pin code : ");
						pin = sc.nextInt();

					} catch (Exception e) {
						System.out.println("enter valid input...");
						e.printStackTrace();
					}
					fres = con.updatePerson(adhar, name, cons, city, pin);
					System.out.println(fres);
				} else {
					System.out.println("Adhar num is not present in database");
					System.out.println("Please try again... ");
				}

				break;
			}
			case 4: {
				System.out.println("Enter Adhar Number : ");
				int adhar = 0;
				try {
					adhar = sc.nextInt();
				} catch (Exception e) {
					System.out.println("please enter only numeric numbers");
					e.printStackTrace();
				}
				con = new Controll();
				String res = con.deletePerson(adhar);
				System.out.println(res);

				break;
			}
			case 5: {
				System.out.println("Thank you for use our application  \nकृपया पुन्हा भेट द्या");
				break;
			}
			default: {
				System.out.println("Invalid Input...");

				break;
			}

			}

		} while (choice != 5);

	}

}
