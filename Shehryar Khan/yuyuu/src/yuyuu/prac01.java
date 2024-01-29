package yuyuu;
import javax.swing.JOptionPane;

class Student{
	private String Name;
	private int Rollno;
	private double Marks;
	
	
	public String getName() {
		return Name;
	}
	
	public void  setName(String name) {
		Name = name;
	}
	
	public int getRollno() {
		return Rollno;
	}
	
	public void  setRollno(int rollno) {
		Rollno = rollno;
	}
	
	public double getMarks() {
		return Marks;
	}
	
	public void  setMarks(double marks) {
		Marks = marks;
	}
	
	public String getGrade() {
		if(Marks <=70) {
			return "F";
			
		}else if (Marks <= 84) {
			return "B";
		}else if (Marks <= 95) {
			return "A";
		}
		return "NULL";
		

	}
	
	
	
	
}





public class prac01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input;
		double marks;
		int Rollno;
		Student st = new Student();
		
		
		input = JOptionPane.showInputDialog(null,"Enter Your Name:");
		st.setName(input);
		
		input = JOptionPane.showInputDialog(null,"Enter Your Roll no: ");
		Rollno = Integer.parseInt(input);
		st.setRollno(Rollno);
		
		input = JOptionPane.showInputDialog(null,"Enter your Marks: ");
		marks = Double.parseDouble(input);
		st.setMarks(marks);
		
		System.out.println("Your name is:"+st.getName());
		System.out.println("Your Rollno is:"+st.getRollno());
		System.out.println("Your Marks is:"+st.getMarks());
		System.out.println("Your Grade is : "+st.getGrade());
		
		
	}

}
