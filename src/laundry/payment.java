package laundry;

public class payment {
        private int pid;
        private static int count;
        private String pmode;
        private double pamt;
		public payment( String pmode, double pamt) {
			count++;
			this.pid = count;
			this.pmode = pmode;
			this.pamt = pamt;
		}
		public String getPmode() {
			return pmode;
		}
		public void setPmode(String pmode) {
			this.pmode = pmode;
		}
		public double getPamt() {
			return pamt;
		}
		public void setPamt(double pamt) {
			this.pamt = pamt;
		}
		@Override
		public String toString() {
			return "payment [pid=" + pid + ", pmode=" + pmode + ", pamt=" + pamt + "]";
		}
}
