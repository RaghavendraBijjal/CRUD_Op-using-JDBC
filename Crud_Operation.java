package Project_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Crud_Operation {

	public static void main(String[] args) throws Exception {
		
		Scanner sc= new Scanner (System.in);
        Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/xyz","root","root");
		while(true)
		{
			System.out.println("SELECT OPTIONS \n 1 : INSERT \n 2 : UPDATE \n 3 : FETCH \n 4 : DELETE");
			switch(sc.nextInt())
			{
			case 1:
			{
				PreparedStatement preparedStatement = connection.prepareStatement("insert into abc values(?,?,?,?,?,?,?,?,?,?,?)");
				System.out.println("Enter Your id");
				int id=sc.nextInt();
				System.out.println("Enter Your F_Name");
				String f_name=sc.next();
				System.out.println("Enter Your L_Name");
				String l_name=sc.next();
				System.out.println("Enter Your degree");
				String degree=sc.next();
				System.out.println("Enter Your Stream");
				String stream=sc.next();
				System.out.println("Enter Your Email");
				String email=sc.next();
				System.out.println("Enter Your ph_no");
				int ph_no=sc.nextInt();
				System.out.println("Enter Your Address");
				String address=sc.next();
				System.out.println("Enter Your City");
				String city=sc.next();
				System.out.println("Enter Your State");
				String state=sc.next();
				System.out.println("Enter Your Pincode");
				int pincode=sc.nextInt();
				
				
				preparedStatement.setInt(1, id);
				preparedStatement.setString(2, f_name);
				preparedStatement.setString(3, l_name);
				preparedStatement.setString(4, degree);
				preparedStatement.setString(5, stream);
				preparedStatement.setString(6, email);
				preparedStatement.setInt(7, ph_no);
				preparedStatement.setString(8, address);
				preparedStatement.setString(9, city);
				preparedStatement.setString(10, state);
				preparedStatement.setInt(11, pincode);
				
				preparedStatement.executeUpdate();
				System.out.println("Values Inserted Successfully");
				break;
		}
			
			case 2:
			{
			 System.out.println("Select Options \n 1 : Id \n 2 : F_Name  \n 3: ph_no \n 4 :Email");
			 switch(sc.nextInt())
			 {
			 case 1 : 
			 {
				 PreparedStatement preparedStatement = connection.prepareStatement("update abc set s_Fname=? ,s_Lname=?, degree=?,stream=?,email=?,ph_no=?,address=?,city=?,state=?,pincode=? where s_id=?");
				 System.out.println("Enter First_Name");
				 String f_name =sc.next();
				 System.out.println("Enter Last_Name");
				 String l_name =sc.next();
				 System.out.println("Enter Degree");
				 String degree =sc.next();
				 System.out.println("Enter Stream");
				 String stream =sc.next();
				 System.out.println("Enter Email");
				 String email =sc.next();
				 System.out.println("Enter Ph_no");
				 Long ph_no =sc.nextLong();
				 System.out.println("Enter Address");
				 String address =sc.next();
				 System.out.println("Enter City");
				 String city =sc.next();
				 System.out.println("Enter State");
				 String state =sc.next();
				 System.out.println("Enter Pincode");
				 int pincode =sc.nextInt();
				 System.out.println("Enter Id ");
				 int id=sc.nextInt();
				 
				 preparedStatement.setString(1, f_name);
				 preparedStatement.setString(2, l_name);
				 preparedStatement.setString(3, degree);
				 preparedStatement.setString(4, stream);
				 preparedStatement.setString(5, email);
				 preparedStatement.setLong(6, ph_no);
				 preparedStatement.setString(7, address);
				 preparedStatement.setString(8, city);
				 preparedStatement.setString(9, state);
				 preparedStatement.setInt(10, pincode);
				 preparedStatement.setInt(11, id);
				 
				 preparedStatement.executeUpdate();
				 System.out.println("Updated Successfully");
				 break;	
			 }
			 case 2:
			 {
				 PreparedStatement preparedStatement = connection.prepareStatement("update abc set s_id=? ,s_Lname=?, degree=?,stream=?,email=?,ph_no=?,address=?,city=?,state=?,pincode=? where s_Fname=?"); 
			     
		         System.out.println("Enter Id ");
				 int id=sc.nextInt();
				 
				 System.out.println("Enter Last_Name");
				 String l_name =sc.next();
				 System.out.println("Enter Degree");
				 String degree =sc.next();
				 System.out.println("Enter Stream");
				 String stream =sc.next();
				 System.out.println("Enter Email");
				 String email =sc.next();
				 System.out.println("Enter Ph_no");
				 Long ph_no =sc.nextLong();
				 System.out.println("Enter Address");
				 String address =sc.next();
				 System.out.println("Enter City");
				 String city =sc.next();
				 System.out.println("Enter State");
				 String state =sc.next();
				 System.out.println("Enter Pincode");
				 int pincode =sc.nextInt();
				 System.out.println("Enter First_Name");
				 String f_name =sc.next();
				 
				 preparedStatement.setInt(1, id);
				 preparedStatement.setString(2, l_name);
				 preparedStatement.setString(3, degree);
				 preparedStatement.setString(4, stream);
				 preparedStatement.setString(5, email);
				 preparedStatement.setLong(6, ph_no);
				 preparedStatement.setString(7, address);
				 preparedStatement.setString(8, city);
				 preparedStatement.setString(9, state);
				 preparedStatement.setInt(10, pincode);
				 preparedStatement.setString(11, f_name);
				 
				 preparedStatement.executeUpdate();
				 System.out.println("Updated Successfully");
				 break;	
				 	 
			 }
			 case 3:
			 {
				 PreparedStatement preparedStatement = connection.prepareStatement("update abc set s_id=?, s_Fname=? ,s_Lname=?, degree=?,stream=?,email=?,address=?,city=?,state=?,pincode=? where ph_no=?"); 
				 
				 
				 System.out.println("Enter Id ");
				 int id=sc.nextInt();
				 System.out.println("Enter First_Name");
				 String f_name =sc.next();
				 System.out.println("Enter Last_Name");
				 String l_name =sc.next();
				 System.out.println("Enter Degree");
				 String degree =sc.next();
				 System.out.println("Enter Stream");
				 String stream =sc.next();
				 System.out.println("Enter Email");
				 String email =sc.next(); 
				 System.out.println("Enter Address");
				 String address =sc.next();
				 System.out.println("Enter City");
				 String city =sc.next();
				 System.out.println("Enter State");
				 String state =sc.next();
				 System.out.println("Enter Pincode");
				 int pincode =sc.nextInt();
				 
				 System.out.println("Enter Ph_no");
				 Long ph_no =sc.nextLong();
				 
				 preparedStatement.setInt(1, id);
				 preparedStatement.setString(2, f_name);
				 preparedStatement.setString(3, l_name);
				 preparedStatement.setString(4, degree);
				 preparedStatement.setString(5, stream);
				 preparedStatement.setString(6, email);
				 preparedStatement.setString(7, address);
				 preparedStatement.setString(8, city);
				 preparedStatement.setString(9, state);
				 preparedStatement.setInt(10, pincode);
				  preparedStatement.setLong(11, ph_no);
				 
				  preparedStatement.executeUpdate();
				  
					 System.out.println("Updated Successfully");
					 break;	
					 	 	 
			 }
			 case 4:
			 {
				 PreparedStatement preparedStatement = connection.prepareStatement("update abc set s_id=?, s_Fname=? ,s_Lname=?, degree=?,stream=?,address=?,city=?,state=?,pincode=?,ph_no=? where email=?"); 
				 
				 System.out.println("Enter Id ");
				 int id=sc.nextInt();
				 System.out.println("Enter First_Name");
				 String f_name =sc.next();
				 System.out.println("Enter Last_Name");
				 String l_name =sc.next();
				 System.out.println("Enter Degree");
				 String degree =sc.next();
				 System.out.println("Enter Stream");
				 String stream =sc.next();
				 System.out.println("Enter Address");
				 String address =sc.next();
				 System.out.println("Enter City");
				 String city =sc.next();
				 System.out.println("Enter State");
				 String state =sc.next();
				 System.out.println("Enter Pincode");
				 int pincode =sc.nextInt();
				 System.out.println("Enter Ph_no");
				 Long ph_no =sc.nextLong();
				 System.out.println("Enter Email");
				 String email =sc.next(); 
				 
				 preparedStatement.setInt(1, id);
				 preparedStatement.setString(2, f_name);
				 preparedStatement.setString(3, l_name);
				 preparedStatement.setString(4, degree);
				 preparedStatement.setString(5, stream);
				 preparedStatement.setString(6, address);
				 preparedStatement.setString(7, city);
				 preparedStatement.setString(8, state);
				 preparedStatement.setInt(9, pincode);
				 preparedStatement.setLong(10, ph_no);
				 preparedStatement.setString(11, email);
				 
				 preparedStatement.executeUpdate();
				 System.out.println("Updated Successfully");
				 break;	
				 	 	 
			 }
			default:
			{
				System.out.println("Select Below Options");
			}
			 
	 }
			  
}
			case 3:
			{
				System.out.println("Select Options \n 1:ID \n 2:E-mail \n 3:Ph-no \n 4: First-Name");
				
				switch(sc.nextInt())
				{
				case 1:
				{
					PreparedStatement preparedStatement = connection.prepareStatement("select * from abc where s_id=?");
					System.out.println("Enter Id ");
					int id=sc.nextInt();
					preparedStatement.setInt(1, id);
					
					ResultSet resultSet = preparedStatement.executeQuery();
					resultSet.next();
					System.out.println("s_id:"+resultSet.getInt(1)+"  "+"s_Fname:"+resultSet.getString(2)+" "+"s_Lname:"+resultSet.getString(3)+" "+"degree:"+resultSet.getString(4)+" "+"stream:"+resultSet.getString(5)+" "+
					"email:"+resultSet.getString(6)+" "+"ph_no:"+resultSet.getString(7)+" "+"address:"+resultSet.getString(8)+" "+"city:"+resultSet.getString(9)+" "+"state:"+resultSet.getString(10)+" "+"pincode:"+resultSet.getString(11));
				
					break;
					
					}
				case 2:
				{
					PreparedStatement preparedStatement = connection.prepareStatement("select * from abc where email=?");
					System.out.println("ENTER EMAIL ID ");
					String email=sc.next();
					preparedStatement.setString(1, email);
					ResultSet resultSet = preparedStatement.executeQuery();
					resultSet.next();
					System.out.println("s_id:"+resultSet.getInt(1)+"  "+"s_Fname:"+resultSet.getString(2)+" "+"s_Lname:"+resultSet.getString(3)+" "+"degree:"+resultSet.getString(4)+" "+"stream:"+resultSet.getString(5)+" "+
							"email:"+resultSet.getString(6)+" "+"ph_no:"+resultSet.getString(7)+" "+"address:"+resultSet.getString(8)+" "+"city:"+resultSet.getString(9)+" "+"state:"+resultSet.getString(10)+" "+"pincode:"+resultSet.getString(11));
					 break;
					
				}
				case 3:
				{
					PreparedStatement preparedStatement = connection.prepareStatement("select * from abc where ph_no=?");
					System.out.println("ENTER PH_NUMBER");
					Long ph_no=sc.nextLong();
					preparedStatement.setLong(1,ph_no );
					ResultSet resultSet = preparedStatement.executeQuery();
					resultSet.next();
					System.out.println("s_id:"+resultSet.getInt(1)+"  "+"s_Fname:"+resultSet.getString(2)+" "+"s_Lname:"+resultSet.getString(3)+" "+"degree:"+resultSet.getString(4)+" "+"stream:"+resultSet.getString(5)+" "+
					"email:"+resultSet.getString(6)+" "+"ph_no:"+resultSet.getString(7)+" "+"address:"+resultSet.getString(8)+" "+"city:"+resultSet.getString(9)+" "+"state:"+resultSet.getString(10)+" "+"pincode:"+resultSet.getString(11));
				
					break;
						
				}
				case 4:
				{
					PreparedStatement preparedStatement = connection.prepareStatement("select * from abc where s_Fname=?");
					System.out.println("ENTER First Name");
					String s_Fname=sc.next();
					preparedStatement.setString(1,s_Fname);
					ResultSet resultSet = preparedStatement.executeQuery();
					resultSet.next();
					System.out.println("s_id:"+resultSet.getInt(1)+"  "+"s_Fname:"+resultSet.getString(2)+" "+"s_Lname:"+resultSet.getString(3)+" "+"degree:"+resultSet.getString(4)+" "+"stream:"+resultSet.getString(5)+" "+
							"email:"+resultSet.getString(6)+" "+"ph_no:"+resultSet.getString(7)+" "+"address:"+resultSet.getString(8)+" "+"city:"+resultSet.getString(9)+" "+"state:"+resultSet.getString(10)+" "+"pincode:"+resultSet.getString(11));
					 break;
					
				}
				default :
				{
					System.out.println("PLEASE SELECT FROM THE BELOW OPTIONS");
				}
				
		}
				
}
	
			case 4:
			{
				System.out.println("SELECT OPTIONS \n 1:Id \n 2:F_Name \n 3:Ph_NUMBER \n 4:E_mail");
				switch(sc.nextInt())
				{
				case 1:
				{
					
						PreparedStatement preparedStatement = connection.prepareStatement("delete from abc where s_id=?");
						System.out.println("Enter Id ");
						int id=sc.nextInt();
						preparedStatement.setInt(1, id);
						
						preparedStatement.executeUpdate();
						
					    System.out.println("Deleted Successfully");	
					    break ;
					
				}
				
				case 2:
				{
					
						PreparedStatement preparedStatement = connection.prepareStatement("delete from abc where s_Fname=?");
						System.out.println("Enter F_Name ");
						String name=sc.next();
						preparedStatement.setString(1, name);
						
						preparedStatement.executeUpdate();
						
					    System.out.println("Deleted Successfully");	
					    break ;
					
					
				}
				case 3:
				{
					
						PreparedStatement preparedStatement = connection.prepareStatement("delete from abc where ph_no=?");
						System.out.println("Enter PHONE-NUMBER ");
						Long ph_no=sc.nextLong();
						preparedStatement.setLong(1, ph_no);
						
						preparedStatement.executeUpdate();
						
					    System.out.println("Deleted Successfully");	
					    break ;
					
				}
				
				case 4:
				{
					
						PreparedStatement preparedStatement = connection.prepareStatement("delete from abc where email=?");
						System.out.println("Enter E-Mail ");
						String email=sc.next();
						preparedStatement.setString(1, email);
						
						preparedStatement.executeUpdate();
						
					    System.out.println("Deleted Successfully");	
					    break ;
				}
				default:
				{
					System.out.println("PLEASE SELECT FROM THE BELOW OPTIONS");
				}
				
				}
				
			}
		}
		
		}
	}
}
