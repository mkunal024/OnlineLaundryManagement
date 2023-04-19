package laundry;

public class Employee {
         private int eid;
		 private static int count=100;
         private String ename;
         private String eaddress;
         
         public Employee(String ename, String eaddress) {
 			super();
 			count++;
 			this.eid=count;
 			this.ename = ename;
 			this.eaddress = eaddress;
 		}

		public String getEname() {
			return ename;
		}

		public void setEname(String ename) {
			this.ename = ename;
		}

		public String getEaddress() {
			return eaddress;
		}

		public void setEaddress(String eaddress) {
			this.eaddress = eaddress;
		}

		public int getEid() {
			return eid;
		}

		@Override
		public String toString() {
			return "Employee [eid=" + eid + ", ename=" + ename + ", eaddress=" + eaddress + "]";
		}
		
}
